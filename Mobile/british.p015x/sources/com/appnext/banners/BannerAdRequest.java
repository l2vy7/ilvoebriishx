package com.appnext.banners;

import com.appnext.core.C3176c;
import java.io.Serializable;

public class BannerAdRequest extends C3176c implements Serializable {
    public static final String TYPE_ALL = "all";
    public static final String TYPE_STATIC = "static";
    public static final String TYPE_VIDEO = "video";
    public static final String VIDEO_LENGTH_LONG = "30";
    public static final String VIDEO_LENGTH_SHORT = "15";
    private boolean autoPlay = false;

    /* renamed from: bv */
    private int f12134bv = 0;

    /* renamed from: bw */
    private int f12135bw = 0;
    private String categories = "";
    private boolean clickEnabled = true;
    private String creativeType = "all";
    private String mSpecificCategories = "";
    private boolean mute = true;
    private String postback = "";
    private String videoLength = "15";

    public BannerAdRequest() {
    }

    public String getCategories() {
        return this.categories;
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public int getVidMax() {
        return this.f12135bw;
    }

    public int getVidMin() {
        return this.f12134bv;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public boolean isMute() {
        return this.mute;
    }

    public BannerAdRequest setAutoPlay(boolean z) {
        this.autoPlay = z;
        return this;
    }

    public BannerAdRequest setCategories(String str) {
        this.categories = str;
        return this;
    }

    public BannerAdRequest setClickEnabled(boolean z) {
        this.clickEnabled = z;
        return this;
    }

    public BannerAdRequest setCreativeType(String str) {
        this.creativeType = str;
        return this;
    }

    public BannerAdRequest setMute(boolean z) {
        this.mute = z;
        return this;
    }

    public BannerAdRequest setPostback(String str) {
        this.postback = str;
        return this;
    }

    public BannerAdRequest setSpecificCategories(String str) {
        this.mSpecificCategories = str;
        return this;
    }

    public BannerAdRequest setVidMax(int i) {
        this.f12135bw = i;
        return this;
    }

    public BannerAdRequest setVidMin(int i) {
        this.f12134bv = i;
        return this;
    }

    public BannerAdRequest setVideoLength(String str) {
        this.videoLength = str;
        return this;
    }

    BannerAdRequest(BannerAdRequest bannerAdRequest) {
        this.categories = bannerAdRequest.categories;
        this.mSpecificCategories = bannerAdRequest.mSpecificCategories;
        this.postback = bannerAdRequest.postback;
        this.creativeType = bannerAdRequest.creativeType;
        this.autoPlay = bannerAdRequest.autoPlay;
        this.mute = bannerAdRequest.mute;
        this.videoLength = bannerAdRequest.videoLength;
        this.f12134bv = bannerAdRequest.f12134bv;
        this.f12135bw = bannerAdRequest.f12135bw;
        this.clickEnabled = bannerAdRequest.clickEnabled;
    }
}
