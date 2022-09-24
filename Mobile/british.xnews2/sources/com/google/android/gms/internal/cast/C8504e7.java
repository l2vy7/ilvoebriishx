package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.e7 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8504e7 implements C8736sc {
    TCP_PROBER_RESULT_UNKNOWN(0),
    TCP_PROBER_RESULT_SUCCESS(1),
    TCP_PROBER_RESULT_CONNECTION_ERROR(2),
    TCP_PROBER_RESULT_OTHER(99);
    

    /* renamed from: g */
    private static final C8751tc<C8504e7> f43439g = null;

    /* renamed from: b */
    private final int f43441b;

    static {
        f43439g = new C8471c7();
    }

    private C8504e7(int i) {
        this.f43441b = i;
    }

    /* renamed from: d */
    public static C8766uc m40789d() {
        return C8488d7.f43418a;
    }

    public final String toString() {
        return "<" + C8504e7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43441b + " name=" + name() + '>';
    }
}
