package com.startapp;

import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdSessionContextType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.startapp.o */
/* compiled from: Sta */
public final class C12101o {

    /* renamed from: a */
    public final C12180s7 f53937a;

    /* renamed from: b */
    public final WebView f53938b;

    /* renamed from: c */
    public final List<C12453yb> f53939c;

    /* renamed from: d */
    public final Map<String, C12453yb> f53940d = new HashMap();

    /* renamed from: e */
    public final String f53941e;

    /* renamed from: f */
    public final String f53942f;

    /* renamed from: g */
    public final String f53943g;

    /* renamed from: h */
    public final AdSessionContextType f53944h;

    public C12101o(C12180s7 s7Var, WebView webView, String str, List<C12453yb> list, String str2, String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.f53939c = arrayList;
        this.f53937a = s7Var;
        this.f53938b = webView;
        this.f53941e = str;
        this.f53944h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (C12453yb put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f53940d.put(uuid, put);
            }
        }
        this.f53943g = str2;
        this.f53942f = str3;
    }

    /* renamed from: a */
    public AdSessionContextType mo45631a() {
        return this.f53944h;
    }

    /* renamed from: b */
    public Map<String, C12453yb> mo45632b() {
        return Collections.unmodifiableMap(this.f53940d);
    }

    /* renamed from: c */
    public String mo45633c() {
        return this.f53941e;
    }

    /* renamed from: d */
    public WebView mo45634d() {
        return this.f53938b;
    }
}
