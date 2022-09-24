package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmy */
/* compiled from: IMASDK */
final class bmy extends bmx {
    bmy() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo15552b(byte[] bArr, int i, int i2) throws bkt {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte b = bArr[r12];
                if (!bmw.m16753a(b)) {
                    break;
                }
                i = r12 + 1;
                bmw.m16754b(b, cArr, i3);
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (bmw.m16753a(b2)) {
                    int i7 = i3 + 1;
                    bmw.m16754b(b2, cArr, i3);
                    r12 = i6;
                    while (true) {
                        i3 = i7;
                        if (r12 >= i4) {
                            break;
                        }
                        byte b3 = bArr[r12];
                        if (!bmw.m16753a(b3)) {
                            break;
                        }
                        r12++;
                        i7 = i3 + 1;
                        bmw.m16754b(b3, cArr, i3);
                    }
                } else if (bmw.m16755c(b2)) {
                    if (i6 < i4) {
                        bmw.m16756d(b2, bArr[i6], cArr, i3);
                        r12 = i6 + 1;
                        i3++;
                    } else {
                        throw bkt.m16355h();
                    }
                } else if (bmw.m16757e(b2)) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        bmw.m16758f(b2, bArr[i6], bArr[i8], cArr, i3);
                        r12 = i8 + 1;
                        i3++;
                    } else {
                        throw bkt.m16355h();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    bmw.m16759g(b2, bArr[i6], bArr[i9], bArr[i10], cArr, i3);
                    i3 += 2;
                    r12 = i10 + 1;
                } else {
                    throw bkt.m16355h();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo15553c(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new bmz(i7 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new bmz(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo15554d(byte[] bArr, int i, int i2) {
        while (r9 < i2 && bArr[r9] >= 0) {
            i = r9 + 1;
        }
        if (r9 >= i2) {
            return 0;
        }
        while (r9 < i2) {
            int i3 = r9 + 1;
            byte b = bArr[r9];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        r9 = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return bna.m16782f(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        r9 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                } else if (i3 >= i2 - 2) {
                    return bna.m16782f(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            r9 = i3;
        }
        return 0;
    }
}
