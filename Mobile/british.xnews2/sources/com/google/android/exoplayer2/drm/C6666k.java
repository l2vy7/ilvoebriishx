package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6666k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f27382b;

    /* renamed from: c */
    public final /* synthetic */ DrmSessionEventListener f27383c;

    public /* synthetic */ C6666k(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        this.f27382b = eventDispatcher;
        this.f27383c = drmSessionEventListener;
    }

    public final void run() {
        this.f27382b.lambda$drmSessionReleased$5(this.f27383c);
    }
}
