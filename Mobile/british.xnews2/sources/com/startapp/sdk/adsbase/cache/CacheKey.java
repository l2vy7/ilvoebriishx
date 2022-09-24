package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.C12458z0;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class CacheKey implements Serializable {
    private static final long serialVersionUID = -5317700110100638162L;
    private String adTag;
    private String advertiserId;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country;
    private boolean forceFullpage;
    private boolean forceOfferWall2D;
    private boolean forceOfferWall3D;
    private boolean forceOverlay;
    private Double minCpm;
    private AdPreferences.Placement placement;
    private String productId;
    private String template;
    private boolean testMode;
    private C5041Ad.AdType type;
    private boolean videoMuted;

    public CacheKey(AdPreferences.Placement placement2, AdPreferences adPreferences) {
        this.placement = placement2;
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = adPreferences.isForceOfferWall3D();
        this.forceOfferWall2D = adPreferences.isForceOfferWall2D();
        this.forceFullpage = adPreferences.isForceFullpage();
        this.forceOverlay = adPreferences.isForceOverlay();
        this.testMode = adPreferences.isTestMode();
        this.adTag = adPreferences.getAdTag();
        this.productId = adPreferences.getCustomProductId();
        this.country = adPreferences.getCountry();
        this.advertiserId = adPreferences.getAdvertiserId();
        this.template = adPreferences.getTemplate();
        this.type = adPreferences.getType();
    }

    /* renamed from: a */
    public AdPreferences.Placement mo21035a() {
        return this.placement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) obj;
        if (this.forceOfferWall3D != cacheKey.forceOfferWall3D || this.forceOfferWall2D != cacheKey.forceOfferWall2D || this.forceFullpage != cacheKey.forceFullpage || this.forceOverlay != cacheKey.forceOverlay || this.testMode != cacheKey.testMode || this.videoMuted != cacheKey.videoMuted || this.placement != cacheKey.placement || !C5015nb.m22922a(this.categories, cacheKey.categories) || !C5015nb.m22922a(this.categoriesExclude, cacheKey.categoriesExclude) || !C5015nb.m22922a(this.minCpm, cacheKey.minCpm) || !C5015nb.m22922a(this.adTag, cacheKey.adTag) || !C5015nb.m22922a(this.productId, cacheKey.productId) || !C5015nb.m22922a(this.country, cacheKey.country) || !C5015nb.m22922a(this.advertiserId, cacheKey.advertiserId) || !C5015nb.m22922a(this.template, cacheKey.template) || this.type != cacheKey.type) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.placement, this.categories, this.categoriesExclude, this.minCpm, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), Boolean.valueOf(this.testMode), Boolean.valueOf(this.videoMuted), this.adTag, this.productId, this.country, this.advertiserId, this.template, this.type};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("CacheKey [placement=");
        a.append(this.placement);
        a.append(", categories=");
        a.append(this.categories);
        a.append(", categoriesExclude=");
        a.append(this.categoriesExclude);
        a.append(", forceOfferWall3D=");
        a.append(this.forceOfferWall3D);
        a.append(", forceOfferWall2D=");
        a.append(this.forceOfferWall2D);
        a.append(", forceFullpage=");
        a.append(this.forceFullpage);
        a.append(", forceOverlay=");
        a.append(this.forceOverlay);
        a.append(", testMode=");
        a.append(this.testMode);
        a.append(", minCpm=");
        a.append(this.minCpm);
        a.append(", country=");
        a.append(this.country);
        a.append(", advertiserId=");
        a.append(this.advertiserId);
        a.append(", template=");
        a.append(this.template);
        a.append(", type=");
        a.append(this.type);
        a.append(", adTag=");
        a.append(this.adTag);
        a.append(", productId=");
        a.append(this.productId);
        a.append(", videoMuted=");
        a.append(this.videoMuted);
        a.append("]");
        return a.toString();
    }
}
