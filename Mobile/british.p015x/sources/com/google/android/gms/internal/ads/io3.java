package com.google.android.gms.internal.ads;

import com.startapp.C12425x3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class io3 extends mo3 {

    /* renamed from: f */
    private final Iterable<ByteBuffer> f33379f;

    /* renamed from: g */
    private final Iterator<ByteBuffer> f33380g;

    /* renamed from: h */
    private ByteBuffer f33381h;

    /* renamed from: i */
    private int f33382i;

    /* renamed from: j */
    private int f33383j;

    /* renamed from: k */
    private int f33384k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f33385l;

    /* renamed from: m */
    private int f33386m;

    /* renamed from: n */
    private long f33387n;

    /* renamed from: o */
    private long f33388o;

    /* renamed from: p */
    private long f33389p;

    /* synthetic */ io3(Iterable iterable, int i, boolean z, ho3 ho3) {
        super((lo3) null);
        this.f33382i = i;
        this.f33379f = iterable;
        this.f33380g = iterable.iterator();
        this.f33386m = 0;
        if (i == 0) {
            this.f33381h = up3.f39922e;
            this.f33387n = 0;
            this.f33388o = 0;
            this.f33389p = 0;
            return;
        }
        m33347G();
    }

    /* renamed from: C */
    private final int m33343C() {
        return (int) ((((long) (this.f33382i - this.f33386m)) - this.f33387n) + this.f33388o);
    }

    /* renamed from: D */
    private final void m33344D() throws wp3 {
        if (this.f33380g.hasNext()) {
            m33347G();
            return;
        }
        throw wp3.m39230j();
    }

    /* renamed from: E */
    private final void m33345E(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= m33343C()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.f33389p - this.f33387n == 0) {
                    m33344D();
                }
                int min = Math.min(i3, (int) (this.f33389p - this.f33387n));
                long j = (long) min;
                qs3.m36731w(this.f33387n, bArr, (long) (i2 - i3), j);
                i3 -= min;
                this.f33387n += j;
            }
        } else if (i2 > 0) {
            throw wp3.m39230j();
        }
    }

    /* renamed from: F */
    private final void m33346F() {
        int i = this.f33382i + this.f33383j;
        this.f33382i = i;
        int i2 = this.f33384k;
        if (i > i2) {
            int i3 = i - i2;
            this.f33383j = i3;
            this.f33382i = i - i3;
            return;
        }
        this.f33383j = 0;
    }

    /* renamed from: G */
    private final void m33347G() {
        ByteBuffer next = this.f33380g.next();
        this.f33381h = next;
        this.f33386m += (int) (this.f33387n - this.f33388o);
        long position = (long) next.position();
        this.f33387n = position;
        this.f33388o = position;
        this.f33389p = (long) this.f33381h.limit();
        long m = qs3.m36721m(this.f33381h);
        this.f33387n += m;
        this.f33388o += m;
        this.f33389p += m;
    }

    /* renamed from: A */
    public final void mo32174A(int i) throws wp3 {
        if (this.f33385l != i) {
            throw wp3.m39223b();
        }
    }

    /* renamed from: B */
    public final void mo32734B(int i) throws IOException {
        if (i >= 0 && ((long) i) <= (((long) (this.f33382i - this.f33386m)) - this.f33387n) + this.f33388o) {
            while (i > 0) {
                if (this.f33389p - this.f33387n == 0) {
                    m33344D();
                }
                int min = Math.min(i, (int) (this.f33389p - this.f33387n));
                i -= min;
                this.f33387n += (long) min;
            }
        } else if (i < 0) {
            throw wp3.m39227f();
        } else {
            throw wp3.m39230j();
        }
    }

    /* renamed from: H */
    public final byte mo32735H() throws IOException {
        if (this.f33389p - this.f33387n == 0) {
            m33344D();
        }
        long j = this.f33387n;
        this.f33387n = 1 + j;
        return qs3.m36717i(j);
    }

    /* renamed from: I */
    public final int mo32736I() throws IOException {
        byte H;
        byte H2;
        long j = this.f33389p;
        long j2 = this.f33387n;
        if (j - j2 >= 4) {
            this.f33387n = 4 + j2;
            H = (qs3.m36717i(j2) & 255) | ((qs3.m36717i(1 + j2) & 255) << 8) | ((qs3.m36717i(2 + j2) & 255) << 16);
            H2 = qs3.m36717i(j2 + 3);
        } else {
            H = (mo32735H() & 255) | ((mo32735H() & 255) << 8) | ((mo32735H() & 255) << 16);
            H2 = mo32735H();
        }
        return H | ((H2 & 255) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (com.google.android.gms.internal.ads.qs3.m36717i(r4) >= 0) goto L_0x0089;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32737J() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.f33387n
            long r2 = r10.f33389p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x008c
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.qs3.m36717i(r0)
            if (r0 < 0) goto L_0x001a
            long r4 = r10.f33387n
            long r4 = r4 + r2
            r10.f33387n = r4
            return r0
        L_0x001a:
            long r6 = r10.f33389p
            long r8 = r10.f33387n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0033
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0089
        L_0x0033:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0042
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0040:
            r6 = r4
            goto L_0x0089
        L_0x0042:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0052
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0089
        L_0x0052:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.qs3.m36717i(r4)
            if (r1 < 0) goto L_0x008c
        L_0x0089:
            r10.f33387n = r6
            return r0
        L_0x008c:
            long r0 = r10.mo32740M()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.io3.mo32737J():int");
    }

    /* renamed from: K */
    public final long mo32738K() throws IOException {
        long H;
        byte H2;
        long j = this.f33389p;
        long j2 = this.f33387n;
        if (j - j2 >= 8) {
            this.f33387n = 8 + j2;
            H = (((long) qs3.m36717i(j2)) & 255) | ((((long) qs3.m36717i(1 + j2)) & 255) << 8) | ((((long) qs3.m36717i(2 + j2)) & 255) << 16) | ((((long) qs3.m36717i(3 + j2)) & 255) << 24) | ((((long) qs3.m36717i(4 + j2)) & 255) << 32) | ((((long) qs3.m36717i(5 + j2)) & 255) << 40) | ((((long) qs3.m36717i(6 + j2)) & 255) << 48);
            H2 = qs3.m36717i(j2 + 7);
        } else {
            H = (((long) mo32735H()) & 255) | ((((long) mo32735H()) & 255) << 8) | ((((long) mo32735H()) & 255) << 16) | ((((long) mo32735H()) & 255) << 24) | ((((long) mo32735H()) & 255) << 32) | ((((long) mo32735H()) & 255) << 40) | ((((long) mo32735H()) & 255) << 48);
            H2 = mo32735H();
        }
        return H | ((((long) H2) & 255) << 56);
    }

    /* renamed from: L */
    public final long mo32739L() throws IOException {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f33387n;
        if (this.f33389p != j4) {
            long j5 = j4 + 1;
            byte i = qs3.m36717i(j4);
            if (i >= 0) {
                this.f33387n++;
                return (long) i;
            } else if (this.f33389p - this.f33387n >= 10) {
                long j6 = j5 + 1;
                byte i2 = i ^ (qs3.m36717i(j5) << 7);
                if (i2 < 0) {
                    b = i2 ^ C12425x3.f55111d;
                } else {
                    long j7 = j6 + 1;
                    byte i3 = i2 ^ (qs3.m36717i(j6) << 14);
                    if (i3 >= 0) {
                        j = (long) (i3 ^ C12425x3.f55111d);
                    } else {
                        j6 = j7 + 1;
                        byte i4 = i3 ^ (qs3.m36717i(j7) << 21);
                        if (i4 < 0) {
                            b = i4 ^ C12425x3.f55111d;
                        } else {
                            j7 = j6 + 1;
                            long i5 = ((long) i4) ^ (((long) qs3.m36717i(j6)) << 28);
                            if (i5 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = j7 + 1;
                                long i6 = i5 ^ (((long) qs3.m36717i(j7)) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    i5 = i6 ^ (((long) qs3.m36717i(j8)) << 42);
                                    if (i5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        i6 = i5 ^ (((long) qs3.m36717i(j7)) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            j = (i6 ^ (((long) qs3.m36717i(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) qs3.m36717i(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f33387n = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = i6 ^ j2;
                                j6 = j8;
                                this.f33387n = j6;
                                return j;
                            }
                            j = i5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f33387n = j6;
                    return j;
                }
                j = (long) b;
                this.f33387n = j6;
                return j;
            }
        }
        return mo32740M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final long mo32740M() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte H = mo32735H();
            j |= ((long) (H & Byte.MAX_VALUE)) << i;
            if ((H & C12425x3.f55111d) == 0) {
                return j;
            }
        }
        throw wp3.m39226e();
    }

    /* renamed from: a */
    public final void mo32182a(int i) {
        this.f33384k = i;
        m33346F();
    }

    /* renamed from: b */
    public final boolean mo32183b() throws IOException {
        return (((long) this.f33386m) + this.f33387n) - this.f33388o == ((long) this.f33382i);
    }

    /* renamed from: c */
    public final boolean mo32184c() throws IOException {
        return mo32739L() != 0;
    }

    /* renamed from: d */
    public final boolean mo32185d(int i) throws IOException {
        int q;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (mo32735H() >= 0) {
                    return true;
                }
            }
            throw wp3.m39226e();
        } else if (i2 == 1) {
            mo32734B(8);
            return true;
        } else if (i2 == 2) {
            mo32734B(mo32737J());
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
                mo32734B(4);
                return true;
            }
            throw wp3.m39222a();
        }
    }

    /* renamed from: h */
    public final double mo32186h() throws IOException {
        return Double.longBitsToDouble(mo32738K());
    }

    /* renamed from: i */
    public final float mo32187i() throws IOException {
        return Float.intBitsToFloat(mo32736I());
    }

    /* renamed from: j */
    public final int mo32188j() {
        return (int) ((((long) this.f33386m) + this.f33387n) - this.f33388o);
    }

    /* renamed from: k */
    public final int mo32189k(int i) throws wp3 {
        if (i >= 0) {
            int j = i + mo32188j();
            int i2 = this.f33384k;
            if (j <= i2) {
                this.f33384k = j;
                m33346F();
                return i2;
            }
            throw wp3.m39230j();
        }
        throw wp3.m39227f();
    }

    /* renamed from: l */
    public final int mo32190l() throws IOException {
        return mo32737J();
    }

    /* renamed from: m */
    public final int mo32191m() throws IOException {
        return mo32736I();
    }

    /* renamed from: n */
    public final int mo32192n() throws IOException {
        return mo32737J();
    }

    /* renamed from: o */
    public final int mo32193o() throws IOException {
        return mo32736I();
    }

    /* renamed from: p */
    public final int mo32194p() throws IOException {
        return mo3.m34837e(mo32737J());
    }

    /* renamed from: q */
    public final int mo32195q() throws IOException {
        if (mo32183b()) {
            this.f33385l = 0;
            return 0;
        }
        int J = mo32737J();
        this.f33385l = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw wp3.m39224c();
    }

    /* renamed from: r */
    public final int mo32196r() throws IOException {
        return mo32737J();
    }

    /* renamed from: s */
    public final long mo32197s() throws IOException {
        return mo32738K();
    }

    /* renamed from: t */
    public final long mo32198t() throws IOException {
        return mo32739L();
    }

    /* renamed from: u */
    public final long mo32199u() throws IOException {
        return mo32738K();
    }

    /* renamed from: v */
    public final long mo32200v() throws IOException {
        return mo3.m34838f(mo32739L());
    }

    /* renamed from: w */
    public final long mo32201w() throws IOException {
        return mo32739L();
    }

    /* renamed from: x */
    public final eo3 mo32202x() throws IOException {
        int J = mo32737J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f33389p;
            long j3 = this.f33387n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[J];
                qs3.m36731w(j3, bArr, 0, j);
                this.f33387n += j;
                return eo3.m31877P(bArr);
            }
        }
        if (J > 0 && J <= m33343C()) {
            byte[] bArr2 = new byte[J];
            m33345E(bArr2, 0, J);
            return eo3.m31877P(bArr2);
        } else if (J == 0) {
            return eo3.f31444c;
        } else {
            if (J < 0) {
                throw wp3.m39227f();
            }
            throw wp3.m39230j();
        }
    }

    /* renamed from: y */
    public final String mo32203y() throws IOException {
        int J = mo32737J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f33389p;
            long j3 = this.f33387n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[J];
                qs3.m36731w(j3, bArr, 0, j);
                String str = new String(bArr, up3.f39919b);
                this.f33387n += j;
                return str;
            }
        }
        if (J > 0 && J <= m33343C()) {
            byte[] bArr2 = new byte[J];
            m33345E(bArr2, 0, J);
            return new String(bArr2, up3.f39919b);
        } else if (J == 0) {
            return "";
        } else {
            if (J < 0) {
                throw wp3.m39227f();
            }
            throw wp3.m39230j();
        }
    }

    /* renamed from: z */
    public final String mo32204z() throws IOException {
        int J = mo32737J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f33389p;
            long j3 = this.f33387n;
            if (j <= j2 - j3) {
                String g = vs3.m38944g(this.f33381h, (int) (j3 - this.f33388o), J);
                this.f33387n += j;
                return g;
            }
        }
        if (J >= 0 && J <= m33343C()) {
            byte[] bArr = new byte[J];
            m33345E(bArr, 0, J);
            return vs3.m38945h(bArr, 0, J);
        } else if (J == 0) {
            return "";
        } else {
            if (J <= 0) {
                throw wp3.m39227f();
            }
            throw wp3.m39230j();
        }
    }
}
