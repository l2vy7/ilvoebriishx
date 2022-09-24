package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fz2 extends ez2 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public fz2(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo31703i(webView);
    }
}
