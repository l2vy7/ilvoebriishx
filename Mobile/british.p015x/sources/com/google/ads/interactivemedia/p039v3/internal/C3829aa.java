package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aa */
/* compiled from: IMASDK */
public enum C3829aa implements bkn {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);
    

    /* renamed from: g */
    private final int f13907g;

    private C3829aa(int i) {
        this.f13907g = i;
    }

    /* renamed from: b */
    public static C3829aa m12687b(int i) {
        if (i == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i == 1) {
            return BITSLICER;
        }
        if (i == 2) {
            return TINK_HYBRID;
        }
        if (i == 3) {
            return UNENCRYPTED;
        }
        if (i == 4) {
            return DG;
        }
        if (i != 5) {
            return null;
        }
        return DG_XTEA;
    }

    /* renamed from: c */
    public static bko m12688c() {
        return C4169m.f17920c;
    }

    /* renamed from: a */
    public final int mo13221a() {
        return this.f13907g;
    }

    public final String toString() {
        return "<" + C3829aa.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f13907g + " name=" + name() + '>';
    }
}
