package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.g2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7705g2 implements C8071q2 {

    /* renamed from: a */
    private final tp2 f32100a;

    /* renamed from: b */
    private final uq2 f32101b;

    /* renamed from: c */
    private final String f32102c;

    /* renamed from: d */
    private String f32103d;

    /* renamed from: e */
    private ad4 f32104e;

    /* renamed from: f */
    private int f32105f = 0;

    /* renamed from: g */
    private int f32106g;

    /* renamed from: h */
    private boolean f32107h;

    /* renamed from: i */
    private long f32108i;

    /* renamed from: j */
    private C8281w f32109j;

    /* renamed from: k */
    private int f32110k;

    /* renamed from: l */
    private long f32111l = C6540C.TIME_UNSET;

    public C7705g2(String str) {
        tp2 tp2 = new tp2(new byte[128], 128);
        this.f32100a = tp2;
        this.f32101b = new uq2(tp2.f39483a);
        this.f32102c = str;
    }

    /* renamed from: a */
    public final void mo18072a(uq2 uq2) {
        nu1.m20743b(this.f32104e);
        while (uq2.mo35239i() > 0) {
            int i = this.f32105f;
            if (i == 0) {
                while (true) {
                    if (uq2.mo35239i() <= 0) {
                        break;
                    } else if (!this.f32107h) {
                        this.f32107h = uq2.mo35249s() == 11;
                    } else {
                        int s = uq2.mo35249s();
                        if (s == 119) {
                            this.f32107h = false;
                            this.f32105f = 1;
                            this.f32101b.mo35238h()[0] = 11;
                            this.f32101b.mo35238h()[1] = 119;
                            this.f32106g = 2;
                            break;
                        }
                        this.f32107h = s == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(uq2.mo35239i(), this.f32110k - this.f32106g);
                yc4.m39857b(this.f32104e, uq2, min);
                int i2 = this.f32106g + min;
                this.f32106g = i2;
                int i3 = this.f32110k;
                if (i2 == i3) {
                    long j = this.f32111l;
                    if (j != C6540C.TIME_UNSET) {
                        this.f32104e.mo30358e(j, 1, i3, 0, (zc4) null);
                        this.f32111l += this.f32108i;
                    }
                    this.f32105f = 0;
                }
            } else {
                byte[] h = this.f32101b.mo35238h();
                int min2 = Math.min(uq2.mo35239i(), 128 - this.f32106g);
                uq2.mo35232b(h, this.f32106g, min2);
                int i4 = this.f32106g + min2;
                this.f32106g = i4;
                if (i4 == 128) {
                    this.f32100a.mo35013h(0);
                    za4 d = ab4.m30277d(this.f32100a);
                    C8281w wVar = this.f32109j;
                    if (wVar == null || d.f42390c != wVar.f40632y || d.f42389b != wVar.f40633z || !d13.m20317p(d.f42388a, wVar.f40619l)) {
                        ge4 ge4 = new ge4();
                        ge4.mo32081h(this.f32103d);
                        ge4.mo32093s(d.f42388a);
                        ge4.mo32076e0(d.f42390c);
                        ge4.mo32094t(d.f42389b);
                        ge4.mo32085k(this.f32102c);
                        C8281w y = ge4.mo32099y();
                        this.f32109j = y;
                        this.f32104e.mo30354a(y);
                    }
                    this.f32110k = d.f42391d;
                    this.f32108i = (((long) d.f42392e) * 1000000) / ((long) this.f32109j.f40633z);
                    this.f32101b.mo35236f(0);
                    yc4.m39857b(this.f32104e, this.f32101b, 128);
                    this.f32105f = 2;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f32103d = e4Var.mo31470b();
        this.f32104e = yb4.mo18211m(e4Var.mo31469a(), 1);
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f32111l = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f32105f = 0;
        this.f32106g = 0;
        this.f32107h = false;
        this.f32111l = C6540C.TIME_UNSET;
    }
}
