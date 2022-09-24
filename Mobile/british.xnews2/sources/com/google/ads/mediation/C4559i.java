package com.google.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.google.ads.mediation.i */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4559i extends InterstitialAdLoadCallback {

    /* renamed from: a */
    final AbstractAdViewAdapter f19810a;

    /* renamed from: b */
    final MediationInterstitialListener f19811b;

    public C4559i(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f19810a = abstractAdViewAdapter;
        this.f19811b = mediationInterstitialListener;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f19811b.onAdFailedToLoad((MediationInterstitialAdapter) this.f19810a, (AdError) loadAdError);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f19810a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd;
        interstitialAd.setFullScreenContentCallback(new C4560j(abstractAdViewAdapter, this.f19811b));
        this.f19811b.onAdLoaded(this.f19810a);
    }
}
