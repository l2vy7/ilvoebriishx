package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7645eg {

    /* renamed from: a */
    private final int f31352a;

    /* renamed from: b */
    private final int f31353b;

    /* renamed from: c */
    private final int f31354c;

    /* renamed from: d */
    private final int f31355d;

    /* renamed from: e */
    private final int f31356e;

    /* renamed from: f */
    private final short[] f31357f;

    /* renamed from: g */
    private int f31358g;

    /* renamed from: h */
    private short[] f31359h;

    /* renamed from: i */
    private int f31360i;

    /* renamed from: j */
    private short[] f31361j;

    /* renamed from: k */
    private int f31362k;

    /* renamed from: l */
    private short[] f31363l;

    /* renamed from: m */
    private int f31364m = 0;

    /* renamed from: n */
    private int f31365n = 0;

    /* renamed from: o */
    private float f31366o = 1.0f;

    /* renamed from: p */
    private float f31367p = 1.0f;

    /* renamed from: q */
    private int f31368q;

    /* renamed from: r */
    private int f31369r;

    /* renamed from: s */
    private int f31370s;

    /* renamed from: t */
    private int f31371t;

    /* renamed from: u */
    private int f31372u = 0;

    /* renamed from: v */
    private int f31373v;

    /* renamed from: w */
    private int f31374w;

    /* renamed from: x */
    private int f31375x;

    public C7645eg(int i, int i2) {
        this.f31352a = i;
        this.f31353b = i2;
        this.f31354c = i / 400;
        int i3 = i / 65;
        this.f31355d = i3;
        int i4 = i3 + i3;
        this.f31356e = i4;
        this.f31357f = new short[i4];
        this.f31358g = i4;
        int i5 = i2 * i4;
        this.f31359h = new short[i5];
        this.f31360i = i4;
        this.f31361j = new short[i5];
        this.f31362k = i4;
        this.f31363l = new short[i5];
    }

    /* renamed from: g */
    private final int m31824g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f31353b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f31374w = i5 / i7;
        this.f31375x = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m31825h(short[] sArr, int i, int i2) {
        m31828k(i2);
        int i3 = this.f31353b;
        System.arraycopy(sArr, i * i3, this.f31361j, this.f31369r * i3, i3 * i2);
        this.f31369r += i2;
    }

    /* renamed from: i */
    private final void m31826i(short[] sArr, int i, int i2) {
        int i3 = this.f31356e / i2;
        int i4 = this.f31353b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f31357f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private final void m31827j(int i) {
        int i2 = this.f31368q;
        int i3 = this.f31358g;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f31358g = i4;
            this.f31359h = Arrays.copyOf(this.f31359h, i4 * this.f31353b);
        }
    }

    /* renamed from: k */
    private final void m31828k(int i) {
        int i2 = this.f31369r;
        int i3 = this.f31360i;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f31360i = i4;
            this.f31361j = Arrays.copyOf(this.f31361j, i4 * this.f31353b);
        }
    }

    /* renamed from: l */
    private static void m31829l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: m */
    private final void m31830m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f31369r;
        float f = this.f31366o / this.f31367p;
        double d = (double) f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f31368q;
            if (i11 >= this.f31356e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f31371t;
                    if (i13 > 0) {
                        int min = Math.min(this.f31356e, i13);
                        m31825h(this.f31359h, i12, min);
                        this.f31371t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f31359h;
                        int i14 = this.f31352a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f31353b == i10 && i15 == i10) {
                            i5 = m31824g(sArr, i12, this.f31354c, this.f31355d);
                        } else {
                            m31826i(sArr, i12, i15);
                            int g = m31824g(this.f31357f, 0, this.f31354c / i15, this.f31355d / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f31354c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f31355d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f31353b == i10) {
                                    i5 = m31824g(sArr, i12, i18, i19);
                                } else {
                                    m31826i(sArr, i12, i10);
                                    i5 = m31824g(this.f31357f, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f31374w;
                        int i23 = (i22 == 0 || (i8 = this.f31372u) == 0 || this.f31375x > i22 * 3 || i22 + i22 <= this.f31373v * 3) ? i5 : i8;
                        this.f31373v = i22;
                        this.f31372u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f31359h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f));
                            } else {
                                this.f31371t = (int) ((((float) i23) * (2.0f - f)) / (-1.0f + f));
                                i7 = i23;
                            }
                            m31828k(i7);
                            int i24 = i7;
                            m31829l(i7, this.f31353b, this.f31361j, this.f31369r, sArr2, i12, sArr2, i12 + i23);
                            this.f31369r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f31359h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i25) * f) / (1.0f - f));
                            } else {
                                this.f31371t = (int) ((((float) i25) * ((f + f) - 4.0f)) / (1.0f - f));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            m31828k(i26);
                            int i27 = this.f31353b;
                            System.arraycopy(sArr3, i12 * i27, this.f31361j, this.f31369r * i27, i27 * i25);
                            m31829l(i6, this.f31353b, this.f31361j, this.f31369r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.f31369r += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f31356e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.f31368q - i12;
                short[] sArr4 = this.f31359h;
                int i29 = this.f31353b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f31368q = i28;
            }
        } else {
            m31825h(this.f31359h, 0, this.f31368q);
            this.f31368q = 0;
        }
        float f2 = this.f31367p;
        if (f2 != 1.0f && this.f31369r != i9) {
            int i30 = this.f31352a;
            int i31 = (int) (((float) i30) / f2);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f31369r - i9;
            int i33 = this.f31370s;
            int i34 = this.f31362k;
            if (i33 + i32 > i34) {
                int i35 = i34 + (i34 / 2) + i32;
                this.f31362k = i35;
                this.f31363l = Arrays.copyOf(this.f31363l, i35 * this.f31353b);
            }
            short[] sArr5 = this.f31361j;
            int i36 = this.f31353b;
            System.arraycopy(sArr5, i9 * i36, this.f31363l, this.f31370s * i36, i36 * i32);
            this.f31369r = i9;
            this.f31370s += i32;
            int i37 = 0;
            while (true) {
                i = this.f31370s;
                i2 = i - 1;
                if (i37 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f31364m + 1;
                    i4 = this.f31365n;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    m31828k(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f31353b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f31361j;
                        int i40 = this.f31369r;
                        short[] sArr7 = this.f31363l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f31365n;
                        int i43 = this.f31364m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                    this.f31365n++;
                    this.f31369r++;
                }
                this.f31364m = i3;
                if (i3 == i30) {
                    this.f31364m = 0;
                    C8195tl.m37900e(i4 == i31);
                    this.f31365n = 0;
                }
                i37++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f31363l;
                int i47 = this.f31353b;
                System.arraycopy(sArr8, i2 * i47, sArr8, 0, (i - i2) * i47);
                this.f31370s -= i2;
            }
        }
    }

    /* renamed from: a */
    public final int mo31566a() {
        return this.f31369r;
    }

    /* renamed from: b */
    public final void mo31567b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f31353b, this.f31369r);
        shortBuffer.put(this.f31361j, 0, this.f31353b * min);
        int i = this.f31369r - min;
        this.f31369r = i;
        short[] sArr = this.f31361j;
        int i2 = this.f31353b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void mo31568c() {
        int i;
        int i2 = this.f31368q;
        float f = this.f31366o;
        float f2 = this.f31367p;
        int i3 = this.f31369r + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f31370s)) / f2) + 0.5f));
        int i4 = this.f31356e;
        m31827j(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f31356e;
            i = i6 + i6;
            int i7 = this.f31353b;
            if (i5 >= i * i7) {
                break;
            }
            this.f31359h[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f31368q += i;
        m31830m();
        if (this.f31369r > i3) {
            this.f31369r = i3;
        }
        this.f31368q = 0;
        this.f31371t = 0;
        this.f31370s = 0;
    }

    /* renamed from: d */
    public final void mo31569d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f31353b;
        int i2 = remaining / i;
        int i3 = i * i2;
        m31827j(i2);
        shortBuffer.get(this.f31359h, this.f31368q * this.f31353b, (i3 + i3) / 2);
        this.f31368q += i2;
        m31830m();
    }

    /* renamed from: e */
    public final void mo31570e(float f) {
        this.f31367p = f;
    }

    /* renamed from: f */
    public final void mo31571f(float f) {
        this.f31366o = f;
    }
}
