package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bk */
/* compiled from: IMASDK */
public final class C3883bk extends C3882bj {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C3883bk(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo15150c(webView);
    }
}
