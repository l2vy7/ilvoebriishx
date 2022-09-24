package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.v4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8774v4 implements C8736sc {
    DISCOVERY_STOP_UNKNOWN(0),
    DISCOVERY_STOP_CRITERIA_CHANGED(1),
    DISCOVERY_STOP_NETWORK_CHANGE(2),
    DISCOVERY_STOP_SCREEN_OFF(3),
    DISCOVERY_STOP_BACKGROUND_MODE(4),
    DISCOVERY_STOP_CONFIGURATION_UPDATED(5),
    DISCOVERY_STOP_APPLICATION_FINISHED(6);
    

    /* renamed from: j */
    private static final C8751tc<C8774v4> f44140j = null;

    /* renamed from: b */
    private final int f44142b;

    static {
        f44140j = new C8744t4();
    }

    private C8774v4(int i) {
        this.f44142b = i;
    }

    /* renamed from: d */
    public static C8766uc m41349d() {
        return C8758u4.f44119a;
    }

    public final String toString() {
        return "<" + C8774v4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44142b + " name=" + name() + '>';
    }
}
