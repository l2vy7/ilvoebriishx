package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pj */
/* compiled from: IMASDK */
final class C4260pj {

    /* renamed from: a */
    private final int f18333a;

    /* renamed from: b */
    private final int f18334b;

    /* renamed from: c */
    private final float f18335c;

    /* renamed from: d */
    private final float f18336d;

    /* renamed from: e */
    private final float f18337e;

    /* renamed from: f */
    private final int f18338f;

    /* renamed from: g */
    private final int f18339g;

    /* renamed from: h */
    private final int f18340h;

    /* renamed from: i */
    private final short[] f18341i;

    /* renamed from: j */
    private short[] f18342j;

    /* renamed from: k */
    private int f18343k;

    /* renamed from: l */
    private short[] f18344l;

    /* renamed from: m */
    private int f18345m;

    /* renamed from: n */
    private short[] f18346n;

    /* renamed from: o */
    private int f18347o;

    /* renamed from: p */
    private int f18348p;

    /* renamed from: q */
    private int f18349q;

    /* renamed from: r */
    private int f18350r;

    /* renamed from: s */
    private int f18351s;

    /* renamed from: t */
    private int f18352t;

    /* renamed from: u */
    private int f18353u;

    /* renamed from: v */
    private int f18354v;

    public C4260pj(int i, int i2, float f, float f2, int i3) {
        this.f18333a = i;
        this.f18334b = i2;
        this.f18335c = f;
        this.f18336d = f2;
        this.f18337e = ((float) i) / ((float) i3);
        this.f18338f = i / 400;
        int i4 = i / 65;
        this.f18339g = i4;
        int i5 = i4 + i4;
        this.f18340h = i5;
        this.f18341i = new short[i5];
        int i6 = i5 * i2;
        this.f18342j = new short[i6];
        this.f18344l = new short[i6];
        this.f18346n = new short[i6];
    }

