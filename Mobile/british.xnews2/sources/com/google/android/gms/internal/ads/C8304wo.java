package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* renamed from: com.google.android.gms.internal.ads.wo */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8304wo extends C7617dp {

    /* renamed from: b */
    private final AppOpenAd.AppOpenAdLoadCallback f40831b;

    /* renamed from: c */
    private final String f40832c;

    public C8304wo(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f40831b = appOpenAdLoadCallback;
        this.f40832c = str;
    }

    /* renamed from: Q0 */
    public final void mo30973Q0(C7546bp bpVar) {
        if (this.f40831b != null) {
            this.f40831b.onAdLoaded(new C8340xo(bpVar, this.f40832c));
        }
    }

    /* renamed from: w3 */
    public final void mo30974w3(zzbew zzbew) {
        if (this.f40831b != null) {
            this.f40831b.onAdFailedToLoad(zzbew.mo36238D0());
        }
    }

    public final void zzb(int i) {
    }
}
