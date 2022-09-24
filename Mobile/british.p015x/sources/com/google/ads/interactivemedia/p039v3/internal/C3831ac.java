package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ac */
/* compiled from: IMASDK */
public enum C3831ac implements bkn {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: e */
    private final int f14116e;

    private C3831ac(int i) {
        this.f14116e = i;
    }

    /* renamed from: a */
    public static C3831ac m12996a(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    /* renamed from: b */
    public static bko m12997b() {
        return C4169m.f17922e;
    }

    public final String toString() {
        return "<" + C3831ac.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f14116e + " name=" + name() + '>';
    }
}
