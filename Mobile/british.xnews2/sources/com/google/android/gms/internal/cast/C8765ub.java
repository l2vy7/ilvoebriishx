package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.ub */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
class C8765ub extends C8750tb {

    /* renamed from: f */
    protected final byte[] f44122f;

    C8765ub(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f44122f = bArr;
    }

    /* renamed from: a */
    public byte mo36695a(int i) {
        return this.f44122f[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte mo36696b(int i) {
        return this.f44122f[i];
    }

    /* renamed from: c */
    public int mo36697c() {
        return this.f44122f.length;
    }

    /* renamed from: e */
    public final C8796wb mo36735e(int i, int i2) {
        C8796wb.m41384v(0, i2, mo36697c());
        if (i2 == 0) {
            return C8796wb.f44177c;
        }
        return new C8719rb(this.f44122f, 0, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8796wb) || mo36697c() != ((C8796wb) obj).mo36697c()) {
            return false;
        }
        if (mo36697c() == 0) {
            return true;
        }
        if (!(obj instanceof C8765ub)) {
            return obj.equals(this);
        }
        C8765ub ubVar = (C8765ub) obj;
        int u = mo36762u();
        int u2 = ubVar.mo36762u();
        if (u != 0 && u2 != 0 && u != u2) {
            return false;
        }
        int c = mo36697c();
        if (c > ubVar.mo36697c()) {
            int c2 = mo36697c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(c);
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        } else if (c <= ubVar.mo36697c()) {
            byte[] bArr = this.f44122f;
            byte[] bArr2 = ubVar.f44122f;
            ubVar.mo36698x();
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
            int c3 = ubVar.mo36697c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(c);
            sb2.append(", ");
            sb2.append(c3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo36737f(C8656nb nbVar) throws IOException {
        ((C8476cc) nbVar).mo36397E(this.f44122f, 0, mo36697c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo36738g(Charset charset) {
        return new String(this.f44122f, 0, mo36697c(), charset);
    }

    /* renamed from: j */
    public final boolean mo36739j() {
        return C8612kf.m41105b(this.f44122f, 0, mo36697c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo36740q(int i, int i2, int i3) {
        return C8443ad.m40696h(i, this.f44122f, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo36698x() {
        return 0;
    }
}
