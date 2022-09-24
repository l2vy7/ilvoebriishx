package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lz */
/* compiled from: IMASDK */
public final class C4168lz {

    /* renamed from: a */
    public Object f17912a;

    /* renamed from: b */
    public Object f17913b;

    /* renamed from: c */
    public int f17914c;

    /* renamed from: d */
    public long f17915d;

    /* renamed from: e */
    public long f17916e;

    /* renamed from: f */
    private act f17917f = act.f14200a;

    /* renamed from: a */
    public final long mo16314a() {
        return C4083iv.m17451a(this.f17916e);
    }

    /* renamed from: b */
    public final long mo16315b(int i) {
        return this.f17917f.f14202c[i];
    }

    /* renamed from: c */
    public final int mo16316c(int i) {
        int[] iArr = this.f17917f.f14203d[i].f14198c;
        return 0;
    }

    /* renamed from: d */
    public final int mo16317d(long j) {
        act act = this.f17917f;
        long j2 = this.f17915d;
        int length = act.f14202c.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j3 = act.f14202c[length];
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
            } else if (j2 != C6540C.TIME_UNSET && j >= j2) {
                break;
            }
            length--;
        }
        if (length < 0) {
            return -1;
        }
        acs acs = act.f14203d[length];
        return length;
    }

    /* renamed from: e */
    public final int mo16318e(long j) {
        int length;
        act act = this.f17917f;
        long j2 = this.f17915d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int i = 0;
        if (j2 != C6540C.TIME_UNSET && j >= j2) {
            return -1;
        }
        while (true) {
            long[] jArr = act.f14202c;
            length = jArr.length;
            if (i >= length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            } else if (j < j3) {
                acs acs = act.f14203d[i];
                break;
            } else {
                i++;
            }
        }
        if (i < length) {
            return i;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4168lz.class.equals(obj.getClass())) {
            C4168lz lzVar = (C4168lz) obj;
            return amm.m14233c(this.f17912a, lzVar.f17912a) && amm.m14233c(this.f17913b, lzVar.f17913b) && this.f17914c == lzVar.f17914c && this.f17915d == lzVar.f17915d && this.f17916e == lzVar.f17916e && amm.m14233c(this.f17917f, lzVar.f17917f);
        }
    }

    /* renamed from: f */
    public final void mo16320f(int i) {
        int i2 = this.f17917f.f14203d[i].f14196a;
    }

    /* renamed from: g */
    public final long mo16321g(int i) {
        int i2 = this.f17917f.f14203d[i].f14196a;
        return C6540C.TIME_UNSET;
    }

    /* renamed from: h */
    public final void mo16322h() {
        long j = this.f17917f.f14204e;
    }

    public final int hashCode() {
        Object obj = this.f17912a;
        int i = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f17913b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = this.f17914c;
        long j = this.f17915d;
        long j2 = this.f17916e;
        return ((((((((hashCode + i) * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.f17917f.hashCode();
    }

    /* renamed from: i */
    public final C4168lz mo16324i(Object obj, Object obj2, long j, long j2) {
        act act = act.f14200a;
        this.f17912a = obj;
        this.f17913b = obj2;
        this.f17914c = 0;
        this.f17915d = j;
        this.f17916e = j2;
        this.f17917f = act;
        return this;
    }
}
