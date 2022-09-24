package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.q7 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8700q7 implements C8736sc {
    WIFI_AUTH_TYPE_OTHER(0),
    WIFI_AUTH_TYPE_WEP(1),
    WIFI_AUTH_TYPE_WPA(2);
    

    /* renamed from: f */
    private static final C8751tc<C8700q7> f43923f = null;

    /* renamed from: b */
    private final int f43925b;

    static {
        f43923f = new C8668o7();
    }

    private C8700q7(int i) {
        this.f43925b = i;
    }

    /* renamed from: d */
    public static C8766uc m41240d() {
        return C8684p7.f43906a;
    }

    public final String toString() {
        return "<" + C8700q7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43925b + " name=" + name() + '>';
    }
}
