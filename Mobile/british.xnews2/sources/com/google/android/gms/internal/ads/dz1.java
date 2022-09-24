package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class dz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ CookieManager f31130a;

    public /* synthetic */ dz1(CookieManager cookieManager) {
        this.f31130a = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f31130a;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) C8311wv.m39277c().mo18570b(p00.f36848C0));
    }
}
