package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.v1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8771v1 implements C8736sc {
    RENDER_BACKEND_UNKNOWN(0),
    RENDER_BACKEND_OPENGL_ES_2(1),
    RENDER_BACKEND_OPENGL_ES_3(2),
    RENDER_BACKEND_METAL(3);
    

    /* renamed from: g */
    private static final C8751tc<C8771v1> f44129g = null;

    /* renamed from: b */
    private final int f44131b;

    static {
        f44129g = new C8741t1();
    }

    private C8771v1(int i) {
        this.f44131b = i;
    }

    /* renamed from: d */
    public static C8766uc m41348d() {
        return C8755u1.f44022a;
    }

    public final String toString() {
        return "<" + C8771v1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44131b + " name=" + name() + '>';
    }
}
