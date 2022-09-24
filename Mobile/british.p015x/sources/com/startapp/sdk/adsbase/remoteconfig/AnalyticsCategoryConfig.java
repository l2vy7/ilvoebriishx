package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import androidx.annotation.Keep;
import com.startapp.C11995jb;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AnalyticsCategoryConfig implements Serializable {
    private static final long serialVersionUID = 5410570404581113345L;
    private Double enabled;
    @C5010hb(parser = FiltersParser.class, type = ArrayList.class, value = AnalyticsCategoryFilterConfig.class)
    private List<AnalyticsCategoryFilterConfig> filters;
    private String firstDelay;
    private Integer flags;
    private Integer priority;
    private Boolean sendViaDb;
    private String ttl;

    @Keep
    /* compiled from: Sta */
    public static class FiltersParser extends C11995jb<AnalyticsCategoryFilterConfig> {
        public FiltersParser() {
            super(AnalyticsCategoryFilterConfig.class);
        }
    }

    /* renamed from: a */
    public Double mo46290a() {
        return this.enabled;
    }

    /* renamed from: b */
    public List<AnalyticsCategoryFilterConfig> mo46291b() {
        return this.filters;
    }

    /* renamed from: c */
    public String mo46292c() {
        return this.firstDelay;
    }

    /* renamed from: d */
    public Integer mo46293d() {
        return this.flags;
    }

    /* renamed from: e */
    public Integer mo46294e() {
        return this.priority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryConfig analyticsCategoryConfig = (AnalyticsCategoryConfig) obj;
        if (!C5015nb.m22922a(this.enabled, analyticsCategoryConfig.enabled) || !C5015nb.m22922a(this.flags, analyticsCategoryConfig.flags) || !C5015nb.m22922a(this.priority, analyticsCategoryConfig.priority) || !C5015nb.m22922a(this.sendViaDb, analyticsCategoryConfig.sendViaDb) || !C5015nb.m22922a(this.ttl, analyticsCategoryConfig.ttl) || !C5015nb.m22922a(this.firstDelay, analyticsCategoryConfig.firstDelay) || !C5015nb.m22922a(this.filters, analyticsCategoryConfig.filters)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Boolean mo46296f() {
        return this.sendViaDb;
    }

    /* renamed from: g */
    public String mo46297g() {
        return this.ttl;
    }

    public int hashCode() {
        Object[] objArr = {this.enabled, this.flags, this.priority, this.sendViaDb, this.ttl, this.firstDelay, this.filters};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
