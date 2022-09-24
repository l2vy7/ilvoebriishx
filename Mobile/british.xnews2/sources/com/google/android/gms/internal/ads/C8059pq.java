package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum C8059pq implements C7950mp3 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);
    

    /* renamed from: o */
    private static final np3<C8059pq> f37746o = null;

    /* renamed from: b */
    private final int f37748b;

    static {
        f37746o = new C7987nq();
    }

    private C8059pq(int i) {
        this.f37748b = i;
    }

    /* renamed from: a */
    public static C8059pq m36162a(int i) {
        switch (i) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static op3 m36163d() {
        return C8024oq.f36574a;
    }

    public final String toString() {
        return Integer.toString(this.f37748b);
    }

    public final int zza() {
        return this.f37748b;
    }
}
