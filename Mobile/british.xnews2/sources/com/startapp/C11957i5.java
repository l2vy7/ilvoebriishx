package com.startapp;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* renamed from: com.startapp.i5 */
/* compiled from: Sta */
public class C11957i5 {

    /* renamed from: a */
    public boolean f53086a = false;

    /* renamed from: b */
    public Runnable f53087b = null;

    public C11957i5(Context context, Runnable runnable) {
        this.f53087b = runnable;
    }

    @JavascriptInterface
    public void closeSplash() {
        if (!this.f53086a) {
            this.f53086a = true;
            this.f53087b.run();
        }
    }
}
