package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.r6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8714r6 implements C8736sc {
    SEND_MESSAGE_RESULT_UNKNOWN(0),
    SEND_MESSAGE_RESULT_SUCCESS(1),
    SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST(2),
    SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL(3),
    SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE(4),
    SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR(5);
    

    /* renamed from: i */
    private static final C8751tc<C8714r6> f43951i = null;

    /* renamed from: b */
    private final int f43953b;

    static {
        f43951i = new C8683p6();
    }

    private C8714r6(int i) {
        this.f43953b = i;
    }

    /* renamed from: d */
    public static C8766uc m41266d() {
        return C8699q6.f43919a;
    }

    public final String toString() {
        return "<" + C8714r6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43953b + " name=" + name() + '>';
    }
}
