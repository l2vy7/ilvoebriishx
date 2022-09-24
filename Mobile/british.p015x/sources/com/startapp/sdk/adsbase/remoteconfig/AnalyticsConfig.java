package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AnalyticsConfig implements Serializable {

    /* renamed from: a */
    public static final String f54645a = "https://infoevent.startappservice.com/tracking/infoEvent";
    private static final long serialVersionUID = 8823631221342981507L;
    @C5010hb(complex = true)
    private AdCallbacksConfig adCallbacksConfig = new AdCallbacksConfig();
    @C5010hb(type = ArrayList.class)
    private List<String> admHeaders = Collections.singletonList("Server-Timing");
    private double admPrb = 0.0d;
    @C5010hb(type = HashMap.class, value = AnalyticsCategoryConfig.class)
    private Map<String, AnalyticsCategoryConfig> categories;
    public boolean dns = false;
    private int fuIef;
    public String hostPeriodic;
    public String hostSecured;
    private String noNetworkTimeout;
    private int retryNum = 3;
    private int retryTime = 10;
    private boolean sendHopsOnFirstSucceededSmartRedirect = false;
    private boolean sendViewabilityInfo = false;
    private float succeededSmartRedirectInfoProbability = 0.01f;

    public AnalyticsConfig() {
        String str = f54645a;
        this.hostSecured = str;
        this.hostPeriodic = str;
    }

    /* renamed from: a */
    public AdCallbacksConfig mo46307a() {
        return this.adCallbacksConfig;
    }

    /* renamed from: b */
    public List<String> mo46308b() {
        return this.admHeaders;
    }

    /* renamed from: c */
    public double mo46309c() {
        return this.admPrb;
    }

    /* renamed from: d */
    public Map<String, AnalyticsCategoryConfig> mo46310d() {
        return this.categories;
    }

    /* renamed from: e */
    public int mo46311e() {
        return this.fuIef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
        if (this.dns == analyticsConfig.dns && this.retryNum == analyticsConfig.retryNum && this.retryTime == analyticsConfig.retryTime && Float.compare(this.succeededSmartRedirectInfoProbability, analyticsConfig.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == analyticsConfig.sendHopsOnFirstSucceededSmartRedirect && this.sendViewabilityInfo == analyticsConfig.sendViewabilityInfo && Double.compare(this.admPrb, analyticsConfig.admPrb) == 0 && this.fuIef == analyticsConfig.fuIef && C5015nb.m22922a(this.hostSecured, analyticsConfig.hostSecured) && C5015nb.m22922a(this.hostPeriodic, analyticsConfig.hostPeriodic) && C5015nb.m22922a(this.noNetworkTimeout, analyticsConfig.noNetworkTimeout) && C5015nb.m22922a(this.categories, analyticsConfig.categories) && C5015nb.m22922a(this.admHeaders, analyticsConfig.admHeaders) && C5015nb.m22922a(this.adCallbacksConfig, analyticsConfig.adCallbacksConfig)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo46313f() {
        return this.noNetworkTimeout;
    }

    /* renamed from: g */
    public int mo46314g() {
        return this.retryNum;
    }

    /* renamed from: h */
    public long mo46315h() {
        return TimeUnit.SECONDS.toMillis((long) this.retryTime);
    }

    public int hashCode() {
        Object[] objArr = {this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect), this.noNetworkTimeout, this.categories, Boolean.valueOf(this.sendViewabilityInfo), Double.valueOf(this.admPrb), this.admHeaders, Integer.valueOf(this.fuIef), this.adCallbacksConfig};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public float mo46317i() {
        return this.succeededSmartRedirectInfoProbability;
    }

    /* renamed from: j */
    public boolean mo46318j() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    /* renamed from: k */
    public boolean mo46319k() {
        return this.sendViewabilityInfo;
    }
}
