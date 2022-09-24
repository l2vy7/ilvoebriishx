package com.ironsource.sdk.p287b;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.p288c.C11541e;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.b.c */
public class C11528c extends WebViewClient {

    /* renamed from: b */
    private static final String f51844b = C11528c.class.getSimpleName();

    /* renamed from: a */
    private final C11541e.C11542a f51845a;

    public C11528c(C11541e.C11542a aVar) {
        this.f51845a = aVar;
    }

    /* renamed from: a */
    private static String m51382a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f51845a.mo44636a(m51382a("onReceivedError", String.valueOf(i)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f51845a.mo44636a(m51382a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str = "";
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                str = String.valueOf(webResourceResponse.getStatusCode());
            }
            this.f51845a.mo44636a(m51382a("onReceivedHttpError", str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            String str = f51844b;
            Logger.m51951e(str, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f51845a.mo44637b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
