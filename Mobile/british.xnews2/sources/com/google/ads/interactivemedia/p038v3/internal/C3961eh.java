package com.google.ads.interactivemedia.p038v3.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eh */
/* compiled from: IMASDK */
final class C3961eh extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C3964ek f16984a;

    C3961eh(C3964ek ekVar) {
        this.f16984a = ekVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C4257pg.m18525d(valueOf.length() != 0 ? "Finished ".concat(valueOf) : new String("Finished "));
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String valueOf = String.valueOf(str);
        C4257pg.m18525d(valueOf.length() != 0 ? "Started ".concat(valueOf) : new String("Started "));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Error: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        C4257pg.m18525d(sb.toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("gmsg://")) {
            return false;
        }
        this.f16984a.mo15729d(str);
        return true;
    }
}
