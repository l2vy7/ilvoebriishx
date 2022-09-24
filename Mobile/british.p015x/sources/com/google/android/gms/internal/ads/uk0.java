package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class uk0 extends ik0 {

    /* renamed from: b */
    private final RewardedInterstitialAdLoadCallback f39880b;

    /* renamed from: c */
    private final vk0 f39881c;

    public uk0(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, vk0 vk0) {
        this.f39880b = rewardedInterstitialAdLoadCallback;
        this.f39881c = vk0;
    }

    /* renamed from: l */
    public final void mo31425l(int i) {
    }

    /* renamed from: m */
    public final void mo31426m(zzbew zzbew) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f39880b;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzbew.mo36238D0());
        }
    }

    public final void zzg() {
        vk0 vk0;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f39880b;
        if (rewardedInterstitialAdLoadCallback != null && (vk0 = this.f39881c) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(vk0);
        }
    }
}
