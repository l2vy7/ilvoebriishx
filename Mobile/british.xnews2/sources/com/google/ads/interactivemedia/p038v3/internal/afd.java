package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afd */
/* compiled from: IMASDK */
public final class afd {

    /* renamed from: a */
    final long f14503a;

    /* renamed from: b */
    final long f14504b;

    public afd(long j, long j2) {
        this.f14503a = j;
        this.f14504b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && afd.class == obj.getClass()) {
            afd afd = (afd) obj;
            return this.f14503a == afd.f14503a && this.f14504b == afd.f14504b;
        }
    }

    public final int hashCode() {
        return (((int) this.f14503a) * 31) + ((int) this.f14504b);
    }
}
