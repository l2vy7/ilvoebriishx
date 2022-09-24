package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.d4 */
final class C8881d4 {

    /* renamed from: a */
    private static final C8888e4 f44495a = (C8859b4.m41584x() && C8859b4.m41585y() ? new C8913h4() : new C8899f4());

    /* renamed from: a */
    static int m41668a(CharSequence charSequence) {
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
                                throw new C8906g4(i2, length2);
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
    static int m41669b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f44495a.mo36886b(charSequence, bArr, i, i2);
    }

    /* renamed from: c */
    static void m41670c(CharSequence charSequence, ByteBuffer byteBuffer) {
        C8888e4 e4Var = f44495a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m41669b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            e4Var.mo36887c(charSequence, byteBuffer);
        } else {
            C8888e4.m41743d(charSequence, byteBuffer);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m41671d(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m41673f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: h */
    public static boolean m41675h(byte[] bArr) {
        return f44495a.mo36888e(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static boolean m41676i(byte[] bArr, int i, int i2) {
        return f44495a.mo36888e(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m41677j(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m41671d(b);
        }
        if (i3 == 1) {
            return m41679l(b, bArr[i]);
        }
        if (i3 == 2) {
            return m41673f(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m41679l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
