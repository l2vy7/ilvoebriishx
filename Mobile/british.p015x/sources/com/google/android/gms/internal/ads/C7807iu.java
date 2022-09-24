package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* renamed from: com.google.android.gms.internal.ads.iu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7807iu extends C7589cw {

    /* renamed from: b */
    private final AdListener f33521b;

    public C7807iu(AdListener adListener) {
        this.f33521b = adListener;
    }

    /* renamed from: l */
    public final void mo30547l(int i) {
    }

    /* renamed from: m */
    public final void mo30548m(zzbew zzbew) {
        AdListener adListener = this.f33521b;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzbew.mo36238D0());
        }
    }

    /* renamed from: n6 */
    public final AdListener mo32767n6() {
        return this.f33521b;
    }

    public final void zzc() {
        AdListener adListener = this.f33521b;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    public final void zzd() {
        AdListener adListener = this.f33521b;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    public final void zzg() {
        AdListener adListener = this.f33521b;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final void zzh() {
    }

    public final void zzi() {
        AdListener adListener = this.f33521b;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    public final void zzj() {
        AdListener adListener = this.f33521b;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }
}
