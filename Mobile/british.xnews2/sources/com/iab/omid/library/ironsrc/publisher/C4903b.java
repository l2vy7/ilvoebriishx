package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.p048b.C4882d;
import com.iab.omid.library.ironsrc.p048b.C4883e;
import com.iab.omid.library.ironsrc.p050d.C4893b;
import com.iab.omid.library.ironsrc.p050d.C4896d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.publisher.b */
public class C4903b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f21844a;

    /* renamed from: b */
    private Long f21845b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f21846c;

    /* renamed from: d */
    private final String f21847d;

    public C4903b(Map<String, VerificationScriptResource> map, String str) {
        this.f21846c = map;
        this.f21847d = str;
    }

    /* renamed from: a */
    public void mo20340a() {
        super.mo20340a();
        mo20364j();
    }

    /* renamed from: a */
    public void mo20346a(C4876a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4893b.m22550a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo20347a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo20354b() {
        super.mo20354b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f21849b;

            {
                this.f21849b = C4903b.this.f21844a;
            }

            public void run() {
                this.f21849b.destroy();
            }
        }, Math.max(4000 - (this.f21845b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4896d.m22562a() - this.f21845b.longValue(), TimeUnit.NANOSECONDS)), SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.f21844a = null;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void mo20364j() {
        WebView webView = new WebView(C4882d.m22495a().mo20312b());
        this.f21844a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo20342a(this.f21844a);
        C4883e.m22498a().mo20323a(this.f21844a, this.f21847d);
        for (String next : this.f21846c.keySet()) {
            C4883e.m22498a().mo20316a(this.f21844a, this.f21846c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f21845b = Long.valueOf(C4896d.m22562a());
    }
}
