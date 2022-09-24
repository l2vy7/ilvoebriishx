package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.l6 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8619l6 implements C8736sc {
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_NO_OP(0),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_PARTNER_APP(1),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_HOME_APP(2),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_PARTNER_APP_PLAY_STORE(3),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_HOME_APP_PLAY_STORE(4);
    

    /* renamed from: h */
    private static final C8751tc<C8619l6> f43663h = null;

    /* renamed from: b */
    private final int f43665b;

    static {
        f43663h = new C8586j6();
    }

    private C8619l6(int i) {
        this.f43665b = i;
    }

    /* renamed from: d */
    public static C8766uc m41111d() {
        return C8603k6.f43634a;
    }

    public final String toString() {
        return "<" + C8619l6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43665b + " name=" + name() + '>';
    }
}
