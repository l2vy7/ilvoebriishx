package com.startapp;

import android.content.DialogInterface;
import android.webkit.WebView;

/* renamed from: com.startapp.q */
/* compiled from: Sta */
public class C12135q implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ WebView f54037a;

    public C12135q(WebView webView) {
        this.f54037a = webView;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f54037a.stopLoading();
    }
}
