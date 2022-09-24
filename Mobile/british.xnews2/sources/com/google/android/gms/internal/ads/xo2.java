package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xo2 {
    /* renamed from: a */
    static vo2<a41, f41> m39514a(Context context, gt2 gt2, yt2 yt2) {
        return m39516c(context, gt2, yt2);
    }

    /* renamed from: b */
    static vo2<o31, v31> m39515b(Context context, gt2 gt2, yt2 yt2) {
        return m39516c(context, gt2, yt2);
    }

    /* renamed from: c */
    private static <AppOpenAdRequestComponent extends v91<AppOpenAd>, AppOpenAd extends o61> vo2<AppOpenAdRequestComponent, AppOpenAd> m39516c(Context context, gt2 gt2, yt2 yt2) {
        in0 in0;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36932M4)).booleanValue()) {
            in0 = zzt.zzo().mo18583h().zzg();
        } else {
            in0 = zzt.zzo().mo18583h().zzh();
        }
        boolean z = false;
        if (in0 != null && in0.mo32726h()) {
            z = true;
        }
        if (((Integer) C8311wv.m39277c().mo18570b(p00.f37063c5)).intValue() > 0) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36924L4)).booleanValue() || z) {
                xt2 a = yt2.mo35974a(ot2.AppOpen, context, gt2, new yn2(new vn2()));
                ko2 ko2 = new ko2(new jo2());
                kt2 kt2 = a.f41327a;
                nb3 nb3 = po0.f37722a;
                return new ao2(ko2, new go2(kt2, nb3), a.f41328b, a.f41327a.zza().f21173i, nb3);
            }
        }
        return new jo2();
    }
}
