package com.ironsource.sdk.p287b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.b */
public class C11526b {

    /* renamed from: a */
    public static Handler f51834a;

    /* renamed from: b */
    public C11525a f51835b;

    /* renamed from: c */
    public C11529d f51836c = new C11529d();

    /* renamed from: d */
    public WebView f51837d;

    /* renamed from: e */
    public String f51838e;

    /* renamed from: f */
    public String f51839f = C11526b.class.getSimpleName();

    /* renamed from: g */
    private String[] f51840g = {"handleGetViewVisibility"};

    /* renamed from: h */
    private final String[] f51841h = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};

    /* renamed from: com.ironsource.sdk.b.b$a */
    class C11527a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51842b;

        C11527a(String str) {
            this.f51842b = str;
        }

        public final void run() {
            C11526b.m51370b(C11526b.this, this.f51842b);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m51370b(C11526b bVar, String str) {
        try {
            String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
            if (Build.VERSION.SDK_INT >= 19) {
                bVar.f51837d.evaluateJavascript(str2, (ValueCallback) null);
            } else {
                bVar.f51837d.loadUrl(str2);
            }
        } catch (Throwable th) {
            Log.e(bVar.f51839f, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    private Handler m51371c() {
        try {
            if (f51834a == null) {
                f51834a = new Handler(Looper.getMainLooper());
            }
        } catch (Exception e) {
            Log.e(this.f51839f, "Error while trying execute method getUIThreadHandler");
            e.printStackTrace();
        }
        return f51834a;
    }

    /* renamed from: d */
    private static String m51372d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
    }

    /* renamed from: a */
    public JSONObject mo44605a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f51836c.mo44619a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f51838e);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public JSONObject mo44606a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(TtmlNode.ATTR_ID, jSONObject.getString(TtmlNode.ATTR_ID));
            jSONObject2.put("data", this.f51836c.mo44619a());
        } catch (Exception e) {
            String str = this.f51839f;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo44607a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f51838e);
            mo44611a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo44608a(String str, int i, boolean z) {
        C11529d dVar = this.f51836c;
        boolean z2 = true;
        if (dVar.f51846a.containsKey(str)) {
            dVar.f51846a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.f51846a.put("isShown", Boolean.valueOf(z));
        if ((!dVar.f51846a.get("isWindowVisible").booleanValue() && !dVar.f51846a.get("isVisible").booleanValue()) || !dVar.f51846a.get("isShown").booleanValue()) {
            z2 = false;
        }
        dVar.f51846a.put("isViewVisible", Boolean.valueOf(z2));
        if ((Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) && this.f51835b != null && this.f51836c != null) {
            mo44611a("containerIsVisible", mo44605a());
        }
    }

    /* renamed from: a */
    public final void mo44609a(String str, String str2) {
        C11525a aVar = this.f51835b;
        if (aVar != null) {
            aVar.mo44603a(str, str2, this.f51838e);
        }
    }

    /* renamed from: a */
    public final void mo44610a(String str, String str2, String str3) {
        if (this.f51837d == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f51839f, str4);
            this.f51835b.mo44603a(str3, str4, this.f51838e);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        m51371c().post(new C11527a(m51372d(str)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f51838e);
        mo44611a(str2, jSONObject);
    }

    /* renamed from: a */
    public final void mo44611a(String str, JSONObject jSONObject) {
        C11525a aVar = this.f51835b;
        if (aVar != null) {
            aVar.mo44604a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo44612b(String str) {
        JSONObject a = this.f51836c.mo44619a();
        a.put("adViewId", this.f51838e);
        mo44611a(str, a);
    }

    /* renamed from: c */
    public boolean mo44613c(String str) {
        for (String equalsIgnoreCase : this.f51840g) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
