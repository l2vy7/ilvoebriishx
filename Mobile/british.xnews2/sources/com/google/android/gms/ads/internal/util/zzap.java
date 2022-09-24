package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzap implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzap(zzaw zzaw, String str) {
        this.zza = zzaw;
        this.zzb = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.mo28507i(this.zzb, dialogInterface, i);
    }
}
