package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.x5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9676x5 {

    /* renamed from: a */
    private static final C9692z5 f45994a;

    static {
        C9692z5 z5Var;
        if (!(C9652v5.m44699u() && C9652v5.m44700v()) || C9519g1.m44268a()) {
            z5Var = new C9684y5();
        } else {
            z5Var = new C9468a6();
        }
        f45994a = z5Var;
    }

    /* renamed from: a */
    static int m44822a(CharSequence charSequence) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C9477b6(i2, length2);
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

    /* renamed from: b */
    static int m44823b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f45994a.mo38253b(charSequence, bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m44824c(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m44826e(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: f */
    public static boolean m44827f(byte[] bArr, int i, int i2) {
        return f45994a.mo38668c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m44829h(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m44824c(b);
        }
        if (i3 == 1) {
            return m44833l(b, bArr[i]);
        }
        if (i3 == 2) {
            return m44826e(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    public static boolean m44830i(byte[] bArr) {
        return f45994a.mo38668c(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    static String m44831j(byte[] bArr, int i, int i2) throws C9513f3 {
        return f45994a.mo38254d(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m44833l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
