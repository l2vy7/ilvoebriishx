package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import com.google.common.collect.C4776v;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import p148s6.C6075n;

final class RtspClient implements Closeable {
    private static final long DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_MS = 30000;
    /* access modifiers changed from: private */
    public boolean hasUpdatedTimelineAndTracks;
    /* access modifiers changed from: private */
    public KeepAliveMonitor keepAliveMonitor;
    /* access modifiers changed from: private */
    public RtspMessageChannel messageChannel = new RtspMessageChannel(new MessageListener());
    /* access modifiers changed from: private */
    public final MessageSender messageSender = new MessageSender();
    /* access modifiers changed from: private */
    public final SparseArray<RtspRequest> pendingRequests = new SparseArray<>();
    /* access modifiers changed from: private */
    public long pendingSeekPositionUs = C6540C.TIME_UNSET;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos = new ArrayDeque<>();
    /* access modifiers changed from: private */
    public PlaybackEventListener playbackEventListener;
    /* access modifiers changed from: private */
    public String sessionId;
    /* access modifiers changed from: private */
    public final SessionInfoListener sessionInfoListener;
    /* access modifiers changed from: private */
    public final SparseArray<RtpDataChannel> transferRtpDataChannelMap = new SparseArray<>();
    /* access modifiers changed from: private */
    public final Uri uri;
    /* access modifiers changed from: private */
    public final String userAgent;

    private final class KeepAliveMonitor implements Runnable, Closeable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler = Util.createHandlerForCurrentLooper();

        public KeepAliveMonitor(long j) {
            this.intervalMs = j;
        }

        public void close() {
            this.isStarted = false;
            this.keepAliveHandler.removeCallbacks(this);
        }

        public void run() {
            RtspClient.this.messageSender.sendOptionsRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        public void start() {
            if (!this.isStarted) {
                this.isStarted = true;
                this.keepAliveHandler.postDelayed(this, this.intervalMs);
            }
        }
    }

    private final class MessageListener implements RtspMessageChannel.MessageListener {
        private MessageListener() {
        }

        private void dispatchRtspError(Throwable th) {
            RtspMediaSource.RtspPlaybackException rtspPlaybackException;
            if (th instanceof RtspMediaSource.RtspPlaybackException) {
                rtspPlaybackException = (RtspMediaSource.RtspPlaybackException) th;
            } else {
                rtspPlaybackException = new RtspMediaSource.RtspPlaybackException(th);
            }
            if (RtspClient.this.hasUpdatedTimelineAndTracks) {
                ((PlaybackEventListener) Assertions.checkNotNull(RtspClient.this.playbackEventListener)).onPlaybackError(rtspPlaybackException);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed(C6075n.m26697c(th.getMessage()), th);
            }
        }

        public void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
            RtspSessionTiming rtspSessionTiming;
            String str = rtspDescribeResponse.sessionDescription.attributes.get(SessionDescription.ATTR_RANGE);
            try {
                SessionInfoListener access$1100 = RtspClient.this.sessionInfoListener;
                if (str != null) {
                    rtspSessionTiming = RtspSessionTiming.parseTiming(str);
                } else {
                    rtspSessionTiming = RtspSessionTiming.DEFAULT;
                }
                access$1100.onSessionTimelineUpdated(rtspSessionTiming, RtspClient.buildTrackList(rtspDescribeResponse.sessionDescription, RtspClient.this.uri));
                boolean unused = RtspClient.this.hasUpdatedTimelineAndTracks = true;
            } catch (ParserException e) {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("SDP format error.", e);
            }
        }

        public void onGetParameterResponseReceived(RtspResponse rtspResponse) {
        }

        public void onInterleavedBinaryDataReceived(byte[] bArr, int i) {
            RtpDataChannel rtpDataChannel = (RtpDataChannel) RtspClient.this.transferRtpDataChannelMap.get(i);
            if (rtpDataChannel != null) {
                rtpDataChannel.write(bArr);
            }
        }

