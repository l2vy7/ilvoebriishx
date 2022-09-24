package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ap2 implements uu3<vo2<ds1, yr1>> {

    /* renamed from: a */
    private final iv3<Context> f29711a;

    /* renamed from: b */
    private final iv3<gt2> f29712b;

    /* renamed from: c */
    private final iv3<yt2> f29713c;

    public ap2(iv3<Context> iv3, iv3<gt2> iv32, iv3<yt2> iv33) {
        this.f29711a = iv3;
        this.f29712b = iv32;
        this.f29713c = iv33;
    }

    /* renamed from: a */
    public final vo2<ds1, yr1> zzb() {
        in0 in0;
        Context zzb = this.f29711a.zzb();
        gt2 zzb2 = this.f29712b.zzb();
        yt2 zzb3 = this.f29713c.zzb();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36932M4)).booleanValue()) {
            in0 = zzt.zzo().mo18583h().zzg();
        } else {
            in0 = zzt.zzo().mo18583h().zzh();
        }
        boolean z = false;
        if (in0 != null && in0.mo32726h()) {
            z = true;
        }
        if (((Integer) C8311wv.m39277c().mo18570b(p00.f36948O4)).intValue() > 0) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36924L4)).booleanValue() || z) {
                xt2 a = zzb3.mo35974a(ot2.Rewarded, zzb, zzb2, new yn2(new vn2()));
                ko2 ko2 = new ko2(new jo2());
                kt2 kt2 = a.f41327a;
                nb3 nb3 = po0.f37722a;
                return new ao2(ko2, new go2(kt2, nb3), a.f41328b, a.f41327a.zza().f21173i, nb3);
            }
        }
        return new jo2();
    }
}
