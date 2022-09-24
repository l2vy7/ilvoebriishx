package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nf */
/* compiled from: IMASDK */
public final class C4202nf {

    /* renamed from: a */
    public final long f18055a;

    /* renamed from: b */
    public final C4171mb f18056b;

    /* renamed from: c */
    public final int f18057c;

    /* renamed from: d */
    public final abb f18058d;

    /* renamed from: e */
    public final long f18059e;

    /* renamed from: f */
    public final C4171mb f18060f;

    /* renamed from: g */
    public final int f18061g;

    /* renamed from: h */
    public final abb f18062h;

    /* renamed from: i */
    public final long f18063i;

    /* renamed from: j */
    public final long f18064j;

    public C4202nf(long j, C4171mb mbVar, int i, abb abb, long j2, C4171mb mbVar2, int i2, abb abb2, long j3, long j4) {
        this.f18055a = j;
        this.f18056b = mbVar;
        this.f18057c = i;
        this.f18058d = abb;
        this.f18059e = j2;
        this.f18060f = mbVar2;
        this.f18061g = i2;
        this.f18062h = abb2;
        this.f18063i = j3;
        this.f18064j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4202nf.class == obj.getClass()) {
            C4202nf nfVar = (C4202nf) obj;
            return this.f18055a == nfVar.f18055a && this.f18057c == nfVar.f18057c && this.f18059e == nfVar.f18059e && this.f18061g == nfVar.f18061g && this.f18063i == nfVar.f18063i && this.f18064j == nfVar.f18064j && arq.m14618b(this.f18056b, nfVar.f18056b) && arq.m14618b(this.f18058d, nfVar.f18058d) && arq.m14618b(this.f18060f, nfVar.f18060f) && arq.m14618b(this.f18062h, nfVar.f18062h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18055a), this.f18056b, Integer.valueOf(this.f18057c), this.f18058d, Long.valueOf(this.f18059e), this.f18060f, Integer.valueOf(this.f18061g), this.f18062h, Long.valueOf(this.f18063i), Long.valueOf(this.f18064j)});
    }
}
