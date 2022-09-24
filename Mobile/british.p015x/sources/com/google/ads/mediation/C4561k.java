package com.google.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;

/* renamed from: com.google.ads.mediation.k */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4561k extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {

    /* renamed from: b */
    final AbstractAdViewAdapter f19814b;

    /* renamed from: c */
    final MediationNativeListener f19815c;

    public C4561k(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f19814b = abstractAdViewAdapter;
        this.f19815c = mediationNativeListener;
    }

    public final void onAdClicked() {
        this.f19815c.onAdClicked(this.f19814b);
    }

    public final void onAdClosed() {
        this.f19815c.onAdClosed(this.f19814b);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f19815c.onAdFailedToLoad((MediationNativeAdapter) this.f19814b, (AdError) loadAdError);
    }

    public final void onAdImpression() {
        this.f19815c.onAdImpression(this.f19814b);
    }

    public final void onAdLoaded() {
    }

    public final void onAdOpened() {
        this.f19815c.onAdOpened(this.f19814b);
    }

    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f19815c.zze(this.f19814b, nativeCustomTemplateAd, str);
    }

    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f19815c.zzc(this.f19814b, nativeCustomTemplateAd);
    }

    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f19815c.onAdLoaded(this.f19814b, new C4557g(unifiedNativeAd));
    }
}
