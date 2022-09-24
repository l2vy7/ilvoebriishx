package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gz1 implements uu3<mb3<String>> {

    /* renamed from: a */
    private final iv3<dw2> f32534a;

    /* renamed from: b */
    private final iv3<Context> f32535b;

    public gz1(iv3<dw2> iv3, iv3<Context> iv32) {
        this.f32534a = iv3;
        this.f32535b = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager zzl = zzt.zzq().zzl(this.f32535b.zzb());
        wv2 wv2 = wv2.WEBVIEW_COOKIE;
        return mv2.m34930a(new dz1(zzl), wv2, this.f32534a.zzb()).mo35050i(1, TimeUnit.SECONDS).mo35044c(Exception.class, new ov2(cz1.f30527a)).mo35042a();
    }
}
