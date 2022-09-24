package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;

/* renamed from: com.startapp.h6 */
/* compiled from: Sta */
public final class C11939h6 {
    /* renamed from: a */
    public static void m52394a(MraidState mraidState, WebView webView) {
        C5015nb.m22916a(webView, true, "mraid.fireStateChangeEvent", mraidState.name().toLowerCase());
    }

    /* renamed from: b */
    public static void m52396b(Context context, int i, int i2, WebView webView) {
        C5015nb.m22916a(webView, true, "mraid.setScreenSize", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: a */
    public static void m52391a(Context context, int i, int i2, WebView webView) {
        C5015nb.m22916a(webView, true, "mraid.setMaxSize", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: b */
    public static void m52395b(Context context, int i, int i2, int i3, int i4, WebView webView) {
        C5015nb.m22916a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i3) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i4) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: a */
    public static void m52390a(Context context, int i, int i2, int i3, int i4, WebView webView) {
        C5015nb.m22916a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i3) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i4) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: a */
    public static void m52392a(WebView webView, String str, String str2) {
        C5015nb.m22916a(webView, true, "mraid.fireErrorEvent", str, str2);
    }

    /* renamed from: a */
    public static void m52393a(WebView webView, String str, boolean z) {
        C5015nb.m22916a(webView, false, "mraid.setSupports", str, Boolean.valueOf(z));
    }
}
