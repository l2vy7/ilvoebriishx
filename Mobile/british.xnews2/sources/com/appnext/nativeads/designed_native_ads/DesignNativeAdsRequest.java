package com.appnext.nativeads.designed_native_ads;

import com.appnext.core.C3176c;

public class DesignNativeAdsRequest extends C3176c {

    /* renamed from: gl */
    private String f12527gl = "";

    /* renamed from: gm */
    private String f12528gm = "";
    private String mSpecificCategories = "";

    public String getCategories() {
        return this.f12527gl;
    }

    public String getPostBack() {
        return this.f12528gm;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public DesignNativeAdsRequest setCategories(String str) {
        this.f12527gl = str;
        return this;
    }

    public DesignNativeAdsRequest setPostBack(String str) {
        this.f12528gm = str;
        return this;
    }

    public DesignNativeAdsRequest setSpecificCategories(String str) {
        this.mSpecificCategories = str;
        return this;
    }
}
