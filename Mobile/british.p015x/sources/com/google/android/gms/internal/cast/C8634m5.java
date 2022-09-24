package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.m5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8634m5 implements C8736sc {
    LOCAL_NETWORK_ACCESS_PERMISSION_STATUS_UNKNOWN(0),
    LOCAL_NETWORK_ACCESS_PERMISSION_STATUS_ALLOWED(1),
    LOCAL_NETWORK_ACCESS_PERMISSION_STATUS_DENIED(2);
    

    /* renamed from: f */
    private static final C8751tc<C8634m5> f43711f = null;

    /* renamed from: b */
    private final int f43713b;

    static {
        f43711f = new C8602k5();
    }

    private C8634m5(int i) {
        this.f43713b = i;
    }

    /* renamed from: d */
    public static C8766uc m41129d() {
        return C8618l5.f43657a;
    }

    public final String toString() {
        return "<" + C8634m5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43713b + " name=" + name() + '>';
    }
}
