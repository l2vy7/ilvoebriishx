package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.b2 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8449b2 implements C8736sc {
    TARGET_DELAY_UNKNOWN(0),
    TARGET_DELAY_MINIMUM(1),
    TARGET_DELAY_LOW(2),
    TARGET_DELAY_NORMAL(3),
    TARGET_DELAY_HIGH(4);
    

    /* renamed from: h */
    private static final C8751tc<C8449b2> f43289h = null;

    /* renamed from: b */
    private final int f43291b;

    static {
        f43289h = new C8832z1();
    }

    private C8449b2(int i) {
        this.f43291b = i;
    }

    /* renamed from: d */
    public static C8766uc m40714d() {
        return C8432a2.f43145a;
    }

    public final String toString() {
        return "<" + C8449b2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43291b + " name=" + name() + '>';
    }
}
