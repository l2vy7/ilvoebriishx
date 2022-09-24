package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.f3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7669f3 implements C8071q2 {

    /* renamed from: a */
    private final uq2 f31596a;

    /* renamed from: b */
    private final qc4 f31597b;

    /* renamed from: c */
    private final String f31598c;

    /* renamed from: d */
    private ad4 f31599d;

    /* renamed from: e */
    private String f31600e;

    /* renamed from: f */
    private int f31601f = 0;

    /* renamed from: g */
    private int f31602g;

    /* renamed from: h */
    private boolean f31603h;

    /* renamed from: i */
    private boolean f31604i;

    /* renamed from: j */
    private long f31605j;

    /* renamed from: k */
    private int f31606k;

    /* renamed from: l */
    private long f31607l;

    public C7669f3(String str) {
        uq2 uq2 = new uq2(4);
        this.f31596a = uq2;
        uq2.mo35238h()[0] = -1;
        this.f31597b = new qc4();
        this.f31607l = C6540C.TIME_UNSET;
        this.f31598c = str;
    }

    /* renamed from: a */
    public final void mo18072a(uq2 uq2) {
        nu1.m20743b(this.f31599d);
        while (uq2.mo35239i() > 0) {
            int i = this.f31601f;
            if (i == 0) {
                byte[] h = uq2.mo35238h();
                int k = uq2.mo35241k();
                int l = uq2.mo35242l();
                while (true) {
                    if (k >= l) {
                        uq2.mo35236f(l);
                        break;
                    }
                    byte b = h[k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f31604i && (b & 224) == 224;
                    this.f31604i = z;
                    if (z2) {
                        uq2.mo35236f(k + 1);
                        this.f31604i = false;
                        this.f31596a.mo35238h()[1] = h[k];
                        this.f31602g = 2;
                        this.f31601f = 1;
                        break;
                    }
                    k++;
                }
            } else if (i != 1) {
                int min = Math.min(uq2.mo35239i(), this.f31606k - this.f31602g);
                yc4.m39857b(this.f31599d, uq2, min);
                int i2 = this.f31602g + min;
                this.f31602g = i2;
                int i3 = this.f31606k;
                if (i2 >= i3) {
                    long j = this.f31607l;
                    if (j != C6540C.TIME_UNSET) {
                        this.f31599d.mo30358e(j, 1, i3, 0, (zc4) null);
                        this.f31607l += this.f31605j;
                    }
                    this.f31602g = 0;
                    this.f31601f = 0;
                }
            } else {
                int min2 = Math.min(uq2.mo35239i(), 4 - this.f31602g);
                uq2.mo35232b(this.f31596a.mo35238h(), this.f31602g, min2);
                int i4 = this.f31602g + min2;
                this.f31602g = i4;
                if (i4 >= 4) {
                    this.f31596a.mo35236f(0);
                    if (!this.f31597b.mo34320a(this.f31596a.mo35243m())) {
                        this.f31602g = 0;
                        this.f31601f = 1;
                    } else {
                        qc4 qc4 = this.f31597b;
                        this.f31606k = qc4.f37976c;
                        if (!this.f31603h) {
                            this.f31605j = (((long) qc4.f37980g) * 1000000) / ((long) qc4.f37977d);
                            ge4 ge4 = new ge4();
                            ge4.mo32081h(this.f31600e);
                            ge4.mo32093s(this.f31597b.f37975b);
                            ge4.mo32086l(4096);
                            ge4.mo32076e0(this.f31597b.f37978e);
                            ge4.mo32094t(this.f31597b.f37977d);
                            ge4.mo32085k(this.f31598c);
                            this.f31599d.mo30354a(ge4.mo32099y());
                            this.f31603h = true;
                        }
                        this.f31596a.mo35236f(0);
                        yc4.m39857b(this.f31599d, this.f31596a, 4);
                        this.f31601f = 2;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f31600e = e4Var.mo31470b();
        this.f31599d = yb4.mo18211m(e4Var.mo31469a(), 1);
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f31607l = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f31601f = 0;
        this.f31602g = 0;
        this.f31604i = false;
        this.f31607l = C6540C.TIME_UNSET;
    }
}
