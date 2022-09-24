package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.h7 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8554h7 implements C8736sc {
    TCP_PROBER_IP_SOURCE_UNKNOWN(0),
    TCP_PROBER_IP_SOURCE_CACHED(1),
    TCP_PROBER_IP_SOURCE_BLE(2),
    TCP_PROBER_IP_SOURCE_GAIA(3);
    

    /* renamed from: g */
    private static final C8751tc<C8554h7> f43520g = null;

    /* renamed from: b */
    private final int f43522b;

    static {
        f43520g = new C8521f7();
    }

    private C8554h7(int i) {
        this.f43522b = i;
    }

    /* renamed from: d */
    public static C8766uc m40982d() {
        return C8537g7.f43494a;
    }

    public final String toString() {
        return "<" + C8554h7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43522b + " name=" + name() + '>';
    }
}
