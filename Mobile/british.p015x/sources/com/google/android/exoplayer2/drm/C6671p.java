package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6671p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f27393b;

    /* renamed from: c */
    public final /* synthetic */ DrmSessionEventListener f27394c;

    /* renamed from: d */
    public final /* synthetic */ Exception f27395d;

    public /* synthetic */ C6671p(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, Exception exc) {
        this.f27393b = eventDispatcher;
        this.f27394c = drmSessionEventListener;
        this.f27395d = exc;
    }

    public final void run() {
        this.f27393b.lambda$drmSessionManagerError$2(this.f27394c, this.f27395d);
    }
}
