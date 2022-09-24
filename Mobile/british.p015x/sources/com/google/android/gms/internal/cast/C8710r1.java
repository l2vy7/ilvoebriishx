package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.r1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8710r1 implements C8736sc {
    BITRATE_MODE_UNKNOWN(0),
    BITRATE_MODE_FIXED(1),
    BITRATE_MODE_ADAPTIVE(2);
    

    /* renamed from: f */
    private static final C8751tc<C8710r1> f43934f = null;

    /* renamed from: b */
    private final int f43936b;

    static {
        f43934f = new C8678p1();
    }

    private C8710r1(int i) {
        this.f43936b = i;
    }

    /* renamed from: d */
    public static C8766uc m41264d() {
        return C8694q1.f43915a;
    }

    public final String toString() {
        return "<" + C8710r1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43936b + " name=" + name() + '>';
    }
}
