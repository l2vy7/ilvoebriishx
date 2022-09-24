package com.startapp.sdk.adsbase.adrules;

import android.app.Activity;
import com.startapp.C5003d;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class AdRules implements Serializable {
    private static final long serialVersionUID = 9050956736420299872L;

    /* renamed from: a */
    public transient Set<Class<? extends AdRule>> f22338a = new HashSet();
    private boolean applyOnBannerRefresh = true;
    @C5010hb(innerValue = AdRule.class, key = AdPreferences.Placement.class, type = HashMap.class, value = ArrayList.class)
    private Map<AdPreferences.Placement, List<AdRule>> placements = new HashMap();
    @C5010hb(type = ArrayList.class, value = AdRule.class)
    private List<AdRule> session = new ArrayList();
    @C5010hb(innerValue = AdRule.class, type = HashMap.class, value = ArrayList.class)
    private Map<String, List<AdRule>> tags = new HashMap();

    /* renamed from: a */
    public boolean mo21021a() {
        return this.applyOnBannerRefresh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdRules adRules = (AdRules) obj;
        if (this.applyOnBannerRefresh != adRules.applyOnBannerRefresh || !C5015nb.m22922a(this.session, adRules.session) || !C5015nb.m22922a(this.placements, adRules.placements) || !C5015nb.m22922a(this.tags, adRules.tags)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.session, this.placements, this.tags, Boolean.valueOf(this.applyOnBannerRefresh)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public synchronized AdRulesResult mo21019a(AdPreferences.Placement placement, String str) {
        AdRulesResult a;
        this.f22338a.clear();
        a = mo21020a(this.tags.get(str), C5003d.f22119d.f22122c.get(str), AdRuleLevel.TAG);
        if (a.mo21025b()) {
            AdRuleLevel adRuleLevel = AdRuleLevel.PLACEMENT;
            placement.toString();
            a = mo21020a(this.placements.get(placement), C5003d.f22119d.f22121b.get(placement), adRuleLevel);
            if (a.mo21025b()) {
                a = mo21020a(this.session, C5003d.f22119d.f22120a, AdRuleLevel.SESSION);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final AdRulesResult mo21020a(List list, List list2, AdRuleLevel adRuleLevel) {
        if (list == null) {
            return new AdRulesResult(true, "");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdRule adRule = (AdRule) it.next();
            if (adRule.f54526a || !this.f22338a.contains(adRule.getClass())) {
                if (!adRule.mo46144a(list2)) {
                    return new AdRulesResult(false, adRule.getClass().getSimpleName() + "_" + adRuleLevel + "");
                }
                this.f22338a.add(adRule.getClass());
            }
        }
        return new AdRulesResult(true, "");
    }
}
