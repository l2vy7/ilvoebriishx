package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.l4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8617l4 implements C8736sc {
    DEVICE_LINK_STATE_UNKNOWN(0),
    DEVICE_LINK_STATE_NOT_LINKED(1),
    DEVICE_LINK_STATE_LINKED(2);
    

    /* renamed from: f */
    private static final C8751tc<C8617l4> f43654f = null;

    /* renamed from: b */
    private final int f43656b;

    static {
        f43654f = new C8584j4();
    }

    private C8617l4(int i) {
        this.f43656b = i;
    }

    /* renamed from: d */
    public static C8766uc m41110d() {
        return C8601k4.f43633a;
    }

    public final String toString() {
        return "<" + C8617l4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43656b + " name=" + name() + '>';
    }
}
