package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class Cover extends BannerStandard {
    public Cover(Activity activity) {
        super(activity);
    }

    /* renamed from: e */
    public String mo20690e() {
        return "StartApp Cover";
    }

    public int getHeightInDp() {
        return 628;
    }

    public int getWidthInDp() {
        return IronSourceConstants.RV_INSTANCE_LOAD_FAILED;
    }

    public void loadAd(int i, int i2) {
        super.loadAd(getWidthInDp(), getHeightInDp());
    }

    /* renamed from: r */
    public int mo20735r() {
        return 2;
    }

    public Cover(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Cover(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Cover(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    public Cover(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Cover(Activity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
    }

    @Deprecated
    public Cover(Context context) {
        super(context);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Cover(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Cover(Context context, boolean z, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context, z, adPreferences, bannerStandardAd);
    }
}
