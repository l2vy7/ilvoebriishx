package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;

/* renamed from: com.google.android.exoplayer2.mediacodec.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6737a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ AsynchronousMediaCodecAdapter f27452a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f27453b;

    public /* synthetic */ C6737a(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener) {
        this.f27452a = asynchronousMediaCodecAdapter;
        this.f27453b = onFrameRenderedListener;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f27452a.lambda$setOnFrameRenderedListener$0(this.f27453b, mediaCodec, j, j2);
    }
}
