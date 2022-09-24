package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.n1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8646n1 implements C8736sc {
    AUDIO_FORMAT_UNKNOWN(0),
    AUDIO_FORMAT_AV_AUDIO_PCM_FLOAT_32(1),
    AUDIO_FORMAT_AV_AUDIO_PCM_FLOAT_64(2),
    AUDIO_FORMAT_AV_AUDIO_PCM_INT_16(3),
    AUDIO_FORMAT_AV_AUDIO_PCM_INT_32(4);
    

    /* renamed from: h */
    private static final C8751tc<C8646n1> f43799h = null;

    /* renamed from: b */
    private final int f43801b;

    static {
        f43799h = new C8614l1();
    }

    private C8646n1(int i) {
        this.f43801b = i;
    }

    /* renamed from: d */
    public static C8766uc m41144d() {
        return C8630m1.f43696a;
    }

    public final String toString() {
        return "<" + C8646n1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f43801b + " name=" + name() + '>';
    }
}
