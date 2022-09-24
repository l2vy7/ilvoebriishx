package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.us */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum C8238us implements C7950mp3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    

    /* renamed from: i */
    private static final np3<C8238us> f39946i = null;

    /* renamed from: b */
    private final int f39948b;

    static {
        f39946i = new C8166ss();
    }

    private C8238us(int i) {
        this.f39948b = i;
    }

    /* renamed from: a */
    public static C8238us m38431a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    /* renamed from: d */
    public static op3 m38432d() {
        return C8202ts.f39521a;
    }

    public final String toString() {
        return Integer.toString(this.f39948b);
    }

    public final int zza() {
        return this.f39948b;
    }
}
