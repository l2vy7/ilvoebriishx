package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.c */
/* compiled from: IMASDK */
public enum C3899c implements bkn {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);
    

    /* renamed from: d */
    private final int f16809d;

    private C3899c(int i) {
        this.f16809d = i;
    }

    /* renamed from: a */
    public static C3899c m16898a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return DISABLED;
    }

    /* renamed from: b */
    public static bko m16899b() {
        return C4034h.f17351b;
    }

    public final String toString() {
        return "<" + C3899c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16809d + " name=" + name() + '>';
    }
}
