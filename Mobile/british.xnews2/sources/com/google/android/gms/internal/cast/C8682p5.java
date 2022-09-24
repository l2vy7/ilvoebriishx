package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.p5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8682p5 implements C8736sc {
    MDNS_RESPONSE_ERROR_UNKNOWN(0),
    ERROR_NOT_RESPONSE_MESSAGE(1),
    ERROR_NO_ANSWERS(2),
    ERROR_READING_RESPONSE_LABELS(3),
    ERROR_READING_IP4_ADDRESS(4),
    ERROR_READING_IP6_ADDRESS(5),
    ERROR_READING_POINTER_RECORD(6),
    ERROR_SKIPPING_POINTER_RECORD(7),
    ERROR_READING_SERVICE_RECORD(8),
    ERROR_SKIPPING_SERVICE_RECORD(9),
    ERROR_READING_TEXT_RECORD(10),
    ERROR_SKIPPING_UNKNOWN_RECORD(11),
    ERROR_END_OF_FILE(12);
    

    /* renamed from: p */
    private static final C8751tc<C8682p5> f43903p = null;

    /* renamed from: b */
    private final int f43905b;

    static {
        f43903p = new C8650n5();
    }

    private C8682p5(int i) {
        this.f43905b = i;
    }

    /* renamed from: d */
    public static C8766uc m41211d() {
        return C8666o5.f43862a;
    }

    public final String toString() {
        return "<" + C8682p5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43905b + " name=" + name() + '>';
    }
}
