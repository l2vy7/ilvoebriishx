package com.iab.omid.library.ironsrc.p049b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.p051d.C4895c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.b.e */
public class C4883e {

    /* renamed from: a */
    private static C4883e f21809a = new C4883e();

    private C4883e() {
    }

    /* renamed from: a */
    public static C4883e m22498a() {
        return f21809a;
    }

    /* renamed from: a */
    public void mo20313a(WebView webView) {
        mo20319a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo20314a(WebView webView, float f) {
        mo20319a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo20315a(WebView webView, ErrorType errorType, String str) {
        mo20319a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo20316a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo20323a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo20317a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo20319a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo20319a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo20318a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo20319a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20319a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo20322a(sb, objArr);
            sb.append(")}");
            mo20320a(webView, sb);
            return;
        }
        C4895c.m22560a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20320a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20321a(WebView webView, JSONObject jSONObject) {
        mo20319a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20322a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo20323a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo20324b(WebView webView) {
        mo20319a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo20325b(WebView webView, String str) {
        mo20319a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo20326b(WebView webView, JSONObject jSONObject) {
        mo20319a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo20327c(WebView webView) {
        mo20319a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo20328c(WebView webView, String str) {
        mo20319a(webView, "setState", str);
    }
}
