package com.appnext.core;

import android.text.TextUtils;

public class AppnextAd extends C3201h {
    private String androidPackage = "";
    private String appSize = "";
    private String bId = "";
    private String buttonText = "";
    private String campaignGoal = "";
    private String campaignId = "";
    private String campaignType = "";
    private String categories = "";

    /* renamed from: cb */
    private String f12248cb = "";
    private String country = "";
    private String cpt_list = "";
    private String desc = "";
    private String ecpm = "";
    private String gdpr = SessionDescription.SUPPORTED_SDP_VERSION;
    private String idx = "";
    private String market_url;
    private String pbaBId = "";
    private String pbaZId = "";
    private String pixelImp = "";
    private String revenueRate = "";
    private String revenueType = "";
    private String specificCategories = "";
    private String storeDownloads = "";
    private String storeRating = "";
    private String supportedVersion = "";
    private String title = "";
    private String urlApp = "";
    private String urlImg = "";
    private String urlImgWide = "";
    private String urlVideo = "";
    private String urlVideo30Sec = "";
    private String urlVideo30SecHigh = "";
    private String urlVideoHigh = "";
    private String webview = SessionDescription.SUPPORTED_SDP_VERSION;
    private String zId = "";

    protected AppnextAd() {
    }

    public String getAdDescription() {
        return this.desc;
    }

    public String getAdPackage() {
        return this.androidPackage;
    }

    public String getAdTitle() {
        return this.title;
    }

    public String getAppSize() {
        return this.appSize;
    }

    public String getAppURL() {
        return this.urlApp;
    }

    public String getBannerID() {
        return this.bId;
    }

    /* access modifiers changed from: protected */
    public String getBpub() {
        return this.pbaBId;
    }

    /* access modifiers changed from: protected */
    public String getButtonText() {
        return this.buttonText;
    }

    /* access modifiers changed from: protected */
    public String getCampaignGoal() {
        return this.campaignGoal;
    }

    public String getCampaignID() {
        return this.campaignId;
    }

    public String getCampaignType() {
        return this.campaignType;
    }

    public String getCategories() {
        return this.categories;
    }

    /* access modifiers changed from: protected */
    public String getCb() {
        return this.f12248cb;
    }

    public String getCountry() {
        return this.country;
    }

    /* access modifiers changed from: protected */
    public String getCptList() {
        return this.cpt_list;
    }

    public AppnextAdCreativeType getCreativeType() {
        return (!TextUtils.isEmpty(getVideoUrl()) || !TextUtils.isEmpty(getVideoUrlHigh()) || !TextUtils.isEmpty(getVideoUrl30Sec()) || !TextUtils.isEmpty(getVideoUrlHigh30Sec())) ? AppnextAdCreativeType.VIDEO : AppnextAdCreativeType.STATIC;
    }

    public float getECPM() {
        return Float.parseFloat(getEcpm());
    }

    /* access modifiers changed from: protected */
    public String getEcpm() {
        return this.ecpm;
    }

    /* access modifiers changed from: protected */
    public String getEpub() {
        return this.pbaZId;
    }

    public String getIdx() {
        return this.idx;
    }

    public String getImageURL() {
        return this.urlImg;
    }

    /* access modifiers changed from: protected */
    public String getImpressionURL() {
        return this.pixelImp;
    }

    /* access modifiers changed from: protected */
    public String getMarketUrl() {
        return this.market_url;
    }

    public float getPPR() {
        return getECPM() / 1000.0f;
    }

    /* access modifiers changed from: protected */
    public String getRevenueRate() {
        return this.revenueRate;
    }

    /* access modifiers changed from: protected */
    public String getRevenueType() {
        return this.revenueType;
    }

    public String getSpecificCategories() {
        return this.specificCategories;
    }

    public String getStoreDownloads() {
        return this.storeDownloads;
    }

    public String getStoreRating() {
        return this.storeRating;
    }

    public String getSupportedVersion() {
        return this.supportedVersion;
    }

    public String getVideoUrl() {
        return this.urlVideo;
    }

    public String getVideoUrl30Sec() {
        return this.urlVideo30Sec;
    }

    public String getVideoUrlHigh() {
        return this.urlVideoHigh;
    }

    public String getVideoUrlHigh30Sec() {
        return this.urlVideo30SecHigh;
    }

    /* access modifiers changed from: protected */
    public String getWebview() {
        return this.webview;
    }

    public String getWideImageURL() {
        return this.urlImgWide;
    }

    /* access modifiers changed from: protected */
    public String getZoneID() {
        return this.zId;
    }

    public boolean isGdpr() {
        return !TextUtils.isEmpty(this.gdpr) && !this.gdpr.equals(SessionDescription.SUPPORTED_SDP_VERSION);
    }

    /* access modifiers changed from: protected */
    public void setAdDesc(String str) {
        this.desc = str;
    }

    /* access modifiers changed from: protected */
    public void setAdPackage(String str) {
        this.androidPackage = str;
    }

    /* access modifiers changed from: protected */
    public void setAdTitle(String str) {
        this.title = str;
    }

    /* access modifiers changed from: protected */
    public void setAppSize(String str) {
        this.appSize = str;
    }

    /* access modifiers changed from: protected */
    public void setAppURL(String str) {
        this.urlApp = str;
    }

    /* access modifiers changed from: protected */
    public void setBannerID(String str) {
        this.bId = str;
    }

    /* access modifiers changed from: protected */
    public void setBpub(String str) {
        this.pbaBId = str;
    }

