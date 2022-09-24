package com.appnext.banners;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;

public class BannerSize {
    public static final BannerSize BANNER = new BannerSize(320, 50, AdPreferences.TYPE_BANNER);
    public static final BannerSize LARGE_BANNER = new BannerSize(320, 100, "LARGE_BANNER");
    public static final BannerSize MEDIUM_RECTANGLE = new BannerSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "MEDIUM_RECTANGLE");

    /* renamed from: bE */
    private int f12136bE;

    /* renamed from: bF */
    private int f12137bF;

    /* renamed from: bG */
    private String f12138bG;

    private BannerSize(int i, int i2, String str) {
        this.f12136bE = i;
        this.f12137bF = i2;
        this.f12138bG = str;
    }

    /* renamed from: J */
    public final int mo10435J() {
        return this.f12136bE;
    }

    /* renamed from: K */
    public final int mo10436K() {
        return this.f12137bF;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerSize)) {
            return false;
        }
        BannerSize bannerSize = (BannerSize) obj;
        return this.f12136bE == bannerSize.f12136bE && this.f12137bF == bannerSize.f12137bF && this.f12138bG.equals(bannerSize.f12138bG);
    }

    public String toString() {
        return this.f12138bG;
    }
}
