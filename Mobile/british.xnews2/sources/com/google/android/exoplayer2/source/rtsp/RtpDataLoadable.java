package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class RtpDataLoadable implements Loader.Loadable {
    private final EventListener eventListener;
    private RtpExtractor extractor;
    private volatile boolean loadCancelled;
    private volatile long nextRtpTimestamp;
    private final ExtractorOutput output;
    private volatile long pendingSeekPositionUs;
    private final Handler playbackThreadHandler = Util.createHandlerForCurrentLooper();
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    public final RtspMediaTrack rtspMediaTrack;
    public final int trackId;

    public interface EventListener {
        void onTransportReady(String str, RtpDataChannel rtpDataChannel);
    }

    public RtpDataLoadable(int i, RtspMediaTrack rtspMediaTrack2, EventListener eventListener2, ExtractorOutput extractorOutput, RtpDataChannel.Factory factory) {
        this.trackId = i;
        this.rtspMediaTrack = rtspMediaTrack2;
        this.eventListener = eventListener2;
        this.output = extractorOutput;
        this.rtpDataChannelFactory = factory;
        this.pendingSeekPositionUs = C6540C.TIME_UNSET;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(String str, RtpDataChannel rtpDataChannel) {
        this.eventListener.onTransportReady(str, rtpDataChannel);
    }

    public void cancelLoad() {
        this.loadCancelled = true;
    }

    public void load() throws IOException {
        RtpDataChannel rtpDataChannel = null;
        try {
            rtpDataChannel = this.rtpDataChannelFactory.createAndOpenDataChannel(this.trackId);
            this.playbackThreadHandler.post(new C6887a(this, rtpDataChannel.getTransport(), rtpDataChannel));
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput((DataReader) Assertions.checkNotNull(rtpDataChannel), 0, -1);
            RtpExtractor rtpExtractor = new RtpExtractor(this.rtspMediaTrack.payloadFormat, this.trackId);
            this.extractor = rtpExtractor;
            rtpExtractor.init(this.output);
            while (!this.loadCancelled) {
                if (this.pendingSeekPositionUs != C6540C.TIME_UNSET) {
                    this.extractor.seek(this.nextRtpTimestamp, this.pendingSeekPositionUs);
                    this.pendingSeekPositionUs = C6540C.TIME_UNSET;
                }
                this.extractor.read(defaultExtractorInput, new PositionHolder());
            }
        } finally {
            Util.closeQuietly(rtpDataChannel);
        }
    }

    public void resetForSeek() {
        ((RtpExtractor) Assertions.checkNotNull(this.extractor)).preSeek();
    }

    public void seekToUs(long j, long j2) {
        this.pendingSeekPositionUs = j;
        this.nextRtpTimestamp = j2;
    }

    public void setSequenceNumber(int i) {
        if (!((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            this.extractor.setFirstSequenceNumber(i);
        }
    }

    public void setTimestamp(long j) {
        if (j != C6540C.TIME_UNSET && !((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            this.extractor.setFirstTimestamp(j);
        }
    }
}
