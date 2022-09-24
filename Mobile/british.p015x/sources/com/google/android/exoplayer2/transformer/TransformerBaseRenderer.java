package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C6930u0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;

abstract class TransformerBaseRenderer extends BaseRenderer {
    protected boolean isRendererStarted;
    protected final TransformerMediaClock mediaClock;
    protected final MuxerWrapper muxerWrapper;
    protected final Transformation transformation;

    public TransformerBaseRenderer(int i, MuxerWrapper muxerWrapper2, TransformerMediaClock transformerMediaClock, Transformation transformation2) {
        super(i);
        this.muxerWrapper = muxerWrapper2;
        this.mediaClock = transformerMediaClock;
        this.transformation = transformation2;
    }

    public final MediaClock getMediaClock() {
        return this.mediaClock;
    }

    public final boolean isReady() {
        return isSourceReady();
    }

    /* access modifiers changed from: protected */
    public final void onEnabled(boolean z, boolean z2) {
        this.muxerWrapper.registerTrack();
        this.mediaClock.updateTimeForTrackType(getTrackType(), 0);
    }

    /* access modifiers changed from: protected */
    public final void onStarted() {
        this.isRendererStarted = true;
    }

    /* access modifiers changed from: protected */
    public final void onStopped() {
        this.isRendererStarted = false;
    }

    public final int supportsFormat(Format format) {
        String str = format.sampleMimeType;
        if (MimeTypes.getTrackType(str) != getTrackType()) {
            return C6930u0.m28682a(0);
        }
        if (this.muxerWrapper.supportsSampleMimeType(str)) {
            return C6930u0.m28682a(4);
        }
        return C6930u0.m28682a(1);
    }
}
