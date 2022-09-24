package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.n */
/* compiled from: IMASDK */
public enum C4196n implements bkn {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7),
    DEVICE_IDENTIFIER_PER_APP_ID_V2(8);
    

    /* renamed from: j */
    private final int f18029j;

    private C4196n(int i) {
        this.f18029j = i;
    }

    /* renamed from: b */
    public static C4196n m18125b(int i) {
        switch (i) {
            case 0:
                return DEVICE_IDENTIFIER_NO_ID;
            case 1:
                return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
            case 2:
                return DEVICE_IDENTIFIER_GLOBAL_ID;
            case 3:
                return DEVICE_IDENTIFIER_ADVERTISER_ID;
            case 4:
                return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
            case 5:
                return DEVICE_IDENTIFIER_ANDROID_AD_ID;
            case 6:
                return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
            case 7:
                return DEVICE_IDENTIFIER_PER_APP_ID;
            case 8:
                return DEVICE_IDENTIFIER_PER_APP_ID_V2;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static bko m18126c() {
        return C4169m.f17918a;
    }

    /* renamed from: a */
    public final int mo16342a() {
        return this.f18029j;
    }

    public final String toString() {
        return "<" + C4196n.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f18029j + " name=" + name() + '>';
    }
}
