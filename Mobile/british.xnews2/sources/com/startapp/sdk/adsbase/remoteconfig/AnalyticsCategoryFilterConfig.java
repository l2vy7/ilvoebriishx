package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AnalyticsCategoryFilterConfig implements Serializable {
    private static final long serialVersionUID = -706642555040875333L;
    @C5010hb(type = ArrayList.class)
    private List<String> excludeAppActivity;
    @C5010hb(type = ArrayList.class)
    private List<String> excludeValues;
    @C5010hb(type = ArrayList.class)
    private List<String> fields;
    @C5010hb(type = ArrayList.class)
    private List<String> includeAppActivity;
    @C5010hb(type = ArrayList.class)
    private List<String> includeValues;
    private String interval;

    /* renamed from: a */
    public List<String> mo46299a() {
        return this.excludeAppActivity;
    }

    /* renamed from: b */
    public List<String> mo46300b() {
        return this.excludeValues;
    }

    /* renamed from: c */
    public List<String> mo46301c() {
        return this.fields;
    }

    /* renamed from: d */
    public List<String> mo46302d() {
        return this.includeAppActivity;
    }

    /* renamed from: e */
    public List<String> mo46303e() {
        return this.includeValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig = (AnalyticsCategoryFilterConfig) obj;
        if (!C5015nb.m22922a(this.includeValues, analyticsCategoryFilterConfig.includeValues) || !C5015nb.m22922a(this.excludeValues, analyticsCategoryFilterConfig.excludeValues) || !C5015nb.m22922a(this.includeAppActivity, analyticsCategoryFilterConfig.includeAppActivity) || !C5015nb.m22922a(this.excludeAppActivity, analyticsCategoryFilterConfig.excludeAppActivity) || !C5015nb.m22922a(this.fields, analyticsCategoryFilterConfig.fields) || !C5015nb.m22922a(this.interval, analyticsCategoryFilterConfig.interval)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo46305f() {
        return this.interval;
    }

    public int hashCode() {
        Object[] objArr = {this.includeValues, this.excludeValues, this.includeAppActivity, this.excludeAppActivity, this.fields, this.interval};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
