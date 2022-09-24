package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.w5 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8790w5 implements C8736sc {
    NETWORK_CONNECTION_STATE_UNKNOWN(0),
    CONNECTED(1),
    CONNECTING(2),
    DISCONNECTED(3),
    DISCONNECTING(4),
    SUSPENDED(6);
    

    /* renamed from: i */
    private static final C8751tc<C8790w5> f44173i = null;

    /* renamed from: b */
    private final int f44175b;

    static {
        f44173i = new C8759u5();
    }

    private C8790w5(int i) {
        this.f44175b = i;
    }

    /* renamed from: d */
    public static C8766uc m41373d() {
        return C8775v5.f44143a;
    }

    public final String toString() {
        return "<" + C8790w5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f44175b + " name=" + name() + '>';
    }
}
