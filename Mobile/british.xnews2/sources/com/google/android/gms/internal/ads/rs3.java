package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rs3 {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m37236a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m37242g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m37242g(b3) || m37242g(b4)) {
            throw wp3.m39225d();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m37237b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m37242g(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m37242g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw wp3.m39225d();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m37238c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m37242g(b2)) {
            throw wp3.m39225d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m37239d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ boolean m37240e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ boolean m37241f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    private static boolean m37242g(byte b) {
        return b > -65;
    }
}
