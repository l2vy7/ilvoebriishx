package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.ironsrc.publisher.a */
public class C4902a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C4902a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo20342a(webView);
    }
}
