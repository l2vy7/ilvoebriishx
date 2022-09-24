package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.g3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8533g3 implements C8736sc {
    RESULT_UNKNOWN(0),
    DECODE_SUCCESS(1),
    REQUEST_TIMED_OUT(2),
    USER_CANCELLED(3),
    USER_INTERRUPTED_AUDIO_PARING(4);
    

    /* renamed from: h */
    private static final C8751tc<C8533g3> f43485h = null;

    /* renamed from: b */
    private final int f43487b;

    static {
        f43485h = new C8500e3();
    }

    private C8533g3(int i) {
        this.f43487b = i;
    }

    /* renamed from: d */
    public static C8766uc m40924d() {
        return C8517f3.f43456a;
    }

    public final String toString() {
        return "<" + C8533g3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43487b + " name=" + name() + '>';
    }
}
