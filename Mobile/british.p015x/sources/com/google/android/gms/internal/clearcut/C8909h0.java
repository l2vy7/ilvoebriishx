package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.h0 */
class C8909h0 extends C8902g0 {

    /* renamed from: e */
    protected final byte[] f44547e;

    C8909h0(byte[] bArr) {
        this.f44547e = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo36799a(int i, int i2, int i3) {
        return C8910h1.m41834c(i, this.f44547e, mo36871v(), i3);
    }

    /* renamed from: b */
    public final C8847a0 mo36800b(int i, int i2) {
        int h = C8847a0.m41489h(0, i2, size());
        return h == 0 ? C8847a0.f44287c : new C8877d0(this.f44547e, mo36871v(), h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo36801c(Charset charset) {
        return new String(this.f44547e, mo36871v(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo36802e(C9042z zVar) throws IOException {
        zVar.mo37037a(this.f44547e, mo36871v(), size());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8847a0) || size() != ((C8847a0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C8909h0)) {
            return obj.equals(this);
        }
        C8909h0 h0Var = (C8909h0) obj;
        int g = mo36805g();
        int g2 = h0Var.mo36805g();
        if (g == 0 || g2 == 0 || g == g2) {
            return mo36947u(h0Var, 0, size());
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo36804f() {
        int v = mo36871v();
        return C8881d4.m41676i(this.f44547e, v, size() + v);
    }

    /* renamed from: q */
    public byte mo36808q(int i) {
        return this.f44547e[i];
    }

    public int size() {
        return this.f44547e.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo36947u(C8847a0 a0Var, int i, int i2) {
        if (i2 > a0Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > a0Var.size()) {
            int size2 = a0Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(a0Var instanceof C8909h0)) {
            return a0Var.mo36800b(0, i2).equals(mo36800b(0, i2));
        } else {
            C8909h0 h0Var = (C8909h0) a0Var;
            byte[] bArr = this.f44547e;
            byte[] bArr2 = h0Var.f44547e;
            int v = mo36871v() + i2;
            int v2 = mo36871v();
            int v3 = h0Var.mo36871v();
            while (v2 < v) {
                if (bArr[v2] != bArr2[v3]) {
                    return false;
                }
                v2++;
                v3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo36871v() {
        return 0;
    }
}
