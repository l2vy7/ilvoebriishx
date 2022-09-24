package com.startapp;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

/* renamed from: com.startapp.k6 */
/* compiled from: Sta */
public final class C12010k6 {
    /* renamed from: a */
    public static void m52531a(Context context, WebView webView, C12029l6 l6Var) {
        if (l6Var == null) {
            l6Var = new C12029l6(context);
        }
        boolean z = true;
        C11939h6.m52393a(webView, "mraid.SUPPORTED_FEATURES.CALENDAR", l6Var.f53250b.contains("calendar") && Build.VERSION.SDK_INT >= 14 && C12437y.m53782a(l6Var.f53249a, "android.permission.WRITE_CALENDAR"));
        C11939h6.m52393a(webView, "mraid.SUPPORTED_FEATURES.INLINEVIDEO", l6Var.f53250b.contains("inlineVideo"));
        C11939h6.m52393a(webView, "mraid.SUPPORTED_FEATURES.SMS", l6Var.f53250b.contains("sms") && C12437y.m53782a(l6Var.f53249a, "android.permission.SEND_SMS"));
        C11939h6.m52393a(webView, "mraid.SUPPORTED_FEATURES.STOREPICTURE", l6Var.f53250b.contains("storePicture"));
        if (!l6Var.f53250b.contains("tel") || !C12437y.m53782a(l6Var.f53249a, "android.permission.CALL_PHONE")) {
            z = false;
        }
        C11939h6.m52393a(webView, "mraid.SUPPORTED_FEATURES.TEL", z);
    }
}
