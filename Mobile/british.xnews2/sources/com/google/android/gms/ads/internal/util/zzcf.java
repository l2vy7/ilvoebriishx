package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.zh0;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcf {
    @Deprecated
    public static <T> T zza(Context context, Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            co0.zzh("Unexpected exception.", th);
            zh0.m21287c(context).mo19058b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
