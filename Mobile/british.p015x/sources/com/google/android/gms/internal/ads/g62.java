package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class g62 implements gk1 {

    /* renamed from: a */
    public final /* synthetic */ uo0 f32171a;

    public /* synthetic */ g62(uo0 uo0) {
        this.f32171a = uo0;
    }

    /* renamed from: a */
    public final void mo32020a(boolean z, Context context, ab1 ab1) {
        uo0 uo0 = this.f32171a;
        try {
            zzt.zzj();
            zzm.zza(context, (AdOverlayInfoParcel) uo0.get(), true);
        } catch (Exception unused) {
        }
    }
}
