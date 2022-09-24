package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaxh extends Surface {

    /* renamed from: d */
    private static boolean f42914d;

    /* renamed from: e */
    private static boolean f42915e;

    /* renamed from: b */
    private final C7946mm f42916b;

    /* renamed from: c */
    private boolean f42917c;

    /* synthetic */ zzaxh(C7946mm mmVar, SurfaceTexture surfaceTexture, boolean z, C7984nm nmVar) {
        super(surfaceTexture);
        this.f42916b = mmVar;
    }

    /* renamed from: a */
    public static zzaxh m40629a(Context context, boolean z) {
        if (C7836jm.f33934a >= 17) {
            boolean z2 = true;
            if (z && !m40630b(context)) {
                z2 = false;
            }
            C8195tl.m37900e(z2);
            return new C7946mm().mo33558a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* renamed from: b */
    public static synchronized boolean m40630b(Context context) {
        boolean z;
        synchronized (zzaxh.class) {
            if (!f42915e) {
                int i = C7836jm.f33934a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = C7836jm.f33937d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    f42914d = z2;
                }
                f42915e = true;
            }
            z = f42914d;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f42916b) {
            if (!this.f42917c) {
                this.f42916b.mo33559b();
                this.f42917c = true;
            }
        }
    }
}
