package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oo3 extends ro3 {

    /* renamed from: d */
    private final byte[] f36564d;

    /* renamed from: e */
    private final int f36565e;

    /* renamed from: f */
    private int f36566f;

    oo3(byte[] bArr, int i, int i2) {
        super((qo3) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f36564d = bArr;
            this.f36566f = 0;
            this.f36565e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo33959E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f36564d, this.f36566f, i2);
            this.f36566f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new po3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36566f), Integer.valueOf(this.f36565e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo33960F(String str) throws IOException {
        int i = this.f36566f;
        try {
            int a = ro3.m37151a(str.length() * 3);
            int a2 = ro3.m37151a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f36566f = i2;
                int d = vs3.m38941d(str, this.f36564d, i2, this.f36565e - i2);
                this.f36566f = i;
                mo33975u((d - i) - a2);
                this.f36566f = d;
                return;
            }
            mo33975u(vs3.m38942e(str));
            byte[] bArr = this.f36564d;
            int i3 = this.f36566f;
            this.f36566f = vs3.m38941d(str, bArr, i3, this.f36565e - i3);
        } catch (us3 e) {
            this.f36566f = i;
            mo34578e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new po3(e2);
        }
    }

    /* renamed from: g */
    public final int mo33961g() {
        return this.f36565e - this.f36566f;
    }

    /* renamed from: h */
    public final void mo33962h(byte b) throws IOException {
        try {
            byte[] bArr = this.f36564d;
            int i = this.f36566f;
            this.f36566f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new po3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36566f), Integer.valueOf(this.f36565e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo33963i(int i, boolean z) throws IOException {
        mo33975u(i << 3);
        mo33962h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo33964j(int i, eo3 eo3) throws IOException {
        mo33975u((i << 3) | 2);
        mo33975u(eo3.mo30457q());
        eo3.mo30450E(this);
    }

    /* renamed from: k */
    public final void mo33965k(int i, int i2) throws IOException {
        mo33975u((i << 3) | 5);
        mo33966l(i2);
    }

    /* renamed from: l */
    public final void mo33966l(int i) throws IOException {
        try {
            byte[] bArr = this.f36564d;
            int i2 = this.f36566f;
            int i3 = i2 + 1;
            this.f36566f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f36566f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f36566f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f36566f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new po3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36566f), Integer.valueOf(this.f36565e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo33967m(int i, long j) throws IOException {
        mo33975u((i << 3) | 1);
        mo33968n(j);
    }

    /* renamed from: n */
    public final void mo33968n(long j) throws IOException {
        try {
            byte[] bArr = this.f36564d;
            int i = this.f36566f;
            int i2 = i + 1;
            this.f36566f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f36566f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f36566f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f36566f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f36566f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f36566f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f36566f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f36566f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new po3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36566f), Integer.valueOf(this.f36565e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo33969o(int i, int i2) throws IOException {
        mo33975u(i << 3);
        mo33970p(i2);
    }

    /* renamed from: p */
    public final void mo33970p(int i) throws IOException {
        if (i >= 0) {
            mo33975u(i);
        } else {
            mo33977w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo33971q(byte[] bArr, int i, int i2) throws IOException {
        mo33959E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo33972r(int i, String str) throws IOException {
        mo33975u((i << 3) | 2);
        mo33960F(str);
    }

    /* renamed from: s */
    public final void mo33973s(int i, int i2) throws IOException {
        mo33975u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo33974t(int i, int i2) throws IOException {
        mo33975u(i << 3);
        mo33975u(i2);
    }

    /* renamed from: u */
    public final void mo33975u(int i) throws IOException {
        if (ro3.f38747c) {
            int i2 = nn3.f36061a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f36564d;
            int i3 = this.f36566f;
            this.f36566f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f36564d;
            int i4 = this.f36566f;
            this.f36566f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new po3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36566f), Integer.valueOf(this.f36565e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo33976v(int i, long j) throws IOException {
        mo33975u(i << 3);
        mo33977w(j);
    }

    /* renamed from: w */
    public final void mo33977w(long j) throws IOException {
        if (!ro3.f38747c || this.f36565e - this.f36566f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f36564d;
                int i = this.f36566f;
                this.f36566f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f36564d;
                int i2 = this.f36566f;
                this.f36566f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new po3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36566f), Integer.valueOf(this.f36565e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f36564d;
                int i3 = this.f36566f;
                this.f36566f = i3 + 1;
                qs3.m36733y(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f36564d;
            int i4 = this.f36566f;
            this.f36566f = i4 + 1;
            qs3.m36733y(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
