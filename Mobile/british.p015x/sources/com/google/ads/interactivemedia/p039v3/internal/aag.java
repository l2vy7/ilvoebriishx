package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aag */
/* compiled from: IMASDK */
public final class aag implements acj {

    /* renamed from: a */
    protected final acj[] f13928a;

    public aag(acj[] acjArr) {
        this.f13928a = acjArr;
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        for (acj bd : this.f13928a) {
            bd.mo13230bd(j);
        }
    }

    /* renamed from: g */
    public final long mo13234g() {
        long j = Long.MAX_VALUE;
        for (acj g : this.f13928a) {
            long g2 = g.mo13234g();
            if (g2 != Long.MIN_VALUE) {
                j = Math.min(j, g2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: k */
    public final long mo13238k() {
        long j = Long.MAX_VALUE;
        for (acj k : this.f13928a) {
            long k2 = k.mo13238k();
            if (k2 != Long.MIN_VALUE) {
                j = Math.min(j, k2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long k = mo13238k();
            if (k != Long.MIN_VALUE) {
                boolean z2 = false;
                for (acj acj : this.f13928a) {
                    long k2 = acj.mo13238k();
                    boolean z3 = k2 != Long.MIN_VALUE && k2 <= j2;
                    if (k2 == k || z3) {
                        z2 |= acj.mo13240m(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return true == z;
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        for (acj n : this.f13928a) {
            if (n.mo13241n()) {
                return true;
            }
        }
        return false;
    }
}
