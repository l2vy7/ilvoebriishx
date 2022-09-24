package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaCodec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pn */
/* compiled from: IMASDK */
final class C4264pn {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f18378a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f18379b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ C4264pn(MediaCodec.CryptoInfo cryptoInfo) {
        this.f18378a = cryptoInfo;
    }

    /* renamed from: a */
    static /* synthetic */ void m18588a(C4264pn pnVar, int i, int i2) {
        pnVar.f18379b.set(i, i2);
        pnVar.f18378a.setPattern(pnVar.f18379b);
    }
}
