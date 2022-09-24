package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class tk0 extends ek0 {

    /* renamed from: b */
    private FullScreenContentCallback f39439b;

    /* renamed from: c */
    private OnUserEarnedRewardListener f39440c;

    /* renamed from: A4 */
    public final void mo31279A4(zzbew zzbew) {
        FullScreenContentCallback fullScreenContentCallback = this.f39439b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzbew.mo36237C0());
        }
    }

    /* renamed from: D4 */
    public final void mo31280D4(yj0 yj0) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f39440c;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new mk0(yj0));
        }
    }

    /* renamed from: n6 */
    public final void mo34968n6(FullScreenContentCallback fullScreenContentCallback) {
        this.f39439b = fullScreenContentCallback;
    }

    /* renamed from: o6 */
    public final void mo34969o6(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f39440c = onUserEarnedRewardListener;
    }

    /* renamed from: p */
    public final void mo31281p(int i) {
    }

    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f39439b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f39439b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.f39439b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f39439b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
