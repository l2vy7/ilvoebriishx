package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum C7619dr implements C7950mp3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    f30953d(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);
    

    /* renamed from: n */
    private static final np3<C7619dr> f30963n = null;

    /* renamed from: b */
    private final int f30965b;

    static {
        f30963n = new C7548br();
    }

    private C7619dr(int i) {
        this.f30965b = i;
    }

    /* renamed from: a */
    public static C7619dr m31545a(int i) {
        switch (i) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return f30953d;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static op3 m31546d() {
        return C7584cr.f30472a;
    }

    public final String toString() {
        return Integer.toString(this.f30965b);
    }

    public final int zza() {
        return this.f30965b;
    }
}
