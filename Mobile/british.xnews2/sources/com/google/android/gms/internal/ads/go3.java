package com.google.android.gms.internal.ads;

import com.startapp.C12425x3;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class go3 extends mo3 {

    /* renamed from: f */
    private final byte[] f32379f;

    /* renamed from: g */
    private int f32380g;

    /* renamed from: h */
    private int f32381h;

    /* renamed from: i */
    private int f32382i;

    /* renamed from: j */
    private final int f32383j;

    /* renamed from: k */
    private int f32384k;

    /* renamed from: l */
    private int f32385l = Integer.MAX_VALUE;

    /* synthetic */ go3(byte[] bArr, int i, int i2, boolean z, fo3 fo3) {
        super((lo3) null);
        this.f32379f = bArr;
        this.f32380g = i2 + i;
        this.f32382i = i;
        this.f32383j = i;
    }

    /* renamed from: C */
    private final void m32595C() {
        int i = this.f32380g + this.f32381h;
        this.f32380g = i;
        int i2 = i - this.f32383j;
        int i3 = this.f32385l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f32381h = i4;
            this.f32380g = i - i4;
            return;
        }
        this.f32381h = 0;
    }

    /* renamed from: A */
    public final void mo32174A(int i) throws wp3 {
        if (this.f32384k != i) {
            throw wp3.m39223b();
        }
    }

    /* renamed from: B */
    public final void mo32175B(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f32380g;
            int i3 = this.f32382i;
            if (i <= i2 - i3) {
                this.f32382i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw wp3.m39227f();
        }
        throw wp3.m39230j();
    }

    /* renamed from: D */
    public final byte mo32176D() throws IOException {
        int i = this.f32382i;
        if (i != this.f32380g) {
            byte[] bArr = this.f32379f;
            this.f32382i = i + 1;
            return bArr[i];
        }
        throw wp3.m39230j();
    }

    /* renamed from: E */
    public final int mo32177E() throws IOException {
        int i = this.f32382i;
        if (this.f32380g - i >= 4) {
            byte[] bArr = this.f32379f;
            this.f32382i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw wp3.m39230j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32178F() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f32382i
            int r1 = r5.f32380g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f32379f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f32382i = r3
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
            r5.f32382i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo32181I()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.go3.mo32178F():int");
    }

    /* renamed from: G */
    public final long mo32179G() throws IOException {
        int i = this.f32382i;
        if (this.f32380g - i >= 8) {
            byte[] bArr = this.f32379f;
            this.f32382i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw wp3.m39230j();
    }

    /* renamed from: H */
    public final long mo32180H() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f32382i;
        int i2 = this.f32380g;
        if (i2 != i) {
            byte[] bArr = this.f32379f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f32382i = i3;
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
                                                    this.f32382i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f32382i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f32382i = i4;
                    return j;
                }
                j = (long) b;
                this.f32382i = i4;
                return j;
            }
        }
        return mo32181I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final long mo32181I() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte D = mo32176D();
            j |= ((long) (D & Byte.MAX_VALUE)) << i;
            if ((D & C12425x3.f55111d) == 0) {
                return j;
            }
        }
        throw wp3.m39226e();
    }

    /* renamed from: a */
    public final void mo32182a(int i) {
        this.f32385l = i;
        m32595C();
    }

    /* renamed from: b */
    public final boolean mo32183b() throws IOException {
        return this.f32382i == this.f32380g;
    }

    /* renamed from: c */
    public final boolean mo32184c() throws IOException {
        return mo32180H() != 0;
    }

    /* renamed from: d */
    public final boolean mo32185d(int i) throws IOException {
        int q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f32380g - this.f32382i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f32379f;
                    int i4 = this.f32382i;
                    this.f32382i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw wp3.m39226e();
            }
            while (i3 < 10) {
                if (mo32176D() < 0) {
                    i3++;
                }
            }
            throw wp3.m39226e();
            return true;
        } else if (i2 == 1) {
            mo32175B(8);
            return true;
        } else if (i2 == 2) {
            mo32175B(mo32178F());
            return true;
        } else if (i2 == 3) {
            do {
                q = mo32195q();
                if (q == 0 || !mo32185d(q)) {
                    mo32174A(((i >>> 3) << 3) | 4);
                }
                q = mo32195q();
                break;
            } while (!mo32185d(q));
            mo32174A(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo32175B(4);
                return true;
            }
            throw wp3.m39222a();
        }
    }

    /* renamed from: h */
    public final double mo32186h() throws IOException {
        return Double.longBitsToDouble(mo32179G());
    }

    /* renamed from: i */
    public final float mo32187i() throws IOException {
        return Float.intBitsToFloat(mo32177E());
    }

    /* renamed from: j */
    public final int mo32188j() {
        return this.f32382i - this.f32383j;
    }

    /* renamed from: k */
    public final int mo32189k(int i) throws wp3 {
        if (i >= 0) {
            int i2 = i + (this.f32382i - this.f32383j);
            if (i2 >= 0) {
                int i3 = this.f32385l;
                if (i2 <= i3) {
                    this.f32385l = i2;
                    m32595C();
                    return i3;
                }
                throw wp3.m39230j();
            }
            throw wp3.m39228g();
        }
        throw wp3.m39227f();
    }

    /* renamed from: l */
    public final int mo32190l() throws IOException {
        return mo32178F();
    }

    /* renamed from: m */
    public final int mo32191m() throws IOException {
        return mo32177E();
    }

    /* renamed from: n */
    public final int mo32192n() throws IOException {
        return mo32178F();
    }

    /* renamed from: o */
    public final int mo32193o() throws IOException {
        return mo32177E();
    }

    /* renamed from: p */
    public final int mo32194p() throws IOException {
        return mo3.m34837e(mo32178F());
    }

    /* renamed from: q */
    public final int mo32195q() throws IOException {
        if (mo32183b()) {
            this.f32384k = 0;
            return 0;
        }
        int F = mo32178F();
        this.f32384k = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw wp3.m39224c();
    }

    /* renamed from: r */
    public final int mo32196r() throws IOException {
        return mo32178F();
    }

    /* renamed from: s */
    public final long mo32197s() throws IOException {
        return mo32179G();
    }

    /* renamed from: t */
    public final long mo32198t() throws IOException {
        return mo32180H();
    }

    /* renamed from: u */
    public final long mo32199u() throws IOException {
        return mo32179G();
    }

    /* renamed from: v */
    public final long mo32200v() throws IOException {
        return mo3.m34838f(mo32180H());
    }

    /* renamed from: w */
    public final long mo32201w() throws IOException {
        return mo32180H();
    }

    /* renamed from: x */
    public final eo3 mo32202x() throws IOException {
        int F = mo32178F();
        if (F > 0) {
            int i = this.f32380g;
            int i2 = this.f32382i;
            if (F <= i - i2) {
                eo3 M = eo3.m31874M(this.f32379f, i2, F);
                this.f32382i += F;
                return M;
            }
        }
        if (F == 0) {
            return eo3.f31444c;
        }
        if (F > 0) {
            int i3 = this.f32380g;
            int i4 = this.f32382i;
            if (F <= i3 - i4) {
                int i5 = F + i4;
                this.f32382i = i5;
                return eo3.m31877P(Arrays.copyOfRange(this.f32379f, i4, i5));
            }
        }
        if (F <= 0) {
            throw wp3.m39227f();
        }
        throw wp3.m39230j();
    }

    /* renamed from: y */
    public final String mo32203y() throws IOException {
        int F = mo32178F();
        if (F > 0) {
            int i = this.f32380g;
            int i2 = this.f32382i;
            if (F <= i - i2) {
                String str = new String(this.f32379f, i2, F, up3.f39919b);
                this.f32382i += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F < 0) {
            throw wp3.m39227f();
        }
        throw wp3.m39230j();
    }

    /* renamed from: z */
    public final String mo32204z() throws IOException {
        int F = mo32178F();
        if (F > 0) {
            int i = this.f32380g;
            int i2 = this.f32382i;
            if (F <= i - i2) {
                String h = vs3.m38945h(this.f32379f, i2, F);
                this.f32382i += F;
                return h;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F <= 0) {
            throw wp3.m39227f();
        }
        throw wp3.m39230j();
    }
}
