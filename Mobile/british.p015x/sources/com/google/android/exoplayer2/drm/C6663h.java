package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6663h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DefaultDrmSession f27381b;

    public /* synthetic */ C6663h(DefaultDrmSession defaultDrmSession) {
        this.f27381b = defaultDrmSession;
    }

    public final void run() {
        this.f27381b.release((DrmSessionEventListener.EventDispatcher) null);
    }
}
