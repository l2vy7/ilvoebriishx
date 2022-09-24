package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzag implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzaw zza;

    public /* synthetic */ zzag(zzaw zzaw) {
        this.zza = zzaw;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.zzr();
    }
}
