package com.iab.omid.library.adcolony.p042b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.p044d.C4845c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.b.e */
public class C4833e {

    /* renamed from: a */
    private static C4833e f21695a = new C4833e();

    /* renamed from: com.iab.omid.library.adcolony.b.e$a */
    class C4834a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f21696a;

        /* renamed from: b */
        final /* synthetic */ String f21697b;

        C4834a(WebView webView, String str) {
            this.f21696a = webView;
            this.f21697b = str;
        }

        public void run() {
            this.f21696a.loadUrl(this.f21697b);
        }
    }

    private C4833e() {
    }

    /* renamed from: a */
    public static C4833e m22277a() {
        return f21695a;
    }

    /* renamed from: a */
    public void mo20127a(WebView webView) {
        mo20133a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo20128a(WebView webView, float f) {
        mo20133a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo20129a(WebView webView, ErrorType errorType, String str) {
        mo20133a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo20130a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo20137a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo20131a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo20133a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo20133a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo20132a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo20133a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20133a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo20136a(sb, objArr);
            sb.append(")}");
            mo20134a(webView, sb);
            return;
        }
        C4845c.m22339a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20134a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new C4834a(webView, sb2));
        }
    }

    /* renamed from: a */
    public void mo20135a(WebView webView, JSONObject jSONObject) {
        mo20133a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20136a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public boolean mo20137a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo20138b(WebView webView) {
        mo20133a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo20139b(WebView webView, String str) {
        mo20133a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo20140b(WebView webView, JSONObject jSONObject) {
        mo20133a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo20141c(WebView webView) {
        mo20133a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo20142c(WebView webView, String str) {
        mo20133a(webView, "setState", str);
    }
}
