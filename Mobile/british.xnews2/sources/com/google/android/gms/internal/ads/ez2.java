package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ez2 {

    /* renamed from: a */
    private d03 f31555a = new d03((WebView) null);

    /* renamed from: b */
    private long f31556b;

    /* renamed from: c */
    private int f31557c;

    public ez2() {
        mo31696b();
    }

    /* renamed from: a */
    public final WebView mo31695a() {
        return (WebView) this.f31555a.get();
    }

    /* renamed from: b */
    public final void mo31696b() {
        this.f31556b = System.nanoTime();
        this.f31557c = 1;
    }

    /* renamed from: c */
    public void mo31697c() {
        this.f31555a.clear();
    }

    /* renamed from: d */
    public final void mo31698d(String str, long j) {
        if (j >= this.f31556b && this.f31557c != 3) {
            this.f31557c = 3;
            wy2.m39303a().mo35694f(mo31695a(), str);
        }
    }

    /* renamed from: e */
    public final void mo31699e(String str, long j) {
        if (j >= this.f31556b) {
            this.f31557c = 2;
            wy2.m39303a().mo35694f(mo31695a(), str);
        }
    }

    /* renamed from: f */
    public void mo31700f(fy2 fy2, dy2 dy2) {
        mo31701g(fy2, dy2, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo31701g(fy2 fy2, dy2 dy2, JSONObject jSONObject) {
        String h = fy2.mo31963h();
        JSONObject jSONObject2 = new JSONObject();
        iz2.m33500g(jSONObject2, "environment", "app");
        iz2.m33500g(jSONObject2, "adSessionType", dy2.mo31430d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        iz2.m33500g(jSONObject3, "deviceType", sb.toString());
        iz2.m33500g(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        iz2.m33500g(jSONObject3, "os", "Android");
        iz2.m33500g(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        iz2.m33500g(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        iz2.m33500g(jSONObject4, "partnerName", dy2.mo31431e().mo33215b());
        iz2.m33500g(jSONObject4, "partnerVersion", dy2.mo31431e().mo33216c());
        iz2.m33500g(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        iz2.m33500g(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        iz2.m33500g(jSONObject5, "appId", uy2.m38542b().mo35336a().getApplicationContext().getPackageName());
        iz2.m33500g(jSONObject2, "app", jSONObject5);
        if (dy2.mo31432f() != null) {
            iz2.m33500g(jSONObject2, "contentUrl", dy2.mo31432f());
        }
        iz2.m33500g(jSONObject2, "customReferenceData", dy2.mo31433g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<ly2> it = dy2.mo31434h().iterator();
        if (!it.hasNext()) {
            wy2.m39303a().mo35695g(mo31695a(), h, jSONObject2, jSONObject6, jSONObject);
        } else {
            ly2 next = it.next();
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo31702h(float f) {
        wy2.m39303a().mo35693e(mo31695a(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo31703i(WebView webView) {
        this.f31555a = new d03(webView);
    }

    /* renamed from: j */
    public void mo31704j() {
    }

    /* renamed from: k */
    public final boolean mo31705k() {
        return this.f31555a.get() != null;
    }
}
