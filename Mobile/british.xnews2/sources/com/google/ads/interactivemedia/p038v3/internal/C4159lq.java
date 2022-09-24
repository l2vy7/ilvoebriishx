package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lq */
/* compiled from: IMASDK */
public final class C4159lq {

    /* renamed from: a */
    public static final C4159lq f17853a;

    /* renamed from: b */
    public static final C4159lq f17854b;

    /* renamed from: c */
    public final long f17855c;

    /* renamed from: d */
    public final long f17856d;

    static {
        C4159lq lqVar = new C4159lq(0, 0);
        f17853a = lqVar;
        new C4159lq(Long.MAX_VALUE, Long.MAX_VALUE);
        new C4159lq(Long.MAX_VALUE, 0);
        new C4159lq(0, Long.MAX_VALUE);
        f17854b = lqVar;
    }

    public C4159lq(long j, long j2) {
        boolean z = true;
        aup.m14885p(j >= 0);
        aup.m14885p(j2 < 0 ? false : z);
        this.f17855c = j;
        this.f17856d = j2;
    }

    /* renamed from: a */
    public final long mo16267a(long j, long j2, long j3) {
        long j4 = this.f17855c;
        if (j4 == 0 && this.f17856d == 0) {
            return j;
        }
        long as = amm.m14229as(j, j4);
        long ai = amm.m14219ai(j, this.f17856d);
        boolean z = true;
        boolean z2 = as <= j2 && j2 <= ai;
        if (as > j3 || j3 > ai) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : as;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4159lq.class == obj.getClass()) {
            C4159lq lqVar = (C4159lq) obj;
            return this.f17855c == lqVar.f17855c && this.f17856d == lqVar.f17856d;
        }
    }

    public final int hashCode() {
        return (((int) this.f17855c) * 31) + ((int) this.f17856d);
    }
}
