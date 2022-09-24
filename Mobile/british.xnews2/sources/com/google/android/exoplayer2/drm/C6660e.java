package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6660e implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C6660e f27377a = new C6660e();

    private /* synthetic */ C6660e() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
    }
}
