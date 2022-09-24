package com.google.ads.interactivemedia.p039v3.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.an */
/* compiled from: IMASDK */
public final class C3844an {

    /* renamed from: a */
    private final C3853au f15393a;

    /* renamed from: b */
    private final WebView f15394b;

    /* renamed from: c */
    private final List<C4130ko> f15395c = new ArrayList();

    /* renamed from: d */
    private final Map<String, C4130ko> f15396d = new HashMap();

    /* renamed from: e */
    private final String f15397e;

    /* renamed from: f */
    private final String f15398f;

    /* renamed from: g */
    private final C3845ao f15399g;

    private C3844an(C3853au auVar, WebView webView, String str, String str2, C3845ao aoVar) {
        this.f15393a = auVar;
        this.f15394b = webView;
        this.f15399g = aoVar;
        this.f15398f = str;
        this.f15397e = str2;
    }

    /* renamed from: a */
    public static C3844an m14332a(C3853au auVar, WebView webView, String str, String str2) {
        if (str2 == null || str2.length() <= 256) {
            return new C3844an(auVar, webView, str, str2, C3845ao.JAVASCRIPT);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    /* renamed from: b */
    public final C3853au mo14059b() {
        return this.f15393a;
    }

    /* renamed from: c */
    public final List<C4130ko> mo14060c() {
        return Collections.unmodifiableList(this.f15395c);
    }

    /* renamed from: d */
    public final Map<String, C4130ko> mo14061d() {
        return Collections.unmodifiableMap(this.f15396d);
    }

    /* renamed from: e */
    public final WebView mo14062e() {
        return this.f15394b;
    }

    /* renamed from: f */
    public final String mo14063f() {
        return this.f15398f;
    }

    /* renamed from: g */
    public final String mo14064g() {
        return this.f15397e;
    }

    /* renamed from: h */
    public final C3845ao mo14065h() {
        return this.f15399g;
    }
}
