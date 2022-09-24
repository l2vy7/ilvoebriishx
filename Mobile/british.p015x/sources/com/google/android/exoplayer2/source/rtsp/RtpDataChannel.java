package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;

interface RtpDataChannel extends DataSource {

    public interface Factory {
        RtpDataChannel createAndOpenDataChannel(int i) throws IOException;
    }

    int getLocalPort();

    String getTransport();

    boolean usesSidebandBinaryData();

    void write(byte[] bArr);
}
