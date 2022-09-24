package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.eo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7653eo implements Runnable {

    /* renamed from: b */
    final ValueCallback<String> f31437b = new C7616do(this);

    /* renamed from: c */
    final /* synthetic */ C4630wn f31438c;

    /* renamed from: d */
    final /* synthetic */ WebView f31439d;

    /* renamed from: e */
    final /* synthetic */ boolean f31440e;

    /* renamed from: f */
    final /* synthetic */ C4612go f31441f;

    C7653eo(C4612go goVar, C4630wn wnVar, WebView webView, boolean z) {
        this.f31441f = goVar;
        this.f31438c = wnVar;
        this.f31439d = webView;
        this.f31440e = z;
    }

    public final void run() {
        if (this.f31439d.getSettings().getJavaScriptEnabled()) {
            try {
                this.f31439d.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f31437b);
            } catch (Throwable unused) {
                ((C7616do) this.f31437b).onReceiveValue("");
            }
        }
    }
}
