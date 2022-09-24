package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lz2 {
    /* renamed from: a */
    public static float m34626a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static String m34627b(View view) {
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
