package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.p3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8680p3 implements C8736sc {
    CLOUD_DISCOVERY_TRIGGERING_SOURCE_UNKNOWN(0),
    CLOUD_DISCOVERY_TRIGGERING_SOURCE_CAST_BUTTON_CLICK(1),
    CLOUD_DISCOVERY_TRIGGERING_SOURCE_REMOTE_CASTING(2);
    

    /* renamed from: f */
    private static final C8751tc<C8680p3> f43887f = null;

    /* renamed from: b */
    private final int f43889b;

    static {
        f43887f = new C8648n3();
    }

    private C8680p3(int i) {
        this.f43889b = i;
    }

    /* renamed from: d */
    public static C8766uc m41210d() {
        return C8664o3.f43850a;
    }

    public final String toString() {
        return "<" + C8680p3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43889b + " name=" + name() + '>';
    }
}