        public void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) {
            if (RtspClient.this.keepAliveMonitor == null) {
                if (RtspClient.serverSupportsDescribe(rtspOptionsResponse.supportedMethods)) {
                    RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
                } else {
                    RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("DESCRIBE not supported.", (Throwable) null);
                }
            }
        }

        public void onPauseResponseReceived(RtspResponse rtspResponse) {
            if (RtspClient.this.pendingSeekPositionUs != C6540C.TIME_UNSET) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.startPlayback(C6540C.usToMs(rtspClient.pendingSeekPositionUs));
            }
        }

        public void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
            if (RtspClient.this.keepAliveMonitor == null) {
                RtspClient rtspClient = RtspClient.this;
                KeepAliveMonitor unused = rtspClient.keepAliveMonitor = new KeepAliveMonitor(30000);
                RtspClient.this.keepAliveMonitor.start();
            }
            ((PlaybackEventListener) Assertions.checkNotNull(RtspClient.this.playbackEventListener)).onPlaybackStarted(C6540C.msToUs(rtspPlayResponse.sessionTiming.startTimeMs), rtspPlayResponse.trackTimingList);
            long unused2 = RtspClient.this.pendingSeekPositionUs = C6540C.TIME_UNSET;
        }

        public /* synthetic */ void onReceivingFailed(Exception exc) {
            C6891e.m28663b(this, exc);
        }

        public void onRtspMessageReceived(List<String> list) {
            RtspSessionTiming rtspSessionTiming;
            C4766t<RtspTrackTiming> tVar;
            RtspResponse parseResponse = RtspMessageUtil.parseResponse(list);
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(parseResponse.headers.get(RtspHeaders.CSEQ)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.pendingRequests.get(parseInt);
            if (rtspRequest != null) {
                RtspClient.this.pendingRequests.remove(parseInt);
                int i = rtspRequest.method;
                int i2 = parseResponse.status;
                if (i2 != 200) {
                    String methodString = RtspMessageUtil.toMethodString(i);
                    int i3 = parseResponse.status;
                    StringBuilder sb = new StringBuilder(String.valueOf(methodString).length() + 12);
                    sb.append(methodString);
                    sb.append(" ");
                    sb.append(i3);
                    dispatchRtspError(new RtspMediaSource.RtspPlaybackException(sb.toString()));
                    return;
                }
                switch (i) {
                    case 1:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                        onUnsupportedResponseReceived(parseResponse);
                        return;
                    case 2:
                        onDescribeResponseReceived(new RtspDescribeResponse(i2, SessionDescriptionParser.parse(parseResponse.messageBody)));
                        return;
                    case 3:
                        onGetParameterResponseReceived(parseResponse);
                        return;
                    case 4:
                        onOptionsResponseReceived(new RtspOptionsResponse(i2, RtspMessageUtil.parsePublicHeader(parseResponse.headers.get(RtspHeaders.PUBLIC))));
                        return;
                    case 5:
                        onPauseResponseReceived(parseResponse);
                        return;
                    case 6:
                        String str = parseResponse.headers.get(RtspHeaders.RANGE);
                        if (str == null) {
                            rtspSessionTiming = RtspSessionTiming.DEFAULT;
                        } else {
                            rtspSessionTiming = RtspSessionTiming.parseTiming(str);
                        }
                        String str2 = parseResponse.headers.get(RtspHeaders.RTP_INFO);
                        if (str2 == null) {
                            tVar = C4766t.m21978E();
                        } else {
                            tVar = RtspTrackTiming.parseTrackTiming(str2);
                        }
                        onPlayResponseReceived(new RtspPlayResponse(parseResponse.status, rtspSessionTiming, tVar));
                        return;
                    case 10:
                        String str3 = parseResponse.headers.get(RtspHeaders.SESSION);
                        String str4 = parseResponse.headers.get(RtspHeaders.TRANSPORT);
                        if (str3 == null || str4 == null) {
                            throw new ParserException();
                        }
                        onSetupResponseReceived(new RtspSetupResponse(parseResponse.status, RtspMessageUtil.parseSessionHeader(str3), str4));
                        return;
                    case 12:
                        onTeardownResponseReceived(parseResponse);
                        return;
                    default:
                        try {
                            throw new IllegalStateException();
                        } catch (ParserException e) {
                            dispatchRtspError(new RtspMediaSource.RtspPlaybackException((Throwable) e));
                            return;
                        }
                }
            }
        }

        public /* synthetic */ void onSendingFailed(List list, Exception exc) {
            C6891e.m28664c(this, list, exc);
        }

        public void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) {
            String unused = RtspClient.this.sessionId = rtspSetupResponse.sessionHeader.sessionId;
            RtspClient.this.continueSetupRtspTrack();
        }

        public void onTeardownResponseReceived(RtspResponse rtspResponse) {
        }

        public void onUnsupportedResponseReceived(RtspResponse rtspResponse) {
        }
    }

    private final class MessageSender {
        private int cSeq;

        private MessageSender() {
        }

        private RtspRequest getRequestWithCommonHeaders(int i, String str, Map<String, String> map, Uri uri) {
            RtspHeaders.Builder builder = new RtspHeaders.Builder();
            int i2 = this.cSeq;
            this.cSeq = i2 + 1;
            builder.add(RtspHeaders.CSEQ, String.valueOf(i2));
            if (RtspClient.this.userAgent != null) {
                builder.add(RtspHeaders.USER_AGENT, RtspClient.this.userAgent);
            }
            if (str != null) {
                builder.add(RtspHeaders.SESSION, str);
            }
            builder.addAll(map);
            return new RtspRequest(uri, i, builder.build(), "");
        }

        private void sendRequest(RtspRequest rtspRequest) {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.CSEQ)));
            Assertions.checkState(RtspClient.this.pendingRequests.get(parseInt) == null);
            RtspClient.this.pendingRequests.append(parseInt, rtspRequest);
            RtspClient.this.messageChannel.send(RtspMessageUtil.serializeRequest(rtspRequest));
        }

        public void sendDescribeRequest(Uri uri, String str) {
            sendRequest(getRequestWithCommonHeaders(2, str, C4776v.m22050o(), uri));
        }

        public void sendOptionsRequest(Uri uri, String str) {
            sendRequest(getRequestWithCommonHeaders(4, str, C4776v.m22050o(), uri));
        }

        public void sendPauseRequest(Uri uri, String str) {
            sendRequest(getRequestWithCommonHeaders(5, str, C4776v.m22050o(), uri));
        }

        public void sendPlayRequest(Uri uri, long j, String str) {
            sendRequest(getRequestWithCommonHeaders(6, str, C4776v.m22051p(RtspHeaders.RANGE, RtspSessionTiming.getOffsetStartTimeTiming(j)), uri));
        }

        public void sendSetupRequest(Uri uri, String str, String str2) {
            sendRequest(getRequestWithCommonHeaders(10, str2, C4776v.m22051p(RtspHeaders.TRANSPORT, str), uri));
        }

        public void sendTeardownRequest(Uri uri, String str) {
            sendRequest(getRequestWithCommonHeaders(12, str, C4776v.m22050o(), uri));
        }
    }

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j, C4766t<RtspTrackTiming> tVar);

        void onRtspSetupCompleted();
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, Throwable th);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, C4766t<RtspMediaTrack> tVar);
    }

    public RtspClient(SessionInfoListener sessionInfoListener2, String str, Uri uri2) {
        this.sessionInfoListener = sessionInfoListener2;
        this.uri = RtspMessageUtil.removeUserInfo(uri2);
        this.userAgent = str;
    }

    /* access modifiers changed from: private */
    public static C4766t<RtspMediaTrack> buildTrackList(SessionDescription sessionDescription, Uri uri2) {
        C4766t.C4768a aVar = new C4766t.C4768a();
        for (int i = 0; i < sessionDescription.mediaDescriptionList.size(); i++) {
            MediaDescription mediaDescription = sessionDescription.mediaDescriptionList.get(i);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                aVar.mo19883e(new RtspMediaTrack(mediaDescription, uri2));
            }
        }
        return aVar.mo19884f();
    }

    /* access modifiers changed from: private */
    public void continueSetupRtspTrack() {
        RtspMediaPeriod.RtpLoadInfo pollFirst = this.pendingSetupRtpLoadInfos.pollFirst();
        if (pollFirst == null) {
            ((PlaybackEventListener) Assertions.checkNotNull(this.playbackEventListener)).onRtspSetupCompleted();
        } else {
            this.messageSender.sendSetupRequest(pollFirst.getTrackUri(), pollFirst.getTransport(), this.sessionId);
        }
    }

    private Socket openSocket() throws IOException {
        Assertions.checkArgument(this.uri.getHost() != null);
        return SocketFactory.getDefault().createSocket((String) Assertions.checkNotNull(this.uri.getHost()), this.uri.getPort() > 0 ? this.uri.getPort() : RtspMessageChannel.DEFAULT_RTSP_PORT);
    }

    /* access modifiers changed from: private */
    public static boolean serverSupportsDescribe(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    public void close() throws IOException {
        KeepAliveMonitor keepAliveMonitor2 = this.keepAliveMonitor;
        if (keepAliveMonitor2 != null) {
            keepAliveMonitor2.close();
            this.keepAliveMonitor = null;
            this.messageSender.sendTeardownRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.messageChannel.close();
    }

    public void registerInterleavedDataChannel(RtpDataChannel rtpDataChannel) {
        this.transferRtpDataChannelMap.put(rtpDataChannel.getLocalPort(), rtpDataChannel);
    }

    public void retryWithRtpTcp() {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new MessageListener());
            this.messageChannel = rtspMessageChannel;
            rtspMessageChannel.openSocket(openSocket());
            this.sessionId = null;
        } catch (IOException e) {
            ((PlaybackEventListener) Assertions.checkNotNull(this.playbackEventListener)).onPlaybackError(new RtspMediaSource.RtspPlaybackException((Throwable) e));
        }
    }

    public void seekToUs(long j) {
        this.messageSender.sendPauseRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        this.pendingSeekPositionUs = j;
    }

    public void setPlaybackEventListener(PlaybackEventListener playbackEventListener2) {
        this.playbackEventListener = playbackEventListener2;
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> list) {
        this.pendingSetupRtpLoadInfos.addAll(list);
        continueSetupRtspTrack();
    }

    public void start() throws IOException {
        try {
            this.messageChannel.openSocket(openSocket());
            this.messageSender.sendOptionsRequest(this.uri, this.sessionId);
        } catch (IOException e) {
            Util.closeQuietly((Closeable) this.messageChannel);
            throw e;
        }
    }

    public void startPlayback(long j) {
        this.messageSender.sendPlayRequest(this.uri, j, (String) Assertions.checkNotNull(this.sessionId));
    }
}
