package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.android.gms.internal.ads.te */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8188te {

    /* renamed from: d */
    public static final C8188te f39400d = new C8188te(1.0f, 1.0f);

    /* renamed from: a */
    public final float f39401a;

    /* renamed from: b */
    public final float f39402b = 1.0f;

    /* renamed from: c */
    private final int f39403c;

    public C8188te(float f, float f2) {
        this.f39401a = f;
        this.f39403c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo34941a(long j) {
        return j * ((long) this.f39403c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8188te.class == obj.getClass() && this.f39401a == ((C8188te) obj).f39401a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f39401a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
