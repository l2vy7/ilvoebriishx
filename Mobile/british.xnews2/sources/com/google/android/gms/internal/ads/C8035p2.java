package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8035p2 implements C8071q2 {

    /* renamed from: a */
    private final List<C7526b4> f37284a;

    /* renamed from: b */
    private final ad4[] f37285b;

    /* renamed from: c */
    private boolean f37286c;

    /* renamed from: d */
    private int f37287d;

    /* renamed from: e */
    private int f37288e;

    /* renamed from: f */
    private long f37289f = C6540C.TIME_UNSET;

    public C8035p2(List<C7526b4> list) {
        this.f37284a = list;
        this.f37285b = new ad4[list.size()];
    }

    /* renamed from: d */
    private final boolean m35921d(uq2 uq2, int i) {
        if (uq2.mo35239i() == 0) {
            return false;
        }
        if (uq2.mo35249s() != i) {
            this.f37286c = false;
        }
        this.f37287d--;
        return this.f37286c;
    }

    /* renamed from: a */
    public final void mo18072a(uq2 uq2) {
        if (!this.f37286c) {
            return;
        }
        if (this.f37287d != 2 || m35921d(uq2, 32)) {
            if (this.f37287d != 1 || m35921d(uq2, 0)) {
                int k = uq2.mo35241k();
                int i = uq2.mo35239i();
                for (ad4 d : this.f37285b) {
                    uq2.mo35236f(k);
                    d.mo30357d(uq2, i);
                }
                this.f37288e += i;
            }
        }
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        for (int i = 0; i < this.f37285b.length; i++) {
            C7526b4 b4Var = this.f37284a.get(i);
            e4Var.mo31471c();
            ad4 m = yb4.mo18211m(e4Var.mo31469a(), 3);
            ge4 ge4 = new ge4();
            ge4.mo32081h(e4Var.mo31470b());
            ge4.mo32093s(MimeTypes.APPLICATION_DVBSUBS);
            ge4.mo32083i(Collections.singletonList(b4Var.f29901b));
            ge4.mo32085k(b4Var.f29900a);
            m.mo30354a(ge4.mo32099y());
            this.f37285b[i] = m;
        }
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if ((i & 4) != 0) {
            this.f37286c = true;
            if (j != C6540C.TIME_UNSET) {
                this.f37289f = j;
            }
            this.f37288e = 0;
            this.f37287d = 2;
        }
    }

    public final void zzc() {
        if (this.f37286c) {
            if (this.f37289f != C6540C.TIME_UNSET) {
                for (ad4 e : this.f37285b) {
                    e.mo30358e(this.f37289f, 1, this.f37288e, 0, (zc4) null);
                }
            }
            this.f37286c = false;
        }
    }

    public final void zze() {
        this.f37286c = false;
        this.f37289f = C6540C.TIME_UNSET;
    }
}
