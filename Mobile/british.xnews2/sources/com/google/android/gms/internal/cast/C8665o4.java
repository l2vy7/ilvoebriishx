package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.o4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8665o4 implements C8736sc {
    DISCOVERY_PROTOCOL_TYPE_UNKNOWN(0),
    MDNS(1),
    CAST_NEARBY(2),
    MDNS_UNICAST_RESPONSE(3),
    SSDP(4),
    BLE(5),
    ADAPTIVE_DISCOVERY(6),
    TCP_FILTER(7);
    

    /* renamed from: k */
    private static final C8751tc<C8665o4> f43859k = null;

    /* renamed from: b */
    private final int f43861b;

    static {
        f43859k = new C8633m4();
    }

    private C8665o4(int i) {
        this.f43861b = i;
    }

    /* renamed from: d */
    public static C8766uc m41174d() {
        return C8649n4.f43802a;
    }

    public final String toString() {
        return "<" + C8665o4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43861b + " name=" + name() + '>';
    }
}
