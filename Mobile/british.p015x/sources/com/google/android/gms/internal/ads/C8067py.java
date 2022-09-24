package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.google.android.gms.internal.ads.py */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8067py extends C8278vv {

    /* renamed from: c */
    final /* synthetic */ C4620qy f37806c;

    C8067py(C4620qy qyVar) {
        this.f37806c = qyVar;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f37806c.f20669d.zzb(this.f37806c.mo18679l());
        super.onAdFailedToLoad(loadAdError);
    }

    public final void onAdLoaded() {
        this.f37806c.f20669d.zzb(this.f37806c.mo18679l());
        super.onAdLoaded();
    }
}
