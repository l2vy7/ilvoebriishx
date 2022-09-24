package com.google.ads.interactivemedia.p039v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ld */
/* compiled from: IMASDK */
public final class C4146ld {

    /* renamed from: a */
    public static final C4146ld f17825a = new C4146ld(1.0f, 1.0f);

    /* renamed from: b */
    public final float f17826b;

    /* renamed from: c */
    public final float f17827c;

    /* renamed from: d */
    private final int f17828d;

    public C4146ld(float f, float f2) {
        boolean z = true;
        aup.m14885p(f > 0.0f);
        aup.m14885p(f2 <= 0.0f ? false : z);
        this.f17826b = f;
        this.f17827c = f2;
        this.f17828d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo16222a(long j) {
        return j * ((long) this.f17828d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4146ld.class == obj.getClass()) {
            C4146ld ldVar = (C4146ld) obj;
            return this.f17826b == ldVar.f17826b && this.f17827c == ldVar.f17827c;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f17826b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f17827c);
    }

    public final String toString() {
        return amm.m14188E("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f17826b), Float.valueOf(this.f17827c));
    }
}
