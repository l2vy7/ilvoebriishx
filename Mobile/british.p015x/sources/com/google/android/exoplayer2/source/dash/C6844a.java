package com.google.android.exoplayer2.source.dash;

/* renamed from: com.google.android.exoplayer2.source.dash.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6844a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DashMediaSource f27533b;

    public /* synthetic */ C6844a(DashMediaSource dashMediaSource) {
        this.f27533b = dashMediaSource;
    }

    public final void run() {
        this.f27533b.startLoadingManifest();
    }
}
