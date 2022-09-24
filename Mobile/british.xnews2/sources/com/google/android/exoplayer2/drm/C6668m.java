package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6668m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f27386b;

    /* renamed from: c */
    public final /* synthetic */ DrmSessionEventListener f27387c;

    public /* synthetic */ C6668m(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        this.f27386b = eventDispatcher;
        this.f27387c = drmSessionEventListener;
    }

    public final void run() {
        this.f27386b.lambda$drmKeysLoaded$1(this.f27387c);
    }
}
