package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmw */
/* compiled from: IMASDK */
final class bmw {
    bmw() {
    }

    bmw(byte[] bArr) {
        this();
    }

    /* renamed from: a */
    static /* synthetic */ boolean m16753a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    static /* synthetic */ void m16754b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m16755c(byte b) {
        return b < -32;
    }

    /* renamed from: d */
    static /* synthetic */ void m16756d(byte b, byte b2, char[] cArr, int i) throws bkt {
        if (b < -62 || m16767p(b2)) {
            throw bkt.m16355h();
        }
        cArr[i] = (char) (((b & 31) << 6) | m16768q(b2));
    }

    /* renamed from: e */
    static /* synthetic */ boolean m16757e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    static /* synthetic */ void m16758f(byte b, byte b2, byte b3, char[] cArr, int i) throws bkt {
        if (!m16767p(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if ((b != -19 || b2 < -96) && !m16767p(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | (m16768q(b2) << 6) | m16768q(b3));
                return;
            }
        }
        throw bkt.m16355h();
    }

    /* renamed from: g */
    static /* synthetic */ void m16759g(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws bkt {
        if (m16767p(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m16767p(b3) || m16767p(b4)) {
            throw bkt.m16355h();
        }
        int q = ((b & 7) << 18) | (m16768q(b2) << 12) | (m16768q(b3) << 6) | m16768q(b4);
        cArr[i] = (char) ((q >>> 10) + 55232);
        cArr[i + 1] = (char) ((q & 1023) + 56320);
    }

    /* renamed from: i */
    static Object m16760i(bka bka, bln bln, int i) {
        return bka.mo15366b(bln, i);
    }

    /* renamed from: j */
    static void m16761j(Object obj) {
        bke bke = ((bkk) obj).f16592a;
        throw null;
    }

    /* renamed from: k */
    static bke m16762k(Object obj) {
        bkk bkk = (bkk) obj;
        throw null;
    }

    /* renamed from: l */
    static boolean m16763l(bln bln) {
        return bln instanceof bkk;
    }

    /* renamed from: m */
    static Object m16764m() throws IOException {
        throw null;
    }

    /* renamed from: n */
    static void m16765n(Object obj) throws IOException {
        throw null;
    }

    /* renamed from: o */
    static void m16766o(Object obj) throws IOException {
        throw null;
    }

    /* renamed from: p */
    private static boolean m16767p(byte b) {
        return b > -65;
    }

    /* renamed from: q */
    private static int m16768q(byte b) {
        return b & 63;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo15550h(Object obj) {
        m16761j(obj);
        throw null;
    }
}
