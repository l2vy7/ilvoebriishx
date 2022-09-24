package com.google.ads.interactivemedia.p039v3.api;

import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.api.Ad */
/* compiled from: IMASDK */
public interface C3759Ad {
    String getAdId();

    AdPodInfo getAdPodInfo();

    String getAdSystem();

    String[] getAdWrapperCreativeIds();

    String[] getAdWrapperIds();

    String[] getAdWrapperSystems();

    String getAdvertiserName();

    List<CompanionAd> getCompanionAds();

    String getContentType();

    String getCreativeAdId();

    String getCreativeId();

    String getDealId();

    String getDescription();

    double getDuration();

    int getHeight();

    double getSkipTimeOffset();

    String getSurveyUrl();

    String getTitle();

    String getTraffickingParameters();

    Set<UiElement> getUiElements();

    @Deprecated
    String getUniversalAdIdRegistry();

    @Deprecated
    String getUniversalAdIdValue();

    UniversalAdId[] getUniversalAdIds();

    int getVastMediaBitrate();

    int getVastMediaHeight();

    int getVastMediaWidth();

    int getWidth();

    boolean isLinear();

    boolean isSkippable();

    boolean isUiDisabled();
}
