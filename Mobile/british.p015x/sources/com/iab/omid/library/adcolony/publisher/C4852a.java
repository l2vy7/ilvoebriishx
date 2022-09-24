package com.iab.omid.library.adcolony.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.adcolony.publisher.a */
public class C4852a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C4852a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo20156a(webView);
    }
}
