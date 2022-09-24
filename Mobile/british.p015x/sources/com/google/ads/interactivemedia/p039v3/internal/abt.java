package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abt */
/* compiled from: IMASDK */
final class abt {

    /* renamed from: a */
    public final int f14048a;

    /* renamed from: b */
    public final boolean f14049b;

    public abt(int i, boolean z) {
        this.f14048a = i;
        this.f14049b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abt.class == obj.getClass()) {
            abt abt = (abt) obj;
            return this.f14048a == abt.f14048a && this.f14049b == abt.f14049b;
        }
    }

    public final int hashCode() {
        return (this.f14048a * 31) + (this.f14049b ? 1 : 0);
    }
}
