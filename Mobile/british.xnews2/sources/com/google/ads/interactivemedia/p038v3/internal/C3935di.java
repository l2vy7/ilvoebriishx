package com.google.ads.interactivemedia.p038v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.p038v3.api.CompanionAdSlot;

/* renamed from: com.google.ads.interactivemedia.v3.internal.di */
/* compiled from: IMASDK */
final class C3935di extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C3936dj f16922a;

    C3935di(C3936dj djVar) {
        this.f16922a = djVar;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f16922a.f16924b.mo15718p(str);
        for (CompanionAdSlot.ClickListener onCompanionAdClick : this.f16922a.f16925c) {
            onCompanionAdClick.onCompanionAdClick();
        }
        return true;
    }
}
