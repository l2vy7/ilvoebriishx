package com.ironsource.sdk.p289c;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.c.b */
public final class C11534b {

    /* renamed from: a */
    private C11535c f51862a;

    C11534b(C11535c cVar) {
        this.f51862a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f51862a.handleMessageFromAd(str);
    }
}
