package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.co0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class zzc implements CustomEventNativeListener {

    /* renamed from: a */
    private final CustomEventAdapter f28037a;

    /* renamed from: b */
    private final MediationNativeListener f28038b;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.f28037a = customEventAdapter;
        this.f28038b = mediationNativeListener;
    }

    public final void onAdClicked() {
        co0.zze("Custom event adapter called onAdClicked.");
        this.f28038b.onAdClicked(this.f28037a);
    }

    public final void onAdClosed() {
        co0.zze("Custom event adapter called onAdClosed.");
        this.f28038b.onAdClosed(this.f28037a);
    }

    public final void onAdFailedToLoad(int i) {
        co0.zze("Custom event adapter called onAdFailedToLoad.");
        this.f28038b.onAdFailedToLoad((MediationNativeAdapter) this.f28037a, i);
    }

    public final void onAdImpression() {
        co0.zze("Custom event adapter called onAdImpression.");
        this.f28038b.onAdImpression(this.f28037a);
    }

    public final void onAdLeftApplication() {
        co0.zze("Custom event adapter called onAdLeftApplication.");
        this.f28038b.onAdLeftApplication(this.f28037a);
    }

    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        co0.zze("Custom event adapter called onAdLoaded.");
        this.f28038b.onAdLoaded(this.f28037a, unifiedNativeAdMapper);
    }

    public final void onAdOpened() {
        co0.zze("Custom event adapter called onAdOpened.");
        this.f28038b.onAdOpened(this.f28037a);
    }

    public final void onAdFailedToLoad(AdError adError) {
        co0.zze("Custom event adapter called onAdFailedToLoad.");
        this.f28038b.onAdFailedToLoad((MediationNativeAdapter) this.f28037a, adError);
    }
}
