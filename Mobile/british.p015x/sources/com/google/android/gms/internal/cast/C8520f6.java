package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.f6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8520f6 implements C8736sc {
    PRECACHE_MESSAGE_TYPE_UNKNOWN(0),
    PRECACHE_MESSAGE_TYPE_ACTIVE_CONNECTION(1),
    PRECACHE_MESSAGE_TYPE_BROADCAST(2);
    

    /* renamed from: f */
    private static final C8751tc<C8520f6> f43469f = null;

    /* renamed from: b */
    private final int f43471b;

    static {
        f43469f = new C8487d6();
    }

    private C8520f6(int i) {
        this.f43471b = i;
    }

    /* renamed from: d */
    public static C8766uc m40852d() {
        return C8503e6.f43434a;
    }

    public final String toString() {
        return "<" + C8520f6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43471b + " name=" + name() + '>';
    }
}
