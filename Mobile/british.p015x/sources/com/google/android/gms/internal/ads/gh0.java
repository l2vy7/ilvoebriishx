package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gh0 {

    /* renamed from: o */
    public static final Object f32305o = new Object();

    /* renamed from: p */
    private static final Object f32306p = new Object();

    /* renamed from: q */
    private static final C7764ho f32307q;

    /* renamed from: r */
    public static final wx3<gh0> f32308r = fg0.f31735a;

    /* renamed from: a */
    public Object f32309a = f32305o;

    /* renamed from: b */
    public C7764ho f32310b = f32307q;

    /* renamed from: c */
    public long f32311c;

    /* renamed from: d */
    public long f32312d;

    /* renamed from: e */
    public long f32313e;

    /* renamed from: f */
    public boolean f32314f;

    /* renamed from: g */
    public boolean f32315g;
    @Deprecated

    /* renamed from: h */
    public boolean f32316h;

    /* renamed from: i */
    public C7831jh f32317i;

    /* renamed from: j */
    public boolean f32318j;

    /* renamed from: k */
    public long f32319k;

    /* renamed from: l */
    public long f32320l;

    /* renamed from: m */
    public int f32321m;

    /* renamed from: n */
    public int f32322n;

    static {
        C7490a4 a4Var = new C7490a4();
        a4Var.mo30301a("androidx.media3.common.Timeline");
        a4Var.mo30302b(Uri.EMPTY);
        f32307q = a4Var.mo30303c();
    }

    /* renamed from: a */
    public final gh0 mo32125a(Object obj, C7764ho hoVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C7831jh jhVar, long j4, long j5, int i, int i2, long j6) {
        C7831jh jhVar2 = jhVar;
        this.f32309a = obj;
        this.f32310b = hoVar != null ? hoVar : f32307q;
        this.f32311c = C6540C.TIME_UNSET;
        this.f32312d = C6540C.TIME_UNSET;
        this.f32313e = C6540C.TIME_UNSET;
        this.f32314f = z;
        this.f32315g = z2;
        this.f32316h = jhVar2 != null;
        this.f32317i = jhVar2;
        this.f32319k = 0;
        this.f32320l = j5;
        this.f32321m = 0;
        this.f32322n = 0;
        this.f32318j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean mo32126b() {
        nu1.m20747f(this.f32316h == (this.f32317i != null));
        return this.f32317i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gh0.class.equals(obj.getClass())) {
            gh0 gh0 = (gh0) obj;
            return d13.m20317p(this.f32309a, gh0.f32309a) && d13.m20317p(this.f32310b, gh0.f32310b) && d13.m20317p((Object) null, (Object) null) && d13.m20317p(this.f32317i, gh0.f32317i) && this.f32311c == gh0.f32311c && this.f32312d == gh0.f32312d && this.f32313e == gh0.f32313e && this.f32314f == gh0.f32314f && this.f32315g == gh0.f32315g && this.f32318j == gh0.f32318j && this.f32320l == gh0.f32320l && this.f32321m == gh0.f32321m && this.f32322n == gh0.f32322n;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f32309a.hashCode() + 217) * 31) + this.f32310b.hashCode()) * 961;
        C7831jh jhVar = this.f32317i;
        if (jhVar == null) {
            i = 0;
        } else {
            i = jhVar.hashCode();
        }
        long j = this.f32311c;
        long j2 = this.f32312d;
        long j3 = this.f32313e;
        boolean z = this.f32314f;
        boolean z2 = this.f32315g;
        boolean z3 = this.f32318j;
        long j4 = this.f32320l;
        return (((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f32321m) * 31) + this.f32322n) * 31;
    }
}
