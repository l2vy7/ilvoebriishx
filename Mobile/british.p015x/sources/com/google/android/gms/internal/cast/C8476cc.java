package com.google.android.gms.internal.cast;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.cast.cc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8476cc extends C8509ec {

    /* renamed from: d */
    private final byte[] f43369d;

    /* renamed from: e */
    private final int f43370e;

    /* renamed from: f */
    private int f43371f;

    C8476cc(byte[] bArr, int i, int i2) {
        super((C8459bc) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f43369d = bArr;
            this.f43371f = 0;
            this.f43370e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo36397E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f43369d, this.f43371f, i2);
            this.f43371f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C8493dc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f43371f), Integer.valueOf(this.f43370e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo36398F(String str) throws IOException {
        int i = this.f43371f;
        try {
            int A = C8509ec.m40797A(str.length() * 3);
            int A2 = C8509ec.m40797A(str.length());
            if (A2 == A) {
                int i2 = i + A2;
                this.f43371f = i2;
                int d = C8612kf.m41107d(str, this.f43369d, i2, this.f43370e - i2);
                this.f43371f = i;
                mo36410r((d - i) - A2);
                this.f43371f = d;
                return;
            }
            mo36410r(C8612kf.m41106c(str));
            byte[] bArr = this.f43369d;
            int i3 = this.f43371f;
            this.f43371f = C8612kf.m41107d(str, bArr, i3, this.f43370e - i3);
        } catch (C8595jf e) {
            this.f43371f = i;
            mo36460d(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C8493dc(e2);
        }
    }

    /* renamed from: g */
    public final void mo36399g(int i, int i2) throws IOException {
        mo36410r((i << 3) | i2);
    }

    /* renamed from: h */
    public final void mo36400h(int i, int i2) throws IOException {
        mo36410r(i << 3);
        mo36409q(i2);
    }

    /* renamed from: i */
    public final void mo36401i(int i, int i2) throws IOException {
        mo36410r(i << 3);
        mo36410r(i2);
    }

    /* renamed from: j */
    public final void mo36402j(int i, int i2) throws IOException {
        mo36410r((i << 3) | 5);
        mo36411s(i2);
    }

    /* renamed from: k */
    public final void mo36403k(int i, long j) throws IOException {
        mo36410r(i << 3);
        mo36412t(j);
    }

    /* renamed from: l */
    public final void mo36404l(int i, long j) throws IOException {
        mo36410r((i << 3) | 1);
        mo36413u(j);
    }

    /* renamed from: m */
    public final void mo36405m(int i, boolean z) throws IOException {
        mo36410r(i << 3);
        mo36408p(z ? (byte) 1 : 0);
    }

    /* renamed from: n */
    public final void mo36406n(int i, String str) throws IOException {
        mo36410r((i << 3) | 2);
        mo36398F(str);
    }

    /* renamed from: o */
    public final void mo36407o(int i, C8796wb wbVar) throws IOException {
        mo36410r((i << 3) | 2);
        mo36410r(wbVar.mo36697c());
        wbVar.mo36737f(this);
    }

    /* renamed from: p */
    public final void mo36408p(byte b) throws IOException {
        try {
            byte[] bArr = this.f43369d;
            int i = this.f43371f;
            this.f43371f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C8493dc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f43371f), Integer.valueOf(this.f43370e), 1}), e);
        }
    }

    /* renamed from: q */
    public final void mo36409q(int i) throws IOException {
        if (i >= 0) {
            mo36410r(i);
        } else {
            mo36412t((long) i);
        }
    }

    /* renamed from: r */
    public final void mo36410r(int i) throws IOException {
        if (C8509ec.f43443c) {
            int i2 = C8640mb.f43715a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f43369d;
            int i3 = this.f43371f;
            this.f43371f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f43369d;
            int i4 = this.f43371f;
            this.f43371f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C8493dc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f43371f), Integer.valueOf(this.f43370e), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo36411s(int i) throws IOException {
        try {
            byte[] bArr = this.f43369d;
            int i2 = this.f43371f;
            int i3 = i2 + 1;
            this.f43371f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f43371f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f43371f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f43371f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8493dc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f43371f), Integer.valueOf(this.f43370e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo36412t(long j) throws IOException {
        if (!C8509ec.f43443c || this.f43370e - this.f43371f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f43369d;
                int i = this.f43371f;
                this.f43371f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f43369d;
                int i2 = this.f43371f;
                this.f43371f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C8493dc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f43371f), Integer.valueOf(this.f43370e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f43369d;
                int i3 = this.f43371f;
                this.f43371f = i3 + 1;
                C8545gf.m40967u(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f43369d;
            int i4 = this.f43371f;
            this.f43371f = i4 + 1;
            C8545gf.m40967u(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: u */
    public final void mo36413u(long j) throws IOException {
        try {
            byte[] bArr = this.f43369d;
            int i = this.f43371f;
            int i2 = i + 1;
            this.f43371f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f43371f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f43371f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f43371f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f43371f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f43371f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f43371f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f43371f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8493dc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f43371f), Integer.valueOf(this.f43370e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo36414v(byte[] bArr, int i, int i2) throws IOException {
        mo36397E(bArr, 0, i2);
    }

    /* renamed from: w */
    public final int mo36415w() {
        return this.f43370e - this.f43371f;
    }
}
