package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6667l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f27384b;

    /* renamed from: c */
    public final /* synthetic */ DrmSessionEventListener f27385c;

    public /* synthetic */ C6667l(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        this.f27384b = eventDispatcher;
        this.f27385c = drmSessionEventListener;
    }

    public final void run() {
        this.f27384b.lambda$drmKeysRemoved$4(this.f27385c);
    }
}
