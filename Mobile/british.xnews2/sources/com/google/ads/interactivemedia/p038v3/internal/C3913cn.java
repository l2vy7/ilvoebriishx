package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.AdProgressInfo;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cn */
/* compiled from: IMASDK */
public final class C3913cn implements AdProgressInfo {

    /* renamed from: a */
    private final double f16827a;

    /* renamed from: b */
    private final double f16828b;

    /* renamed from: c */
    private final int f16829c;

    /* renamed from: d */
    private final int f16830d;

    /* renamed from: e */
    private final double f16831e;

    /* renamed from: f */
    private final double f16832f;

    C3913cn(double d, double d2, int i, int i2, double d3, double d4) {
        this.f16827a = d;
        this.f16828b = d2;
        this.f16829c = i;
        this.f16830d = i2;
        this.f16831e = d3;
        this.f16832f = d4;
    }

    public final double getAdBreakDuration() {
        return this.f16831e;
    }

    public final double getAdPeriodDuration() {
        return this.f16832f;
    }

    public final int getAdPosition() {
        return this.f16829c;
    }

    public final double getCurrentTime() {
        return this.f16827a;
    }

    public final double getDuration() {
        return this.f16828b;
    }

    public final int getTotalAds() {
        return this.f16830d;
    }
}
