package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.i7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7784i7 {
    /* renamed from: a */
    public static double m33099a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    /* renamed from: b */
    public static double m33100b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 65536.0d;
    }

    /* renamed from: c */
    public static int m33101c(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: d */
    public static int m33102d(ByteBuffer byteBuffer) {
        return (m33101c(byteBuffer.get()) << 8) + m33101c(byteBuffer.get());
    }

    /* renamed from: e */
    public static long m33103e(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* renamed from: f */
    public static long m33104f(ByteBuffer byteBuffer) {
        long e = m33103e(byteBuffer) << 32;
        if (e >= 0) {
            return e + m33103e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
