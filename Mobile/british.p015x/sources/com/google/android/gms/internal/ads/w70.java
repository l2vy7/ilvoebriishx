package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class w70 extends WebViewClient {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract WebViewClient mo28384a();

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onFormResubmission(webView, message, message2);
        }
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onLoadResource(webView, str);
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onPageCommitVisible(webView, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onPageFinished(webView, str);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onPageStarted(webView, str, bitmap);
        }
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedError(webView, i, str, str2);
        }
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient a = mo28384a();
        if (a == null) {
            return false;
        }
        return a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onScaleChanged(webView, f, f2);
        }
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onTooManyRedirects(webView, message, message2);
        }
    }

    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a = mo28384a();
        if (a == null) {
            return null;
        }
        return a.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a = mo28384a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a = mo28384a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient a = mo28384a();
        if (a != null) {
            a.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient a = mo28384a();
        if (a == null) {
            return null;
        }
        return a.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient a = mo28384a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideUrlLoading(webView, str);
    }
}
