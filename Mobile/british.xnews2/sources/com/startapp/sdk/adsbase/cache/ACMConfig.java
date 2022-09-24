package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.StartAppAd;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class ACMConfig implements Serializable {
    private static final long serialVersionUID = 4666931462145537293L;
    private long adCacheTTL = 3600;
    @C5010hb(type = EnumSet.class, value = StartAppAd.AdMode.class)
    private Set<StartAppAd.AdMode> autoLoad = EnumSet.of(StartAppAd.AdMode.FULLPAGE);
    @C5010hb(complex = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private boolean localCache = true;
    private int maxCacheSize = 7;
    private long returnAdCacheTTL = 3600;
    private boolean returnAdShouldLoadInBg = true;

    /* renamed from: a */
    public long mo21026a() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    /* renamed from: b */
    public Set<StartAppAd.AdMode> mo21027b() {
        return this.autoLoad;
    }

    /* renamed from: c */
    public FailuresHandler mo21028c() {
        return this.failuresHandler;
    }

    /* renamed from: d */
    public int mo21029d() {
        return this.maxCacheSize;
    }

    /* renamed from: e */
    public long mo21030e() {
        return TimeUnit.SECONDS.toMillis(this.returnAdCacheTTL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ACMConfig aCMConfig = (ACMConfig) obj;
        if (this.adCacheTTL == aCMConfig.adCacheTTL && this.returnAdCacheTTL == aCMConfig.returnAdCacheTTL && this.localCache == aCMConfig.localCache && this.returnAdShouldLoadInBg == aCMConfig.returnAdShouldLoadInBg && this.maxCacheSize == aCMConfig.maxCacheSize && C5015nb.m22922a(this.autoLoad, aCMConfig.autoLoad) && C5015nb.m22922a(this.failuresHandler, aCMConfig.failuresHandler)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo21032f() {
        return this.localCache;
    }

    /* renamed from: g */
    public boolean mo21033g() {
        return this.returnAdShouldLoadInBg;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.adCacheTTL), Long.valueOf(this.returnAdCacheTTL), this.autoLoad, Boolean.valueOf(this.localCache), Boolean.valueOf(this.returnAdShouldLoadInBg), this.failuresHandler, Integer.valueOf(this.maxCacheSize)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
