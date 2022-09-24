package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xn */
/* compiled from: IMASDK */
final class C4480xn implements C4324rt {

    /* renamed from: a */
    private final C4477xk f19575a;

    /* renamed from: b */
    private final int f19576b;

    /* renamed from: c */
    private final long f19577c;

    /* renamed from: d */
    private final long f19578d;

    /* renamed from: e */
    private final long f19579e;

    public C4480xn(C4477xk xkVar, int i, long j, long j2) {
        this.f19575a = xkVar;
        this.f19576b = i;
        this.f19577c = j;
        long j3 = (j2 - j) / ((long) xkVar.f19570d);
        this.f19578d = j3;
        this.f19579e = m19464d(j3);
    }

    /* renamed from: d */
    private final long m19464d(long j) {
        return amm.m14196M(j * ((long) this.f19576b), 1000000, (long) this.f19575a.f19569c);
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return true;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        long I = amm.m14192I((((long) this.f19575a.f19569c) * j) / (((long) this.f19576b) * 1000000), 0, this.f19578d - 1);
        long j2 = this.f19577c;
        int i = this.f19575a.f19570d;
        long d = m19464d(I);
        C4325ru ruVar = new C4325ru(d, j2 + (((long) i) * I));
        if (d >= j || I == this.f19578d - 1) {
            return new C4322rr(ruVar, ruVar);
        }
        long j3 = I + 1;
        return new C4322rr(ruVar, new C4325ru(m19464d(j3), this.f19577c + (j3 * ((long) this.f19575a.f19570d))));
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f19579e;
    }
}
