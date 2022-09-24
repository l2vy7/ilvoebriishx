package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;

final class TransferRtpDataChannelFactory implements RtpDataChannel.Factory {
    private static final int INTERLEAVED_CHANNELS_PER_TRACK = 2;

    TransferRtpDataChannelFactory() {
    }

    public RtpDataChannel createAndOpenDataChannel(int i) {
        TransferRtpDataChannel transferRtpDataChannel = new TransferRtpDataChannel();
        transferRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(i * 2));
        return transferRtpDataChannel;
    }
}
