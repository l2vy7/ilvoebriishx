package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class av0 extends bv0 {
    public av0(xt0 xt0, C7728gq gqVar, boolean z) {
        super(xt0, gqVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo30804H0(webView, str, (Map<String, String>) null);
    }
}
