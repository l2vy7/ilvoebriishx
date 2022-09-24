package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.vision.v1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
class C9642v1 extends C9661w1 {

    /* renamed from: f */
    protected final byte[] f45905f;

    C9642v1(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f45905f = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo38565A() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo38455c(Charset charset) {
        return new String(this.f45905f, mo38565A(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo38456e(C9560l1 l1Var) throws IOException {
        l1Var.mo38297a(this.f45905f, mo38565A(), size());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9552k1) || size() != ((C9552k1) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C9642v1)) {
            return obj.equals(this);
        }
        C9642v1 v1Var = (C9642v1) obj;
        int v = mo38467v();
        int v2 = v1Var.mo38467v();
        if (v == 0 || v2 == 0 || v == v2) {
            return mo38606z(v1Var, 0, size());
        }
        return false;
    }

    /* renamed from: f */
    public byte mo38458f(int i) {
        return this.f45905f[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public byte mo38459h(int i) {
        return this.f45905f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo38462q(int i, int i2, int i3) {
        return C9662w2.m44749c(i, this.f45905f, mo38565A(), i3);
    }

    public int size() {
        return this.f45905f.length;
    }

    /* renamed from: u */
    public final boolean mo38466u() {
        int A = mo38565A();
        return C9676x5.m44827f(this.f45905f, A, size() + A);
    }

    /* renamed from: x */
    public final C9552k1 mo38468x(int i, int i2) {
        int r = C9552k1.m44406r(0, i2, size());
        if (r == 0) {
            return C9552k1.f45714c;
        }
        return new C9609r1(this.f45905f, mo38565A(), r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo38606z(C9552k1 k1Var, int i, int i2) {
        if (i2 > k1Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > k1Var.size()) {
            int size2 = k1Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(k1Var instanceof C9642v1)) {
            return k1Var.mo38468x(0, i2).equals(mo38468x(0, i2));
        } else {
            C9642v1 v1Var = (C9642v1) k1Var;
            byte[] bArr = this.f45905f;
            byte[] bArr2 = v1Var.f45905f;
            int A = mo38565A() + i2;
            int A2 = mo38565A();
            int A3 = v1Var.mo38565A();
            while (A2 < A) {
                if (bArr[A2] != bArr2[A3]) {
                    return false;
                }
                A2++;
                A3++;
            }
            return true;
        }
    }
}
