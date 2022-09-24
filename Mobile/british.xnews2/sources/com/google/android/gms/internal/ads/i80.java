package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.p195h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class i80 implements OnH5AdsEventListener {

    /* renamed from: a */
    public final /* synthetic */ WebView f33129a;

    public /* synthetic */ i80(WebView webView) {
        this.f33129a = webView;
    }

    public final void onH5AdsEvent(String str) {
        WebView webView = this.f33129a;
        int i = j80.f33798d;
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
