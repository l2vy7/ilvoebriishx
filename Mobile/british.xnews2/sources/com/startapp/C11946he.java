package com.startapp;

import android.webkit.WebView;

/* renamed from: com.startapp.he */
/* compiled from: Sta */
public class C11946he implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WebView f53047a;

    /* renamed from: b */
    public final /* synthetic */ String f53048b;

    public C11946he(WebView webView, String str) {
        this.f53047a = webView;
        this.f53048b = str;
    }

    public void run() {
        this.f53047a.loadUrl(this.f53048b);
    }
}
