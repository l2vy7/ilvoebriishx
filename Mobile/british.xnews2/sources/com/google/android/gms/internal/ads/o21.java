package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o21 {

    /* renamed from: a */
    public byte[] f36246a;

    /* renamed from: b */
    public byte[] f36247b;

    /* renamed from: c */
    public int f36248c;

    /* renamed from: d */
    public int[] f36249d;

    /* renamed from: e */
    public int[] f36250e;

    /* renamed from: f */
    public int f36251f;

    /* renamed from: g */
    public int f36252g;

    /* renamed from: h */
    public int f36253h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f36254i;

    /* renamed from: j */
    private final n11 f36255j;

    public o21() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f36254i = cryptoInfo;
        this.f36255j = d13.f20195a >= 24 ? new n11(cryptoInfo, (m01) null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo33827a() {
        return this.f36254i;
    }

    /* renamed from: b */
    public final void mo33828b(int i) {
        if (i != 0) {
            if (this.f36249d == null) {
                int[] iArr = new int[1];
                this.f36249d = iArr;
                this.f36254i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f36249d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public final void mo33829c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f36251f = i;
        this.f36249d = iArr;
        this.f36250e = iArr2;
        this.f36247b = bArr;
        this.f36246a = bArr2;
        this.f36248c = i2;
        this.f36252g = i3;
        this.f36253h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f36254i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (d13.f20195a >= 24) {
            n11 n11 = this.f36255j;
            Objects.requireNonNull(n11);
            n11.m35015a(n11, i3, i4);
        }
    }
}
