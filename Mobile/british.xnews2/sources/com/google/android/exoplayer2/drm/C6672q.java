package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;

/* renamed from: com.google.android.exoplayer2.drm.q */
/* compiled from: DrmSessionManager */
public final /* synthetic */ class C6672q {
    static {
        DrmSessionManager drmSessionManager = DrmSessionManager.DRM_UNSUPPORTED;
    }

    /* renamed from: a */
    public static DrmSessionManager.DrmSessionReference m28528a(DrmSessionManager drmSessionManager, Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionManager.DrmSessionReference.EMPTY;
    }

    /* renamed from: b */
    public static void m28529b(DrmSessionManager drmSessionManager) {
    }

    /* renamed from: c */
    public static void m28530c(DrmSessionManager drmSessionManager) {
    }

    @Deprecated
    /* renamed from: d */
    public static DrmSessionManager m28531d() {
        return DrmSessionManager.DRM_UNSUPPORTED;
    }
}
