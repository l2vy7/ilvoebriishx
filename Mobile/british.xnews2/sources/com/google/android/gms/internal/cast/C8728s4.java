package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.s4 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8728s4 implements C8736sc {
    DISCOVERY_START_UNKNOWN(0),
    DISCOVERY_START_CRITERIA_CHANGED(1),
    DISCOVERY_START_NETWORK_CHANGE(2),
    DISCOVERY_START_SCREEN_ON(3),
    DISCOVERY_START_FOREGROUND_MODE(4),
    DISCOVERY_START_CONFIGURATION_UPDATED(5);
    

    /* renamed from: i */
    private static final C8751tc<C8728s4> f43977i = null;

    /* renamed from: b */
    private final int f43979b;

    static {
        f43977i = new C8681p4();
    }

    private C8728s4(int i) {
        this.f43979b = i;
    }

    /* renamed from: d */
    public static C8766uc m41301d() {
        return C8697q4.f43918a;
    }

    public final String toString() {
        return "<" + C8728s4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43979b + " name=" + name() + '>';
    }
}
