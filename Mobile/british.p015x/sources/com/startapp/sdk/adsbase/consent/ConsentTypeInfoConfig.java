package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    /* renamed from: a */
    public Integer mo46206a() {
        return this.falseClick;
    }

    /* renamed from: b */
    public Integer mo46207b() {
        return this.impression;
    }

    /* renamed from: c */
    public Integer mo46208c() {
        return this.trueClick;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentTypeInfoConfig.class != obj.getClass()) {
            return false;
        }
        ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
        if (!C5015nb.m22922a(this.impression, consentTypeInfoConfig.impression) || !C5015nb.m22922a(this.trueClick, consentTypeInfoConfig.trueClick) || !C5015nb.m22922a(this.falseClick, consentTypeInfoConfig.falseClick)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
