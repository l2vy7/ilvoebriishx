package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p149s6.C11001d;

final class RtspMessageChannel implements Closeable {
    public static final int DEFAULT_RTSP_PORT = 554;
    private static final String TAG = "RtspMessageChannel";
    /* access modifiers changed from: private */
    public volatile boolean closed;
    /* access modifiers changed from: private */
    public final MessageListener messageListener;
    /* access modifiers changed from: private */
    public final Handler messageListenerHandler = Util.createHandlerForCurrentLooper();
    private final Loader receiverLoader;
    private Sender sender;
    private Socket socket;

    private final class LoaderCallbackImpl implements Loader.Callback<Receiver> {
        private LoaderCallbackImpl() {
        }

        public void onLoadCanceled(Receiver receiver, long j, long j2, boolean z) {
        }

        public void onLoadCompleted(Receiver receiver, long j, long j2) {
        }

        public Loader.LoadErrorAction onLoadError(Receiver receiver, long j, long j2, IOException iOException, int i) {
            RtspMessageChannel.this.messageListener.onReceivingFailed(iOException);
            return Loader.DONT_RETRY;
        }
    }

    public interface MessageListener {
        void onInterleavedBinaryDataReceived(byte[] bArr, int i);

        void onReceivingFailed(Exception exc);

        void onRtspMessageReceived(List<String> list);

        void onSendingFailed(List<String> list, Exception exc);
    }

    private final class Receiver implements Loader.Loadable {
        private static final byte RTSP_INTERLEAVED_MESSAGE_MARKER = 36;
        private final DataInputStream dataInputStream;
        private volatile boolean loadCanceled;
        private final RtspMessageBuilder messageBuilder = new RtspMessageBuilder();

        public Receiver(InputStream inputStream) {
            this.dataInputStream = new DataInputStream(inputStream);
        }

        private void handleInterleavedBinaryData() throws IOException {
            int readUnsignedByte = this.dataInputStream.readUnsignedByte();
            int readUnsignedShort = this.dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.dataInputStream.readFully(bArr, 0, readUnsignedShort);
            RtspMessageChannel.this.messageListenerHandler.post(new C6893g(this, bArr, readUnsignedByte));
        }

        private void handleRtspMessage(byte b) throws IOException {
            C4766t<String> addLine = this.messageBuilder.addLine(handleRtspMessageLine(b));
            while (addLine == null) {
                addLine = this.messageBuilder.addLine(handleRtspMessageLine(this.dataInputStream.readByte()));
            }
            RtspMessageChannel.this.messageListenerHandler.post(new C6892f(this, C4766t.m21988y(addLine)));
        }

        private byte[] handleRtspMessageLine(byte b) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b, this.dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                bArr[1] = this.dataInputStream.readByte();
                byteArrayOutputStream.write(bArr[1]);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$handleInterleavedBinaryData$1(byte[] bArr, int i) {
            if (!RtspMessageChannel.this.closed) {
                RtspMessageChannel.this.messageListener.onInterleavedBinaryDataReceived(bArr, i);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$handleRtspMessage$0(C4766t tVar) {
            if (!RtspMessageChannel.this.closed) {
                RtspMessageChannel.this.messageListener.onRtspMessageReceived(tVar);
            }
        }

        public void cancelLoad() {
            this.loadCanceled = true;
        }

        public void load() throws IOException {
            while (!this.loadCanceled) {
                byte readByte = this.dataInputStream.readByte();
                if (readByte == 36) {
                    handleInterleavedBinaryData();
                } else {
                    handleRtspMessage(readByte);
                }
            }
        }
    }

    private static final class RtspMessageBuilder {
        private static final int STATE_READING_FIRST_LINE = 1;
        private static final int STATE_READING_RTSP_BODY = 3;
        private static final int STATE_READING_RTSP_HEADER = 2;
        private long messageBodyLength;
        private final List<String> messageLines = new ArrayList();
        private long receivedMessageBodyLength;
        @ReadingState
        private int state = 1;

        private void reset() {
            this.messageLines.clear();
            this.state = 1;
            this.messageBodyLength = 0;
            this.receivedMessageBodyLength = 0;
        }

        public C4766t<String> addLine(byte[] bArr) throws ParserException {
            Assertions.checkArgument(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, C11001d.f49947c);
            this.messageLines.add(str);
            int i = this.state;
            if (i != 1) {
                if (i == 2) {
                    long parseContentLengthHeader = RtspMessageUtil.parseContentLengthHeader(str);
                    if (parseContentLengthHeader != -1) {
                        this.messageBodyLength = parseContentLengthHeader;
                    }
                    if (!str.isEmpty()) {
                        return null;
                    }
                    if (this.messageBodyLength > 0) {
                        this.state = 3;
                        return null;
                    }
                    C4766t<String> y = C4766t.m21988y(this.messageLines);
                    reset();
                    return y;
                } else if (i == 3) {
                    long length = this.receivedMessageBodyLength + ((long) bArr.length);
                    this.receivedMessageBodyLength = length;
                    if (length < this.messageBodyLength) {
                        return null;
                    }
                    C4766t<String> y2 = C4766t.m21988y(this.messageLines);
                    reset();
                    return y2;
                } else {
                    throw new IllegalStateException();
                }
            } else if (!RtspMessageUtil.isRtspStartLine(str)) {
                return null;
            } else {
                this.state = 2;
                return null;
            }
        }
    }

    private final class Sender implements Closeable {
        private final OutputStream outputStream;
        private final HandlerThread senderThread;
        private final Handler senderThreadHandler;

        public Sender(OutputStream outputStream2) {
            this.outputStream = outputStream2;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.senderThread = handlerThread;
            handlerThread.start();
            this.senderThreadHandler = new Handler(handlerThread.getLooper());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$send$0(List list, Exception exc) {
            if (!RtspMessageChannel.this.closed) {
                RtspMessageChannel.this.messageListener.onSendingFailed(list, exc);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$send$1(byte[] bArr, List list) {
            try {
                this.outputStream.write(bArr);
            } catch (Exception e) {
                RtspMessageChannel.this.messageListenerHandler.post(new C6895i(this, list, e));
            }
        }

        public void close() {
            Handler handler = this.senderThreadHandler;
            HandlerThread handlerThread = this.senderThread;
            Objects.requireNonNull(handlerThread);
            handler.post(new C6894h(handlerThread));
            try {
                this.senderThread.join();
            } catch (InterruptedException unused) {
                this.senderThread.interrupt();
            }
        }

        public void send(List<String> list) {
            this.senderThreadHandler.post(new C6896j(this, RtspMessageUtil.convertMessageToByteArray(list), list));
        }
    }

    public RtspMessageChannel(MessageListener messageListener2) {
        this.messageListener = messageListener2;
        this.receiverLoader = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    }

    public void close() throws IOException {
        if (!this.closed) {
            try {
                Sender sender2 = this.sender;
                if (sender2 != null) {
                    sender2.close();
                }
                this.receiverLoader.release();
                this.messageListenerHandler.removeCallbacksAndMessages((Object) null);
                Socket socket2 = this.socket;
                if (socket2 != null) {
                    socket2.close();
                }
            } finally {
                this.closed = true;
            }
        }
    }

    public void openSocket(Socket socket2) throws IOException {
        this.socket = socket2;
        this.sender = new Sender(socket2.getOutputStream());
        this.receiverLoader.startLoading(new Receiver(socket2.getInputStream()), new LoaderCallbackImpl(), 0);
    }

    public void send(List<String> list) {
        Assertions.checkStateNotNull(this.sender);
        this.sender.send(list);
    }
}
