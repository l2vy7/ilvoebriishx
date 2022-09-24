package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qs2 {
    /* renamed from: a */
    public static void m36699a(Context context, boolean z) {
        if (z) {
            co0.zzi("This request is sent from a test device.");
            return;
        }
        C8241uv.m38463b();
        String t = vn0.m38861t(context);
        StringBuilder sb = new StringBuilder(String.valueOf(t).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(t);
        sb.append("\")) to get test ads on this device.");
        co0.zzi(sb.toString());
    }

    /* renamed from: b */
    public static void m36700b(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        co0.zzi(sb.toString());
        zze.zzb(str, th);
        if (i != 3) {
            zzt.zzo().mo18591r(th, str);
        }
    }
}
