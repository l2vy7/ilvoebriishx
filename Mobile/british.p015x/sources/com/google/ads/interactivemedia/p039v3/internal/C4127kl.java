package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kl */
/* compiled from: IMASDK */
public final class C4127kl {

    /* renamed from: a */
    public final long f17715a;

    /* renamed from: b */
    public final long f17716b;

    /* renamed from: c */
    public final long f17717c;

    /* renamed from: d */
    public final float f17718d;

    /* renamed from: e */
    public final float f17719e;

    static {
        new C4127kl(C6540C.TIME_UNSET, C6540C.TIME_UNSET, C6540C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
    }

    public C4127kl(long j, long j2, long j3, float f, float f2) {
        this.f17715a = j;
        this.f17716b = j2;
        this.f17717c = j3;
        this.f17718d = f;
        this.f17719e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4127kl)) {
            return false;
        }
        C4127kl klVar = (C4127kl) obj;
        return this.f17715a == klVar.f17715a && this.f17716b == klVar.f17716b && this.f17717c == klVar.f17717c && this.f17718d == klVar.f17718d && this.f17719e == klVar.f17719e;
    }

    public final int hashCode() {
        long j = this.f17715a;
        long j2 = this.f17716b;
        long j3 = this.f17717c;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.f17718d;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f17719e;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }
}
