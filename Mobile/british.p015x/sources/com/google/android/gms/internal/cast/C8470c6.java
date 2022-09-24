package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.c6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8470c6 implements C8736sc {
    PRECACHE_MESSAGE_RESULT_UNKNOWN(0),
    PRECACHE_MESSAGE_RESULT_SENT(1),
    PRECACHE_MESSAGE_RESULT_FAILED(2);
    

    /* renamed from: f */
    private static final C8751tc<C8470c6> f43366f = null;

    /* renamed from: b */
    private final int f43368b;

    static {
        f43366f = new C8436a6();
    }

    private C8470c6(int i) {
        this.f43368b = i;
    }

    /* renamed from: d */
    public static C8766uc m40724d() {
        return C8453b6.f43293a;
    }

    public final String toString() {
        return "<" + C8470c6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43368b + " name=" + name() + '>';
    }
}
