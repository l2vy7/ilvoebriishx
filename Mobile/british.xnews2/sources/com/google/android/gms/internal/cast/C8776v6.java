package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.v6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8776v6 implements C8736sc {
    SESSION_ID_TYPE_UNKNOWN(0),
    DEVICE_CONTROLLER_CONNECTION(1),
    DEVICE_CONTROLLER_APPLICATION_CONNECTION(2),
    DEVICE_FILTER(3),
    REMOTE_DISPLAY_PLUGIN_SESSION(4),
    REMOTE_CONTROL_NOTIFICATION_SESSION(5);
    

    /* renamed from: i */
    private static final C8751tc<C8776v6> f44150i = null;

    /* renamed from: b */
    private final int f44152b;

    static {
        f44150i = new C8730s6();
    }

    private C8776v6(int i) {
        this.f44152b = i;
    }

    /* renamed from: d */
    public static C8766uc m41350d() {
        return C8760u6.f44120a;
    }

    public final String toString() {
        return "<" + C8776v6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44152b + " name=" + name() + '>';
    }
}
