package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6669n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f27388b;

    /* renamed from: c */
    public final /* synthetic */ DrmSessionEventListener f27389c;

    public /* synthetic */ C6669n(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        this.f27388b = eventDispatcher;
        this.f27389c = drmSessionEventListener;
    }

    public final void run() {
        this.f27388b.lambda$drmKeysRestored$3(this.f27389c);
    }
}
