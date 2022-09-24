package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.h3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7742h3 implements C8072q3 {

    /* renamed from: a */
    private C8281w f32598a;

    /* renamed from: b */
    private ay2 f32599b;

    /* renamed from: c */
    private ad4 f32600c;

    public C7742h3(String str) {
        ge4 ge4 = new ge4();
        ge4.mo32093s(str);
        this.f32598a = ge4.mo32099y();
    }

    /* renamed from: a */
    public final void mo32326a(uq2 uq2) {
        nu1.m20743b(this.f32599b);
        int i = d13.f20195a;
        long d = this.f32599b.mo30575d();
        long e = this.f32599b.mo30576e();
        if (d != C6540C.TIME_UNSET && e != C6540C.TIME_UNSET) {
            C8281w wVar = this.f32598a;
            if (e != wVar.f40623p) {
                ge4 b = wVar.mo35521b();
                b.mo32097w(e);
                C8281w y = b.mo32099y();
                this.f32598a = y;
                this.f32600c.mo30354a(y);
            }
            int i2 = uq2.mo35239i();
            yc4.m39857b(this.f32600c, uq2, i2);
            this.f32600c.mo30358e(d, 1, i2, 0, (zc4) null);
        }
    }

    /* renamed from: b */
    public final void mo32327b(ay2 ay2, yb4 yb4, C7633e4 e4Var) {
        this.f32599b = ay2;
        e4Var.mo31471c();
        ad4 m = yb4.mo18211m(e4Var.mo31469a(), 5);
        this.f32600c = m;
        m.mo30354a(this.f32598a);
    }
}
