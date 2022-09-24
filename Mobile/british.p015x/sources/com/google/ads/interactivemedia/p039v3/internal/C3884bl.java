package com.google.ads.interactivemedia.p039v3.internal;

import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bl */
/* compiled from: IMASDK */
final class C3884bl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3885bm f16618a;

    /* renamed from: b */
    private final WebView f16619b;

    C3884bl(C3885bm bmVar) {
        this.f16618a = bmVar;
        this.f16619b = bmVar.f16673a;
    }

    public final void run() {
        this.f16619b.destroy();
    }
}
