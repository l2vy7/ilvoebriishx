package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ams */
/* compiled from: IMASDK */
public final class ams extends Surface {

    /* renamed from: a */
    private static int f15329a;

    /* renamed from: b */
    private static boolean f15330b;

    /* renamed from: c */
    private final C3843amr f15331c;

    /* renamed from: d */
    private boolean f15332d;

    /* synthetic */ ams(C3843amr amr, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f15331c = amr;
    }

    /* renamed from: a */
    public static synchronized boolean m14262a(Context context) {
        int i;
        synchronized (ams.class) {
            if (!f15330b) {
                int i2 = amm.f15298a;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!"samsung".equals(amm.f15300c)) {
                            if ("XT1650".equals(amm.f15301d)) {
                            }
                        }
                    }
                    if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            if (i2 >= 17) {
                                String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                                if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                    i3 = 1;
                                }
                            }
                            f15329a = i3;
                            f15330b = true;
                        }
                    }
                }
                i3 = 0;
                f15329a = i3;
                f15330b = true;
            }
            i = f15329a;
        }
        return i != 0;
    }

    /* renamed from: b */
    public static ams m14263b(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m14262a(context)) {
            z2 = false;
        }
        aup.m14887r(z2);
        C3843amr amr = new C3843amr();
        if (z) {
            i = f15329a;
        }
        return amr.mo14008a(i);
    }

    public final void release() {
        super.release();
        synchronized (this.f15331c) {
            if (!this.f15332d) {
                this.f15331c.mo14009b();
                this.f15332d = true;
            }
        }
    }
}
