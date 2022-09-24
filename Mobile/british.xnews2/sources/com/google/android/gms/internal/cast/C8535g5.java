package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.g5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8535g5 implements C8736sc {
    KEY_EXCHANGE_UNKNOWN(0),
    KEY_EXCHANGE_SUCCEEDED(1),
    KEY_EXCHANGE_FAILED(2);
    

    /* renamed from: f */
    private static final C8751tc<C8535g5> f43491f = null;

    /* renamed from: b */
    private final int f43493b;

    static {
        f43491f = new C8502e5();
    }

    private C8535g5(int i) {
        this.f43493b = i;
    }

    /* renamed from: d */
    public static C8766uc m40925d() {
        return C8519f5.f43465a;
    }

    public final String toString() {
        return "<" + C8535g5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43493b + " name=" + name() + '>';
    }
}
