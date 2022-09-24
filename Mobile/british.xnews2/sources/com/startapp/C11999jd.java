package com.startapp;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;

/* renamed from: com.startapp.jd */
/* compiled from: Sta */
public class C11999jd extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C11999jd(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo20414a(webView);
    }
}
