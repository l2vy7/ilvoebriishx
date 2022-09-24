package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class n11 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f35866a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f35867b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ n11(MediaCodec.CryptoInfo cryptoInfo, m01 m01) {
        this.f35866a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m35015a(n11 n11, int i, int i2) {
        n11.f35867b.set(i, i2);
        n11.f35866a.setPattern(n11.f35867b);
    }
}
