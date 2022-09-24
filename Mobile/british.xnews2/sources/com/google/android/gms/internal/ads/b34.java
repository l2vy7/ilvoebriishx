package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b34 {

    /* renamed from: d */
    public static final b34 f29895d = new b34(0, 0, 0);

    /* renamed from: e */
    public static final wx3<b34> f29896e = a24.f29511a;

    /* renamed from: a */
    public final int f29897a = 0;

    /* renamed from: b */
    public final int f29898b;

    /* renamed from: c */
    public final int f29899c;

    public b34(int i, int i2, int i3) {
        this.f29898b = i2;
        this.f29899c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b34)) {
            return false;
        }
        b34 b34 = (b34) obj;
        int i = b34.f29897a;
        return this.f29898b == b34.f29898b && this.f29899c == b34.f29899c;
    }

    public final int hashCode() {
        return ((this.f29898b + 16337) * 31) + this.f29899c;
    }
}
