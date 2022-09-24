package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pu */
/* compiled from: IMASDK */
public final class C4271pu {

    /* renamed from: a */
    public final int f18407a = 0;

    /* renamed from: b */
    public final int f18408b;

    /* renamed from: c */
    public final int f18409c;

    static {
        new C4271pu(0, 0);
    }

    public C4271pu(int i, int i2) {
        this.f18408b = i;
        this.f18409c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4271pu)) {
            return false;
        }
        C4271pu puVar = (C4271pu) obj;
        int i = puVar.f18407a;
        return this.f18408b == puVar.f18408b && this.f18409c == puVar.f18409c;
    }

    public final int hashCode() {
        return ((this.f18408b + 16337) * 31) + this.f18409c;
    }
}
