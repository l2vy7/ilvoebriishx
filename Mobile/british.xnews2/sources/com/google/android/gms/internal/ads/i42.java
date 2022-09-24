package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class i42 implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ zzl f33088b;

    public /* synthetic */ i42(zzl zzl) {
        this.f33088b = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzl zzl = this.f33088b;
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
