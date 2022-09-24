package com.google.android.exoplayer2.source;

/* renamed from: com.google.android.exoplayer2.source.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6873n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ProgressiveMediaPeriod f27572b;

    public /* synthetic */ C6873n(ProgressiveMediaPeriod progressiveMediaPeriod) {
        this.f27572b = progressiveMediaPeriod;
    }

    public final void run() {
        this.f27572b.maybeFinishPrepare();
    }
}
