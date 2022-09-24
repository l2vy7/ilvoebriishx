package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6670o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f27390b;

    /* renamed from: c */
    public final /* synthetic */ DrmSessionEventListener f27391c;

    /* renamed from: d */
    public final /* synthetic */ int f27392d;

    public /* synthetic */ C6670o(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f27390b = eventDispatcher;
        this.f27391c = drmSessionEventListener;
        this.f27392d = i;
    }

    public final void run() {
        this.f27390b.lambda$drmSessionAcquired$0(this.f27391c, this.f27392d);
    }
}
