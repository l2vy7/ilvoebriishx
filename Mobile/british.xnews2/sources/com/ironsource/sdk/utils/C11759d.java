package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: com.ironsource.sdk.utils.d */
public class C11759d {

    /* renamed from: a */
    private static String f52511a = "d";

    /* renamed from: a */
    public static FrameLayout m51980a(Context context, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    /* renamed from: a */
    public static void m51981a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");
        settings.setDomStorageEnabled(true);
        try {
            int i = Build.VERSION.SDK_INT;
            if (i > 11) {
                settings.setDisplayZoomControls(false);
            }
            if (i >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            String str = f52511a;
            Logger.m51951e(str, "setWebSettings - " + th.toString());
        }
    }
}
