package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class RscMetadataItem implements Serializable {
    private static final long serialVersionUID = 1691586261519008915L;
    private String config;
    private Integer ief;
    private Integer limit;
    private int noCache;
    private Integer output;
    private Integer ppid;
    private int[] sortBy;
    private int triggers;
    private Integer ttl;

    /* renamed from: a */
    public String mo46393a() {
        return this.config;
    }

    /* renamed from: b */
    public Integer mo46394b() {
        return this.ief;
    }

    /* renamed from: c */
    public Integer mo46395c() {
        return this.limit;
    }

    /* renamed from: d */
    public int mo46396d() {
        return this.noCache;
    }

    /* renamed from: e */
    public Integer mo46397e() {
        return this.output;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadataItem rscMetadataItem = (RscMetadataItem) obj;
        if (this.triggers != rscMetadataItem.triggers || this.noCache != rscMetadataItem.noCache || !C5015nb.m22922a(this.config, rscMetadataItem.config) || !C5015nb.m22922a(this.ttl, rscMetadataItem.ttl) || !Arrays.equals(this.sortBy, rscMetadataItem.sortBy) || !C5015nb.m22922a(this.limit, rscMetadataItem.limit) || !C5015nb.m22922a(this.ppid, rscMetadataItem.ppid) || !C5015nb.m22922a(this.output, rscMetadataItem.output) || !C5015nb.m22922a(this.ief, rscMetadataItem.ief)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Integer mo46399f() {
        return this.ppid;
    }

    /* renamed from: g */
    public int[] mo46400g() {
        return this.sortBy;
    }

    /* renamed from: h */
    public int mo46401h() {
        return this.triggers;
    }

    public int hashCode() {
        Object[] objArr = {this.config, Integer.valueOf(this.triggers), Integer.valueOf(this.noCache), this.ttl, this.sortBy, this.limit, this.ppid, this.output, this.ief};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public Integer mo46403i() {
        return this.ttl;
    }
}
