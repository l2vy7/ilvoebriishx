package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bj */
/* compiled from: IMASDK */
public class C3882bj {

    /* renamed from: a */
    private C3903cd f16459a = new C3903cd((WebView) null);

    /* renamed from: b */
    private long f16460b;

    /* renamed from: c */
    private int f16461c;

    public C3882bj() {
        mo15158k();
    }

    /* renamed from: a */
    public void mo15148a() {
    }

    /* renamed from: b */
    public void mo15149b() {
        this.f16459a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo15150c(WebView webView) {
        this.f16459a = new C3903cd(webView);
    }

    /* renamed from: d */
    public final WebView mo15151d() {
        return (WebView) this.f16459a.get();
    }

    /* renamed from: e */
    public final boolean mo15152e() {
        return this.f16459a.get() != null;
    }

    /* renamed from: f */
    public final void mo15153f(String str, long j) {
        if (j >= this.f16460b) {
            this.f16461c = 2;
            C3875bc.m15575a().mo14883e(mo15151d(), str);
        }
    }

    /* renamed from: g */
    public final void mo15154g(String str, long j) {
        if (j >= this.f16460b && this.f16461c != 3) {
            this.f16461c = 3;
            C3875bc.m15575a().mo14883e(mo15151d(), str);
        }
    }

    /* renamed from: h */
    public void mo15155h(C3846ap apVar, C3844an anVar) {
        mo15156i(apVar, anVar, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo15156i(C3846ap apVar, C3844an anVar, JSONObject jSONObject) {
        String i = apVar.mo14172i();
        JSONObject jSONObject2 = new JSONObject();
        C3887bo.m16853d(jSONObject2, "environment", "app");
        C3887bo.m16853d(jSONObject2, "adSessionType", anVar.mo14065h());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        C3887bo.m16853d(jSONObject3, "deviceType", sb.toString());
        C3887bo.m16853d(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C3887bo.m16853d(jSONObject3, "os", "Android");
        C3887bo.m16853d(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C3887bo.m16853d(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C3887bo.m16853d(jSONObject4, "partnerName", anVar.mo14059b().mo14533a());
        C3887bo.m16853d(jSONObject4, "partnerVersion", anVar.mo14059b().mo14534b());
        C3887bo.m16853d(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C3887bo.m16853d(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        C3887bo.m16853d(jSONObject5, "appId", C3873ba.m15330a().mo14782b().getApplicationContext().getPackageName());
        C3887bo.m16853d(jSONObject2, "app", jSONObject5);
        if (anVar.mo14063f() != null) {
            C3887bo.m16853d(jSONObject2, "contentUrl", anVar.mo14063f());
        }
        if (anVar.mo14064g() != null) {
            C3887bo.m16853d(jSONObject2, "customReferenceData", anVar.mo14064g());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator<C4130ko> it = anVar.mo14060c().iterator();
        if (!it.hasNext()) {
            C3875bc.m15575a().mo14881c(mo15151d(), i, jSONObject2, jSONObject6, jSONObject);
        } else {
            C4130ko next = it.next();
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo15157j(float f) {
        C3875bc.m15575a().mo14884f(mo15151d(), f);
    }

    /* renamed from: k */
    public final void mo15158k() {
        this.f16460b = System.nanoTime();
        this.f16461c = 1;
    }
}
