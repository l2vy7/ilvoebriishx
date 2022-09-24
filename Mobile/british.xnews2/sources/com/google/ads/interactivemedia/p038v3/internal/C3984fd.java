package com.google.ads.interactivemedia.p038v3.internal;

import android.view.ViewGroup;
import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fd */
/* compiled from: IMASDK */
public final class C3984fd {

    /* renamed from: a */
    private final WebView f17049a;

    /* renamed from: b */
    private final ViewGroup f17050b;

    public C3984fd(WebView webView, ViewGroup viewGroup) {
        this.f17049a = webView;
        this.f17050b = viewGroup;
    }

    /* renamed from: a */
    public final void mo15776a() {
        if (((ViewGroup) this.f17049a.getParent()) == null) {
            this.f17050b.addView(this.f17049a, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f17049a.setVisibility(0);
        this.f17050b.bringChildToFront(this.f17049a);
    }

    /* renamed from: b */
    public final void mo15777b() {
        this.f17049a.setVisibility(4);
    }
}
