package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.f4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8518f4 implements C8736sc {
    DEVICE_CONNECTION_TYPE_UNKNOWN(0),
    DEVICE_CONNECTION_TYPE_LOCAL(1),
    DEVICE_CONNECTION_TYPE_OPENCAST(2),
    DEVICE_CONNECTION_TYPE_RELAY(3),
    DEVICE_CONNECTION_TYPE_REMOTE_CASTING(4);
    

    /* renamed from: h */
    private static final C8751tc<C8518f4> f43462h = null;

    /* renamed from: b */
    private final int f43464b;

    static {
        f43462h = new C8485d4();
    }

    private C8518f4(int i) {
        this.f43464b = i;
    }

    /* renamed from: d */
    public static C8766uc m40851d() {
        return C8501e4.f43433a;
    }

    public final String toString() {
        return "<" + C8518f4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43464b + " name=" + name() + '>';
    }
}
