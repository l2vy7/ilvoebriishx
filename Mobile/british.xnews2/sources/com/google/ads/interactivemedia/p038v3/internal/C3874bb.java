package com.google.ads.interactivemedia.p038v3.internal;

import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bb */
/* compiled from: IMASDK */
final class C3874bb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView f15986a;

    /* renamed from: b */
    final /* synthetic */ String f15987b;

    C3874bb(WebView webView, String str) {
        this.f15986a = webView;
        this.f15987b = str;
    }

    public final void run() {
        this.f15986a.loadUrl(this.f15987b);
    }
}
