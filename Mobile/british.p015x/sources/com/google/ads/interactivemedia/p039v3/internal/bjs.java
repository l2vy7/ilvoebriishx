package com.google.ads.interactivemedia.p039v3.internal;

import com.startapp.C12425x3;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjs */
/* compiled from: IMASDK */
public final class bjs {

    /* renamed from: a */
    int f16484a;

    /* renamed from: b */
    int f16485b;

    /* renamed from: c */
    bju f16486c;

    /* renamed from: d */
    private final byte[] f16487d;

    /* renamed from: e */
    private int f16488e;

    /* renamed from: f */
    private int f16489f;

    /* renamed from: g */
    private int f16490g;

    /* renamed from: h */
    private int f16491h;

    /* renamed from: i */
    private int f16492i;

    /* renamed from: j */
    private int f16493j;

    /* synthetic */ bjs(byte[] bArr) {
        this.f16485b = 100;
    }

    /* synthetic */ bjs(byte[] bArr, int i, int i2) {
        this((byte[]) null);
        this.f16493j = Integer.MAX_VALUE;
        this.f16487d = bArr;
        this.f16488e = i2;
        this.f16490g = 0;
        this.f16491h = 0;
    }

    /* renamed from: I */
    private void m16088I() {
        int i = this.f16488e + this.f16489f;
        this.f16488e = i;
        int i2 = this.f16493j;
        if (i > i2) {
            int i3 = i - i2;
            this.f16489f = i3;
            this.f16488e = i - i3;
            return;
        }
        this.f16489f = 0;
    }

