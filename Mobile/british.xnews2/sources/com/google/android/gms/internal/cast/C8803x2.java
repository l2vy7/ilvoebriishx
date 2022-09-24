package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.x2 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8803x2 implements C8736sc {
    APP_SESSION_REASON_UNKNOWN(0),
    APP_SESSION_REASON_ERROR(1),
    APP_SESSION_NETWORK_ERROR(2),
    APP_SESSION_NETWORK_RECOVERED(3),
    APP_SESSION_RECEIVER_CONNECTION_LOSS(4),
    APP_SESSION_RECEIVER_CONNECTION_RECOVERED(5),
    APP_SESSION_APP_BACKGROUNDED(6),
    APP_SESSION_APP_FOREGROUNDED(7),
    APP_SESSION_APP_STOPPED(8),
    APP_SESSION_CASTING_STOPPED(9),
    APP_SESSION_RESUMED_FROM_SAVED_SESSION(10),
    APP_SESSION_RESUMED_FROM_OPEN_URL(11),
    APP_SESSION_NETWORK_NOT_REACHABLE(12),
    APP_SESSION_GMSCORE_SERVICE_DISCONNECTED(13),
    APP_SESSION_ENDPOINT_SWITCHED(14),
    APP_SESSION_DEVICE_CONNECTION_SUSPENDED(15),
    APP_SESSION_MEDIA_ROUTE_CHANGED(16);
    

    /* renamed from: t */
    private static final C8751tc<C8803x2> f44208t = null;

    /* renamed from: b */
    private final int f44210b;

    static {
        f44208t = new C8772v2();
    }

    private C8803x2(int i) {
        this.f44210b = i;
    }

    /* renamed from: d */
    public static C8766uc m41404d() {
        return C8787w2.f44158a;
    }

    public final String toString() {
        return "<" + C8803x2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44210b + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f44210b;
    }
}
