package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arj */
/* compiled from: IMASDK */
public final class arj implements ari {
    static {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                SystemClock.elapsedRealtimeNanos();
            }
        } catch (Throwable unused) {
        }
    }
}