    /* renamed from: a */
    static bjs m16089a(byte[] bArr, int i, int i2, boolean z) {
        bjs bjs = new bjs(bArr, 0, i2);
        try {
            bjs.mo15222C(i2);
            return bjs;
        } catch (bkt e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static int m16090b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m16091c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: A */
    public int mo15220A() throws IOException {
        int i = this.f16490g;
        if (this.f16488e - i >= 4) {
            byte[] bArr = this.f16487d;
            this.f16490g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw bkt.m16348a();
    }

    /* renamed from: B */
    public long mo15221B() throws IOException {
        int i = this.f16490g;
        if (this.f16488e - i >= 8) {
            byte[] bArr = this.f16487d;
            this.f16490g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw bkt.m16348a();
    }

    /* renamed from: C */
    public int mo15222C(int i) throws bkt {
        if (i >= 0) {
            int F = i + mo15225F();
            int i2 = this.f16493j;
            if (F <= i2) {
                this.f16493j = F;
                m16088I();
                return i2;
            }
            throw bkt.m16348a();
        }
        throw bkt.m16349b();
    }

    /* renamed from: D */
    public void mo15223D(int i) {
        this.f16493j = i;
        m16088I();
    }

    /* renamed from: E */
    public boolean mo15224E() throws IOException {
        return this.f16490g == this.f16488e;
    }

    /* renamed from: F */
    public int mo15225F() {
        return this.f16490g;
    }

    /* renamed from: G */
    public byte mo15226G() throws IOException {
        int i = this.f16490g;
        if (i != this.f16488e) {
            byte[] bArr = this.f16487d;
            this.f16490g = i + 1;
            return bArr[i];
        }
        throw bkt.m16348a();
    }

    /* renamed from: H */
    public void mo15227H(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f16488e;
            int i3 = this.f16490g;
            if (i <= i2 - i3) {
                this.f16490g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw bkt.m16349b();
        }
        throw bkt.m16348a();
    }

    /* renamed from: d */
    public int mo15228d() throws IOException {
        if (mo15224E()) {
            this.f16492i = 0;
            return 0;
        }
        int x = mo15248x();
        this.f16492i = x;
        if (bnd.m16788b(x) != 0) {
            return this.f16492i;
        }
        throw bkt.m16351d();
    }

    /* renamed from: e */
    public void mo15229e(int i) throws bkt {
        if (this.f16492i != i) {
            throw bkt.m16352e();
        }
    }

    /* renamed from: f */
    public boolean mo15230f(int i) throws IOException {
        int d;
        int a = bnd.m16787a(i);
        int i2 = 0;
        if (a == 0) {
            if (this.f16488e - this.f16490g >= 10) {
                while (i2 < 10) {
                    byte[] bArr = this.f16487d;
                    int i3 = this.f16490g;
                    this.f16490g = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw bkt.m16350c();
            }
            while (i2 < 10) {
                if (mo15226G() < 0) {
                    i2++;
                }
            }
            throw bkt.m16350c();
            return true;
        } else if (a == 1) {
            mo15227H(8);
            return true;
        } else if (a == 2) {
            mo15227H(mo15248x());
            return true;
        } else if (a == 3) {
            do {
                d = mo15228d();
                if (d == 0 || !mo15230f(d)) {
                    mo15229e(bnd.m16789c(bnd.m16788b(i), 4));
                }
                d = mo15228d();
                break;
            } while (!mo15230f(d));
            mo15229e(bnd.m16789c(bnd.m16788b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                mo15227H(4);
                return true;
            }
            throw bkt.m16353f();
        }
    }

    /* renamed from: g */
    public double mo15231g() throws IOException {
        return Double.longBitsToDouble(mo15221B());
    }

    /* renamed from: h */
    public float mo15232h() throws IOException {
        return Float.intBitsToFloat(mo15220A());
    }

    /* renamed from: i */
    public long mo15233i() throws IOException {
        return mo15249y();
    }

    /* renamed from: j */
    public long mo15234j() throws IOException {
        return mo15249y();
    }

    /* renamed from: k */
    public int mo15235k() throws IOException {
        return mo15248x();
    }

    /* renamed from: l */
    public long mo15236l() throws IOException {
        return mo15221B();
    }

    /* renamed from: m */
    public int mo15237m() throws IOException {
        return mo15220A();
    }

    /* renamed from: n */
    public boolean mo15238n() throws IOException {
        return mo15249y() != 0;
    }

    /* renamed from: o */
    public String mo15239o() throws IOException {
        int x = mo15248x();
        if (x > 0) {
            int i = this.f16488e;
            int i2 = this.f16490g;
            if (x <= i - i2) {
                String str = new String(this.f16487d, i2, x, bkr.f16599a);
                this.f16490g += x;
                return str;
            }
        }
        if (x == 0) {
            return "";
        }
        if (x < 0) {
            throw bkt.m16349b();
        }
        throw bkt.m16348a();
    }

    /* renamed from: p */
    public String mo15240p() throws IOException {
        int x = mo15248x();
        if (x > 0) {
            int i = this.f16488e;
            int i2 = this.f16490g;
            if (x <= i - i2) {
                String e = bna.m16781e(this.f16487d, i2, x);
                this.f16490g += x;
                return e;
            }
        }
        if (x == 0) {
            return "";
        }
        if (x <= 0) {
            throw bkt.m16349b();
        }
        throw bkt.m16348a();
    }

    /* renamed from: q */
    public bjq mo15241q() throws IOException {
        int x = mo15248x();
        if (x > 0) {
            int i = this.f16488e;
            int i2 = this.f16490g;
            if (x <= i - i2) {
                bjq m = bjq.m16050m(this.f16487d, i2, x);
                this.f16490g += x;
                return m;
            }
        }
        if (x == 0) {
            return bjq.f16482b;
        }
        if (x > 0) {
            int i3 = this.f16488e;
            int i4 = this.f16490g;
            if (x <= i3 - i4) {
                int i5 = x + i4;
                this.f16490g = i5;
                return bjq.m16052o(Arrays.copyOfRange(this.f16487d, i4, i5));
            }
        }
        if (x <= 0) {
            throw bkt.m16349b();
        }
        throw bkt.m16348a();
    }

    /* renamed from: r */
    public int mo15242r() throws IOException {
        return mo15248x();
    }

    /* renamed from: s */
    public int mo15243s() throws IOException {
        return mo15248x();
    }

    /* renamed from: t */
    public int mo15244t() throws IOException {
        return mo15220A();
    }

    /* renamed from: u */
    public long mo15245u() throws IOException {
        return mo15221B();
    }

    /* renamed from: v */
    public int mo15246v() throws IOException {
        return m16090b(mo15248x());
    }

    /* renamed from: w */
    public long mo15247w() throws IOException {
        return m16091c(mo15249y());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo15248x() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f16490g
            int r1 = r5.f16488e
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f16487d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f16490g = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f16490g = r1
            return r0
        L_0x006c:
            long r0 = r5.mo15250z()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bjs.mo15248x():int");
    }

    /* renamed from: y */
    public long mo15249y() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f16490g;
        int i2 = this.f16488e;
        if (i2 != i) {
            byte[] bArr = this.f16487d;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f16490g = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ C12425x3.f55111d;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ C12425x3.f55111d);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ C12425x3.f55111d;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f16490g = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f16490g = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f16490g = i4;
                    return j;
                }
                j = (long) b;
                this.f16490g = i4;
                return j;
            }
        }
        return mo15250z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public long mo15250z() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte G = mo15226G();
            j |= ((long) (G & Byte.MAX_VALUE)) << i;
            if ((G & C12425x3.f55111d) == 0) {
                return j;
            }
        }
        throw bkt.m16350c();
    }

    private bjs() {
        this.f16485b = 100;
    }
}
