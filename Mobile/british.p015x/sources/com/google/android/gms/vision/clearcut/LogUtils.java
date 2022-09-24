package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C9606r;
import com.google.android.gms.internal.vision.C9643v2;
import p187z5.C11148d;
import p193c5.C6520c;

@Keep
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class LogUtils {
    public static C9606r zza(Context context) {
        C9606r.C9607a w = C9606r.m44555w().mo38563w(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            w.mo38564y(zzb);
        }
        return (C9606r) ((C9643v2) w.mo38389A());
    }

    private static String zzb(Context context) {
        try {
            return C6520c.m28321a(context).mo24355f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C11148d.m49747c(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }
}
