package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.m7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7931m7 extends du3 {

    /* renamed from: m */
    private Date f35422m;

    /* renamed from: n */
    private Date f35423n;

    /* renamed from: o */
    private long f35424o;

    /* renamed from: p */
    private long f35425p;

    /* renamed from: q */
    private double f35426q = 1.0d;

    /* renamed from: r */
    private float f35427r = 1.0f;

    /* renamed from: s */
    private nu3 f35428s = nu3.f36139j;

    /* renamed from: t */
    private long f35429t;

    public C7931m7() {
        super("mvhd");
    }

    /* renamed from: b */
    public final void mo30505b(ByteBuffer byteBuffer) {
        mo31414g(byteBuffer);
        if (mo31413f() == 1) {
            this.f35422m = iu3.m33450a(C7784i7.m33104f(byteBuffer));
            this.f35423n = iu3.m33450a(C7784i7.m33104f(byteBuffer));
            this.f35424o = C7784i7.m33103e(byteBuffer);
            this.f35425p = C7784i7.m33104f(byteBuffer);
        } else {
            this.f35422m = iu3.m33450a(C7784i7.m33103e(byteBuffer));
            this.f35423n = iu3.m33450a(C7784i7.m33103e(byteBuffer));
            this.f35424o = C7784i7.m33103e(byteBuffer);
            this.f35425p = C7784i7.m33103e(byteBuffer);
        }
        this.f35426q = C7784i7.m33100b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f35427r = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280))))) / 256.0f;
        C7784i7.m33102d(byteBuffer);
        C7784i7.m33103e(byteBuffer);
        C7784i7.m33103e(byteBuffer);
        double b = C7784i7.m33100b(byteBuffer);
        double b2 = C7784i7.m33100b(byteBuffer);
        double a = C7784i7.m33099a(byteBuffer);
        this.f35428s = new nu3(b, b2, C7784i7.m33100b(byteBuffer), C7784i7.m33100b(byteBuffer), a, C7784i7.m33099a(byteBuffer), C7784i7.m33099a(byteBuffer), C7784i7.m33100b(byteBuffer), C7784i7.m33100b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f35429t = C7784i7.m33103e(byteBuffer);
    }

    /* renamed from: h */
    public final long mo33498h() {
        return this.f35425p;
    }

    /* renamed from: i */
    public final long mo33499i() {
        return this.f35424o;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f35422m + ";modificationTime=" + this.f35423n + ";timescale=" + this.f35424o + ";duration=" + this.f35425p + ";rate=" + this.f35426q + ";volume=" + this.f35427r + ";matrix=" + this.f35428s + ";nextTrackId=" + this.f35429t + "]";
    }
}
