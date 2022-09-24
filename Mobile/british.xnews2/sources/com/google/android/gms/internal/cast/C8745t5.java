package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.t5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8745t5 implements C8736sc {
    SUBTYPE_UNKNOWN(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    SUBTYPE_1XRTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18);
    

    /* renamed from: v */
    private static final C8751tc<C8745t5> f44016v = null;

    /* renamed from: b */
    private final int f44018b;

    static {
        f44016v = new C8698q5();
    }

    private C8745t5(int i) {
        this.f44018b = i;
    }

    /* renamed from: d */
    public static C8766uc m41315d() {
        return C8713r5.f43944a;
    }

    public final String toString() {
        return "<" + C8745t5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44018b + " name=" + name() + '>';
    }
}
