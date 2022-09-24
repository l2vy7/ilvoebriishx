package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.AdsManager;
import com.google.ads.interactivemedia.p038v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p038v3.api.StreamManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cw */
/* compiled from: IMASDK */
public final class C3922cw implements AdsManagerLoadedEvent {

    /* renamed from: a */
    private final AdsManager f16864a;

    /* renamed from: b */
    private final StreamManager f16865b;

    /* renamed from: c */
    private final Object f16866c;

    C3922cw(AdsManager adsManager, Object obj) {
        this.f16864a = adsManager;
        this.f16865b = null;
        this.f16866c = obj;
    }

    C3922cw(StreamManager streamManager, Object obj) {
        this.f16864a = null;
        this.f16865b = streamManager;
        this.f16866c = obj;
    }

    public final AdsManager getAdsManager() {
        return this.f16864a;
    }

    public final StreamManager getStreamManager() {
        return this.f16865b;
    }

    public final Object getUserRequestContext() {
        return this.f16866c;
    }
}
