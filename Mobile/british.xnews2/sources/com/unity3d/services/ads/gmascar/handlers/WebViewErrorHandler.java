package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12496l;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class WebViewErrorHandler implements C12487d<C12496l> {
    public void handleError(C12496l lVar) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.valueOf(lVar.getDomain()), lVar.getErrorCategory(), lVar.getErrorArguments());
    }
}
