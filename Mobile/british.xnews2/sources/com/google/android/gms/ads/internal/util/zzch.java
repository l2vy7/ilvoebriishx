package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzch implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ Context f27884a;

    /* renamed from: b */
    final /* synthetic */ Context f27885b;

    zzch(zzci zzci, Context context, Context context2) {
        this.f27884a = context;
        this.f27885b = context2;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f27884a != null) {
            zze.zza("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f27884a.getSharedPreferences("admob_user_agent", 0);
        } else {
            zze.zza("Attempting to read user agent from local cache.");
            sharedPreferences = this.f27885b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zze.zza("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f27885b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zze.zza("Persisting user agent.");
            }
        }
        return string;
    }
}
