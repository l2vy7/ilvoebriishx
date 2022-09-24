package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rj */
/* compiled from: IMASDK */
public final class C4314rj implements C4324rt {

    /* renamed from: a */
    private final C4316rl f18508a;

    /* renamed from: b */
    private final long f18509b;

    public C4314rj(C4316rl rlVar, long j) {
        this.f18508a = rlVar;
        this.f18509b = j;
    }

    /* renamed from: d */
    private final C4325ru m18778d(long j, long j2) {
        return new C4325ru((j * 1000000) / ((long) this.f18508a.f18516e), this.f18509b + j2);
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return true;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        long j2;
        aup.m14889t(this.f18508a.f18522k);
        C4316rl rlVar = this.f18508a;
        C4315rk rkVar = rlVar.f18522k;
        long[] jArr = rkVar.f18510a;
        long[] jArr2 = rkVar.f18511b;
        int am = amm.m14223am(jArr, rlVar.mo16609b(j), false);
        long j3 = 0;
        if (am == -1) {
            j2 = 0;
        } else {
            j2 = jArr[am];
        }
        if (am != -1) {
            j3 = jArr2[am];
        }
        C4325ru d = m18778d(j2, j3);
        if (d.f18539b == j || am == jArr.length - 1) {
            return new C4322rr(d, d);
        }
        int i = am + 1;
        return new C4322rr(d, m18778d(jArr[i], jArr2[i]));
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18508a.mo16608a();
    }
}
