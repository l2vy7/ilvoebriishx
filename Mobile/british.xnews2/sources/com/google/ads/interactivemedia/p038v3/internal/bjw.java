package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjw */
/* compiled from: IMASDK */
public final class bjw extends bjr {

    /* renamed from: b */
    private static final Logger f16500b = Logger.getLogger(bjw.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f16501c = bmv.m16727a();

    /* renamed from: a */
    bjx f16502a;

    /* renamed from: d */
    private final byte[] f16503d;

    /* renamed from: e */
    private final int f16504e;

    /* renamed from: f */
    private int f16505f;

    private bjw() {
    }

    /* synthetic */ bjw(byte[] bArr) {
    }

    bjw(byte[] bArr, int i) {
        this((byte[]) null);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.f16503d = bArr;
            this.f16505f = 0;
            this.f16504e = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    /* renamed from: A */
    public static int m16173A(int i, int i2) {
        return m16181I(i) + m16184L(i2);
    }

    /* renamed from: B */
    public static int m16174B(int i, long j) {
        return m16181I(i) + m16185M(j);
    }

    /* renamed from: C */
    public static int m16175C(int i, long j) {
        return m16181I(i) + m16185M(j);
    }

    /* renamed from: D */
    public static int m16176D(int i, long j) {
        return m16181I(i) + m16186N(j);
    }

    /* renamed from: E */
    public static int m16177E(int i, int i2) {
        return m16181I(i) + m16182J(i2);
    }

    /* renamed from: F */
    public static int m16178F(int i, String str) {
        return m16181I(i) + m16187O(str);
    }

    /* renamed from: G */
    public static int m16179G(int i, bjq bjq) {
        return m16181I(i) + m16189Q(bjq);
    }

    /* renamed from: H */
    public static int m16180H(int i, bkw bkw) {
        return m16181I(i) + m16188P(bkw);
    }

    /* renamed from: I */
    public static int m16181I(int i) {
        return m16183K(bnd.m16789c(i, 0));
    }

    /* renamed from: J */
    public static int m16182J(int i) {
        if (i >= 0) {
            return m16183K(i);
        }
        return 10;
    }

    /* renamed from: K */
    public static int m16183K(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: L */
    public static int m16184L(int i) {
        return m16183K(m16192T(i));
    }

    /* renamed from: M */
    public static int m16185M(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: N */
    public static int m16186N(long j) {
        return m16185M(m16193U(j));
    }

    /* renamed from: O */
    public static int m16187O(String str) {
        int i;
        try {
            i = bna.m16779c(str);
        } catch (bmz unused) {
            i = str.getBytes(bkr.f16599a).length;
        }
        return m16191S(i);
    }

    /* renamed from: P */
    public static int m16188P(bkw bkw) {
        return m16191S(bkw.mo15410b());
    }

    /* renamed from: Q */
    public static int m16189Q(bjq bjq) {
        return m16191S(bjq.mo15201c());
    }

    /* renamed from: R */
    static int m16190R(bln bln, bly bly) {
        bjc bjc = (bjc) bln;
        int ah = bjc.mo15167ah();
        if (ah == -1) {
            ah = bly.mo15451e(bjc);
            bjc.mo15168ai(ah);
        }
        return m16191S(ah);
    }

    /* renamed from: S */
    static int m16191S(int i) {
        return m16183K(i) + i;
    }

    /* renamed from: T */
    public static int m16192T(int i) {
        return (i >> 31) ^ (i + i);
    }

    /* renamed from: U */
    public static long m16193U(long j) {
        return (j >> 63) ^ (j + j);
    }

    @Deprecated
    /* renamed from: Y */
    static int m16194Y(int i, bln bln, bly bly) {
        int I = m16181I(i);
        int i2 = I + I;
        bjc bjc = (bjc) bln;
        int ah = bjc.mo15167ah();
        if (ah == -1) {
            ah = bly.mo15451e(bjc);
            bjc.mo15168ai(ah);
        }
        return i2 + ah;
    }

    /* renamed from: aA */
    public static int m16196aA(int i) {
        return m16181I(i) + 8;
    }

    /* renamed from: au */
    public static int m16197au(int i) {
        return m16181I(i) + 1;
    }

    /* renamed from: av */
    public static int m16198av(int i) {
        return m16181I(i) + 8;
    }

    /* renamed from: aw */
    public static int m16199aw(int i) {
        return m16181I(i) + 4;
    }

    /* renamed from: ax */
    public static int m16200ax(int i) {
        return m16181I(i) + 8;
    }

    /* renamed from: ay */
    public static int m16201ay(int i) {
        return m16181I(i) + 4;
    }

    /* renamed from: az */
    public static int m16202az(int i) {
        return m16181I(i) + 4;
    }

    /* renamed from: t */
    public static bjw m16203t(byte[] bArr) {
        return new bjw(bArr, bArr.length);
    }

    /* renamed from: y */
    public static int m16204y(int i, int i2) {
        return m16181I(i) + m16182J(i2);
    }

    /* renamed from: z */
    public static int m16205z(int i, int i2) {
        return m16181I(i) + m16183K(i2);
    }

    /* renamed from: V */
    public final void mo15294V() {
        if (mo15316at() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final void mo15295W(String str, bmz bmz) throws IOException {
        f16500b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", bmz);
        byte[] bytes = str.getBytes(bkr.f16599a);
        try {
            int length = bytes.length;
            mo15309am(length);
            mo15314ar(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new bjv(e);
        } catch (bjv e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: X */
    public final void mo15296X(bln bln) throws IOException {
        bln.mo15171aW(this);
    }

    /* renamed from: aa */
    public void mo15297aa(int i, int i2) throws IOException {
        mo15309am(bnd.m16789c(i, i2));
    }

    /* renamed from: ab */
    public void mo15298ab(int i, int i2) throws IOException {
        mo15297aa(i, 0);
        mo15308al(i2);
    }

    /* renamed from: ac */
    public void mo15299ac(int i, int i2) throws IOException {
        mo15297aa(i, 0);
        mo15309am(i2);
    }

    /* renamed from: ad */
    public void mo15300ad(int i, int i2) throws IOException {
        mo15297aa(i, 5);
        mo15310an(i2);
    }

    /* renamed from: ae */
    public void mo15301ae(int i, long j) throws IOException {
        mo15297aa(i, 0);
        mo15311ao(j);
    }

    /* renamed from: af */
    public void mo15302af(int i, long j) throws IOException {
        mo15297aa(i, 1);
        mo15312ap(j);
    }

    /* renamed from: ag */
    public void mo15303ag(int i, boolean z) throws IOException {
        mo15297aa(i, 0);
        mo15307ak(z ? (byte) 1 : 0);
    }

    /* renamed from: ah */
    public void mo15304ah(int i, String str) throws IOException {
        mo15297aa(i, 2);
        mo15315as(str);
    }

    /* renamed from: ai */
    public void mo15305ai(int i, bjq bjq) throws IOException {
        mo15297aa(i, 2);
        mo15309am(bjq.mo15201c());
        bjq.mo15212k(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aj */
    public void mo15306aj(int i, bln bln, bly bly) throws IOException {
        mo15297aa(i, 2);
        bjc bjc = (bjc) bln;
        int ah = bjc.mo15167ah();
        if (ah == -1) {
            ah = bly.mo15451e(bjc);
            bjc.mo15168ai(ah);
        }
        mo15309am(ah);
        bly.mo15452f(bln, this.f16502a);
    }

    /* renamed from: ak */
    public void mo15307ak(byte b) throws IOException {
        try {
            byte[] bArr = this.f16503d;
            int i = this.f16505f;
            this.f16505f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new bjv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16505f), Integer.valueOf(this.f16504e), 1}), e);
        }
    }

    /* renamed from: al */
    public void mo15308al(int i) throws IOException {
        if (i >= 0) {
            mo15309am(i);
        } else {
            mo15311ao((long) i);
        }
    }

    /* renamed from: am */
    public void mo15309am(int i) throws IOException {
        if (f16501c) {
            int i2 = bjf.f16467a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f16503d;
            int i3 = this.f16505f;
            this.f16505f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f16503d;
            int i4 = this.f16505f;
            this.f16505f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new bjv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16505f), Integer.valueOf(this.f16504e), 1}), e);
        }
    }

    /* renamed from: an */
    public void mo15310an(int i) throws IOException {
        try {
            byte[] bArr = this.f16503d;
            int i2 = this.f16505f;
            int i3 = i2 + 1;
            this.f16505f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f16505f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f16505f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f16505f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new bjv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16505f), Integer.valueOf(this.f16504e), 1}), e);
        }
    }

    /* renamed from: ao */
    public void mo15311ao(long j) throws IOException {
        if (!f16501c || mo15316at() < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f16503d;
                int i = this.f16505f;
                this.f16505f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f16503d;
                int i2 = this.f16505f;
                this.f16505f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new bjv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16505f), Integer.valueOf(this.f16504e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f16503d;
                int i3 = this.f16505f;
                this.f16505f = i3 + 1;
                bmv.m16742p(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f16503d;
            int i4 = this.f16505f;
            this.f16505f = i4 + 1;
            bmv.m16742p(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: ap */
    public void mo15312ap(long j) throws IOException {
        try {
            byte[] bArr = this.f16503d;
            int i = this.f16505f;
            int i2 = i + 1;
            this.f16505f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f16505f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f16505f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f16505f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f16505f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f16505f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f16505f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f16505f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new bjv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16505f), Integer.valueOf(this.f16504e), 1}), e);
        }
    }

    /* renamed from: aq */
    public void mo15313aq(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f16503d, this.f16505f, i2);
            this.f16505f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new bjv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f16505f), Integer.valueOf(this.f16504e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: ar */
    public void mo15314ar(byte[] bArr, int i, int i2) throws IOException {
        mo15313aq(bArr, 0, i2);
    }

    /* renamed from: as */
    public void mo15315as(String str) throws IOException {
        int i = this.f16505f;
        try {
            int K = m16183K(str.length() * 3);
            int K2 = m16183K(str.length());
            if (K2 == K) {
                int i2 = i + K2;
                this.f16505f = i2;
                int d = bna.m16780d(str, this.f16503d, i2, mo15316at());
                this.f16505f = i;
                mo15309am((d - i) - K2);
                this.f16505f = d;
                return;
            }
            mo15309am(bna.m16779c(str));
            this.f16505f = bna.m16780d(str, this.f16503d, this.f16505f, mo15316at());
        } catch (bmz e) {
            this.f16505f = i;
            mo15295W(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new bjv(e2);
        }
    }

    /* renamed from: at */
    public int mo15316at() {
        return this.f16504e - this.f16505f;
    }

    /* renamed from: u */
    public final void mo15317u(int i, int i2) throws IOException {
        mo15299ac(i, m16192T(i2));
    }

    /* renamed from: v */
    public final void mo15318v(int i, long j) throws IOException {
        mo15301ae(i, m16193U(j));
    }

    /* renamed from: w */
    public final void mo15319w(int i, float f) throws IOException {
        mo15300ad(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: x */
    public final void mo15320x(int i, double d) throws IOException {
        mo15302af(i, Double.doubleToRawLongBits(d));
    }
}