    /* renamed from: g */
    private final short[] m18547g(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f18334b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: h */
    private final void m18548h(short[] sArr, int i, int i2) {
        short[] g = m18547g(this.f18344l, this.f18345m, i2);
        this.f18344l = g;
        int i3 = this.f18334b;
        System.arraycopy(sArr, i * i3, g, this.f18345m * i3, i3 * i2);
        this.f18345m += i2;
    }

    /* renamed from: i */
    private final void m18549i(short[] sArr, int i, int i2) {
        int i3 = this.f18340h / i2;
        int i4 = this.f18334b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f18341i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private final int m18550j(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f18334b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
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
        this.f18353u = i5 / i7;
        this.f18354v = i8 / i6;
        return i7;
    }

    /* renamed from: k */
    private final void m18551k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f18345m;
        float f = this.f18335c;
        float f2 = this.f18336d;
        float f3 = f / f2;
        float f4 = this.f18337e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f18343k;
            if (i11 >= this.f18340h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f18350r;
                    if (i13 > 0) {
                        int min = Math.min(this.f18340h, i13);
                        m18548h(this.f18342j, i12, min);
                        this.f18350r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f18342j;
                        int i14 = this.f18333a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f18334b == i10 && i15 == i10) {
                            i5 = m18550j(sArr, i12, this.f18338f, this.f18339g);
                        } else {
                            m18549i(sArr, i12, i15);
                            int j = m18550j(this.f18341i, 0, this.f18338f / i15, this.f18339g / i15);
                            if (i15 != i10) {
                                int i16 = j * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f18338f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f18339g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f18334b == i10) {
                                    i5 = m18550j(sArr, i12, i18, i19);
                                } else {
                                    m18549i(sArr, i12, i10);
                                    i5 = m18550j(this.f18341i, 0, i18, i19);
                                }
                            } else {
                                i5 = j;
                            }
                        }
                        int i22 = this.f18353u;
                        int i23 = (i22 == 0 || (i8 = this.f18351s) == 0 || this.f18354v > i22 * 3 || i22 + i22 <= this.f18352t * 3) ? i5 : i8;
                        this.f18352t = i22;
                        this.f18351s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f18342j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f3));
                            } else {
                                this.f18350r = (int) ((((float) i23) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i23;
                            }
                            short[] g = m18547g(this.f18344l, this.f18345m, i7);
                            this.f18344l = g;
                            int i24 = i7;
                            short[] sArr3 = sArr2;
                            m18552l(i7, this.f18334b, g, this.f18345m, sArr3, i12, sArr3, i12 + i23);
                            this.f18345m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f18342j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i25) * f3) / (f5 - f3));
                            } else {
                                this.f18350r = (int) ((((float) i25) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            short[] g2 = m18547g(this.f18344l, this.f18345m, i26);
                            this.f18344l = g2;
                            int i27 = this.f18334b;
                            System.arraycopy(sArr4, i12 * i27, g2, this.f18345m * i27, i27 * i25);
                            m18552l(i6, this.f18334b, this.f18344l, this.f18345m + i25, sArr4, i12 + i25, sArr4, i12);
                            this.f18345m += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f18340h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f18343k - i12;
                short[] sArr5 = this.f18342j;
                int i29 = this.f18334b;
                System.arraycopy(sArr5, i12 * i29, sArr5, 0, i29 * i28);
                this.f18343k = i28;
                f5 = 1.0f;
            }
        } else {
            m18548h(this.f18342j, 0, this.f18343k);
            this.f18343k = 0;
        }
        if (f4 != f5 && this.f18345m != i9) {
            int i30 = this.f18333a;
            int i31 = (int) (((float) i30) / f4);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f18345m - i9;
            short[] g3 = m18547g(this.f18346n, this.f18347o, i32);
            this.f18346n = g3;
            short[] sArr6 = this.f18344l;
            int i33 = this.f18334b;
            System.arraycopy(sArr6, i9 * i33, g3, this.f18347o * i33, i33 * i32);
            this.f18345m = i9;
            this.f18347o += i32;
            int i34 = 0;
            while (true) {
                i = this.f18347o;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f18348p + 1;
                    i4 = this.f18349q;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    this.f18344l = m18547g(this.f18344l, this.f18345m, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f18334b;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f18344l;
                        int i37 = this.f18345m;
                        short[] sArr8 = this.f18346n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i36];
                        int i39 = this.f18349q;
                        int i40 = this.f18348p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                    this.f18349q++;
                    this.f18345m++;
                }
                this.f18348p = i3;
                if (i3 == i30) {
                    this.f18348p = 0;
                    aup.m14887r(i4 == i31);
                    this.f18349q = 0;
                }
                i34++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f18346n;
                int i44 = this.f18334b;
                System.arraycopy(sArr9, i2 * i44, sArr9, 0, (i - i2) * i44);
                this.f18347o -= i2;
            }
        }
    }

    /* renamed from: l */
    private static void m18552l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: a */
    public final int mo16496a() {
        int i = this.f18343k * this.f18334b;
        return i + i;
    }

    /* renamed from: b */
    public final void mo16497b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f18334b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] g = m18547g(this.f18342j, this.f18343k, i2);
        this.f18342j = g;
        shortBuffer.get(g, this.f18343k * this.f18334b, (i3 + i3) / 2);
        this.f18343k += i2;
        m18551k();
    }

    /* renamed from: c */
    public final void mo16498c(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f18334b, this.f18345m);
        shortBuffer.put(this.f18344l, 0, this.f18334b * min);
        int i = this.f18345m - min;
        this.f18345m = i;
        short[] sArr = this.f18344l;
        int i2 = this.f18334b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: d */
    public final void mo16499d() {
        int i;
        int i2 = this.f18343k;
        float f = this.f18335c;
        float f2 = this.f18336d;
        int i3 = this.f18345m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f18347o)) / (this.f18337e * f2)) + 0.5f));
        short[] sArr = this.f18342j;
        int i4 = this.f18340h;
        this.f18342j = m18547g(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f18340h;
            i = i6 + i6;
            int i7 = this.f18334b;
            if (i5 >= i * i7) {
                break;
            }
            this.f18342j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f18343k += i;
        m18551k();
        if (this.f18345m > i3) {
            this.f18345m = i3;
        }
        this.f18343k = 0;
        this.f18350r = 0;
        this.f18347o = 0;
    }

    /* renamed from: e */
    public final void mo16500e() {
        this.f18343k = 0;
        this.f18345m = 0;
        this.f18347o = 0;
        this.f18348p = 0;
        this.f18349q = 0;
        this.f18350r = 0;
        this.f18351s = 0;
        this.f18352t = 0;
        this.f18353u = 0;
        this.f18354v = 0;
    }

    /* renamed from: f */
    public final int mo16501f() {
        int i = this.f18345m * this.f18334b;
        return i + i;
    }
}
