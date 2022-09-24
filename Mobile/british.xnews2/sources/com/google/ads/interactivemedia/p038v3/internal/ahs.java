package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahs */
/* compiled from: IMASDK */
public final class ahs {

    /* renamed from: a */
    public final long f14872a;

    /* renamed from: b */
    public final long f14873b;

    public ahs(long j, long j2) {
        this.f14872a = j;
        this.f14873b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahs)) {
            return false;
        }
        ahs ahs = (ahs) obj;
        return this.f14872a == ahs.f14872a && this.f14873b == ahs.f14873b;
    }

    public final int hashCode() {
        return (((int) this.f14872a) * 31) + ((int) this.f14873b);
    }
}
