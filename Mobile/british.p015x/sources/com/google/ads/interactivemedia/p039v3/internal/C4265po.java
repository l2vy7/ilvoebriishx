package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaCodec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.po */
/* compiled from: IMASDK */
public final class C4265po {

    /* renamed from: a */
    public byte[] f18380a;

    /* renamed from: b */
    public int[] f18381b;

    /* renamed from: c */
    public int[] f18382c;

    /* renamed from: d */
    private final MediaCodec.CryptoInfo f18383d;

    /* renamed from: e */
    private final C4264pn f18384e;

    public C4265po() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18383d = cryptoInfo;
        this.f18384e = amm.f15298a >= 24 ? new C4264pn(cryptoInfo) : null;
    }

    /* renamed from: a */
    public final void mo16516a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f18381b = iArr;
        this.f18382c = iArr2;
        this.f18380a = bArr2;
        MediaCodec.CryptoInfo cryptoInfo = this.f18383d;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (amm.f15298a >= 24) {
            C4264pn pnVar = this.f18384e;
            aup.m14890u(pnVar);
            C4264pn.m18588a(pnVar, i3, i4);
        }
    }

    /* renamed from: b */
    public final MediaCodec.CryptoInfo mo16517b() {
        return this.f18383d;
    }

    /* renamed from: c */
    public final void mo16518c(int i) {
        if (i != 0) {
            if (this.f18381b == null) {
                int[] iArr = new int[1];
                this.f18381b = iArr;
                this.f18383d.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f18381b;
            iArr2[0] = iArr2[0] + i;
        }
    }
}
