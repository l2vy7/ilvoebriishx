package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.z3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8834z3 implements C8736sc {
    UNKNOWN_FEATURE(0),
    GET_IP_ADDRESS(1),
    GET_INET_ADDRESS(2);
    

    /* renamed from: f */
    private static final C8751tc<C8834z3> f44245f = null;

    /* renamed from: b */
    private final int f44247b;

    static {
        f44245f = new C8804x3();
    }

    private C8834z3(int i) {
        this.f44247b = i;
    }

    /* renamed from: d */
    public static C8766uc m41448d() {
        return C8819y3.f44224a;
    }

    public final String toString() {
        return "<" + C8834z3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44247b + " name=" + name() + '>';
    }
}
