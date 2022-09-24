package com.appnext.nativeads.designed_native_ads;

public class AppnextDesignedNativeAdData {

    /* renamed from: gb */
    private String f12524gb;

    /* renamed from: gc */
    private String f12525gc;

    /* renamed from: gd */
    private long f12526gd;

    public AppnextDesignedNativeAdData(String str, String str2, long j) {
        this.f12524gb = str;
        this.f12525gc = str2;
        this.f12526gd = j;
    }

    public long getAdClickedTime() {
        return this.f12526gd;
    }

    public String getAdPackageName() {
        return this.f12524gb;
    }

    public String getAdTitle() {
        return this.f12525gc;
    }
}
