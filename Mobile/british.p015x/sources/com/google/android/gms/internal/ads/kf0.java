package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kf0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AdOverlayInfoParcel f34283b;

    /* renamed from: c */
    final /* synthetic */ zzcaf f34284c;

    kf0(zzcaf zzcaf, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f34284c = zzcaf;
        this.f34283b = adOverlayInfoParcel;
    }

    public final void run() {
        zzt.zzj();
        zzm.zza(this.f34284c.f43018a, this.f34283b, true);
    }
}
