package com.startapp.sdk.adsbase.model;

import com.startapp.C5010hb;
import com.startapp.sdk.adsbase.BaseResponse;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class GetAdResponse extends BaseResponse {
    private static final long serialVersionUID = 1;
    @C5010hb(complex = true)
    private AdInformationOverrides adInfoOverrides = AdInformationOverrides.m23167a();
    @C5010hb(type = ArrayList.class, value = AdDetails.class)
    private List<AdDetails> adsDetails = new ArrayList();
    private boolean inAppBrowser;
    @C5010hb(type = inAppBrowserPreLoad.class)
    private inAppBrowserPreLoad inAppBrowserPreLoad;
    private String productId;
    private String publisherId;

    /* compiled from: Sta */
    public enum inAppBrowserPreLoad {
    }

    /* renamed from: c */
    public AdInformationOverrides mo46278c() {
        return this.adInfoOverrides;
    }

    /* renamed from: d */
    public List<AdDetails> mo46279d() {
        return this.adsDetails;
    }
}
