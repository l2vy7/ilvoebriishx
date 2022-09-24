package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;

/* renamed from: com.google.android.gms.internal.ads.yo */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8377yo extends C7765hp {

    /* renamed from: b */
    private FullScreenContentCallback f41940b;

    /* renamed from: J */
    public final void mo32205J(zzbew zzbew) {
        FullScreenContentCallback fullScreenContentCallback = this.f41940b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzbew.mo36237C0());
        }
    }

    /* renamed from: n6 */
    public final void mo35950n6(FullScreenContentCallback fullScreenContentCallback) {
        this.f41940b = fullScreenContentCallback;
    }

    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f41940b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f41940b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f41940b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f41940b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
