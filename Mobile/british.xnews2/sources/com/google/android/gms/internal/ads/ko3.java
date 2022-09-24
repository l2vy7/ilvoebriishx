package com.google.android.gms.internal.ads;

import com.startapp.C12425x3;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ko3 extends mo3 {

    /* renamed from: f */
    private final InputStream f34384f;

    /* renamed from: g */
    private final byte[] f34385g;

    /* renamed from: h */
    private int f34386h;

    /* renamed from: i */
    private int f34387i;

    /* renamed from: j */
    private int f34388j;

    /* renamed from: k */
    private int f34389k;

    /* renamed from: l */
    private int f34390l;

    /* renamed from: m */
    private int f34391m = Integer.MAX_VALUE;

    /* synthetic */ ko3(InputStream inputStream, int i, jo3 jo3) {
        super((lo3) null);
        up3.m38380f(inputStream, "input");
        this.f34384f = inputStream;
        this.f34385g = new byte[4096];
        this.f34386h = 0;
        this.f34388j = 0;
        this.f34390l = 0;
    }

    /* renamed from: C */
    private final List<byte[]> m33999C(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f34384f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f34390l += read;
                    i2 += read;
                } else {
                    throw wp3.m39230j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: D */
    private final void m34000D() {
        int i = this.f34386h + this.f34387i;
        this.f34386h = i;
        int i2 = this.f34390l + i;
        int i3 = this.f34391m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f34387i = i4;
            this.f34386h = i - i4;
            return;
        }
        this.f34387i = 0;
    }

    /* renamed from: E */
    private final void m34001E(int i) throws IOException {
        if (m34002F(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f34390l) - this.f34388j) {
            throw wp3.m39229i();
        }
        throw wp3.m39230j();
    }

    /* renamed from: F */
    private final boolean m34002F(int i) throws IOException {
        int i2 = this.f34388j;
        int i3 = this.f34386h;
        if (i2 + i > i3) {
            int i4 = this.f34390l;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f34391m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f34385g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f34390l + i2;
                this.f34390l = i4;
                i3 = this.f34386h - i2;
                this.f34386h = i3;
                this.f34388j = 0;
            }
            try {
                int read = this.f34384f.read(this.f34385g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.f34384f.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f34386h += read;
                    m34000D();
                    if (this.f34386h >= i) {
                        return true;
                    }
                    return m34002F(i);
                }
            } catch (wp3 e) {
                e.mo35654k();
                throw e;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: G */
    private final byte[] m34003G(int i, boolean z) throws IOException {
        byte[] H = m34004H(i);
        if (H != null) {
            return H;
        }
        int i2 = this.f34388j;
        int i3 = this.f34386h;
        int i4 = i3 - i2;
        this.f34390l += i3;
        this.f34388j = 0;
        this.f34386h = 0;
        List<byte[]> C = m33999C(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f34385g, i2, bArr, 0, i4);
        for (byte[] next : C) {
            int length = next.length;
            System.arraycopy(next, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: H */
    private final byte[] m34004H(int i) throws IOException {
        if (i == 0) {
            return up3.f39921d;
        }
        if (i >= 0) {
            int i2 = this.f34390l;
            int i3 = this.f34388j;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.f34391m;
                if (i4 <= i5) {
                    int i6 = this.f34386h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f34384f.available()) {
                                return null;
                            }
                        } catch (wp3 e) {
                            e.mo35654k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f34385g, this.f34388j, bArr, 0, i6);
                    this.f34390l += this.f34386h;
                    this.f34388j = 0;
                    this.f34386h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f34384f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f34390l += read;
                                i6 += read;
                            } else {
                                throw wp3.m39230j();
                            }
                        } catch (wp3 e2) {
                            e2.mo35654k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo33121B((i5 - i2) - i3);
                throw wp3.m39230j();
            }
            throw wp3.m39229i();
        }
        throw wp3.m39227f();
    }

    /* renamed from: A */
    public final void mo32174A(int i) throws wp3 {
        if (this.f34389k != i) {
            throw wp3.m39223b();
        }
    }

    /* renamed from: B */
    public final void mo33121B(int i) throws IOException {
        int i2 = this.f34386h;
        int i3 = this.f34388j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f34388j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f34390l;
            int i6 = i5 + i3;
            int i7 = this.f34391m;
            if (i6 + i <= i7) {
                this.f34390l = i6;
                this.f34386h = 0;
                this.f34388j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f34384f.skip(j);
                        if (skip < 0 || skip > j) {
                            String valueOf = String.valueOf(this.f34384f.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (wp3 e) {
                        e.mo35654k();
                        throw e;
                    } catch (Throwable th) {
                        this.f34390l += i4;
                        m34000D();
                        throw th;
                    }
                }
                this.f34390l += i4;
                m34000D();
                if (i4 < i) {
                    int i8 = this.f34386h;
                    int i9 = i8 - this.f34388j;
                    this.f34388j = i8;
                    m34001E(1);
                    while (true) {
                        int i10 = i - i9;
                        int i11 = this.f34386h;
                        if (i10 > i11) {
                            i9 += i11;
                            this.f34388j = i11;
                            m34001E(1);
                        } else {
                            this.f34388j = i10;
                            return;
                        }
                    }
                }
            } else {
                mo33121B((i7 - i5) - i3);
                throw wp3.m39230j();
            }
        } else {
            throw wp3.m39227f();
        }
    }

    /* renamed from: I */
    public final byte mo33122I() throws IOException {
        if (this.f34388j == this.f34386h) {
            m34001E(1);
        }
        byte[] bArr = this.f34385g;
        int i = this.f34388j;
        this.f34388j = i + 1;
        return bArr[i];
    }

    /* renamed from: J */
    public final int mo33123J() throws IOException {
        int i = this.f34388j;
        if (this.f34386h - i < 4) {
            m34001E(4);
            i = this.f34388j;
        }
        byte[] bArr = this.f34385g;
        this.f34388j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo33124K() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f34388j
            int r1 = r5.f34386h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f34385g
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f34388j = r3
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
            r5.f34388j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo33127N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ko3.mo33124K():int");
    }

    /* renamed from: L */
    public final long mo33125L() throws IOException {
        int i = this.f34388j;
        if (this.f34386h - i < 8) {
            m34001E(8);
            i = this.f34388j;
        }
        byte[] bArr = this.f34385g;
        this.f34388j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: M */
    public final long mo33126M() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f34388j;
        int i2 = this.f34386h;
        if (i2 != i) {
            byte[] bArr = this.f34385g;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f34388j = i3;
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
                                                    this.f34388j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f34388j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f34388j = i4;
                    return j;
                }
                j = (long) b;
                this.f34388j = i4;
                return j;
            }
        }
        return mo33127N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final long mo33127N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = mo33122I();
            j |= ((long) (I & Byte.MAX_VALUE)) << i;
            if ((I & C12425x3.f55111d) == 0) {
                return j;
            }
        }
        throw wp3.m39226e();
    }

    /* renamed from: a */
    public final void mo32182a(int i) {
        this.f34391m = i;
        m34000D();
    }

    /* renamed from: b */
    public final boolean mo32183b() throws IOException {
        return this.f34388j == this.f34386h && !m34002F(1);
    }

    /* renamed from: c */
    public final boolean mo32184c() throws IOException {
        return mo33126M() != 0;
    }

    /* renamed from: d */
    public final boolean mo32185d(int i) throws IOException {
        int q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f34386h - this.f34388j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f34385g;
                    int i4 = this.f34388j;
                    this.f34388j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw wp3.m39226e();
            }
            while (i3 < 10) {
                if (mo33122I() < 0) {
                    i3++;
                }
            }
            throw wp3.m39226e();
            return true;
        } else if (i2 == 1) {
            mo33121B(8);
            return true;
        } else if (i2 == 2) {
            mo33121B(mo33124K());
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
                mo33121B(4);
                return true;
            }
            throw wp3.m39222a();
        }
    }

    /* renamed from: h */
    public final double mo32186h() throws IOException {
        return Double.longBitsToDouble(mo33125L());
    }

    /* renamed from: i */
    public final float mo32187i() throws IOException {
        return Float.intBitsToFloat(mo33123J());
    }

    /* renamed from: j */
    public final int mo32188j() {
        return this.f34390l + this.f34388j;
    }

    /* renamed from: k */
    public final int mo32189k(int i) throws wp3 {
        if (i >= 0) {
            int i2 = i + this.f34390l + this.f34388j;
            int i3 = this.f34391m;
            if (i2 <= i3) {
                this.f34391m = i2;
                m34000D();
                return i3;
            }
            throw wp3.m39230j();
        }
        throw wp3.m39227f();
    }

    /* renamed from: l */
    public final int mo32190l() throws IOException {
        return mo33124K();
    }

    /* renamed from: m */
    public final int mo32191m() throws IOException {
        return mo33123J();
    }

    /* renamed from: n */
    public final int mo32192n() throws IOException {
        return mo33124K();
    }

    /* renamed from: o */
    public final int mo32193o() throws IOException {
        return mo33123J();
    }

    /* renamed from: p */
    public final int mo32194p() throws IOException {
        return mo3.m34837e(mo33124K());
    }

    /* renamed from: q */
    public final int mo32195q() throws IOException {
        if (mo32183b()) {
            this.f34389k = 0;
            return 0;
        }
        int K = mo33124K();
        this.f34389k = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw wp3.m39224c();
    }

    /* renamed from: r */
    public final int mo32196r() throws IOException {
        return mo33124K();
    }

    /* renamed from: s */
    public final long mo32197s() throws IOException {
        return mo33125L();
    }

    /* renamed from: t */
    public final long mo32198t() throws IOException {
        return mo33126M();
    }

    /* renamed from: u */
    public final long mo32199u() throws IOException {
        return mo33125L();
    }

    /* renamed from: v */
    public final long mo32200v() throws IOException {
        return mo3.m34838f(mo33126M());
    }

    /* renamed from: w */
    public final long mo32201w() throws IOException {
        return mo33126M();
    }

    /* renamed from: x */
    public final eo3 mo32202x() throws IOException {
        int K = mo33124K();
        int i = this.f34386h;
        int i2 = this.f34388j;
        if (K <= i - i2 && K > 0) {
            eo3 M = eo3.m31874M(this.f34385g, i2, K);
            this.f34388j += K;
            return M;
        } else if (K == 0) {
            return eo3.f31444c;
        } else {
            byte[] H = m34004H(K);
            if (H != null) {
                return eo3.m31873L(H);
            }
            int i3 = this.f34388j;
            int i4 = this.f34386h;
            int i5 = i4 - i3;
            this.f34390l += i4;
            this.f34388j = 0;
            this.f34386h = 0;
            List<byte[]> C = m33999C(K - i5);
            byte[] bArr = new byte[K];
            System.arraycopy(this.f34385g, i3, bArr, 0, i5);
            for (byte[] next : C) {
                int length = next.length;
                System.arraycopy(next, 0, bArr, i5, length);
                i5 += length;
            }
            return eo3.m31877P(bArr);
        }
    }

    /* renamed from: y */
    public final String mo32203y() throws IOException {
        int K = mo33124K();
        if (K > 0) {
            int i = this.f34386h;
            int i2 = this.f34388j;
            if (K <= i - i2) {
                String str = new String(this.f34385g, i2, K, up3.f39919b);
                this.f34388j += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K > this.f34386h) {
            return new String(m34003G(K, false), up3.f39919b);
        }
        m34001E(K);
        String str2 = new String(this.f34385g, this.f34388j, K, up3.f39919b);
        this.f34388j += K;
        return str2;
    }

    /* renamed from: z */
    public final String mo32204z() throws IOException {
        byte[] bArr;
        int K = mo33124K();
        int i = this.f34388j;
        int i2 = this.f34386h;
        if (K <= i2 - i && K > 0) {
            bArr = this.f34385g;
            this.f34388j = i + K;
        } else if (K == 0) {
            return "";
        } else {
            if (K <= i2) {
                m34001E(K);
                bArr = this.f34385g;
                this.f34388j = K;
            } else {
                bArr = m34003G(K, false);
            }
            i = 0;
        }
        return vs3.m38945h(bArr, i, K);
    }
}
