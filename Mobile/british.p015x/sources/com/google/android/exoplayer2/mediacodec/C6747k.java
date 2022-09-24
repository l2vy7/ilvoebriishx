package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;

/* renamed from: com.google.android.exoplayer2.mediacodec.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6747k implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ SynchronousMediaCodecAdapter f27464a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f27465b;

    public /* synthetic */ C6747k(SynchronousMediaCodecAdapter synchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener) {
        this.f27464a = synchronousMediaCodecAdapter;
        this.f27465b = onFrameRenderedListener;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f27464a.lambda$setOnFrameRenderedListener$0(this.f27465b, mediaCodec, j, j2);
    }
}
