package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.o6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8667o6 implements C8736sc {
    REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN(0),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT(1),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION(2),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS(3),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS(4),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_SET_MEDIA_NAMESPACE_CALLBACK(5),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_REQUEST_RECEIVER_STATUS(6);
    

    /* renamed from: j */
    private static final C8751tc<C8667o6> f43870j = null;

    /* renamed from: b */
    private final int f43872b;

    static {
        f43870j = new C8635m6();
    }

    private C8667o6(int i) {
        this.f43872b = i;
    }

    /* renamed from: d */
    public static C8766uc m41175d() {
        return C8651n6.f43803a;
    }

    public final String toString() {
        return "<" + C8667o6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43872b + " name=" + name() + '>';
    }
}
