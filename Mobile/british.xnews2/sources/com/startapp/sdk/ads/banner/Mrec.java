package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class Mrec extends BannerStandard {
    public Mrec(Activity activity) {
        super(activity);
    }

    /* renamed from: e */
    public String mo20690e() {
        return "StartApp Mrec";
    }

    public int getHeightInDp() {
        return IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void loadAd(int i, int i2) {
        super.loadAd(getWidthInDp(), getHeightInDp());
    }

    /* renamed from: r */
    public int mo20735r() {
        return 1;
    }

    public Mrec(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Mrec(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Mrec(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    public Mrec(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Mrec(Activity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
    }

    @Deprecated
    public Mrec(Context context) {
        super(context);
    }

    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Mrec(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Mrec(Context context, boolean z, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context, z, adPreferences, bannerStandardAd);
    }
}
