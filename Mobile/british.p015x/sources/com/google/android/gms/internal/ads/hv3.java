package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hv3<T> implements iv3<T> {

    /* renamed from: c */
    private static final Object f32860c = new Object();

    /* renamed from: a */
    private volatile iv3<T> f32861a;

    /* renamed from: b */
    private volatile Object f32862b = f32860c;

    private hv3(iv3<T> iv3) {
        this.f32861a = iv3;
    }

    /* renamed from: a */
    public static <P extends iv3<T>, T> iv3<T> m32957a(P p) {
        if ((p instanceof hv3) || (p instanceof tu3)) {
            return p;
        }
        Objects.requireNonNull(p);
        return new hv3(p);
    }

    public final T zzb() {
        T t = this.f32862b;
        if (t != f32860c) {
            return t;
        }
        iv3<T> iv3 = this.f32861a;
        if (iv3 == null) {
            return this.f32862b;
        }
        T zzb = iv3.zzb();
        this.f32862b = zzb;
        this.f32861a = null;
        return zzb;
    }
}
