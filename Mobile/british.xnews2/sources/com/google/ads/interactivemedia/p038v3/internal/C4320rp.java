package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rp */
/* compiled from: IMASDK */
public final class C4320rp implements C4324rt {

    /* renamed from: a */
    private final long[] f18529a;

    /* renamed from: b */
    private final long[] f18530b;

    /* renamed from: c */
    private final long f18531c;

    /* renamed from: d */
    private final boolean f18532d;

    public C4320rp(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        aup.m14885p(length == length2);
        boolean z = length2 > 0;
        this.f18532d = z;
        if (!z || jArr2[0] <= 0) {
            this.f18529a = jArr;
            this.f18530b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f18529a = jArr3;
            long[] jArr4 = new long[i];
            this.f18530b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f18531c = j;
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return this.f18532d;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        if (!this.f18532d) {
            C4325ru ruVar = C4325ru.f18538a;
            return new C4322rr(ruVar, ruVar);
        }
        int am = amm.m14223am(this.f18530b, j, true);
        C4325ru ruVar2 = new C4325ru(this.f18530b[am], this.f18529a[am]);
        if (ruVar2.f18539b != j) {
            long[] jArr = this.f18530b;
            if (am != jArr.length - 1) {
                int i = am + 1;
                return new C4322rr(ruVar2, new C4325ru(jArr[i], this.f18529a[i]));
            }
        }
        return new C4322rr(ruVar2, ruVar2);
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18531c;
    }
}
