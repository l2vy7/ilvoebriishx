package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.d5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8486d5 implements C8736sc {
    SUCCESS(0),
    LOW_API_LEVEL(1),
    DEVICE_AUTH_FAILURE(2),
    DEVICE_UNAUTHENTICATED(3),
    PASSWORD_ENCRYPTION_FAILURE(4),
    NO_WIFI_MANAGER(5),
    WEP_RESTRICTION_PRE_O(6),
    NO_MATCHING_NETWORK(7),
    EMPTY_PASSWORD(8);
    

    /* renamed from: l */
    private static final C8751tc<C8486d5> f43415l = null;

    /* renamed from: b */
    private final int f43417b;

    static {
        f43415l = new C8452b5();
    }

    private C8486d5(int i) {
        this.f43417b = i;
    }

    /* renamed from: d */
    public static C8766uc m40759d() {
        return C8469c5.f43362a;
    }

    public final String toString() {
        return "<" + C8486d5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43417b + " name=" + name() + '>';
    }
}
