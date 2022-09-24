package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aca */
/* compiled from: IMASDK */
final class aca {

    /* renamed from: a */
    public final long f14117a;

    /* renamed from: b */
    public final long f14118b;

    /* renamed from: c */
    public boolean f14119c;

    /* renamed from: d */
    public ais f14120d;

    /* renamed from: e */
    public aca f14121e;

    public aca(long j) {
        this.f14117a = j;
        this.f14118b = j + 65536;
    }

    /* renamed from: a */
    public final int mo13380a(long j) {
        long j2 = this.f14117a;
        int i = this.f14120d.f15014b;
        return (int) (j - j2);
    }

    /* renamed from: b */
    public final aca mo13381b() {
        this.f14120d = null;
        aca aca = this.f14121e;
        this.f14121e = null;
        return aca;
    }
}
