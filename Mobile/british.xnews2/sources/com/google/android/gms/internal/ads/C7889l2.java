package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.l2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7889l2 implements vb4 {

    /* renamed from: j */
    public static final cc4 f34790j = C7852k2.f34123b;

    /* renamed from: a */
    private final C7926m2 f34791a = new C7926m2(true, (String) null);

    /* renamed from: b */
    private final uq2 f34792b = new uq2(2048);

    /* renamed from: c */
    private final uq2 f34793c;

    /* renamed from: d */
    private final tp2 f34794d;

    /* renamed from: e */
    private yb4 f34795e;

    /* renamed from: f */
    private long f34796f;

    /* renamed from: g */
    private long f34797g = -1;

    /* renamed from: h */
    private boolean f34798h;

    /* renamed from: i */
    private boolean f34799i;

    public C7889l2(int i) {
        uq2 uq2 = new uq2(10);
        this.f34793c = uq2;
        byte[] h = uq2.mo35238h();
        this.f34794d = new tp2(h, h.length);
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        int i = 0;
        while (true) {
            qb4 qb4 = (qb4) wb4;
            qb4.mo33311e(this.f34793c.mo35238h(), 0, 10, false);
            this.f34793c.mo35236f(0);
            if (this.f34793c.mo35251u() != 4801587) {
                break;
            }
            this.f34793c.mo35237g(3);
            int r = this.f34793c.mo35248r();
            i += r + 10;
            qb4.mo34304j(r, false);
        }
        wb4.zzj();
        qb4 qb42 = (qb4) wb4;
        qb42.mo34304j(i, false);
        if (this.f34797g == -1) {
            this.f34797g = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            qb42.mo33311e(this.f34793c.mo35238h(), 0, 2, false);
            this.f34793c.mo35236f(0);
            if (!C7926m2.m34648d(this.f34793c.mo35253w())) {
                i2++;
                wb4.zzj();
                qb42.mo34304j(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                qb42.mo33311e(this.f34793c.mo35238h(), 0, 4, false);
                this.f34794d.mo35013h(14);
                int c = this.f34794d.mo35008c(13);
                if (c <= 6) {
                    i2++;
                    wb4.zzj();
                    qb42.mo34304j(i2, false);
                } else {
                    qb42.mo34304j(c - 6, false);
                    i4 += c;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        nu1.m20743b(this.f34795e);
        int b = wb4.mo30477b(this.f34792b.mo35238h(), 0, 2048);
        if (!this.f34799i) {
            this.f34795e.mo18210l(new vc4(C6540C.TIME_UNSET, 0));
            this.f34799i = true;
        }
        if (b == -1) {
            return -1;
        }
        this.f34792b.mo35236f(0);
        this.f34792b.mo35235e(b);
        if (!this.f34798h) {
            this.f34791a.mo18074c(this.f34796f, 4);
            this.f34798h = true;
        }
        this.f34791a.mo18072a(this.f34792b);
        return 0;
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f34795e = yb4;
        this.f34791a.mo18073b(yb4, new C7633e4(Integer.MIN_VALUE, 0, 1));
        yb4.zzB();
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f34798h = false;
        this.f34791a.zze();
        this.f34796f = j2;
    }
}
