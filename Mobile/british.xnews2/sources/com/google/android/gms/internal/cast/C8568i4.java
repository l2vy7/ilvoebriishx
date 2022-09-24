package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.i4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8568i4 implements C8736sc {
    DEVICE_DISCONNECT_REASON_UNKNOWN(0),
    STATUS_ERROR_NETWORK(1),
    STATUS_ERROR_HEARTBEAT_TIMEOUT(2),
    STATUS_EXPLICIT_DISCONNECT(3),
    STATUS_IMPLICIT_DISCONNECT(4);
    

    /* renamed from: h */
    private static final C8751tc<C8568i4> f43532h = null;

    /* renamed from: b */
    private final int f43534b;

    static {
        f43532h = new C8534g4();
    }

    private C8568i4(int i) {
        this.f43534b = i;
    }

    /* renamed from: d */
    public static C8766uc m40999d() {
        return C8551h4.f43514a;
    }

    public final String toString() {
        return "<" + C8568i4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43534b + " name=" + name() + '>';
    }
}
