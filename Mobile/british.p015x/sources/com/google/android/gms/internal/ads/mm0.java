package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mm0 {
    /* renamed from: a */
    static Uri m34820a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: b */
    public static String m34821b(Uri uri, Context context) {
        if (!zzt.zzn().mo18501z(context)) {
            return uri.toString();
        }
        String f = zzt.zzn().mo18481f(context);
        if (f == null) {
            return uri.toString();
        }
        String str = (String) C8311wv.m39277c().mo18570b(p00.f37031Z);
        String uri2 = uri.toString();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37023Y)).booleanValue() && uri2.contains(str)) {
            zzt.zzn().mo18493r(context, f);
            return m34823d(uri2, context).replace(str, f);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            String uri3 = m34820a(m34823d(uri2, context), "fbs_aeid", f).toString();
            zzt.zzn().mo18493r(context, f);
            return uri3;
        }
    }

    /* renamed from: c */
    public static String m34822c(String str, Context context, boolean z) {
        String f;
        if ((((Boolean) C8311wv.m39277c().mo18570b(p00.f37094g0)).booleanValue() && !z) || !zzt.zzn().mo18501z(context) || TextUtils.isEmpty(str) || (f = zzt.zzn().mo18481f(context)) == null) {
            return str;
        }
        String str2 = (String) C8311wv.m39277c().mo18570b(p00.f37031Z);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37023Y)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (zzt.zzp().zzo(str)) {
                zzt.zzn().mo18493r(context, f);
                return m34820a(m34823d(str, context), "fbs_aeid", f).toString();
            } else if (!zzt.zzp().zzp(str)) {
                return str;
            } else {
                zzt.zzn().mo18494s(context, f);
                return m34820a(m34823d(str, context), "fbs_aeid", f).toString();
            }
        } else if (zzt.zzp().zzo(str)) {
            zzt.zzn().mo18493r(context, f);
            return m34823d(str, context).replace(str2, f);
        } else if (!zzt.zzp().zzp(str)) {
            return str;
        } else {
            zzt.zzn().mo18494s(context, f);
            return m34823d(str, context).replace(str2, f);
        }
    }

    /* renamed from: d */
    private static String m34823d(String str, Context context) {
        String j = zzt.zzn().mo18485j(context);
        String h = zzt.zzn().mo18483h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j)) {
            str = m34820a(str, "gmp_app_id", j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h)) ? str : m34820a(str, "fbs_aiid", h).toString();
    }
}
