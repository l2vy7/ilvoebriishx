package com.google.android.exoplayer2.source.hls;

/* renamed from: com.google.android.exoplayer2.source.hls.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6861c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ HlsSampleStreamWrapper f27549b;

    public /* synthetic */ C6861c(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.f27549b = hlsSampleStreamWrapper;
    }

    public final void run() {
        this.f27549b.onTracksEnded();
    }
}
