package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ky0 {

    /* renamed from: e */
    public static final ky0 f34736e = new ky0(0, 0, 0, 1.0f);

    /* renamed from: f */
    public static final wx3<ky0> f34737f = jx0.f34069a;

    /* renamed from: a */
    public final int f34738a;

    /* renamed from: b */
    public final int f34739b;

    /* renamed from: c */
    public final int f34740c;

    /* renamed from: d */
    public final float f34741d;

    public ky0(int i, int i2, int i3, float f) {
        this.f34738a = i;
        this.f34739b = i2;
        this.f34740c = i3;
        this.f34741d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ky0) {
            ky0 ky0 = (ky0) obj;
            return this.f34738a == ky0.f34738a && this.f34739b == ky0.f34739b && this.f34740c == ky0.f34740c && this.f34741d == ky0.f34741d;
        }
    }

    public final int hashCode() {
        return ((((((this.f34738a + 217) * 31) + this.f34739b) * 31) + this.f34740c) * 31) + Float.floatToRawIntBits(this.f34741d);
    }
}
