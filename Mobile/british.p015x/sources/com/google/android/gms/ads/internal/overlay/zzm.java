package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C7659eu;
import com.google.android.gms.internal.ads.gi1;
import p006a5.C6492o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzm {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            C7659eu euVar = adOverlayInfoParcel.zzb;
            if (euVar != null) {
                euVar.onAdClicked();
            }
            gi1 gi1 = adOverlayInfoParcel.zzy;
            if (gi1 != null) {
                gi1.zzq();
            }
            Activity zzk = adOverlayInfoParcel.zzd.zzk();
            zzc zzc = adOverlayInfoParcel.zza;
            if (!(zzc == null || !zzc.zzj || zzk == null)) {
                context = zzk;
            }
            zzt.zzi();
            zzc zzc2 = adOverlayInfoParcel.zza;
            zza.zzb(context, zzc2, adOverlayInfoParcel.zzi, zzc2 != null ? zzc2.zzi : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.f43039e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!C6492o.m28285h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzt.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzQ(context, intent);
    }
}
