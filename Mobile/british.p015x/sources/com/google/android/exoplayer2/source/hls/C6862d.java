package com.google.android.exoplayer2.source.hls;

/* renamed from: com.google.android.exoplayer2.source.hls.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6862d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ HlsSampleStreamWrapper f27550b;

    public /* synthetic */ C6862d(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.f27550b = hlsSampleStreamWrapper;
    }

    public final void run() {
        this.f27550b.maybeFinishPrepare();
    }
}
