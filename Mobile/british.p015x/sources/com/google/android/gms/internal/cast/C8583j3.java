package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.j3 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8583j3 implements C8736sc {
    CLOUD_DEVICE_PROBING_STATUS_CODE_UNKNOWN(0),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SCHEDULED(1),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SKIPPED_CLOUD_PROBING_DISABLED(2),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SKIPPED_INVALID_IP_FRAGMENT(3),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SKIPPED_INVALID_NETWORK_INFO(4),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SKIPPED_INVALID_NETWORK_IP(5),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SKIPPED_STRUCTURE_OFFLINE(6),
    CLOUD_DEVICE_PROBING_STATUS_CODE_SKIPPED_CLOUD_DEVICE_OFFLINE(7);
    

    /* renamed from: k */
    private static final C8751tc<C8583j3> f43614k = null;

    /* renamed from: b */
    private final int f43616b;

    static {
        f43614k = new C8550h3();
    }

    private C8583j3(int i) {
        this.f43616b = i;
    }

    /* renamed from: d */
    public static C8766uc m41022d() {
        return C8567i3.f43526a;
    }

    public final String toString() {
        return "<" + C8583j3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43616b + " name=" + name() + '>';
    }
}
