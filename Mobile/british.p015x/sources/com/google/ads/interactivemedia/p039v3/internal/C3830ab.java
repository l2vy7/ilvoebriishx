package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ab */
/* compiled from: IMASDK */
public enum C3830ab implements bkn {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: e */
    private final int f13997e;

    private C3830ab(int i) {
        this.f13997e = i;
    }

    /* renamed from: b */
    public static C3830ab m12867b(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    /* renamed from: c */
    public static bko m12868c() {
        return C4169m.f17921d;
    }

    /* renamed from: a */
    public final int mo13309a() {
        return this.f13997e;
    }

    public final String toString() {
        return "<" + C3830ab.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f13997e + " name=" + name() + '>';
    }
}
