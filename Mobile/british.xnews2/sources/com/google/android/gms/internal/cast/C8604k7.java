package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.k7 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8604k7 implements C8736sc {
    TCP_PROBING_SUMMARY_RESULT_CODE_UNKNOWN(0),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_REACHED_ATTEMPT_LIMIT(1),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_ALREADY_PUBLISHED(2),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_DISABLED(3),
    TCP_PROBING_SUMMARY_RESULT_CODE_SUCCESS(4),
    TCP_PROBING_SUMMARY_RESULT_CODE_FAIL(5);
    

    /* renamed from: i */
    private static final C8751tc<C8604k7> f43641i = null;

    /* renamed from: b */
    private final int f43643b;

    static {
        f43641i = new C8571i7();
    }

    private C8604k7(int i) {
        this.f43643b = i;
    }

    /* renamed from: d */
    public static C8766uc m41091d() {
        return C8587j7.f43623a;
    }

    public final String toString() {
        return "<" + C8604k7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43643b + " name=" + name() + '>';
    }
}
