package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.xa3;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzu implements xa3<zzah> {

    /* renamed from: a */
    final /* synthetic */ zzv f28084a;

    zzu(zzv zzv) {
        this.f28084a = zzv;
    }

    public final void zza(Throwable th) {
        zzt.zzo().mo18592s(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzv.m28891O6(this.f28084a, "sgf", "sgf_reason", th.getMessage());
        co0.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzah zzah = (zzah) obj;
        co0.zze("Initialized webview successfully for SDKCore.");
    }
}
