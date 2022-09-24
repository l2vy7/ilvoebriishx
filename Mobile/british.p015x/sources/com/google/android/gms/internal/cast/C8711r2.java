package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.r2 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8711r2 implements C8736sc {
    TRIGGER_REASON_NONE(0),
    NO_MDNS_RESPONSE(1),
    NO_MDNS_SUBTYPE_RESPONSE(2),
    SOME_MDNS_SUBTYPE_RESPONSES_RECEIVED(3);
    

    /* renamed from: g */
    private static final C8751tc<C8711r2> f43941g = null;

    /* renamed from: b */
    private final int f43943b;

    static {
        f43941g = new C8663o2();
    }

    private C8711r2(int i) {
        this.f43943b = i;
    }

    /* renamed from: d */
    public static C8766uc m41265d() {
        return C8695q2.f43916a;
    }

    public final String toString() {
        return "<" + C8711r2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43943b + " name=" + name() + '>';
    }
}
