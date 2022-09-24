package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class pk0 extends ik0 {

    /* renamed from: b */
    private final RewardedAdLoadCallback f37697b;

    /* renamed from: c */
    private final RewardedAd f37698c;

    public pk0(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.f37697b = rewardedAdLoadCallback;
        this.f37698c = rewardedAd;
    }

    /* renamed from: l */
    public final void mo31425l(int i) {
    }

    /* renamed from: m */
    public final void mo31426m(zzbew zzbew) {
        if (this.f37697b != null) {
            this.f37697b.onAdFailedToLoad(zzbew.mo36238D0());
        }
    }

    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f37697b;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.f37698c);
        }
    }
}
