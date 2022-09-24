package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.y4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8820y4 implements C8736sc {
    UNKNOWN(0),
    POSIX(1),
    OSSTATUS(2),
    COCOA(3);
    

    /* renamed from: g */
    private static final C8751tc<C8820y4> f44229g = null;

    /* renamed from: b */
    private final int f44231b;

    static {
        f44229g = new C8789w4();
    }

    private C8820y4(int i) {
        this.f44231b = i;
    }

    /* renamed from: d */
    public static C8766uc m41427d() {
        return C8805x4.f44211a;
    }

    public final String toString() {
        return "<" + C8820y4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44231b + " name=" + name() + '>';
    }
}