    /* access modifiers changed from: protected */
    public void setButtonText(String str) {
        this.buttonText = str;
    }

    /* access modifiers changed from: protected */
    public void setCampaignGoal(String str) {
        this.campaignGoal = str;
    }

    /* access modifiers changed from: protected */
    public void setCampaignID(String str) {
        this.campaignId = str;
    }

    /* access modifiers changed from: protected */
    public void setCampaignType(String str) {
        this.campaignType = str;
    }

    /* access modifiers changed from: protected */
    public void setCategories(String str) {
        this.categories = str;
    }

    /* access modifiers changed from: protected */
    public void setCb(String str) {
        this.f12248cb = str;
    }

    /* access modifiers changed from: protected */
    public void setCounty(String str) {
        this.country = str;
    }

    /* access modifiers changed from: protected */
    public void setCptList(String str) {
        this.cpt_list = str;
    }

    /* access modifiers changed from: protected */
    public void setEcpm(String str) {
        this.ecpm = str;
    }

    /* access modifiers changed from: protected */
    public void setEpub(String str) {
        this.pbaZId = str;
    }

    public void setGdpr(String str) {
        this.gdpr = str;
    }

    /* access modifiers changed from: protected */
    public void setIdx(String str) {
        this.idx = str;
    }

    /* access modifiers changed from: protected */
    public void setImageURL(String str) {
        this.urlImg = str;
    }

    /* access modifiers changed from: protected */
    public void setImpressionURL(String str) {
        this.pixelImp = str;
    }

    /* access modifiers changed from: protected */
    public void setMarketUrl(String str) {
        this.market_url = str;
    }

    /* access modifiers changed from: protected */
    public void setRevenueRate(String str) {
        this.revenueRate = str;
    }

    /* access modifiers changed from: protected */
    public void setRevenueType(String str) {
        this.revenueType = str;
    }

    /* access modifiers changed from: protected */
    public void setSpecificCategories(String str) {
        this.specificCategories = str;
    }

    /* access modifiers changed from: protected */
    public void setStoreDownloads(String str) {
        this.storeDownloads = str;
    }

    /* access modifiers changed from: protected */
    public void setStoreRating(String str) {
        this.storeRating = str;
    }

    /* access modifiers changed from: protected */
    public void setSupportedVersion(String str) {
        this.supportedVersion = str;
    }

    /* access modifiers changed from: protected */
    public void setVideoUrl(String str) {
        this.urlVideo = str;
    }

    /* access modifiers changed from: protected */
    public void setVideoUrl30Sec(String str) {
        this.urlVideo30Sec = str;
    }

    /* access modifiers changed from: protected */
    public void setVideoUrlHigh(String str) {
        this.urlVideoHigh = str;
    }

    /* access modifiers changed from: protected */
    public void setVideoUrlHigh30Sec(String str) {
        this.urlVideo30SecHigh = str;
    }

    /* access modifiers changed from: protected */
    public void setWebview(String str) {
        this.webview = str;
    }

    /* access modifiers changed from: protected */
    public void setWideImageURL(String str) {
        this.urlImgWide = str;
    }

    /* access modifiers changed from: protected */
    public void setZoneID(String str) {
        this.zId = str;
    }

    public String toString() {
        return "AppnextAd{androidPackage='" + this.androidPackage + '\'' + '}';
    }

    protected AppnextAd(AppnextAd appnextAd) {
        if (appnextAd != null) {
            this.desc = appnextAd.desc;
            this.title = appnextAd.title;
            this.urlImg = appnextAd.urlImg;
            this.urlImgWide = appnextAd.urlImgWide;
            this.urlApp = appnextAd.urlApp;
            this.bId = appnextAd.bId;
            this.campaignId = appnextAd.campaignId;
            this.f12248cb = appnextAd.f12248cb;
            this.zId = appnextAd.zId;
            this.androidPackage = appnextAd.androidPackage;
            this.pbaZId = appnextAd.pbaZId;
            this.pbaBId = appnextAd.pbaBId;
            this.revenueType = appnextAd.revenueType;
            this.revenueRate = appnextAd.revenueRate;
            this.categories = appnextAd.categories;
            this.specificCategories = appnextAd.specificCategories;
            this.idx = appnextAd.idx;
            this.pixelImp = appnextAd.pixelImp;
            this.country = appnextAd.country;
            this.campaignType = appnextAd.campaignType;
            this.supportedVersion = appnextAd.supportedVersion;
            this.storeRating = appnextAd.storeRating;
            this.storeDownloads = appnextAd.storeDownloads;
            this.appSize = appnextAd.appSize;
            this.urlVideo = appnextAd.urlVideo;
            this.urlVideoHigh = appnextAd.urlVideoHigh;
            this.urlVideo30Sec = appnextAd.urlVideo30Sec;
            this.urlVideo30SecHigh = appnextAd.urlVideo30SecHigh;
            this.campaignGoal = appnextAd.campaignGoal;
            this.buttonText = appnextAd.buttonText;
            this.ecpm = appnextAd.ecpm;
            this.cpt_list = appnextAd.cpt_list;
            this.webview = appnextAd.webview;
            this.gdpr = appnextAd.gdpr;
            this.market_url = appnextAd.market_url;
            setAdID(appnextAd.getAdID());
            setSession(appnextAd.getSession());
            setPlacementID(appnextAd.getPlacementID());
            setAdJSON(appnextAd.getAdJSON());
        }
    }
}
