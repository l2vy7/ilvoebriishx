package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import java.util.concurrent.Callable;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzp implements Callable {
    public final /* synthetic */ zzv zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ C10487a zzc;

    public /* synthetic */ zzp(zzv zzv, Uri uri, C10487a aVar) {
        this.zza = zzv;
        this.zzb = uri;
        this.zzc = aVar;
    }

    public final Object call() {
        return this.zza.mo28906A6(this.zzb, this.zzc);
    }
}
