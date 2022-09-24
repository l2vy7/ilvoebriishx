package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.e2 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8499e2 implements C8736sc {
    TARGET_FPS_UNKNOWN(0),
    TARGET_FPS_15(1),
    TARGET_FPS_24(2),
    TARGET_FPS_25(3),
    TARGET_FPS_30(4),
    TARGET_FPS_60(5);
    

    /* renamed from: i */
    private static final C8751tc<C8499e2> f43430i = null;

    /* renamed from: b */
    private final int f43432b;

    static {
        f43430i = new C8466c2();
    }

    private C8499e2(int i) {
        this.f43432b = i;
    }

    /* renamed from: d */
    public static C8766uc m40788d() {
        return C8483d2.f43392a;
    }

    public final String toString() {
        return "<" + C8499e2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43432b + " name=" + name() + '>';
    }
}
