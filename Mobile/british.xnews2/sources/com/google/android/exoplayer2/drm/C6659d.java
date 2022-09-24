package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6659d implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C6659d f27376a = new C6659d();

    private /* synthetic */ C6659d() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
    }
}
