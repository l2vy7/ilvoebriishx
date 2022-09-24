package com.google.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.C7659eu;

/* renamed from: com.google.ads.mediation.h */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4558h extends AdListener implements AppEventListener, C7659eu {

    /* renamed from: b */
    final AbstractAdViewAdapter f19808b;

    /* renamed from: c */
    final MediationBannerListener f19809c;

    public C4558h(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f19808b = abstractAdViewAdapter;
        this.f19809c = mediationBannerListener;
    }

    public final void onAdClicked() {
        this.f19809c.onAdClicked(this.f19808b);
    }

    public final void onAdClosed() {
        this.f19809c.onAdClosed(this.f19808b);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f19809c.onAdFailedToLoad((MediationBannerAdapter) this.f19808b, (AdError) loadAdError);
    }

    public final void onAdLoaded() {
        this.f19809c.onAdLoaded(this.f19808b);
    }

    public final void onAdOpened() {
        this.f19809c.onAdOpened(this.f19808b);
    }

    public final void onAppEvent(String str, String str2) {
        this.f19809c.zzd(this.f19808b, str, str2);
    }
}
