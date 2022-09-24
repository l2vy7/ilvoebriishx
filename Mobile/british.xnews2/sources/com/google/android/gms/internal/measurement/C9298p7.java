package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
class C9298p7 extends C9283o7 {

    /* renamed from: f */
    protected final byte[] f45362f;

    C9298p7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f45362f = bArr;
    }

    /* renamed from: a */
    public byte mo37729a(int i) {
        return this.f45362f[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte mo37730b(int i) {
        return this.f45362f[i];
    }

    /* renamed from: c */
    public int mo37731c() {
        return this.f45362f.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo37923e(int i, int i2, int i3) {
        return C9453z8.m43973d(i, this.f45362f, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9329r7) || mo37731c() != ((C9329r7) obj).mo37731c()) {
            return false;
        }
        if (mo37731c() == 0) {
            return true;
        }
        if (!(obj instanceof C9298p7)) {
            return obj.equals(this);
        }
        C9298p7 p7Var = (C9298p7) obj;
        int r = mo37987r();
        int r2 = p7Var.mo37987r();
        if (r != 0 && r2 != 0 && r != r2) {
            return false;
        }
        int c = mo37731c();
        if (c > p7Var.mo37731c()) {
            int c2 = mo37731c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(c);
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        } else if (c <= p7Var.mo37731c()) {
            byte[] bArr = this.f45362f;
            byte[] bArr2 = p7Var.f45362f;
            p7Var.mo37732x();
            int i = 0;
            int i2 = 0;
            while (i < c) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int c3 = p7Var.mo37731c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(c);
            sb2.append(", ");
            sb2.append(c3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: f */
    public final C9329r7 mo37925f(int i, int i2) {
        int q = C9329r7.m43543q(0, i2, mo37731c());
        if (q == 0) {
            return C9329r7.f45419c;
        }
        return new C9252m7(this.f45362f, 0, q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo37926g(Charset charset) {
        return new String(this.f45362f, 0, mo37731c(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo37927h(C9176h7 h7Var) throws IOException {
        ((C9422x7) h7Var).mo38148E(this.f45362f, 0, mo37731c());
    }

    /* renamed from: j */
    public final boolean mo37928j() {
        return C9240lb.m43189f(this.f45362f, 0, mo37731c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo37732x() {
        return 0;
    }
}
