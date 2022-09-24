package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.co0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class zzb implements CustomEventInterstitialListener {

    /* renamed from: a */
    private final CustomEventAdapter f28034a;

    /* renamed from: b */
    private final MediationInterstitialListener f28035b;

    /* renamed from: c */
    final /* synthetic */ CustomEventAdapter f28036c;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f28036c = customEventAdapter;
        this.f28034a = customEventAdapter2;
        this.f28035b = mediationInterstitialListener;
    }

    public final void onAdClicked() {
        co0.zze("Custom event adapter called onAdClicked.");
        this.f28035b.onAdClicked(this.f28034a);
    }

    public final void onAdClosed() {
        co0.zze("Custom event adapter called onAdClosed.");
        this.f28035b.onAdClosed(this.f28034a);
    }

    public final void onAdFailedToLoad(int i) {
        co0.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f28035b.onAdFailedToLoad((MediationInterstitialAdapter) this.f28034a, i);
    }

    public final void onAdLeftApplication() {
        co0.zze("Custom event adapter called onAdLeftApplication.");
        this.f28035b.onAdLeftApplication(this.f28034a);
    }

    public final void onAdLoaded() {
        co0.zze("Custom event adapter called onReceivedAd.");
        this.f28035b.onAdLoaded(this.f28036c);
    }

    public final void onAdOpened() {
        co0.zze("Custom event adapter called onAdOpened.");
        this.f28035b.onAdOpened(this.f28034a);
    }

    public final void onAdFailedToLoad(AdError adError) {
        co0.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f28035b.onAdFailedToLoad((MediationInterstitialAdapter) this.f28034a, adError);
    }
}
