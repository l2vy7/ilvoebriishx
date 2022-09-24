package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bnl */
/* compiled from: IMASDK */
final class bnl {

    /* renamed from: a */
    private final Object f16764a;

    /* renamed from: b */
    private final int f16765b;

    bnl(Object obj) {
        this.f16765b = System.identityHashCode(obj);
        this.f16764a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnl)) {
            return false;
        }
        bnl bnl = (bnl) obj;
        if (this.f16765b == bnl.f16765b && this.f16764a == bnl.f16764a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16765b;
    }
}
