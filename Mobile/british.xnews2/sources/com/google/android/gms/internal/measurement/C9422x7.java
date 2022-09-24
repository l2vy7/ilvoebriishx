package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9422x7 extends C9452z7 {

    /* renamed from: d */
    private final byte[] f45512d;

    /* renamed from: e */
    private final int f45513e;

    /* renamed from: f */
    private int f45514f;

    C9422x7(byte[] bArr, int i, int i2) {
        super((C9407w7) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f45512d = bArr;
            this.f45514f = 0;
            this.f45513e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo38148E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f45512d, this.f45514f, i2);
            this.f45514f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C9437y7(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45514f), Integer.valueOf(this.f45513e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo38149F(String str) throws IOException {
        int i = this.f45514f;
        try {
            int a = C9452z7.m43944a(str.length() * 3);
            int a2 = C9452z7.m43944a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f45514f = i2;
                int b = C9240lb.m43185b(str, this.f45512d, i2, this.f45513e - i2);
                this.f45514f = i;
                mo38164u((b - i) - a2);
                this.f45514f = b;
                return;
            }
            mo38164u(C9240lb.m43186c(str));
            byte[] bArr = this.f45512d;
            int i3 = this.f45514f;
            this.f45514f = C9240lb.m43185b(str, bArr, i3, this.f45513e - i3);
        } catch (C9225kb e) {
            this.f45514f = i;
            mo38221e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C9437y7(e2);
        }
    }

    /* renamed from: g */
    public final int mo38150g() {
        return this.f45513e - this.f45514f;
    }

    /* renamed from: h */
    public final void mo38151h(byte b) throws IOException {
        try {
            byte[] bArr = this.f45512d;
            int i = this.f45514f;
            this.f45514f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C9437y7(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45514f), Integer.valueOf(this.f45513e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo38152i(int i, boolean z) throws IOException {
        mo38164u(i << 3);
        mo38151h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo38153j(int i, C9329r7 r7Var) throws IOException {
        mo38164u((i << 3) | 2);
        mo38164u(r7Var.mo37731c());
        r7Var.mo37927h(this);
    }

    /* renamed from: k */
    public final void mo38154k(int i, int i2) throws IOException {
        mo38164u((i << 3) | 5);
        mo38155l(i2);
    }

    /* renamed from: l */
    public final void mo38155l(int i) throws IOException {
        try {
            byte[] bArr = this.f45512d;
            int i2 = this.f45514f;
            int i3 = i2 + 1;
            this.f45514f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f45514f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f45514f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f45514f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C9437y7(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45514f), Integer.valueOf(this.f45513e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo38156m(int i, long j) throws IOException {
        mo38164u((i << 3) | 1);
        mo38157n(j);
    }

    /* renamed from: n */
    public final void mo38157n(long j) throws IOException {
        try {
            byte[] bArr = this.f45512d;
            int i = this.f45514f;
            int i2 = i + 1;
            this.f45514f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f45514f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f45514f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f45514f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f45514f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f45514f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f45514f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f45514f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C9437y7(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45514f), Integer.valueOf(this.f45513e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo38158o(int i, int i2) throws IOException {
        mo38164u(i << 3);
        mo38159p(i2);
    }

    /* renamed from: p */
    public final void mo38159p(int i) throws IOException {
        if (i >= 0) {
            mo38164u(i);
        } else {
            mo38166w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo38160q(byte[] bArr, int i, int i2) throws IOException {
        mo38148E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo38161r(int i, String str) throws IOException {
        mo38164u((i << 3) | 2);
        mo38149F(str);
    }

    /* renamed from: s */
    public final void mo38162s(int i, int i2) throws IOException {
        mo38164u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo38163t(int i, int i2) throws IOException {
        mo38164u(i << 3);
        mo38164u(i2);
    }

    /* renamed from: u */
    public final void mo38164u(int i) throws IOException {
        if (C9452z7.f45540c) {
            int i2 = C9115d7.f44952a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f45512d;
            int i3 = this.f45514f;
            this.f45514f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f45512d;
            int i4 = this.f45514f;
            this.f45514f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C9437y7(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45514f), Integer.valueOf(this.f45513e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo38165v(int i, long j) throws IOException {
        mo38164u(i << 3);
        mo38166w(j);
    }

    /* renamed from: w */
    public final void mo38166w(long j) throws IOException {
        if (!C9452z7.f45540c || this.f45513e - this.f45514f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f45512d;
                int i = this.f45514f;
                this.f45514f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f45512d;
                int i2 = this.f45514f;
                this.f45514f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C9437y7(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45514f), Integer.valueOf(this.f45513e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f45512d;
                int i3 = this.f45514f;
                this.f45514f = i3 + 1;
                C9165gb.m42963s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f45512d;
            int i4 = this.f45514f;
            this.f45514f = i4 + 1;
            C9165gb.m42963s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
