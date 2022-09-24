package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.p294g.C11702c;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.p297j.C11720a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.controller.j */
public final class C11588j {

    /* renamed from: a */
    private final Map<String, C11702c> f52038a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C11702c> f52039b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, C11702c> f52040c = new LinkedHashMap();

    /* renamed from: a */
    public final C11702c mo44754a(C11703d.C11708e eVar, String str) {
        Map<String, C11702c> c;
        if (TextUtils.isEmpty(str) || (c = mo44758c(eVar)) == null) {
            return null;
        }
        return c.get(str);
    }

    /* renamed from: a */
    public final C11702c mo44755a(C11703d.C11708e eVar, String str, Map<String, String> map, C11720a aVar) {
        C11702c cVar = new C11702c(str, str, map, aVar);
        mo44756a(eVar, str, cVar);
        return cVar;
    }

    /* renamed from: a */
    public void mo44756a(C11703d.C11708e eVar, String str, C11702c cVar) {
        Map<String, C11702c> c;
        if (!TextUtils.isEmpty(str) && (c = mo44758c(eVar)) != null) {
            c.put(str, cVar);
        }
    }

    /* renamed from: b */
    public final Collection<C11702c> mo44757b(C11703d.C11708e eVar) {
        Map<String, C11702c> c = mo44758c(eVar);
        return c != null ? c.values() : new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Map<String, C11702c> mo44758c(C11703d.C11708e eVar) {
        if (eVar.name().equalsIgnoreCase(C11703d.C11708e.RewardedVideo.name())) {
            return this.f52038a;
        }
        if (eVar.name().equalsIgnoreCase(C11703d.C11708e.Interstitial.name())) {
            return this.f52039b;
        }
        if (eVar.name().equalsIgnoreCase(C11703d.C11708e.Banner.name())) {
            return this.f52040c;
        }
        return null;
    }
}
