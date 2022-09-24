package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.google.ads.mediation.j */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4560j extends FullScreenContentCallback {

    /* renamed from: a */
    final AbstractAdViewAdapter f19812a;

    /* renamed from: b */
    final MediationInterstitialListener f19813b;

    public C4560j(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f19812a = abstractAdViewAdapter;
        this.f19813b = mediationInterstitialListener;
    }

    public final void onAdDismissedFullScreenContent() {
        this.f19813b.onAdClosed(this.f19812a);
    }

    public final void onAdShowedFullScreenContent() {
        this.f19813b.onAdOpened(this.f19812a);
    }
}
