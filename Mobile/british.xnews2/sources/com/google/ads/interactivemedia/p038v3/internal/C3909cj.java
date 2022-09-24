package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.AdError;
import com.google.ads.interactivemedia.p038v3.api.AdErrorEvent;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cj */
/* compiled from: IMASDK */
public final class C3909cj implements AdErrorEvent {

    /* renamed from: a */
    private final AdError f16819a;

    /* renamed from: b */
    private final Object f16820b;

    C3909cj(AdError adError) {
        this.f16819a = adError;
        this.f16820b = null;
    }

    C3909cj(AdError adError, Object obj) {
        this.f16819a = adError;
        this.f16820b = obj;
    }

    public final AdError getError() {
        return this.f16819a;
    }

    public final Object getUserRequestContext() {
        return this.f16820b;
    }
}
