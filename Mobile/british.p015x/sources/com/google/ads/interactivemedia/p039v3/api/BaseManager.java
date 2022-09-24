package com.google.ads.interactivemedia.p039v3.api;

import com.google.ads.interactivemedia.p039v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.player.AdProgressProvider;

/* renamed from: com.google.ads.interactivemedia.v3.api.BaseManager */
/* compiled from: IMASDK */
public interface BaseManager extends AdProgressProvider {
    void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener);

    void addAdEventListener(AdEvent.AdEventListener adEventListener);

    void destroy();

    void focus();

    AdProgressInfo getAdProgressInfo();

    C3759Ad getCurrentAd();

    void init();

    void init(AdsRenderingSettings adsRenderingSettings);

    @Deprecated
    boolean isCustomPlaybackUsed();

    void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener);

    void removeAdEventListener(AdEvent.AdEventListener adEventListener);
}
