package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.m3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8632m3 implements C8736sc {
    CLOUD_DISCOVERY_RESULT_CODE_UNKNOWN(0),
    CLOUD_DISCOVERY_RESULT_CODE_SUCCESS(1),
    CLOUD_DISCOVERY_RESULT_CODE_FAILURE(2);
    

    /* renamed from: f */
    private static final C8751tc<C8632m3> f43705f = null;

    /* renamed from: b */
    private final int f43707b;

    static {
        f43705f = new C8600k3();
    }

    private C8632m3(int i) {
        this.f43707b = i;
    }

    /* renamed from: d */
    public static C8766uc m41128d() {
        return C8616l3.f43650a;
    }

    public final String toString() {
        return "<" + C8632m3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43707b + " name=" + name() + '>';
    }
}
