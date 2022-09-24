package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.s */
final class C11613s {

    /* renamed from: a */
    private C11614t f52103a;

    /* renamed from: b */
    private boolean f52104b = false;

    C11613s(C11614t tVar) {
        this.f52103a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f52104b) {
            return "";
        }
        this.f52104b = true;
        return this.f52103a.f52105a;
    }
}
