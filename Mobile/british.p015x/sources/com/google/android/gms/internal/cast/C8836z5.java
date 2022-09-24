package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.z5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8836z5 implements C8736sc {
    NETWORK_CONNECTION_TYPE_UNKNOWN(0),
    MOBILE(1),
    WIFI(2),
    MOBILE_MMS(3),
    MOBILE_SUPL(4),
    MOBILE_DUN(5),
    MOBILE_HIPRI(6),
    WIMAX(7),
    BLUETOOTH(8),
    DUMMY(9),
    ETHERNET(10),
    VPN(11);
    

    /* renamed from: o */
    private static final C8751tc<C8836z5> f44260o = null;

    /* renamed from: b */
    private final int f44262b;

    static {
        f44260o = new C8806x5();
    }

    private C8836z5(int i) {
        this.f44262b = i;
    }

    /* renamed from: d */
    public static C8766uc m41449d() {
        return C8821y5.f44232a;
    }

    public final String toString() {
        return "<" + C8836z5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44262b + " name=" + name() + '>';
    }
}
