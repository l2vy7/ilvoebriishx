package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.co0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class zza implements CustomEventBannerListener {

    /* renamed from: a */
    private final CustomEventAdapter f28032a;

    /* renamed from: b */
    private final MediationBannerListener f28033b;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f28032a = customEventAdapter;
        this.f28033b = mediationBannerListener;
    }

    public final void onAdClicked() {
        co0.zze("Custom event adapter called onAdClicked.");
        this.f28033b.onAdClicked(this.f28032a);
    }

    public final void onAdClosed() {
        co0.zze("Custom event adapter called onAdClosed.");
        this.f28033b.onAdClosed(this.f28032a);
    }

    public final void onAdFailedToLoad(int i) {
        co0.zze("Custom event adapter called onAdFailedToLoad.");
        this.f28033b.onAdFailedToLoad((MediationBannerAdapter) this.f28032a, i);
    }

    public final void onAdLeftApplication() {
        co0.zze("Custom event adapter called onAdLeftApplication.");
        this.f28033b.onAdLeftApplication(this.f28032a);
    }

    public final void onAdLoaded(View view) {
        co0.zze("Custom event adapter called onAdLoaded.");
        this.f28032a.f28027a = view;
        this.f28033b.onAdLoaded(this.f28032a);
    }

    public final void onAdOpened() {
        co0.zze("Custom event adapter called onAdOpened.");
        this.f28033b.onAdOpened(this.f28032a);
    }

    public final void onAdFailedToLoad(AdError adError) {
        co0.zze("Custom event adapter called onAdFailedToLoad.");
        this.f28033b.onAdFailedToLoad((MediationBannerAdapter) this.f28032a, adError);
    }
}
