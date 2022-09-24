package com.appnext.nativeads.designed_native_ads;

import com.appnext.core.AppnextAd;

public class DesignNativeAd extends AppnextAd {
    private String mIconUrl;

    public DesignNativeAd(AppnextAd appnextAd, String str) {
        super(appnextAd);
        this.mIconUrl = str;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public String getImpressionUrl() {
        return super.getImpressionURL();
    }
}
