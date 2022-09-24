package com.google.ads.interactivemedia.p038v3.api;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdEvent */
/* compiled from: IMASDK */
public interface AdEvent {

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener */
    /* compiled from: IMASDK */
    public interface AdEventListener {
        void onAdEvent(AdEvent adEvent);
    }

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType */
    /* compiled from: IMASDK */
    public enum AdEventType {
        ALL_ADS_COMPLETED,
        AD_BREAK_FETCH_ERROR,
        CLICKED,
        COMPLETED,
        CUEPOINTS_CHANGED,
        CONTENT_PAUSE_REQUESTED,
        CONTENT_RESUME_REQUESTED,
        FIRST_QUARTILE,
        LOG,
        AD_BREAK_READY,
        MIDPOINT,
        PAUSED,
        RESUMED,
        SKIPPABLE_STATE_CHANGED,
        SKIPPED,
        STARTED,
        TAPPED,
        ICON_TAPPED,
        ICON_FALLBACK_IMAGE_CLOSED,
        THIRD_QUARTILE,
        LOADED,
        AD_PROGRESS,
        AD_BUFFERING,
        AD_BREAK_STARTED,
        AD_BREAK_ENDED,
        AD_PERIOD_STARTED,
        AD_PERIOD_ENDED
    }

    C3759Ad getAd();

    Map<String, String> getAdData();

    AdEventType getType();
}
