package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzuq extends Surface {

    /* renamed from: e */
    private static int f43066e;

    /* renamed from: f */
    private static boolean f43067f;

    /* renamed from: b */
    public final boolean f43068b;

    /* renamed from: c */
    private final t94 f43069c;

    /* renamed from: d */
    private boolean f43070d;

    /* synthetic */ zzuq(t94 t94, SurfaceTexture surfaceTexture, boolean z, u94 u94) {
        super(surfaceTexture);
        this.f43069c = t94;
        this.f43068b = z;
    }

    /* renamed from: a */
    public static zzuq m40664a(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m40665b(context)) {
            z2 = false;
        }
        nu1.m20747f(z2);
        t94 t94 = new t94();
        if (z) {
            i = f43066e;
        }
        return t94.mo34874a(i);
    }

    /* renamed from: b */
    public static synchronized boolean m40665b(Context context) {
        int i;
        synchronized (zzuq.class) {
            if (!f43067f) {
                int i2 = d13.f20195a;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!"samsung".equals(d13.f20197c)) {
                            if ("XT1650".equals(d13.f20198d)) {
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
                            f43066e = i3;
                            f43067f = true;
                        }
                    }
                }
                i3 = 0;
                f43066e = i3;
                f43067f = true;
            }
            i = f43066e;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.f43069c) {
            if (!this.f43070d) {
                this.f43069c.mo34875b();
                this.f43070d = true;
            }
        }
    }
}
