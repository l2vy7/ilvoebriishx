package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hz2 extends ez2 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f33000d;

    /* renamed from: e */
    private Long f33001e = null;

    /* renamed from: f */
    private final Map<String, ly2> f33002f;

    public hz2(Map<String, ly2> map, String str) {
        this.f33002f = map;
    }

    /* renamed from: c */
    public final void mo31697c() {
        long j;
        super.mo31697c();
        if (this.f33001e == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f33001e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new gz2(this), Math.max(4000 - j, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.f33000d = null;
    }

    /* renamed from: f */
    public final void mo31700f(fy2 fy2, dy2 dy2) {
        JSONObject jSONObject = new JSONObject();
        Map<String, ly2> i = dy2.mo31435i();
        for (String next : i.keySet()) {
            iz2.m33500g(jSONObject, next, i.get(next));
        }
        mo31701g(fy2, dy2, jSONObject);
    }

    /* renamed from: j */
    public final void mo31704j() {
        WebView webView = new WebView(uy2.m38542b().mo35336a());
        this.f33000d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo31703i(this.f33000d);
        WebView webView2 = this.f33000d;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator<String> it = this.f33002f.keySet().iterator();
        if (!it.hasNext()) {
            this.f33001e = Long.valueOf(System.nanoTime());
            return;
        }
        ly2 ly2 = this.f33002f.get(it.next());
        throw null;
    }
}
