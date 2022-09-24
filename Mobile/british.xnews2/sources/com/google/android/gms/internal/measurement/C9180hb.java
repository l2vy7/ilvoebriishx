package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9180hb {
    /* renamed from: a */
    static /* synthetic */ void m42995a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C9085b9 {
        if (m42999e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m42999e(b3) || m42999e(b4)) {
            throw C9085b9.m42685c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* synthetic */ void m42996b(byte b, byte b2, char[] cArr, int i) throws C9085b9 {
        if (b < -62 || m42999e(b2)) {
            throw C9085b9.m42685c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: c */
    static /* synthetic */ void m42997c(byte b, byte b2, byte b3, char[] cArr, int i) throws C9085b9 {
        if (!m42999e(b2)) {
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
            if (!m42999e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C9085b9.m42685c();
    }

    /* renamed from: d */
    static /* synthetic */ boolean m42998d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m42999e(byte b) {
        return b > -65;
    }
}
