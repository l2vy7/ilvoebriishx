package com.iab.omid.library.startio.publisher;

import android.os.Build;
import android.webkit.WebView;
import com.startapp.C11780a6;
import com.startapp.C11875de;
import com.startapp.C11972id;
import com.startapp.C11973ie;
import com.startapp.C11974j;
import com.startapp.C12063n;
import com.startapp.C12101o;
import com.startapp.C12377ud;
import com.startapp.C12418wd;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    public C12418wd f21910a = new C12418wd((WebView) null);

    /* renamed from: b */
    public C11974j f21911b;

    /* renamed from: c */
    public C11780a6 f21912c;

    /* renamed from: d */
    public C4920a f21913d;

    /* renamed from: e */
    public long f21914e;

    /* renamed from: com.iab.omid.library.startio.publisher.AdSessionStatePublisher$a */
    /* compiled from: Sta */
    public enum C4920a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo20413a();
    }

    /* renamed from: a */
    public void mo20413a() {
        this.f21914e = System.nanoTime();
        this.f21913d = C4920a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void mo20414a(WebView webView) {
        this.f21910a = new C12418wd(webView);
    }

    /* renamed from: a */
    public void mo20415a(C11972id idVar, C12101o oVar) {
        mo20416a(idVar, oVar, (JSONObject) null);
    }

    /* renamed from: b */
    public void mo20419b() {
        this.f21910a.clear();
    }

    /* renamed from: b */
    public void mo20420b(String str, long j) {
        if (j >= this.f21914e) {
            this.f21913d = C4920a.AD_STATE_VISIBLE;
            C11973ie.f53134a.mo45464a(mo20421c(), "setNativeViewHierarchy", str);
        }
    }

    /* renamed from: c */
    public WebView mo20421c() {
        return (WebView) this.f21910a.get();
    }

    /* renamed from: d */
    public void mo20422d() {
    }

    /* renamed from: a */
    public void mo20417a(C12063n nVar) {
        C11973ie ieVar = C11973ie.f53134a;
        WebView c = mo20421c();
        nVar.getClass();
        JSONObject jSONObject = new JSONObject();
        C12377ud.m53546a(jSONObject, "impressionOwner", nVar.f53308a);
        C12377ud.m53546a(jSONObject, "mediaEventsOwner", nVar.f53309b);
        C12377ud.m53546a(jSONObject, "creativeType", nVar.f53311d);
        C12377ud.m53546a(jSONObject, "impressionType", nVar.f53312e);
        C12377ud.m53546a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(nVar.f53310c));
        ieVar.mo45464a(c, "init", jSONObject);
    }

    /* renamed from: a */
    public void mo20416a(C11972id idVar, C12101o oVar, JSONObject jSONObject) {
        String str = idVar.f53131h;
        JSONObject jSONObject2 = new JSONObject();
        C12377ud.m53546a(jSONObject2, "environment", "app");
        C12377ud.m53546a(jSONObject2, "adSessionType", oVar.f53944h);
        JSONObject jSONObject3 = new JSONObject();
        C12377ud.m53546a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C12377ud.m53546a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C12377ud.m53546a(jSONObject3, "os", "Android");
        C12377ud.m53546a(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C12377ud.m53546a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C12377ud.m53546a(jSONObject4, "partnerName", oVar.f53937a.f54143a);
        C12377ud.m53546a(jSONObject4, "partnerVersion", oVar.f53937a.f54144b);
        C12377ud.m53546a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C12377ud.m53546a(jSONObject5, "libraryVersion", "1.3.31-Startio");
        C12377ud.m53546a(jSONObject5, "appId", C11875de.f52875b.f52876a.getApplicationContext().getPackageName());
        C12377ud.m53546a(jSONObject2, "app", jSONObject5);
        String str2 = oVar.f53943g;
        if (str2 != null) {
            C12377ud.m53546a(jSONObject2, "contentUrl", str2);
        }
        String str3 = oVar.f53942f;
        if (str3 != null) {
            C12377ud.m53546a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (T t : Collections.unmodifiableList(oVar.f53939c)) {
            C12377ud.m53546a(jSONObject6, t.f55171a, t.f55173c);
        }
        C11973ie.f53134a.mo45464a(mo20421c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: a */
    public void mo20418a(String str, long j) {
        C4920a aVar;
        if (j >= this.f21914e && this.f21913d != (aVar = C4920a.AD_STATE_NOTVISIBLE)) {
            this.f21913d = aVar;
            C11973ie.f53134a.mo45464a(mo20421c(), "setNativeViewHierarchy", str);
        }
    }
}
