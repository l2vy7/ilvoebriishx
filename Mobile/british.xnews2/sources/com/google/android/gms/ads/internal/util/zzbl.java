package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C7635e6;
import com.google.android.gms.internal.ads.C8358y5;
import com.google.android.gms.internal.ads.co0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzbl implements C8358y5 {

    /* renamed from: a */
    final /* synthetic */ String f27862a;

    /* renamed from: b */
    final /* synthetic */ zzbp f27863b;

    zzbl(zzbs zzbs, String str, zzbp zzbp) {
        this.f27862a = str;
        this.f27863b = zzbp;
    }

    public final void zza(C7635e6 e6Var) {
        String str = this.f27862a;
        String exc = e6Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        co0.zzj(sb.toString());
        this.f27863b.zza(null);
    }
}
