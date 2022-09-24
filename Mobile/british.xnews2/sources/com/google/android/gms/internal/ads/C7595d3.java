package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.android.gms.internal.ads.d3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7595d3 implements C8071q2 {

    /* renamed from: a */
    private final uq2 f30621a = new uq2(10);

    /* renamed from: b */
    private ad4 f30622b;

    /* renamed from: c */
    private boolean f30623c;

    /* renamed from: d */
    private long f30624d = C6540C.TIME_UNSET;

    /* renamed from: e */
    private int f30625e;

    /* renamed from: f */
    private int f30626f;

    /* renamed from: a */
    public final void mo18072a(uq2 uq2) {
        nu1.m20743b(this.f30622b);
        if (this.f30623c) {
            int i = uq2.mo35239i();
            int i2 = this.f30626f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(uq2.mo35238h(), uq2.mo35241k(), this.f30621a.mo35238h(), this.f30626f, min);
                if (this.f30626f + min == 10) {
                    this.f30621a.mo35236f(0);
                    if (this.f30621a.mo35249s() == 73 && this.f30621a.mo35249s() == 68 && this.f30621a.mo35249s() == 51) {
                        this.f30621a.mo35237g(3);
                        this.f30625e = this.f30621a.mo35248r() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f30623c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f30625e - this.f30626f);
            yc4.m39857b(this.f30622b, uq2, min2);
            this.f30626f += min2;
        }
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        ad4 m = yb4.mo18211m(e4Var.mo31469a(), 5);
        this.f30622b = m;
        ge4 ge4 = new ge4();
        ge4.mo32081h(e4Var.mo31470b());
        ge4.mo32093s(MimeTypes.APPLICATION_ID3);
        m.mo30354a(ge4.mo32099y());
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if ((i & 4) != 0) {
            this.f30623c = true;
            if (j != C6540C.TIME_UNSET) {
                this.f30624d = j;
            }
            this.f30625e = 0;
            this.f30626f = 0;
        }
    }

    public final void zzc() {
        int i;
        nu1.m20743b(this.f30622b);
        if (this.f30623c && (i = this.f30625e) != 0 && this.f30626f == i) {
            long j = this.f30624d;
            if (j != C6540C.TIME_UNSET) {
                this.f30622b.mo30358e(j, 1, i, 0, (zc4) null);
            }
            this.f30623c = false;
        }
    }

    public final void zze() {
        this.f30623c = false;
        this.f30624d = C6540C.TIME_UNSET;
    }
}
