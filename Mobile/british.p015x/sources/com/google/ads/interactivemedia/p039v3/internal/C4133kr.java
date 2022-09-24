package com.google.ads.interactivemedia.p039v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kr */
/* compiled from: IMASDK */
final class C4133kr {

    /* renamed from: a */
    public final abb f17749a;

    /* renamed from: b */
    public final long f17750b;

    /* renamed from: c */
    public final long f17751c;

    /* renamed from: d */
    public final long f17752d;

    /* renamed from: e */
    public final long f17753e;

    /* renamed from: f */
    public final boolean f17754f;

    /* renamed from: g */
    public final boolean f17755g;

    /* renamed from: h */
    public final boolean f17756h;

    C4133kr(abb abb, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f17749a = abb;
        this.f17750b = j;
        this.f17751c = j2;
        this.f17752d = j3;
        this.f17753e = j4;
        this.f17754f = z;
        this.f17755g = z2;
        this.f17756h = z3;
    }

    /* renamed from: a */
    public final C4133kr mo16177a(long j) {
        if (j == this.f17750b) {
            return this;
        }
        return new C4133kr(this.f17749a, j, this.f17751c, this.f17752d, this.f17753e, this.f17754f, this.f17755g, this.f17756h);
    }

    /* renamed from: b */
    public final C4133kr mo16178b(long j) {
        if (j == this.f17751c) {
            return this;
        }
        return new C4133kr(this.f17749a, this.f17750b, j, this.f17752d, this.f17753e, this.f17754f, this.f17755g, this.f17756h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4133kr.class == obj.getClass()) {
            C4133kr krVar = (C4133kr) obj;
            return this.f17750b == krVar.f17750b && this.f17751c == krVar.f17751c && this.f17752d == krVar.f17752d && this.f17753e == krVar.f17753e && this.f17754f == krVar.f17754f && this.f17755g == krVar.f17755g && this.f17756h == krVar.f17756h && amm.m14233c(this.f17749a, krVar.f17749a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f17749a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f17750b)) * 31) + ((int) this.f17751c)) * 31) + ((int) this.f17752d)) * 31) + ((int) this.f17753e)) * 31) + (this.f17754f ? 1 : 0)) * 31) + (this.f17755g ? 1 : 0)) * 31) + (this.f17756h ? 1 : 0);
    }
}
