package com.appnext.nativeads.designed_native_ads;

import com.appnext.core.C3148Ad;
import com.appnext.core.SettingsManager;
import com.appnext.nativeads.C3289b;

/* renamed from: com.appnext.nativeads.designed_native_ads.b */
public final class C3295b extends C3289b {

    /* renamed from: gk */
    private static C3295b f12535gk;

    /* renamed from: bf */
    public static synchronized C3295b m11036bf() {
        C3295b bVar;
        synchronized (C3295b.class) {
            if (f12535gk == null) {
                f12535gk = new C3295b();
            }
            bVar = f12535gk;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SettingsManager mo10240c(C3148Ad ad) {
        return C3296c.m11038bg();
    }
}
