package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* renamed from: com.google.android.exoplayer2.drm.i */
/* compiled from: DrmSession */
public final /* synthetic */ class C6664i {
    /* renamed from: a */
    public static boolean m28519a(DrmSession drmSession) {
        return false;
    }

    /* renamed from: b */
    public static void m28520b(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession != drmSession2) {
            if (drmSession2 != null) {
                drmSession2.acquire((DrmSessionEventListener.EventDispatcher) null);
            }
            if (drmSession != null) {
                drmSession.release((DrmSessionEventListener.EventDispatcher) null);
            }
        }
    }
}
