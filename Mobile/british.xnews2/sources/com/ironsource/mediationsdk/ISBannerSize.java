package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;

public class ISBannerSize {
    public static final ISBannerSize BANNER = new ISBannerSize(AdPreferences.TYPE_BANNER, 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    /* renamed from: d */
    protected static final ISBannerSize f22089d = new ISBannerSize("LEADERBOARD", 728, 90);

    /* renamed from: a */
    private int f22090a;

    /* renamed from: b */
    private int f22091b;

    /* renamed from: c */
    private String f22092c;

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f22092c = str;
        this.f22090a = i;
        this.f22091b = i2;
    }

    public String getDescription() {
        return this.f22092c;
    }

    public int getHeight() {
        return this.f22091b;
    }

    public int getWidth() {
        return this.f22090a;
    }

    public boolean isSmart() {
        return this.f22092c.equals("SMART");
    }
}
