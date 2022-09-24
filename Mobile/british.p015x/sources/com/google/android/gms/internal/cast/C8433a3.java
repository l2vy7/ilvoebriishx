package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.a3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8433a3 implements C8736sc {
    APPLICATION_CONNECTION_FAILED_REASON_UNKNOWN(0),
    APPLICATION_NOT_FOUND(1),
    APPLICATION_NOT_RUNNING(2),
    APPLICATION_NOT_ALLOWED(3),
    LAUNCH_CANCELLED(4),
    LAUNCH_TIMED_OUT(5),
    INVALID_REQUEST(6);
    

    /* renamed from: j */
    private static final C8751tc<C8433a3> f43153j = null;

    /* renamed from: b */
    private final int f43155b;

    static {
        f43153j = new C8818y2();
    }

    private C8433a3(int i) {
        this.f43155b = i;
    }

    /* renamed from: d */
    public static C8766uc m40682d() {
        return C8833z2.f44241a;
    }

    public final String toString() {
        return "<" + C8433a3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43155b + " name=" + name() + '>';
    }
}
