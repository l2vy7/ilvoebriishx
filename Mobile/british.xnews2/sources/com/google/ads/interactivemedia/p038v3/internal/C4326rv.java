package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rv */
/* compiled from: IMASDK */
public final class C4326rv {

    /* renamed from: a */
    public final int f18541a;

    /* renamed from: b */
    public final byte[] f18542b;

    /* renamed from: c */
    public final int f18543c;

    /* renamed from: d */
    public final int f18544d;

    public C4326rv(int i, byte[] bArr, int i2, int i3) {
        this.f18541a = i;
        this.f18542b = bArr;
        this.f18543c = i2;
        this.f18544d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4326rv.class == obj.getClass()) {
            C4326rv rvVar = (C4326rv) obj;
            return this.f18541a == rvVar.f18541a && this.f18543c == rvVar.f18543c && this.f18544d == rvVar.f18544d && Arrays.equals(this.f18542b, rvVar.f18542b);
        }
    }

    public final int hashCode() {
        return (((((this.f18541a * 31) + Arrays.hashCode(this.f18542b)) * 31) + this.f18543c) * 31) + this.f18544d;
    }
}
