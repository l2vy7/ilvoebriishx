package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ku0 {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.xt0, java.lang.Object] */
    /* renamed from: a */
    public static final xt0 m20660a(Context context, ov0 ov0, String str, boolean z, boolean z2, C7497ab abVar, p10 p10, zzcjf zzcjf, e10 e10, zzl zzl, zza zza, C7728gq gqVar, ir2 ir2, lr2 lr2) throws ju0 {
        StrictMode.ThreadPolicy threadPolicy;
        p00.m35913c(context);
        try {
            gu0 gu0 = new gu0(context, ov0, str, z, z2, abVar, p10, zzcjf, (e10) null, zzl, zza, gqVar, ir2, lr2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza2 = gu0.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza2;
        } catch (Throwable th) {
            throw new ju0("Webview initialization failed.", th);
        }
    }
}
