package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.y0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public enum C9679y0 implements C9689z2 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    f46002j(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);
    

    /* renamed from: q */
    private static final C9681y2<C9679y0> f46009q = null;

    /* renamed from: b */
    private final int f46011b;

    static {
        f46009q = new C9671x0();
    }

    private C9679y0(int i) {
        this.f46011b = i;
    }

    /* renamed from: a */
    public static C9679y0 m44837a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return f46002j;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static C9474b3 m44838d() {
        return C9463a1.f45589a;
    }

    /* renamed from: e */
    public final int mo38237e() {
        return this.f46011b;
    }

    public final String toString() {
        return "<" + C9679y0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f46011b + " name=" + name() + '>';
    }
}
