package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C12486c;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import p324r7.C12868a;

public class SignalsHandler implements C12868a {
    public void onSignalsCollected(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, C12486c.SIGNALS, str);
    }

    public void onSignalsCollectionFailed(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, C12486c.SIGNALS_ERROR, str);
    }
}
