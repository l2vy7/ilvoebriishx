package com.startapp;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.startapp.qd */
/* compiled from: Sta */
public class C12151qd extends AdSessionStatePublisher {

    /* renamed from: f */
    public WebView f54075f;

    /* renamed from: g */
    public Long f54076g = null;

    /* renamed from: h */
    public final Map<String, C12453yb> f54077h;

    /* renamed from: i */
    public final String f54078i;

    /* renamed from: com.startapp.qd$a */
    /* compiled from: Sta */
    public class C12152a implements Runnable {

        /* renamed from: a */
        public final WebView f54079a;

        public C12152a(C12151qd qdVar) {
            this.f54079a = qdVar.f54075f;
        }

        public void run() {
            this.f54079a.destroy();
        }
    }

    public C12151qd(Map<String, C12453yb> map, String str) {
        this.f54077h = map;
        this.f54078i = str;
    }

    /* renamed from: a */
    public void mo20415a(C11972id idVar, C12101o oVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, C12453yb> unmodifiableMap = Collections.unmodifiableMap(oVar.f53940d);
        for (String next : unmodifiableMap.keySet()) {
            C12377ud.m53546a(jSONObject, next, unmodifiableMap.get(next));
        }
        mo20416a(idVar, oVar, jSONObject);
    }

    /* renamed from: b */
    public void mo20419b() {
        long j;
        this.f21910a.clear();
        if (this.f54076g == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f54076g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C12152a(this), Math.max(4000 - j, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.f54075f = null;
    }

    /* renamed from: d */
    public void mo20422d() {
        WebView webView = new WebView(C11875de.f52875b.f52876a);
        this.f54075f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f21910a = new C12418wd(this.f54075f);
        WebView webView2 = this.f54075f;
        String str = this.f54078i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String next : this.f54077h.keySet()) {
            String externalForm = this.f54077h.get(next).f55172b.toExternalForm();
            WebView webView3 = this.f54075f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f54076g = Long.valueOf(System.nanoTime());
    }
}
