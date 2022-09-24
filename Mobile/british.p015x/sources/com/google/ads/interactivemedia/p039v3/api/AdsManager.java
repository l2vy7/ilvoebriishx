package com.google.ads.interactivemedia.p039v3.api;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdsManager */
/* compiled from: IMASDK */
public interface AdsManager extends BaseManager {
    void clicked();

    void discardAdBreak();

    List<Float> getAdCuePoints();

    void pause();

    @Deprecated
    void requestNextAdBreak();

    void resume();

    void skip();

    void start();
}
