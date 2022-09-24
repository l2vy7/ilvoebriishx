package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.jg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7830jg {

    /* renamed from: a */
    public byte[] f33869a;

    /* renamed from: b */
    public byte[] f33870b;

    /* renamed from: c */
    public int f33871c;

    /* renamed from: d */
    public int[] f33872d;

    /* renamed from: e */
    public int[] f33873e;

    /* renamed from: f */
    public int f33874f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f33875g;

    /* renamed from: h */
    private final C7794ig f33876h;

    public C7830jg() {
        int i = C7836jm.f33934a;
        C7794ig igVar = null;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f33875g = cryptoInfo;
        this.f33876h = i >= 24 ? new C7794ig(cryptoInfo, (C7756hg) null) : igVar;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo32884a() {
        return this.f33875g;
    }

    /* renamed from: b */
    public final void mo32885b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f33874f = i;
        this.f33872d = iArr;
        this.f33873e = iArr2;
        this.f33870b = bArr;
        this.f33869a = bArr2;
        this.f33871c = 1;
        int i3 = C7836jm.f33934a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f33875g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                C7794ig.m33217a(this.f33876h, 0, 0);
            }
        }
    }
}
