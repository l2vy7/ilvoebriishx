package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.zzae;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzk extends zzb {

    /* renamed from: c */
    final /* synthetic */ zzl f27792c;

    /* synthetic */ zzk(zzl zzl, zzj zzj) {
        this.f27792c = zzl;
    }

    public final void zza() {
        Bitmap zza = zzt.zzu().zza(Integer.valueOf(this.f27792c.f27795c.zzo.zzf));
        if (zza != null) {
            zzae zzq = zzt.zzq();
            zzl zzl = this.f27792c;
            Activity activity = zzl.f27794b;
            zzj zzj = zzl.f27795c.zzo;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzi(this, zzq.zzc(activity, zza, zzj.zzd, zzj.zze)));
        }
    }
}
