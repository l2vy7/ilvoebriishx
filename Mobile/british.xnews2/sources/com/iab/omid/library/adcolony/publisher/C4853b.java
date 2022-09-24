package com.iab.omid.library.adcolony.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.p042b.C4832d;
import com.iab.omid.library.adcolony.p042b.C4833e;
import com.iab.omid.library.adcolony.p044d.C4843b;
import com.iab.omid.library.adcolony.p044d.C4846d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.b */
public class C4853b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f21730f;

    /* renamed from: g */
    private Long f21731g = null;

    /* renamed from: h */
    private Map<String, VerificationScriptResource> f21732h;

    /* renamed from: i */
    private final String f21733i;

    /* renamed from: com.iab.omid.library.adcolony.publisher.b$a */
    class C4854a implements Runnable {

        /* renamed from: a */
        private WebView f21734a;

        C4854a() {
            this.f21734a = C4853b.this.f21730f;
        }

        public void run() {
            this.f21734a.destroy();
        }
    }

    public C4853b(Map<String, VerificationScriptResource> map, String str) {
        this.f21732h = map;
        this.f21733i = str;
    }

    /* renamed from: a */
    public void mo20154a() {
        super.mo20154a();
        mo20178j();
    }

    /* renamed from: a */
    public void mo20160a(C4826a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4843b.m22329a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo20161a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo20168b() {
        super.mo20168b();
        new Handler().postDelayed(new C4854a(), Math.max(4000 - (this.f21731g == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4846d.m22341a() - this.f21731g.longValue(), TimeUnit.NANOSECONDS)), SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.f21730f = null;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void mo20178j() {
        WebView webView = new WebView(C4832d.m22274a().mo20126b());
        this.f21730f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo20156a(this.f21730f);
        C4833e.m22277a().mo20137a(this.f21730f, this.f21733i);
        for (String next : this.f21732h.keySet()) {
            C4833e.m22277a().mo20130a(this.f21730f, this.f21732h.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f21731g = Long.valueOf(C4846d.m22341a());
    }
}
