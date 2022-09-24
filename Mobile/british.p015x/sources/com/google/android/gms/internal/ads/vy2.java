package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vy2 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ WebView f40587b;

    /* renamed from: c */
    final /* synthetic */ String f40588c;

    vy2(wy2 wy2, WebView webView, String str) {
        this.f40587b = webView;
        this.f40588c = str;
    }

    public final void run() {
        this.f40587b.loadUrl(this.f40588c);
    }
}
