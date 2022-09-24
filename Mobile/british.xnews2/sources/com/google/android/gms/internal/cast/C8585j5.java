package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.j5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8585j5 implements C8736sc {
    LAUNCH_UNKNOWN(0),
    JOIN(1),
    LAUNCH(2);
    

    /* renamed from: f */
    private static final C8751tc<C8585j5> f43620f = null;

    /* renamed from: b */
    private final int f43622b;

    static {
        f43620f = new C8552h5();
    }

    private C8585j5(int i) {
        this.f43622b = i;
    }

    /* renamed from: d */
    public static C8766uc m41023d() {
        return C8569i5.f43535a;
    }

    public final String toString() {
        return "<" + C8585j5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43622b + " name=" + name() + '>';
    }
}
