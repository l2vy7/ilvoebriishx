package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.y1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8817y1 implements C8736sc {
    RENDER_TARGET_UNKNOWN(0),
    RENDER_TARGET_CAMERA(1),
    RENDER_TARGET_RENDER_TEXTURE_SET_ON_CAMERA(2),
    RENDER_TARGET_RENDER_TEXTURE(3);
    

    /* renamed from: g */
    private static final C8751tc<C8817y1> f44221g = null;

    /* renamed from: b */
    private final int f44223b;

    static {
        f44221g = new C8786w1();
    }

    private C8817y1(int i) {
        this.f44223b = i;
    }

    /* renamed from: d */
    public static C8766uc m41426d() {
        return C8802x1.f44190a;
    }

    public final String toString() {
        return "<" + C8817y1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44223b + " name=" + name() + '>';
    }
}
