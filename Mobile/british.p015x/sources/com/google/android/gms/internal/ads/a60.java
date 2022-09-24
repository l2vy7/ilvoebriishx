package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class a60 extends e50 {

    /* renamed from: b */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f29540b;

    public a60(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f29540b = onUnifiedNativeAdLoadedListener;
    }

    /* renamed from: Z3 */
    public final void mo30311Z3(p50 p50) {
        this.f29540b.onUnifiedNativeAdLoaded(new q50(p50));
    }
}
