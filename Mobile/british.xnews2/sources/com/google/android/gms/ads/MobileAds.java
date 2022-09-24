package com.google.android.gms.ads;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.C4632yy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MobileAds {
    @RecentlyNonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@RecentlyNonNull Context context) {
        C4632yy.m21230f().mo19016k(context);
    }

    @RecentlyNullable
    public static InitializationStatus getInitializationStatus() {
        return C4632yy.m21230f().mo19014e();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return C4632yy.m21230f().mo19013c();
    }

    @RecentlyNonNull
    public static String getVersionString() {
        return C4632yy.m21230f().mo19015g();
    }

    public static void initialize(@RecentlyNonNull Context context) {
        C4632yy.m21230f().mo19017l(context, (String) null, (OnInitializationCompleteListener) null);
    }

    public static void openAdInspector(@RecentlyNonNull Context context, @RecentlyNonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        C4632yy.m21230f().mo19019n(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        C4632yy.m21230f().mo19020o(context, str);
    }

    public static void registerRtbAdapter(@RecentlyNonNull Class<? extends RtbAdapter> cls) {
        C4632yy.m21230f().mo19021p(cls);
    }

    public static void registerWebView(@RecentlyNonNull WebView webView) {
        C4632yy.m21230f().mo19022q(webView);
    }

    public static void setAppMuted(boolean z) {
        C4632yy.m21230f().mo19023r(z);
    }

    public static void setAppVolume(float f) {
        C4632yy.m21230f().mo19024s(f);
    }

    public static void setRequestConfiguration(@RecentlyNonNull RequestConfiguration requestConfiguration) {
        C4632yy.m21230f().mo19025t(requestConfiguration);
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        C4632yy.m21230f().mo19017l(context, (String) null, onInitializationCompleteListener);
    }
}
