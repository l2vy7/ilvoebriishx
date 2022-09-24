package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.p043b.C4832d;
import com.iab.omid.library.adcolony.p043b.C4833e;
import com.iab.omid.library.adcolony.p045d.C4842a;
import com.iab.omid.library.adcolony.p045d.C4843b;
import com.iab.omid.library.adcolony.p045d.C4846d;
import com.iab.omid.library.adcolony.p046e.C4850b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4850b f21721a = new C4850b((WebView) null);

    /* renamed from: b */
    private AdEvents f21722b;

    /* renamed from: c */
    private MediaEvents f21723c;

    /* renamed from: d */
    private C4851a f21724d;

    /* renamed from: e */
    private long f21725e;

    /* renamed from: com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher$a */
    enum C4851a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo20177i();
    }

    /* renamed from: a */
    public void mo20154a() {
    }

    /* renamed from: a */
    public void mo20155a(float f) {
        C4833e.m22277a().mo20128a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20156a(WebView webView) {
        this.f21721a = new C4850b(webView);
    }

    /* renamed from: a */
    public void mo20157a(AdEvents adEvents) {
        this.f21722b = adEvents;
    }

    /* renamed from: a */
    public void mo20158a(AdSessionConfiguration adSessionConfiguration) {
        C4833e.m22277a().mo20135a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo20159a(ErrorType errorType, String str) {
        C4833e.m22277a().mo20129a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo20160a(C4826a aVar, AdSessionContext adSessionContext) {
        mo20161a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20161a(C4826a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4843b.m22329a(jSONObject2, "environment", "app");
        C4843b.m22329a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4843b.m22329a(jSONObject2, "deviceInfo", C4842a.m22322d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4843b.m22329a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4843b.m22329a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4843b.m22329a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4843b.m22329a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4843b.m22329a(jSONObject4, "libraryVersion", "1.3.11-Adcolony");
        C4843b.m22329a(jSONObject4, "appId", C4832d.m22274a().mo20126b().getApplicationContext().getPackageName());
        C4843b.m22329a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4843b.m22329a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4843b.m22329a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4843b.m22329a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4833e.m22277a().mo20132a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo20162a(MediaEvents mediaEvents) {
        this.f21723c = mediaEvents;
    }

    /* renamed from: a */
    public void mo20163a(String str) {
        C4833e.m22277a().mo20131a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo20164a(String str, long j) {
        if (j >= this.f21725e) {
            this.f21724d = C4851a.AD_STATE_VISIBLE;
            C4833e.m22277a().mo20139b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo20165a(String str, JSONObject jSONObject) {
        C4833e.m22277a().mo20131a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo20166a(JSONObject jSONObject) {
        C4833e.m22277a().mo20140b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo20167a(boolean z) {
        if (mo20172e()) {
            C4833e.m22277a().mo20142c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo20168b() {
        this.f21721a.clear();
    }

    /* renamed from: b */
    public void mo20169b(String str, long j) {
        C4851a aVar;
        if (j >= this.f21725e && this.f21724d != (aVar = C4851a.AD_STATE_NOTVISIBLE)) {
            this.f21724d = aVar;
            C4833e.m22277a().mo20139b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo20170c() {
        return this.f21722b;
    }

    /* renamed from: d */
    public MediaEvents mo20171d() {
        return this.f21723c;
    }

    /* renamed from: e */
    public boolean mo20172e() {
        return this.f21721a.get() != null;
    }

    /* renamed from: f */
    public void mo20173f() {
        C4833e.m22277a().mo20127a(getWebView());
    }

    /* renamed from: g */
    public void mo20174g() {
        C4833e.m22277a().mo20138b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f21721a.get();
    }

    /* renamed from: h */
    public void mo20176h() {
        C4833e.m22277a().mo20141c(getWebView());
    }

    /* renamed from: i */
    public void mo20177i() {
        this.f21725e = C4846d.m22341a();
        this.f21724d = C4851a.AD_STATE_IDLE;
    }
}
