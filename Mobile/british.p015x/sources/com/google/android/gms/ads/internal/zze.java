package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.hb0;
import com.google.android.gms.internal.ads.in0;
import com.google.android.gms.internal.ads.mb0;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.pb0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.sb0;
import com.google.android.gms.internal.ads.so0;
import com.google.android.gms.internal.ads.zzcjf;
import com.unity3d.ads.metadata.MediationMetaData;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p193c5.C6520c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zze {

    /* renamed from: a */
    private Context f19879a;

    /* renamed from: b */
    private long f19880b = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17651a(Context context, zzcjf zzcjf, boolean z, in0 in0, String str, String str2, Runnable runnable) {
        PackageInfo f;
        if (zzt.zzA().elapsedRealtime() - this.f19880b < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            co0.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f19880b = zzt.zzA().elapsedRealtime();
        if (in0 != null) {
            long a = in0.mo32719a();
            if (zzt.zzA().currentTimeMillis() - a <= ((Long) C8311wv.m39277c().mo18570b(p00.f36866E2)).longValue() && in0.mo32727i()) {
                return;
            }
        }
        if (context == null) {
            co0.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f19879a = applicationContext;
            sb0 a2 = zzt.zzf().mo18420a(this.f19879a, zzcjf);
            mb0<JSONObject> mb0 = pb0.f37568b;
            hb0<I, O> a3 = a2.mo18829a("google.afma.config.fetchAppSettings", mb0, mb0);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", p00.m35911a()));
                try {
                    ApplicationInfo applicationInfo = this.f19879a.getApplicationInfo();
                    if (!(applicationInfo == null || (f = C6520c.m28321a(context).mo24355f(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put(MediationMetaData.KEY_VERSION, f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                mb3<O> zzb = a3.zzb(jSONObject);
                zzd zzd = zzd.zza;
                nb3 nb3 = po0.f37727f;
                mb3<O> n = bb3.m30654n(zzb, zzd, nb3);
                if (runnable != null) {
                    zzb.zzc(runnable, nb3);
                }
                so0.m37458a(n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                co0.zzh("Error requesting application settings", e);
            }
        } else {
            co0.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zza(Context context, zzcjf zzcjf, String str, Runnable runnable) {
        mo17651a(context, zzcjf, true, (in0) null, str, (String) null, runnable);
    }

    public final void zzc(Context context, zzcjf zzcjf, String str, in0 in0) {
        mo17651a(context, zzcjf, false, in0, in0 != null ? in0.mo32720b() : null, str, (Runnable) null);
    }
}
