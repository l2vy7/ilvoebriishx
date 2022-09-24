package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vr1 implements u70 {

    /* renamed from: b */
    private final ub1 f20934b;

    /* renamed from: c */
    private final zzces f20935c;

    /* renamed from: d */
    private final String f20936d;

    /* renamed from: e */
    private final String f20937e;

    public vr1(ub1 ub1, ir2 ir2) {
        this.f20934b = ub1;
        this.f20935c = ir2.f33487m;
        this.f20936d = ir2.f33484k;
        this.f20937e = ir2.f33486l;
    }

    @ParametersAreNonnullByDefault
    /* renamed from: C */
    public final void mo18913C(zzces zzces) {
        int i;
        String str;
        zzces zzces2 = this.f20935c;
        if (zzces2 != null) {
            zzces = zzces2;
        }
        if (zzces != null) {
            str = zzces.f43026b;
            i = zzces.f43027c;
        } else {
            i = 1;
            str = "";
        }
        this.f20934b.mo35158E0(new hj0(str, i), this.f20936d, this.f20937e);
    }

    public final void zzb() {
        this.f20934b.zze();
    }

    public final void zzc() {
        this.f20934b.mo35159G0();
    }
}
