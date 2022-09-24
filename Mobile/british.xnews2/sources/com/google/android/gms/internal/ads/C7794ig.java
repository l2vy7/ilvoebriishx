package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.ads.ig */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7794ig {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f33236a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f33237b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ C7794ig(MediaCodec.CryptoInfo cryptoInfo, C7756hg hgVar) {
        this.f33236a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m33217a(C7794ig igVar, int i, int i2) {
        igVar.f33237b.set(0, 0);
        igVar.f33236a.setPattern(igVar.f33237b);
    }
}
