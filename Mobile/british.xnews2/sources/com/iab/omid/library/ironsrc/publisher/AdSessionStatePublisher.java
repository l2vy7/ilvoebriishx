package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.p048b.C4882d;
import com.iab.omid.library.ironsrc.p048b.C4883e;
import com.iab.omid.library.ironsrc.p050d.C4892a;
import com.iab.omid.library.ironsrc.p050d.C4893b;
import com.iab.omid.library.ironsrc.p050d.C4896d;
import com.iab.omid.library.ironsrc.p051e.C4900b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4900b f21835a = new C4900b((WebView) null);

    /* renamed from: b */
    private AdEvents f21836b;

    /* renamed from: c */
    private MediaEvents f21837c;

    /* renamed from: d */
    private C4901a f21838d;

    /* renamed from: e */
    private long f21839e;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    enum C4901a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo20363i();
    }

    /* renamed from: a */
    public void mo20340a() {
    }

    /* renamed from: a */
    public void mo20341a(float f) {
        C4883e.m22498a().mo20314a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20342a(WebView webView) {
        this.f21835a = new C4900b(webView);
    }

    /* renamed from: a */
    public void mo20343a(AdEvents adEvents) {
        this.f21836b = adEvents;
    }

    /* renamed from: a */
    public void mo20344a(AdSessionConfiguration adSessionConfiguration) {
        C4883e.m22498a().mo20321a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo20345a(ErrorType errorType, String str) {
        C4883e.m22498a().mo20315a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo20346a(C4876a aVar, AdSessionContext adSessionContext) {
        mo20347a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20347a(C4876a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4893b.m22550a(jSONObject2, "environment", "app");
        C4893b.m22550a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4893b.m22550a(jSONObject2, "deviceInfo", C4892a.m22543d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4893b.m22550a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4893b.m22550a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4893b.m22550a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4893b.m22550a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4893b.m22550a(jSONObject4, "libraryVersion", "1.3.12-Ironsrc");
        C4893b.m22550a(jSONObject4, "appId", C4882d.m22495a().mo20312b().getApplicationContext().getPackageName());
        C4893b.m22550a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4893b.m22550a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4893b.m22550a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4893b.m22550a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4883e.m22498a().mo20318a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo20348a(MediaEvents mediaEvents) {
        this.f21837c = mediaEvents;
    }

    /* renamed from: a */
    public void mo20349a(String str) {
        C4883e.m22498a().mo20317a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo20350a(String str, long j) {
        if (j >= this.f21839e) {
            this.f21838d = C4901a.AD_STATE_VISIBLE;
            C4883e.m22498a().mo20325b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo20351a(String str, JSONObject jSONObject) {
        C4883e.m22498a().mo20317a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo20352a(JSONObject jSONObject) {
        C4883e.m22498a().mo20326b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo20353a(boolean z) {
        if (mo20358e()) {
            C4883e.m22498a().mo20328c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo20354b() {
        this.f21835a.clear();
    }

    /* renamed from: b */
    public void mo20355b(String str, long j) {
        C4901a aVar;
        if (j >= this.f21839e && this.f21838d != (aVar = C4901a.AD_STATE_NOTVISIBLE)) {
            this.f21838d = aVar;
            C4883e.m22498a().mo20325b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo20356c() {
        return this.f21836b;
    }

    /* renamed from: d */
    public MediaEvents mo20357d() {
        return this.f21837c;
    }

    /* renamed from: e */
    public boolean mo20358e() {
        return this.f21835a.get() != null;
    }

    /* renamed from: f */
    public void mo20359f() {
        C4883e.m22498a().mo20313a(getWebView());
    }

    /* renamed from: g */
    public void mo20360g() {
        C4883e.m22498a().mo20324b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f21835a.get();
    }

    /* renamed from: h */
    public void mo20362h() {
        C4883e.m22498a().mo20327c(getWebView());
    }

    /* renamed from: i */
    public void mo20363i() {
        this.f21839e = C4896d.m22562a();
        this.f21838d = C4901a.AD_STATE_IDLE;
    }
}
