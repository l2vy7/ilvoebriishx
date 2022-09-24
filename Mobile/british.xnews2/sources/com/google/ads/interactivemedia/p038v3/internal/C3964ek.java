package com.google.ads.interactivemedia.p038v3.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

@SuppressLint({"SetJavaScriptEnabled", "NewApi"})
/* renamed from: com.google.ads.interactivemedia.v3.internal.ek */
/* compiled from: IMASDK */
final class C3964ek {

    /* renamed from: a */
    private final C3962ei f16985a;

    /* renamed from: b */
    private final WebView f16986b;

    /* renamed from: c */
    private final Handler f16987c;

    /* renamed from: d */
    private boolean f16988d = false;

    C3964ek(Handler handler, WebView webView, C3962ei eiVar) {
        this.f16987c = handler;
        this.f16986b = webView;
        this.f16985a = eiVar;
        webView.setBackgroundColor(0);
        int i = Build.VERSION.SDK_INT;
        if (i > 19) {
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new C3961eh(this));
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        if (i >= 21) {
            instance.setAcceptThirdPartyCookies(webView, true);
        }
    }

    /* renamed from: a */
    public final WebView mo15726a() {
        return this.f16986b;
    }

    /* renamed from: b */
    public final void mo15727b(String str) {
        this.f16986b.loadUrl(str);
    }

    /* renamed from: c */
    public final void mo15728c(C3949dw dwVar) {
        this.f16987c.post(new C3959ef(this, dwVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15729d(String str) {
        String str2;
        String str3;
        try {
            C3949dw a = C3949dw.m16996a(str);
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32 + String.valueOf(str).length());
            sb.append("Received Javascript msg: ");
            sb.append(valueOf);
            sb.append("; URL: ");
            sb.append(str);
            C4257pg.m18525d(sb.toString());
            this.f16985a.mo15707e(a);
        } catch (IllegalArgumentException unused) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "Invalid internal message. Please make sure the Google IMA SDK library is up to date. Message: ".concat(valueOf2);
            } else {
                str2 = new String("Invalid internal message. Please make sure the Google IMA SDK library is up to date. Message: ");
            }
            C4257pg.m18526e(str2);
        } catch (Exception e) {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str3 = "Invalid internal message. Message could not be be parsed: ".concat(valueOf3);
            } else {
                str3 = new String("Invalid internal message. Message could not be be parsed: ");
            }
            C4257pg.m18527f(str3, e);
        }
    }

    /* renamed from: e */
    public final void mo15730e() {
        this.f16987c.post(new C3960eg(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo15731f() {
        this.f16988d = true;
        this.f16986b.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo15732g(C3949dw dwVar) {
        String f = dwVar.mo15695f();
        if (this.f16988d) {
            String valueOf = String.valueOf(dwVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 50 + String.valueOf(f).length());
            sb.append("Attempted to send bridge message after cleanup: ");
            sb.append(valueOf);
            sb.append("; ");
            sb.append(f);
            C4257pg.m18526e(sb.toString());
            return;
        }
        String valueOf2 = String.valueOf(dwVar);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 31 + String.valueOf(f).length());
        sb2.append("Sending Javascript msg: ");
        sb2.append(valueOf2);
        sb2.append("; URL: ");
        sb2.append(f);
        C4257pg.m18525d(sb2.toString());
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                this.f16986b.evaluateJavascript(f, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                this.f16986b.loadUrl(f);
            }
        } else {
            this.f16986b.loadUrl(f);
        }
    }
}
