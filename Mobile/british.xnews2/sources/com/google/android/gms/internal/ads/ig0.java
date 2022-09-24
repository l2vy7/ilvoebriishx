package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ig0 extends e50 {

    /* renamed from: b */
    private final NativeAd.OnNativeAdLoadedListener f33238b;

    public ig0(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f33238b = onNativeAdLoadedListener;
    }

    /* renamed from: Z3 */
    public final void mo30311Z3(p50 p50) {
        this.f33238b.onNativeAdLoaded(new ag0(p50));
    }
}
