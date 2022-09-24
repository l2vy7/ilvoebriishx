package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.p00;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zza {
    /* renamed from: a */
    private static final boolean m28790a(Context context, Uri uri, zzw zzw, zzu zzu) {
        int i;
        try {
            i = zzt.zzp().zzs(context, uri);
            if (zzw != null) {
                zzw.zzg();
            }
        } catch (ActivityNotFoundException e) {
            co0.zzj(e.getMessage());
            i = 6;
        }
        if (zzu != null) {
            zzu.zzb(i);
        }
        return i == 5;
    }

    public static final boolean zza(Context context, Intent intent, zzw zzw, zzu zzu, boolean z) {
        String str;
        if (z) {
            return m28790a(context, intent.getData(), zzw, zzu);
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            if (valueOf.length() != 0) {
                str = "Launching an intent: ".concat(valueOf);
            } else {
                str = new String("Launching an intent: ");
            }
            zze.zza(str);
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzQ(context, intent);
            if (zzw != null) {
                zzw.zzg();
            }
            if (zzu != null) {
                zzu.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            co0.zzj(e.getMessage());
            if (zzu != null) {
                zzu.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzc, zzw zzw, zzu zzu) {
        int i = 0;
        if (zzc == null) {
            co0.zzj("No intent data for launcher overlay.");
            return false;
        }
        p00.m35913c(context);
        Intent intent = zzc.zzh;
        if (intent != null) {
            return zza(context, intent, zzw, zzu, zzc.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.zzb)) {
            co0.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.zzc)) {
            intent2.setDataAndType(Uri.parse(zzc.zzb), zzc.zzc);
        } else {
            intent2.setData(Uri.parse(zzc.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.zzd)) {
            intent2.setPackage(zzc.zzd);
        }
        if (!TextUtils.isEmpty(zzc.zze)) {
            String[] split = zzc.zze.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzc.zze);
                co0.zzj(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzc.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                co0.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37052b3)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37043a3)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzu(context, intent2);
            }
        }
        return zza(context, intent2, zzw, zzu, zzc.zzj);
    }
}
