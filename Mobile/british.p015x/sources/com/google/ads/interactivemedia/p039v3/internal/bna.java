package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bna */
/* compiled from: IMASDK */
final class bna {

    /* renamed from: a */
    private static final bmx f16721a = new bmy();

    static {
        if (bmv.m16727a() && bmv.m16728b()) {
            int i = bjf.f16467a;
        }
    }

    /* renamed from: a */
    public static boolean m16777a(byte[] bArr) {
        return f16721a.mo15551a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static boolean m16778b(byte[] bArr, int i, int i2) {
        return f16721a.mo15551a(bArr, i, i2);
    }

    /* renamed from: c */
    static int m16779c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new bmz(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static int m16780d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f16721a.mo15553c(charSequence, bArr, i, i2);
    }

    /* renamed from: e */
    static String m16781e(byte[] bArr, int i, int i2) throws bkt {
        return f16721a.mo15552b(bArr, i, i2);
    }

    /* renamed from: f */
    static /* synthetic */ int m16782f(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m16783g(b);
        }
        if (i3 == 1) {
            return m16784h(b, bArr[i]);
        }
        if (i3 == 2) {
            return m16785i(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    private static int m16783g(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: h */
    private static int m16784h(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: i */
    private static int m16785i(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
