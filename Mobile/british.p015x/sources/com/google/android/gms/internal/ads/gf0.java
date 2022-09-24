package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gf0 {

    /* renamed from: h */
    public static final wx3<gf0> f32283h = ee0.f31334a;

    /* renamed from: a */
    public Object f32284a;

    /* renamed from: b */
    public Object f32285b;

    /* renamed from: c */
    public int f32286c;

    /* renamed from: d */
    public long f32287d;

    /* renamed from: e */
    public long f32288e;

    /* renamed from: f */
    public boolean f32289f;

    /* renamed from: g */
    private r51 f32290g = r51.f38540c;

    /* renamed from: a */
    public final int mo32101a(int i) {
        return this.f32290g.mo34501a(i).f31714b;
    }

    /* renamed from: b */
    public final int mo32102b(long j) {
        return -1;
    }

    /* renamed from: c */
    public final int mo32103c(long j) {
        return -1;
    }

    /* renamed from: d */
    public final int mo32104d(int i) {
        return this.f32290g.mo34501a(i).mo31846a(-1);
    }

    /* renamed from: e */
    public final int mo32105e(int i, int i2) {
        return this.f32290g.mo34501a(i).mo31846a(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gf0.class.equals(obj.getClass())) {
            gf0 gf0 = (gf0) obj;
            return d13.m20317p(this.f32284a, gf0.f32284a) && d13.m20317p(this.f32285b, gf0.f32285b) && this.f32286c == gf0.f32286c && this.f32287d == gf0.f32287d && this.f32289f == gf0.f32289f && d13.m20317p(this.f32290g, gf0.f32290g);
        }
    }

    /* renamed from: f */
    public final long mo32107f(int i, int i2) {
        ff0 a = this.f32290g.mo34501a(i);
        return a.f31714b != -1 ? a.f31717e[i2] : C6540C.TIME_UNSET;
    }

    /* renamed from: g */
    public final long mo32108g(int i) {
        long j = this.f32290g.mo34501a(i).f31713a;
        return 0;
    }

    /* renamed from: h */
    public final long mo32109h() {
        long j = this.f32290g.f38543a;
        return 0;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f32284a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 217) * 31;
        Object obj2 = this.f32285b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.f32286c;
        long j = this.f32287d;
        return ((((((((i3 + i2) * 31) + i4) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f32289f ? 1 : 0)) * 31) + this.f32290g.hashCode();
    }

    /* renamed from: i */
    public final long mo32111i(int i) {
        long j = this.f32290g.mo34501a(i).f31718f;
        return 0;
    }

    /* renamed from: j */
    public final gf0 mo32112j(Object obj, Object obj2, int i, long j, long j2, r51 r51, boolean z) {
        this.f32284a = obj;
        this.f32285b = obj2;
        this.f32286c = 0;
        this.f32287d = j;
        this.f32288e = 0;
        this.f32290g = r51;
        this.f32289f = z;
        return this;
    }

    /* renamed from: k */
    public final boolean mo32113k(int i) {
        boolean z = this.f32290g.mo34501a(i).f31719g;
        return false;
    }
}
