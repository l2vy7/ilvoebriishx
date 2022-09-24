package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;

/* renamed from: com.google.android.gms.internal.ads.ju */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7843ju<AdT> extends C7698fw {

    /* renamed from: b */
    private final AdLoadCallback<AdT> f34044b;

    /* renamed from: c */
    private final AdT f34045c;

    public C7843ju(AdLoadCallback<AdT> adLoadCallback, AdT adt) {
        this.f34044b = adLoadCallback;
        this.f34045c = adt;
    }

    /* renamed from: S */
    public final void mo31670S(zzbew zzbew) {
        AdLoadCallback<AdT> adLoadCallback = this.f34044b;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzbew.mo36238D0());
        }
    }

    public final void zzc() {
        AdT adt;
        AdLoadCallback<AdT> adLoadCallback = this.f34044b;
        if (adLoadCallback != null && (adt = this.f34045c) != null) {
            adLoadCallback.onAdLoaded(adt);
        }
    }
}
