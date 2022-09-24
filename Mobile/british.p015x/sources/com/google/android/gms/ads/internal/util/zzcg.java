package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import p006a5.C6494r;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzcg implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ Context f27883a;

    zzcg(zzci zzci, Context context) {
        this.f27883a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences = this.f27883a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f27883a);
            C6494r.m28291a(this.f27883a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        zze.zza("User agent is already initialized on Google Play Services.");
        return string;
    }
}
