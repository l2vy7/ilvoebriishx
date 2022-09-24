package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dj */
/* compiled from: IMASDK */
final class C3936dj extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ Context f16923a;

    /* renamed from: b */
    final /* synthetic */ C3958ee f16924b;

    /* renamed from: c */
    final /* synthetic */ List f16925c;

    C3936dj(Context context, C3958ee eeVar, List list) {
        this.f16923a = context;
        this.f16924b = eeVar;
        this.f16925c = list;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        webViewTransport.setWebView(new WebView(this.f16923a));
        webViewTransport.getWebView().setWebViewClient(new C3935di(this));
        message.sendToTarget();
        return true;
    }
}
