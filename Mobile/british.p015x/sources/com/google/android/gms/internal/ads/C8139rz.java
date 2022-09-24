package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* renamed from: com.google.android.gms.internal.ads.rz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8139rz extends C7520ay {

    /* renamed from: b */
    private final OnPaidEventListener f38819b;

    public C8139rz(OnPaidEventListener onPaidEventListener) {
        this.f38819b = onPaidEventListener;
    }

    /* renamed from: F5 */
    public final void mo30821F5(zzbfk zzbfk) {
        if (this.f38819b != null) {
            this.f38819b.onPaidEvent(AdValue.zza(zzbfk.f21078c, zzbfk.f21079d, zzbfk.f21080e));
        }
    }
}
