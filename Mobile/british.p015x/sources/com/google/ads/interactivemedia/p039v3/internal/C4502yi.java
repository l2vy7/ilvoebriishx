package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaCodec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yi */
final /* synthetic */ class C4502yi implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    private final C4504yk f19684a;

    /* renamed from: b */
    private final C4484xr f19685b;

    C4502yi(C4504yk ykVar, C4484xr xrVar) {
        this.f19684a = ykVar;
        this.f19685b = xrVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f19685b.mo14025a(j);
    }
}
