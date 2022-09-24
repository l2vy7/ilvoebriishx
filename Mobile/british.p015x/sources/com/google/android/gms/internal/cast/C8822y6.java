package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.y6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8822y6 implements C8736sc {
    SLOW_MDNS_UNKNOWN(0),
    SLOW_MDNS_RESPONSE_FROM_NON_SUBTYPE_AWARE_DEVICE(1),
    SLOW_MDNS_SUBTYPE_RESPONSE(2);
    

    /* renamed from: f */
    private static final C8751tc<C8822y6> f44236f = null;

    /* renamed from: b */
    private final int f44238b;

    static {
        f44236f = new C8791w6();
    }

    private C8822y6(int i) {
        this.f44238b = i;
    }

    /* renamed from: d */
    public static C8766uc m41428d() {
        return C8807x6.f44212a;
    }

    public final String toString() {
        return "<" + C8822y6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44238b + " name=" + name() + '>';
    }
}
