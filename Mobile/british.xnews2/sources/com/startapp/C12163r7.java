package com.startapp;

import android.os.Handler;
import android.webkit.WebView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11772a5;

/* renamed from: com.startapp.r7 */
/* compiled from: Sta */
public class C12163r7 extends C11772a5 {

    /* renamed from: com.startapp.r7$a */
    /* compiled from: Sta */
    public class C12164a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WebView f54108a;

        public C12164a(C12163r7 r7Var, WebView webView) {
            this.f54108a = webView;
        }

        public void run() {
            try {
                this.f54108a.setBackgroundColor(0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo45097a(WebView webView) {
        new Handler().postDelayed(new C12164a(this, webView), 1000);
    }

    /* renamed from: b */
    public void mo45103b(WebView webView) {
        this.f52553C = false;
        webView.setOnTouchListener(new C11772a5.C11776d());
        if (this.f52606h.equals(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE)) {
            webView.setBackgroundColor(0);
        }
    }
}
