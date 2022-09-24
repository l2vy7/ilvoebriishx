package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.t3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8743t3 implements C8736sc {
    CONNECTION_TYPE_UNKNOWN(0),
    CONNECTION_TYPE_STRONG(1),
    CONNECTION_TYPE_INVISIBLE(2);
    

    /* renamed from: f */
    private static final C8751tc<C8743t3> f43994f = null;

    /* renamed from: b */
    private final int f43996b;

    static {
        f43994f = new C8712r3();
    }

    private C8743t3(int i) {
        this.f43996b = i;
    }

    /* renamed from: d */
    public static C8766uc m41314d() {
        return C8727s3.f43970a;
    }

    public final String toString() {
        return "<" + C8743t3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43996b + " name=" + name() + '>';
    }
}
