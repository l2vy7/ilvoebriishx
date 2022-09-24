package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C11882e4;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class TelephonyDataConfig implements Serializable {

    /* renamed from: a */
    public static final TelephonyDataConfig f54665a = new TelephonyDataConfig();
    private static final long serialVersionUID = -7175662234963204913L;
    @C5010hb(type = ArrayList.class)
    private List<String> categories = Collections.singletonList(C11882e4.f52892k.mo45317a());
    private boolean enabled = true;
    private String param;

    /* renamed from: a */
    public List<String> mo46423a() {
        return this.categories;
    }

    /* renamed from: b */
    public String mo46424b() {
        return this.param;
    }

    /* renamed from: c */
    public boolean mo46425c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TelephonyDataConfig telephonyDataConfig = (TelephonyDataConfig) obj;
        if (this.enabled != telephonyDataConfig.enabled || !C5015nb.m22922a(this.categories, telephonyDataConfig.categories) || !C5015nb.m22922a(this.param, telephonyDataConfig.param)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.categories, this.param};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
