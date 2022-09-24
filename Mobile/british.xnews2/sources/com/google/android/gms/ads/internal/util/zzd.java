package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.so0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzd {
    public static void zza(Context context) {
        if (bo0.m30770k(context) && !bo0.m30772m()) {
            mb3<?> zzb = new zzc(context).zzb();
            co0.zzi("Updating ad debug logging enablement.");
            so0.m37458a(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
