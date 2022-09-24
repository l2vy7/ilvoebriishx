package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* renamed from: com.google.android.exoplayer2.drm.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6657b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Exception f27374a;

    public /* synthetic */ C6657b(Exception exc) {
        this.f27374a = exc;
    }

    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmSessionManagerError(this.f27374a);
    }
}
