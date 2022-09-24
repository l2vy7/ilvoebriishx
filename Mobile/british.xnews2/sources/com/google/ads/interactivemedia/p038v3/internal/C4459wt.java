package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wt */
/* compiled from: IMASDK */
final class C4459wt extends C4299qv {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4459wt(amk amk, long j, long j2) {
        super(new C4294qq(), new C4450wk(amk), j, j + 1, 0, j2, 188, 1000);
        amk amk2 = amk;
    }

    /* renamed from: h */
    static /* synthetic */ int m19394h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4459wt(amk amk, long j, long j2, int i, int i2) {
        super(new C4294qq(), new C4458ws(i, amk, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES), j, j + 1, 0, j2, 188, 940);
        amk amk2 = amk;
    }
}
