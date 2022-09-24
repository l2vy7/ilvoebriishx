package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w44 extends r44 {

    /* renamed from: f */
    public static final Object f40698f = new Object();

    /* renamed from: d */
    private final Object f40699d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f40700e;

    private w44(gi0 gi0, Object obj, Object obj2) {
        super(gi0);
        this.f40699d = obj;
        this.f40700e = obj2;
    }

    /* renamed from: q */
    public static w44 m39033q(C7764ho hoVar) {
        return new w44(new x44(hoVar), gh0.f32305o, f40698f);
    }

    /* renamed from: r */
    public static w44 m39034r(gi0 gi0, Object obj, Object obj2) {
        return new w44(gi0, obj, obj2);
    }

    /* renamed from: a */
    public final int mo32133a(Object obj) {
        Object obj2;
        gi0 gi0 = this.f38539c;
        if (f40698f.equals(obj) && (obj2 = this.f40700e) != null) {
            obj = obj2;
        }
        return gi0.mo32133a(obj);
    }

    /* renamed from: d */
    public final gf0 mo31484d(int i, gf0 gf0, boolean z) {
        this.f38539c.mo31484d(i, gf0, z);
        if (d13.m20317p(gf0.f32285b, this.f40700e) && z) {
            gf0.f32285b = f40698f;
        }
        return gf0;
    }

    /* renamed from: e */
    public final gh0 mo31485e(int i, gh0 gh0, long j) {
        this.f38539c.mo31485e(i, gh0, j);
        if (d13.m20317p(gh0.f32309a, this.f40699d)) {
            gh0.f32309a = gh0.f32305o;
        }
        return gh0;
    }

    /* renamed from: f */
    public final Object mo32135f(int i) {
        Object f = this.f38539c.mo32135f(i);
        return d13.m20317p(f, this.f40700e) ? f40698f : f;
    }

    /* renamed from: p */
    public final w44 mo35557p(gi0 gi0) {
        return new w44(gi0, this.f40699d, this.f40700e);
    }
}
