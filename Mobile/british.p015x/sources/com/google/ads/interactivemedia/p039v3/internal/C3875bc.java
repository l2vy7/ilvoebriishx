package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bc */
/* compiled from: IMASDK */
public final class C3875bc {

    /* renamed from: a */
    private static final C3875bc f16067a = new C3875bc();

    private C3875bc() {
    }

    /* renamed from: a */
    public static C3875bc m15575a() {
        return f16067a;
    }

    /* renamed from: b */
    public final void mo14880b(WebView webView, JSONObject jSONObject) {
        mo14885g(webView, "init", jSONObject);
    }

    /* renamed from: c */
    public final void mo14881c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo14885g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: d */
    public final void mo14882d(WebView webView) {
        mo14885g(webView, "finishSession", new Object[0]);
    }

    /* renamed from: e */
    public final void mo14883e(WebView webView, String str) {
        mo14885g(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: f */
    public final void mo14884f(WebView webView, float f) {
        mo14885g(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14885g(WebView webView, String str, Object... objArr) {
        String str2;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (r6 > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new C3874bb(webView, sb2));
            }
        } else {
            if (str.length() != 0) {
                str2 = "The WebView is null for ".concat(str);
            } else {
                str2 = new String("The WebView is null for ");
            }
            if (C3838ai.f14939a.booleanValue() && !TextUtils.isEmpty(str2)) {
                Log.i("OMIDLIB", str2);
            }
        }
    }

    /* renamed from: h */
    public final void mo14886h(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView.loadUrl("null".length() != 0 ? "javascript: ".concat("null") : new String("javascript: "));
        }
    }
}
