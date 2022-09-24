package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* renamed from: com.google.android.exoplayer2.drm.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6661f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DefaultDrmSessionManager.PreacquiredSessionReference f27378b;

    public /* synthetic */ C6661f(DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference) {
        this.f27378b = preacquiredSessionReference;
    }

    public final void run() {
        this.f27378b.lambda$release$1();
    }
}
