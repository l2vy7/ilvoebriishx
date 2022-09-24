package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dy2 {

    /* renamed from: a */
    private final ky2 f31118a;

    /* renamed from: b */
    private final WebView f31119b;

    /* renamed from: c */
    private final List<ly2> f31120c = new ArrayList();

    /* renamed from: d */
    private final Map<String, ly2> f31121d = new HashMap();

    /* renamed from: e */
    private final String f31122e;

    /* renamed from: f */
    private final String f31123f;

    /* renamed from: g */
    private final ey2 f31124g;

    private dy2(ky2 ky2, WebView webView, String str, List<ly2> list, String str2, String str3, ey2 ey2) {
        this.f31118a = ky2;
        this.f31119b = webView;
        this.f31124g = ey2;
        this.f31123f = str2;
        this.f31122e = "";
    }

    /* renamed from: b */
    public static dy2 m31646b(ky2 ky2, WebView webView, String str, String str2) {
        return new dy2(ky2, webView, (String) null, (List<ly2>) null, str, "", ey2.HTML);
    }

    /* renamed from: c */
    public static dy2 m31647c(ky2 ky2, WebView webView, String str, String str2) {
        return new dy2(ky2, webView, (String) null, (List<ly2>) null, str, "", ey2.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView mo31429a() {
        return this.f31119b;
    }

    /* renamed from: d */
    public final ey2 mo31430d() {
        return this.f31124g;
    }

    /* renamed from: e */
    public final ky2 mo31431e() {
        return this.f31118a;
    }

    /* renamed from: f */
    public final String mo31432f() {
        return this.f31123f;
    }

    /* renamed from: g */
    public final String mo31433g() {
        return this.f31122e;
    }

    /* renamed from: h */
    public final List<ly2> mo31434h() {
        return Collections.unmodifiableList(this.f31120c);
    }

    /* renamed from: i */
    public final Map<String, ly2> mo31435i() {
        return Collections.unmodifiableMap(this.f31121d);
    }
}
