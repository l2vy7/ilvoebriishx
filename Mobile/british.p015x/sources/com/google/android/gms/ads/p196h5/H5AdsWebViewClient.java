package com.google.android.gms.ads.p196h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.w70;

/* renamed from: com.google.android.gms.ads.h5.H5AdsWebViewClient */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class H5AdsWebViewClient extends w70 {

    /* renamed from: a */
    private final j80 f27774a;

    public H5AdsWebViewClient(@RecentlyNonNull Context context, @RecentlyNonNull WebView webView) {
        this.f27774a = new j80(context, webView);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: a */
    public WebViewClient mo28384a() {
        return this.f27774a;
    }

    public void clearAdObjects() {
        this.f27774a.mo32864b();
    }

    @RecentlyNullable
    public WebViewClient getDelegateWebViewClient() {
        return this.f27774a.mo28384a();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.f27774a.mo32865c(webViewClient);
    }
}
