package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afa */
/* compiled from: IMASDK */
public abstract class afa extends aff {

    /* renamed from: a */
    final long f14493a;

    /* renamed from: b */
    final long f14494b;

    /* renamed from: c */
    final List<afd> f14495c;

    /* renamed from: d */
    final long f14496d;

    /* renamed from: e */
    private final long f14497e;

    /* renamed from: f */
    private final long f14498f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afa(aew aew, long j, long j2, long j3, long j4, List<afd> list, long j5, long j6, long j7) {
        super(aew, j, j2);
        this.f14493a = j3;
        this.f14494b = j4;
        this.f14495c = list;
        this.f14496d = j5;
        this.f14497e = j6;
        this.f14498f = j7;
    }

    /* renamed from: a */
    public final long mo13590a(long j, long j2) {
        long j3 = this.f14493a;
        long h = (long) mo13597h(j2);
        if (h == 0) {
            return j3;
        }
        if (this.f14495c == null) {
            long j4 = this.f14493a + (j / ((this.f14494b * 1000000) / this.f14508i));
            if (j4 < j3) {
                return j3;
            }
            return h != -1 ? Math.min(j4, (j3 + h) - 1) : j4;
        }
        long j5 = (h + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long c = mo13592c(j7);
            if (c < j) {
                j6 = 1 + j7;
            } else if (c <= j) {
                return j7;
            } else {
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    /* renamed from: b */
    public final long mo13591b(long j, long j2) {
        List<afd> list = this.f14495c;
        if (list != null) {
            return (list.get((int) (j - this.f14493a)).f14504b * 1000000) / this.f14508i;
        }
        int h = mo13597h(j2);
        if (h == -1 || j != (this.f14493a + ((long) h)) - 1) {
            return (this.f14494b * 1000000) / this.f14508i;
        }
        return j2 - mo13592c(j);
    }

    /* renamed from: c */
    public final long mo13592c(long j) {
        long j2;
        List<afd> list = this.f14495c;
        if (list != null) {
            j2 = list.get((int) (j - this.f14493a)).f14503a - this.f14509j;
        } else {
            j2 = (j - this.f14493a) * this.f14494b;
        }
        return amm.m14196M(j2, 1000000, this.f14508i);
    }

    /* renamed from: d */
    public abstract aew mo13593d(aez aez, long j);

    /* renamed from: e */
    public final long mo13594e(long j, long j2) {
        if (((long) mo13597h(j)) == -1) {
            long j3 = this.f14497e;
            if (j3 != C6540C.TIME_UNSET) {
                return Math.max(this.f14493a, mo13590a((j2 - this.f14498f) - j3, j));
            }
        }
        return this.f14493a;
    }

    /* renamed from: f */
    public final int mo13595f(long j, long j2) {
        int h = mo13597h(j);
        if (h != -1) {
            return h;
        }
        return (int) (mo13590a((j2 - this.f14498f) + this.f14496d, j) - mo13594e(j, j2));
    }

    /* renamed from: g */
    public boolean mo13596g() {
        return this.f14495c != null;
    }

    /* renamed from: h */
    public abstract int mo13597h(long j);
}
