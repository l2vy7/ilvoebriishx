package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6656a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f27373a;

    public /* synthetic */ C6656a(int i) {
        this.f27373a = i;
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmSessionAcquired(this.f27373a);
    }
}
