package com.startapp.sdk.adsbase.model;

import android.app.Activity;
import android.content.Context;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class AdPreferences implements Serializable {
    public static final String TYPE_APP_WALL = "APP_WALL";
    public static final String TYPE_BANNER = "BANNER";
    public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
    public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
    public static final String TYPE_TEXT = "TEXT";
    private static final long serialVersionUID = 6348347121407735103L;
    private String adTag = null;
    public String advertiserId = null;
    private String age = null;

    /* renamed from: ai */
    private Boolean f22389ai = null;

    /* renamed from: as */
    private Boolean f22390as = null;
    private Integer autoLoadAmount;
    private Set<String> categories = null;
    private Set<String> categoriesExclude = null;
    public String country = null;
    public boolean forceFullpage = false;
    public boolean forceOfferWall2D = false;
    public boolean forceOfferWall3D = false;
    public boolean forceOverlay = false;
    private SDKAdPreferences.Gender gender = null;
    private boolean hardwareAccelerated = StartAppSDKInternal.m23097a().mo20987d();
    private String keywords = null;
    private Double latitude = null;
    private Double longitude = null;
    public Double minCpm = null;
    public Set<String> packageInclude = null;
    private String productId;
    public String template = null;
    private boolean testMode = false;
    public C5041Ad.AdType type = null;
    private boolean videoMuted = false;

    /* compiled from: Sta */
    public enum Placement {
        INAPP_FULL_SCREEN(1),
        INAPP_BANNER(2),
        INAPP_OFFER_WALL(3),
        INAPP_SPLASH(4),
        INAPP_OVERLAY(5),
        INAPP_NATIVE(6),
        INAPP_RETURN(8),
        INAPP_BROWSER(9);
        
        private int index;

        /* access modifiers changed from: public */
        Placement(int i) {
            this.index = i;
        }

        /* renamed from: a */
        public int mo21158a() {
            return this.index;
        }

        /* renamed from: a */
        public static Placement m23239a(int i) {
            Placement placement = INAPP_FULL_SCREEN;
            for (Placement placement2 : values()) {
                if (placement2.index == i) {
                    return placement2;
                }
            }
            return placement;
        }
    }

    public AdPreferences() {
    }

    /* renamed from: a */
    public Integer mo21112a() {
        return this.autoLoadAmount;
    }

    public AdPreferences addCategory(String str) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add(str);
        return this;
    }

    public AdPreferences addCategoryExclude(String str) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add(str);
        return this;
    }

    /* renamed from: b */
    public boolean mo21115b() {
        return this.hardwareAccelerated;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdPreferences adPreferences = (AdPreferences) obj;
        if (this.forceOfferWall3D != adPreferences.forceOfferWall3D || this.forceOfferWall2D != adPreferences.forceOfferWall2D || this.forceFullpage != adPreferences.forceFullpage || this.forceOverlay != adPreferences.forceOverlay || this.testMode != adPreferences.testMode || this.videoMuted != adPreferences.videoMuted || this.hardwareAccelerated != adPreferences.hardwareAccelerated || !C5015nb.m22922a(this.autoLoadAmount, adPreferences.autoLoadAmount) || !C5015nb.m22922a(this.country, adPreferences.country) || !C5015nb.m22922a(this.advertiserId, adPreferences.advertiserId) || !C5015nb.m22922a(this.template, adPreferences.template) || this.type != adPreferences.type || !C5015nb.m22922a(this.packageInclude, adPreferences.packageInclude) || !C5015nb.m22922a(this.minCpm, adPreferences.minCpm) || !C5015nb.m22922a(this.longitude, adPreferences.longitude) || !C5015nb.m22922a(this.latitude, adPreferences.latitude) || !C5015nb.m22922a(this.keywords, adPreferences.keywords) || this.gender != adPreferences.gender || !C5015nb.m22922a(this.age, adPreferences.age) || !C5015nb.m22922a(this.f22389ai, adPreferences.f22389ai) || !C5015nb.m22922a(this.f22390as, adPreferences.f22390as) || !C5015nb.m22922a(this.adTag, adPreferences.adTag) || !C5015nb.m22922a(this.productId, adPreferences.productId) || !C5015nb.m22922a(this.categories, adPreferences.categories) || !C5015nb.m22922a(this.categoriesExclude, adPreferences.categoriesExclude)) {
            return false;
        }
        return true;
    }

    public String getAdTag() {
        return this.adTag;
    }

    public String getAdvertiserId() {
        return this.advertiserId;
    }

    public String getAge(Context context) {
        String str = this.age;
        if (str != null) {
            return str;
        }
        Object obj = StartAppSDKInternal.f22265C;
        return StartAppSDKInternal.C5051d.f22295a.mo20985c(context).getAge();
    }

    public Boolean getAi() {
        return this.f22389ai;
    }

    public Boolean getAs() {
        return this.f22390as;
    }

    public Set<String> getCategories() {
        return this.categories;
    }

    public Set<String> getCategoriesExclude() {
        return this.categoriesExclude;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCustomProductId() {
        return this.productId;
    }

    public SDKAdPreferences.Gender getGender(Context context) {
        SDKAdPreferences.Gender gender2 = this.gender;
        if (gender2 != null) {
            return gender2;
        }
        Object obj = StartAppSDKInternal.f22265C;
        return StartAppSDKInternal.C5051d.f22295a.mo20985c(context).getGender();
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getMinCpm() {
        return this.minCpm;
    }

    public String getTemplate() {
        return this.template;
    }

    public C5041Ad.AdType getType() {
        return this.type;
    }

    public int hashCode() {
        Object[] objArr = {this.country, this.advertiserId, this.template, this.type, this.packageInclude, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), this.minCpm, Boolean.valueOf(this.testMode), this.longitude, this.latitude, this.keywords, this.gender, this.age, this.f22389ai, this.f22390as, Boolean.valueOf(this.videoMuted), this.adTag, this.productId, Boolean.valueOf(this.hardwareAccelerated), this.autoLoadAmount, this.categories, this.categoriesExclude};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean isForceFullpage() {
        return this.forceFullpage;
    }

    public boolean isForceOfferWall2D() {
        return this.forceOfferWall2D;
    }

    public boolean isForceOfferWall3D() {
        return this.forceOfferWall3D;
    }

    public boolean isForceOverlay() {
        return this.forceOverlay;
    }

    public boolean isSimpleToken() {
        return true;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public boolean isVideoMuted() {
        return this.videoMuted;
    }

    public AdPreferences muteVideo() {
        this.videoMuted = true;
        return this;
    }

    public AdPreferences setAdTag(String str) {
        this.adTag = str;
        return this;
    }

    public AdPreferences setAge(Integer num) {
        this.age = Integer.toString(num.intValue());
        return this;
    }

    public AdPreferences setAi(Boolean bool) {
        this.f22389ai = bool;
        return this;
    }

    public AdPreferences setAs(Boolean bool) {
        this.f22390as = bool;
        return this;
    }

    public void setAutoLoadAmount(int i) {
        if (i > 0) {
            this.autoLoadAmount = Integer.valueOf(i);
        }
    }

    public AdPreferences setCustomProductId(String str) {
        this.productId = str;
        return this;
    }

    public AdPreferences setGender(SDKAdPreferences.Gender gender2) {
        this.gender = gender2;
        return this;
    }

    public void setHardwareAccelerated(boolean z) {
        this.hardwareAccelerated = z;
    }

    public AdPreferences setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    public AdPreferences setLatitude(double d) {
        this.latitude = Double.valueOf(d);
        return this;
    }

    public AdPreferences setLongitude(double d) {
        this.longitude = Double.valueOf(d);
        return this;
    }

    public void setMinCpm(Double d) {
        this.minCpm = d;
    }

    public AdPreferences setTestMode(boolean z) {
        this.testMode = z;
        return this;
    }

    public void setType(C5041Ad.AdType adType) {
        this.type = adType;
    }

    public String toString() {
        return super.toString();
    }

    public AdPreferences setAge(String str) {
        this.age = str;
        return this;
    }

    public AdPreferences(AdPreferences adPreferences) {
        this.country = adPreferences.country;
        this.advertiserId = adPreferences.advertiserId;
        this.template = adPreferences.template;
        this.type = adPreferences.type;
        if (adPreferences.packageInclude != null) {
            this.packageInclude = new HashSet(adPreferences.packageInclude);
        }
        this.minCpm = adPreferences.minCpm;
        this.forceOfferWall3D = adPreferences.forceOfferWall3D;
        this.forceOfferWall2D = adPreferences.forceOfferWall2D;
        this.forceFullpage = adPreferences.forceFullpage;
        this.forceOverlay = adPreferences.forceOverlay;
        this.testMode = adPreferences.testMode;
        this.longitude = adPreferences.longitude;
        this.latitude = adPreferences.latitude;
        this.keywords = adPreferences.keywords;
        this.gender = adPreferences.gender;
        this.age = adPreferences.age;
        this.f22389ai = adPreferences.f22389ai;
        this.f22390as = adPreferences.f22390as;
        this.videoMuted = adPreferences.videoMuted;
        this.adTag = adPreferences.adTag;
        this.hardwareAccelerated = adPreferences.hardwareAccelerated;
        this.autoLoadAmount = adPreferences.autoLoadAmount;
        this.productId = adPreferences.productId;
        if (adPreferences.categories != null) {
            this.categories = new HashSet(adPreferences.categories);
        }
        if (adPreferences.categoriesExclude != null) {
            this.categoriesExclude = new HashSet(adPreferences.categoriesExclude);
        }
    }
}
