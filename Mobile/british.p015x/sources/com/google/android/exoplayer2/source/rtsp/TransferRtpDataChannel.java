package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class TransferRtpDataChannel extends BaseDataSource implements RtpDataChannel {
    private static final String DEFAULT_TCP_TRANSPORT_FORMAT = "RTP/AVP/TCP;unicast;interleaved=%d-%d";
    private static final long TIMEOUT_MS = 8000;
    private int channelNumber = -1;
    private final LinkedBlockingQueue<byte[]> packetQueue = new LinkedBlockingQueue<>();
    private byte[] unreadData = new byte[0];

    public TransferRtpDataChannel() {
        super(true);
    }

    public void close() {
    }

    public int getLocalPort() {
        return this.channelNumber;
    }

    public String getTransport() {
        Assertions.checkState(this.channelNumber != -1);
        return Util.formatInvariant(DEFAULT_TCP_TRANSPORT_FORMAT, Integer.valueOf(this.channelNumber), Integer.valueOf(this.channelNumber + 1));
    }

    public Uri getUri() {
        return null;
    }

    public long open(DataSpec dataSpec) {
        this.channelNumber = dataSpec.uri.getPort();
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.unreadData.length);
        System.arraycopy(this.unreadData, 0, bArr, i, min);
        int i3 = min + 0;
        byte[] bArr2 = this.unreadData;
        this.unreadData = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (i3 == i2) {
            return i3;
        }
        try {
            byte[] poll = this.packetQueue.poll(TIMEOUT_MS, TimeUnit.MILLISECONDS);
            if (poll != null) {
                int min2 = Math.min(i2 - i3, poll.length);
                System.arraycopy(poll, 0, bArr, i + i3, min2);
                if (min2 < poll.length) {
                    this.unreadData = Arrays.copyOfRange(poll, min2, poll.length);
                }
                return i3 + min2;
            }
            throw new IOException(new SocketTimeoutException());
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    public boolean usesSidebandBinaryData() {
        return true;
    }

    public void write(byte[] bArr) {
        this.packetQueue.add(bArr);
    }
}
