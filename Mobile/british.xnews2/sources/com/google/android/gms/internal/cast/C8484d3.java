package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.d3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8484d3 implements C8736sc {
    BROADCAST_ERROR_UNKNOWN(0),
    BROADCAST_ERROR_ENCRYPTION_FAILED(1),
    BROADCAST_ERROR_SOCKET_ERROR(2),
    BROADCAST_ERROR_DROPPED(3),
    BROADCAST_ERROR_KEY_EXCHANGE_INVALID_INPUT(4),
    BROADCAST_ERROR_KEY_EXCHANGE_INVALID_RESPONSE(5),
    BROADCAST_ERROR_KEY_EXCHANGE_EMPTY_RESPONSE(6),
    BROADCAST_ERROR_KEY_EXCHANGE_FAILED_TO_FIND_DEVICE(7),
    BROADCAST_ERROR_KEY_EXCHANGE_FAILED_TO_CONNECT(8),
    BROADCAST_ERROR_KEY_EXCHANGE_REQUEST_TIMED_OUT(9);
    

    /* renamed from: m */
    private static final C8751tc<C8484d3> f43403m = null;

    /* renamed from: b */
    private final int f43405b;

    static {
        f43403m = new C8450b3();
    }

    private C8484d3(int i) {
        this.f43405b = i;
    }

    /* renamed from: d */
    public static C8766uc m40758d() {
        return C8467c3.f43311a;
    }

    public final String toString() {
        return "<" + C8484d3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43405b + " name=" + name() + '>';
    }
}
