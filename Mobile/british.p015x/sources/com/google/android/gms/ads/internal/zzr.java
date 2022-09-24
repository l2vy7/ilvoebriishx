package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.wi2;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import p193c5.C6520c;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzr {

    /* renamed from: a */
    private final Context f27967a;

    /* renamed from: b */
    private final String f27968b;

    /* renamed from: c */
    private final Map<String, String> f27969c = new TreeMap();

    /* renamed from: d */
    private String f27970d;

    /* renamed from: e */
    private String f27971e;

    /* renamed from: f */
    private final String f27972f;

    public zzr(Context context, String str) {
        String str2;
        this.f27967a = context.getApplicationContext();
        this.f27968b = str;
        String packageName = context.getPackageName();
        try {
            String str3 = C6520c.m28321a(context).mo24355f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str3).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str3);
            str2 = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            co0.zzh("Unable to get package version name for reporting", e);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f27972f = str2;
    }

    public final String zza() {
        return this.f27972f;
    }

    public final String zzb() {
        return this.f27971e;
    }

    public final String zzc() {
        return this.f27968b;
    }

    public final String zzd() {
        return this.f27970d;
    }

    public final Map<String, String> zze() {
        return this.f27969c;
    }

    public final void zzf(zzbfd zzbfd, zzcjf zzcjf) {
        this.f27970d = zzbfd.f42949k.f42989b;
        Bundle bundle = zzbfd.f42952n;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String e = u10.f39717c.mo34648e();
            for (String str : bundle2.keySet()) {
                if (e.equals(str)) {
                    this.f27971e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f27969c.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.f27969c.put("SDKVersion", zzcjf.f43036b);
            if (u10.f39715a.mo34648e().booleanValue()) {
                try {
                    Bundle a = wi2.m39190a(this.f27967a, new JSONArray(u10.f39716b.mo34648e()));
                    for (String str2 : a.keySet()) {
                        this.f27969c.put(str2, a.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    co0.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }
}
