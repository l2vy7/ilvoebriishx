package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventNativeListener extends CustomEventListener {
    void onAdImpression();

    void onAdLoaded(@RecentlyNonNull UnifiedNativeAdMapper unifiedNativeAdMapper);
}
