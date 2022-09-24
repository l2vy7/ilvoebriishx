package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class u90 {
    /* renamed from: a */
    public static void m38242a(v90 v90, String str, Map map) {
        try {
            v90.mo18322a(str, zzt.zzp().zzf(map));
        } catch (JSONException unused) {
            co0.zzj("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m38243b(v90 v90, String str, JSONObject jSONObject) {
        String str2;
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        if (sb2.length() != 0) {
            str2 = "Dispatching AFMA event: ".concat(sb2);
        } else {
            str2 = new String("Dispatching AFMA event: ");
        }
        co0.zze(str2);
        v90.zza(sb.toString());
    }

    /* renamed from: c */
    public static void m38244c(v90 v90, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        v90.zza(sb.toString());
    }

    /* renamed from: d */
    public static void m38245d(v90 v90, String str, JSONObject jSONObject) {
        v90.mo18325g(str, jSONObject.toString());
    }
}
