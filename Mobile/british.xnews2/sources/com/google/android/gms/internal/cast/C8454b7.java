package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.b7 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8454b7 implements C8736sc {
    TCP_PROBER_UNKNOWN(0),
    TCP_PROBER_DEVICE_EXPIRED(1),
    TCP_PROBER_SUBTYPE_MDNS_MISSING(2),
    TCP_PROBER_BLE(3),
    TCP_PROBER_CLOUD_DISCOVERY(4),
    TCP_PROBER_GAIA_DISCOVERY(5),
    TCP_PROBER_KNOWN_SESSION_ENDPOINT(6),
    TCP_PROBER_APP_HINT(7),
    TCP_PROBER_REFRESH_SESSION_ENDPOINT(8);
    

    /* renamed from: l */
    private static final C8751tc<C8454b7> f43303l = null;

    /* renamed from: b */
    private final int f43305b;

    static {
        f43303l = new C8837z6();
    }

    private C8454b7(int i) {
        this.f43305b = i;
    }

    /* renamed from: d */
    public static C8766uc m40715d() {
        return C8437a7.f43263a;
    }

    public final String toString() {
        return "<" + C8454b7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43305b + " name=" + name() + '>';
    }
}
