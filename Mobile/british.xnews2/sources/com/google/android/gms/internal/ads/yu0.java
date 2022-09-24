package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.iv0;
import com.google.android.gms.internal.ads.zu0;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yu0<WebViewT extends zu0 & gv0 & iv0> {

    /* renamed from: a */
    private final WebViewT f41997a;

    /* renamed from: b */
    private final wu0 f41998b;

    public yu0(zu0 zu0, WebViewT webviewt, wu0 wu0) {
        this.f41998b = webviewt;
        this.f41997a = zu0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo35975a(String str) {
        wu0 wu0 = this.f41998b;
        Uri parse = Uri.parse(str);
        eu0 H0 = ((ru0) wu0.f40903a).mo18718H0();
        if (H0 == null) {
            co0.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            H0.mo18269m0(parse);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        C7497ab zzK = this.f41997a.zzK();
        if (zzK == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        C8291wa c = zzK.mo30331c();
        if (c == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (this.f41997a.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.f41997a.getContext();
            WebViewT webviewt = this.f41997a;
            return c.zzf(context, str, (View) webviewt, webviewt.zzk());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            co0.zzj("URL is empty, ignoring message");
        } else {
            zzt.zza.post(new xu0(this, str));
        }
    }
}
