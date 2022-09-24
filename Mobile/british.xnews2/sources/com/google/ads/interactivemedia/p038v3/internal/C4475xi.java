package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xi */
/* compiled from: IMASDK */
final class C4475xi implements C4474xh {

    /* renamed from: a */
    private final C4309re f19553a;

    /* renamed from: b */
    private final C4327rw f19554b;

    /* renamed from: c */
    private final C4477xk f19555c;

    /* renamed from: d */
    private final C4120ke f19556d;

    /* renamed from: e */
    private final int f19557e;

    /* renamed from: f */
    private long f19558f;

    /* renamed from: g */
    private int f19559g;

    /* renamed from: h */
    private long f19560h;

    public C4475xi(C4309re reVar, C4327rw rwVar, C4477xk xkVar, String str, int i) throws C4144lb {
        this.f19553a = reVar;
        this.f19554b = rwVar;
        this.f19555c = xkVar;
        int i2 = (xkVar.f19568b * xkVar.f19571e) / 8;
        int i3 = xkVar.f19570d;
        if (i3 == i2) {
            int i4 = xkVar.f19569c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f19557e = max;
            C4119kd kdVar = new C4119kd();
            kdVar.mo16120ae(str);
            kdVar.mo16095G(i5);
            kdVar.mo16114Z(i5);
            kdVar.mo16111W(max);
            kdVar.mo16096H(xkVar.f19568b);
            kdVar.mo16121af(xkVar.f19569c);
            kdVar.mo16113Y(i);
            this.f19556d = kdVar.mo16115a();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw new C4144lb(sb.toString());
    }

    /* renamed from: a */
    public final void mo16768a(long j) {
        this.f19558f = j;
        this.f19559g = 0;
        this.f19560h = 0;
    }

    /* renamed from: b */
    public final void mo16769b(int i, long j) {
        this.f19553a.mo13364bc(new C4480xn(this.f19555c, 1, (long) i, j));
        this.f19554b.mo13403a(this.f19556d);
    }

    /* renamed from: c */
    public final boolean mo16770c(C4307rc rcVar, long j) throws IOException {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.f19559g) < (i2 = this.f19557e)) {
            int c = this.f19554b.mo13405c(rcVar, (int) Math.min((long) (i2 - i), j3), true);
            if (c == -1) {
                j3 = 0;
            } else {
                this.f19559g += c;
                j3 -= (long) c;
            }
        }
        C4477xk xkVar = this.f19555c;
        int i3 = xkVar.f19570d;
        int i4 = this.f19559g / i3;
        if (i4 > 0) {
            long j4 = this.f19558f;
            long M = amm.m14196M(this.f19560h, 1000000, (long) xkVar.f19569c);
            int i5 = i4 * i3;
            int i6 = this.f19559g - i5;
            this.f19554b.mo13404b(j4 + M, 1, i5, i6, (C4326rv) null);
            this.f19560h += (long) i4;
            this.f19559g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
