package com.google.ads.interactivemedia.p038v3.api;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdErrorEvent */
/* compiled from: IMASDK */
public interface AdErrorEvent {

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener */
    /* compiled from: IMASDK */
    public interface AdErrorListener {
        void onAdError(AdErrorEvent adErrorEvent);
    }

    AdError getError();

    Object getUserRequestContext();
}
