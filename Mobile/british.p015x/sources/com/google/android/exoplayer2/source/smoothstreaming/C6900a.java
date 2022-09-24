package com.google.android.exoplayer2.source.smoothstreaming;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6900a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SsMediaSource f27597b;

    public /* synthetic */ C6900a(SsMediaSource ssMediaSource) {
        this.f27597b = ssMediaSource;
    }

    public final void run() {
        this.f27597b.startLoadingManifest();
    }
}
