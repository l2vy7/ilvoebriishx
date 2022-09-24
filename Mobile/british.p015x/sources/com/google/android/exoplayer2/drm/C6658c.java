package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6658c implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C6658c f27375a = new C6658c();

    private /* synthetic */ C6658c() {
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded();
    }
}
