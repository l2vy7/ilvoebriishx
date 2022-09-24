package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bm */
/* compiled from: IMASDK */
public final class C3885bm extends C3882bj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f16673a;

    /* renamed from: b */
    private Long f16674b = null;

    /* renamed from: c */
    private final Map<String, C4130ko> f16675c;

    public C3885bm(Map<String, C4130ko> map) {
        this.f16675c = map;
    }

    /* renamed from: a */
    public final void mo15148a() {
        WebView webView = new WebView(C3873ba.m15330a().mo14782b());
        this.f16673a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo15150c(this.f16673a);
        C3875bc.m15575a().mo14886h(this.f16673a, (String) null);
        Iterator<String> it = this.f16675c.keySet().iterator();
        if (!it.hasNext()) {
            this.f16674b = Long.valueOf(System.nanoTime());
            return;
        }
        C4130ko koVar = this.f16675c.get(it.next());
        throw null;
    }

    /* renamed from: b */
    public final void mo15149b() {
        long j;
        super.mo15149b();
        if (this.f16674b == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16674b.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C3884bl(this), Math.max(4000 - j, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.f16673a = null;
    }

    /* renamed from: h */
    public final void mo15155h(C3846ap apVar, C3844an anVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, C4130ko> d = anVar.mo14061d();
        for (String next : d.keySet()) {
            C3887bo.m16853d(jSONObject, next, d.get(next));
        }
        mo15156i(apVar, anVar, jSONObject);
    }
}
