package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qx */
/* compiled from: IMASDK */
public class C4301qx implements C4324rt {

    /* renamed from: a */
    private final long f18462a;

    /* renamed from: b */
    private final long f18463b;

    /* renamed from: c */
    private final int f18464c;

    /* renamed from: d */
    private final long f18465d;

    /* renamed from: e */
    private final int f18466e;

    /* renamed from: f */
    private final long f18467f;

    public C4301qx(long j, long j2, int i, int i2) {
        this.f18462a = j;
        this.f18463b = j2;
        this.f18464c = i2 == -1 ? 1 : i2;
        this.f18466e = i;
        if (j == -1) {
            this.f18465d = -1;
            this.f18467f = C6540C.TIME_UNSET;
            return;
        }
        this.f18465d = j - j2;
        this.f18467f = m18693e(j, j2, i);
    }

    /* renamed from: e */
    private static long m18693e(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: C */
    public final long mo16594C(long j) {
        return m18693e(j, this.f18463b, this.f18466e);
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return this.f18465d != -1;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        long j2 = this.f18465d;
        if (j2 != -1) {
            int i = this.f18466e;
            long j3 = (long) this.f18464c;
            long I = this.f18463b + amm.m14192I((((((long) i) * j) / 8000000) / j3) * j3, 0, j2 - j3);
            long C = mo16594C(I);
            C4325ru ruVar = new C4325ru(C, I);
            if (C < j) {
                long j4 = I + ((long) this.f18464c);
                if (j4 < this.f18462a) {
                    return new C4322rr(ruVar, new C4325ru(mo16594C(j4), j4));
                }
            }
            return new C4322rr(ruVar, ruVar);
        }
        C4325ru ruVar2 = new C4325ru(0, this.f18463b);
        return new C4322rr(ruVar2, ruVar2);
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18467f;
    }
}
