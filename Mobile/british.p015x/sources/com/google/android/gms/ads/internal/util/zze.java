package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.g20;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zze extends co0 {
    public static void zza(String str) {
        if (!zzc()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : co0.f30442a.mo33028d(str)) {
            if (z) {
                Log.v("Ads", next);
            } else {
                Log.v("Ads-cont", next);
            }
            z = false;
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return co0.zzm(2) && g20.f32112a.mo34648e().booleanValue();
    }
}
