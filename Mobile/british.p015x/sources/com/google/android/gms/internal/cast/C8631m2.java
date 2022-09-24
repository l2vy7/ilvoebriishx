package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.m2 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8631m2 implements C8736sc {
    PLUGIN_TYPE_UNKNOWN(0),
    PLUGIN_TYPE_UNITY_3D(1);
    

    /* renamed from: e */
    private static final C8751tc<C8631m2> f43699e = null;

    /* renamed from: b */
    private final int f43701b;

    static {
        f43699e = new C8599k2();
    }

    private C8631m2(int i) {
        this.f43701b = i;
    }

    /* renamed from: d */
    public static C8766uc m41127d() {
        return C8615l2.f43649a;
    }

    public final String toString() {
        return "<" + C8631m2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43701b + " name=" + name() + '>';
    }
}
