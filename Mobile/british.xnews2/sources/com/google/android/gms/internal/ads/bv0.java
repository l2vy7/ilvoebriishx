package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class bv0 extends eu0 {
    public bv0(xt0 xt0, C7728gq gqVar, boolean z) {
        super(xt0, gqVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public final WebResourceResponse mo30804H0(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof xt0)) {
            co0.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        xt0 xt0 = (xt0) webView;
        hl0 hl0 = this.f20314v;
        if (hl0 != null) {
            hl0.mo18141a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo18258M(str, map);
        }
        if (xt0.mo18793u0() != null) {
            xt0.mo18793u0().mo18264f();
        }
        if (xt0.mo18765m().mo34013i()) {
            str2 = (String) C8311wv.m39277c().mo18570b(p00.f36903J);
        } else if (xt0.mo18732S()) {
            str2 = (String) C8311wv.m39277c().mo18570b(p00.f36895I);
        } else {
            str2 = (String) C8311wv.m39277c().mo18570b(p00.f36887H);
        }
        zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzB(xt0.getContext(), xt0.zzp().f43036b, str2);
    }
}
