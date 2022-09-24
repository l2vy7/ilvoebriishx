package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.i */
/* compiled from: IMASDK */
public enum C4061i implements bkn {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: f */
    private final int f17410f;

    private C4061i(int i) {
        this.f17410f = i;
    }

    /* renamed from: a */
    public static C4061i m17361a(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    /* renamed from: b */
    public static bko m17362b() {
        return C4034h.f17350a;
    }

    public final String toString() {
        return "<" + C4061i.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f17410f + " name=" + name() + '>';
    }
}
