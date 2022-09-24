package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.p196h5.H5AdsRequestHandler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class j80 extends w70 {

    /* renamed from: d */
    public static final /* synthetic */ int f33798d = 0;

    /* renamed from: a */
    private WebViewClient f33799a;

    /* renamed from: b */
    private final H5AdsRequestHandler f33800b;

    /* renamed from: c */
    private final WebView f33801c;

    public j80(Context context, WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        b43.m20208e(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.f33801c = webView;
        this.f33800b = new H5AdsRequestHandler(context, new i80(webView));
    }

    /* renamed from: d */
    private final boolean m33569d(WebView webView) {
        if (this.f33801c.equals(webView)) {
            return true;
        }
        co0.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    /* renamed from: a */
    public final WebViewClient mo28384a() {
        return this.f33799a;
    }

    /* renamed from: b */
    public final void mo32864b() {
        this.f33800b.clearAdObjects();
    }

    /* renamed from: c */
    public final void mo32865c(WebViewClient webViewClient) {
        b43.m20208e(webViewClient != this, "Delegate cannot be itself.");
        this.f33799a = webViewClient;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (m33569d(webView) && !this.f33800b.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!m33569d(this.f33801c)) {
            return false;
        }
        if (this.f33800b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!m33569d(webView)) {
            return false;
        }
        if (this.f33800b.handleH5AdsRequest(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
