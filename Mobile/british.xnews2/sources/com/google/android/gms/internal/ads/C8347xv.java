package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;

/* renamed from: com.google.android.gms.internal.ads.xv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8347xv extends C7662ex {

    /* renamed from: b */
    private final FullScreenContentCallback f41337b;

    public C8347xv(FullScreenContentCallback fullScreenContentCallback) {
        this.f41337b = fullScreenContentCallback;
    }

    /* renamed from: J */
    public final void mo31418J(zzbew zzbew) {
        FullScreenContentCallback fullScreenContentCallback = this.f41337b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzbew.mo36237C0());
        }
    }

    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f41337b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f41337b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f41337b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f41337b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
