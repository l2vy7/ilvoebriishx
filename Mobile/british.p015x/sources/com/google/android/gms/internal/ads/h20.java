package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h20 {

    /* renamed from: d */
    public static final h20 f32588d = new h20(1.0f, 1.0f);

    /* renamed from: e */
    public static final wx3<h20> f32589e = g10.f32094a;

    /* renamed from: a */
    public final float f32590a;

    /* renamed from: b */
    public final float f32591b;

    /* renamed from: c */
    private final int f32592c;

    public h20(float f, float f2) {
        boolean z = true;
        nu1.m20745d(f > 0.0f);
        nu1.m20745d(f2 <= 0.0f ? false : z);
        this.f32590a = f;
        this.f32591b = f2;
        this.f32592c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo32320a(long j) {
        return j * ((long) this.f32592c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h20.class == obj.getClass()) {
            h20 h20 = (h20) obj;
            return this.f32590a == h20.f32590a && this.f32591b == h20.f32591b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f32590a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f32591b);
    }

    public final String toString() {
        return d13.m20302d("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f32590a), Float.valueOf(this.f32591b));
    }
}
