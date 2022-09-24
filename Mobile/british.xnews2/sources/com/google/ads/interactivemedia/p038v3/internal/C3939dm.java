package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.CuePoint;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dm */
/* compiled from: IMASDK */
public final class C3939dm implements CuePoint {

    /* renamed from: a */
    private final double f16932a;

    /* renamed from: b */
    private final double f16933b;

    /* renamed from: c */
    private final boolean f16934c;

    C3939dm(double d, double d2, boolean z) {
        this.f16932a = d;
        this.f16933b = d2;
        this.f16934c = z;
    }

    public final double getEndTime() {
        return this.f16933b;
    }

    public final double getStartTime() {
        return this.f16932a;
    }

    public final boolean isPlayed() {
        return this.f16934c;
    }
}
