package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tv */
/* compiled from: IMASDK */
final class C4380tv implements C4377ts {

    /* renamed from: a */
    private final alw f18853a;

    /* renamed from: b */
    private final int f18854b;

    /* renamed from: c */
    private final int f18855c;

    /* renamed from: d */
    private int f18856d;

    /* renamed from: e */
    private int f18857e;

    public C4380tv(C4374tp tpVar) {
        alw alw = tpVar.f18835a;
        this.f18853a = alw;
        alw.mo13951i(12);
        this.f18855c = alw.mo13934C() & 255;
        this.f18854b = alw.mo13934C();
    }

    /* renamed from: a */
    public final int mo16663a() {
        return this.f18854b;
    }

    /* renamed from: b */
    public final int mo16664b() {
        return -1;
    }

    /* renamed from: c */
    public final int mo16665c() {
        int i = this.f18855c;
        if (i == 8) {
            return this.f18853a.mo13957o();
        }
        if (i == 16) {
            return this.f18853a.mo13958p();
        }
        int i2 = this.f18856d;
        this.f18856d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f18857e & 15;
        }
        int o = this.f18853a.mo13957o();
        this.f18857e = o;
        return (o & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
