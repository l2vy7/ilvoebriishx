package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.w3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8788w3 implements C8736sc {
    CONSUME_CHUNK_RESULT_UNKNOWN(0),
    CONSUME_CHUNK_RESULT_SUCCESS(1),
    CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED(3),
    CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD(4),
    CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE(5);
    

    /* renamed from: h */
    private static final C8751tc<C8788w3> f44164h = null;

    /* renamed from: b */
    private final int f44166b;

    static {
        f44164h = new C8757u3();
    }

    private C8788w3(int i) {
        this.f44166b = i;
    }

    /* renamed from: d */
    public static C8766uc m41372d() {
        return C8773v3.f44132a;
    }

    public final String toString() {
        return "<" + C8788w3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44166b + " name=" + name() + '>';
    }
}
