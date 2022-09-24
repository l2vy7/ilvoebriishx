package com.google.ads.interactivemedia.p038v3.internal;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.ads.interactivemedia.p038v3.impl.data.TestingConfiguration;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ko */
/* compiled from: IMASDK */
public final /* synthetic */ class C4130ko {
    /* renamed from: a */
    public static C4084iw m17745a(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        return new C4084iw(0.97f, 1.03f, 1000, 1.0E-7f, j2, j3, 0.999f);
    }

    /* renamed from: b */
    public static boolean m17746b(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceTvMode()) {
            return true;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Application m17747c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    /* renamed from: d */
    public static float m17748d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: e */
    public static String m17749e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                return visibility != 8 ? "viewNotVisible" : "viewGone";
            }
            return "viewInvisible";
        } else if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        } else {
            return null;
        }
    }
}
