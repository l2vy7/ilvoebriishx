package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjo */
/* compiled from: IMASDK */
class bjo extends bjn {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    protected final byte[] f16480a;

    bjo(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f16480a = bArr;
    }

    /* renamed from: a */
    public byte mo15199a(int i) {
        return this.f16480a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public byte mo15200b(int i) {
        return this.f16480a[i];
    }

    /* renamed from: c */
    public int mo15201c() {
        return this.f16480a.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo15202d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15203e(byte[] bArr, int i) {
        System.arraycopy(this.f16480a, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjq) || mo15201c() != ((bjq) obj).mo15201c()) {
            return false;
        }
        if (mo15201c() == 0) {
            return true;
        }
        if (!(obj instanceof bjo)) {
            return obj.equals(this);
        }
        bjo bjo = (bjo) obj;
        int s = mo15218s();
        int s2 = bjo.mo15218s();
        if (s != 0 && s2 != 0 && s != s2) {
            return false;
        }
        int c = mo15201c();
        if (c > bjo.mo15201c()) {
            int c2 = mo15201c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(c);
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        } else if (c <= bjo.mo15201c()) {
            byte[] bArr = this.f16480a;
            byte[] bArr2 = bjo.f16480a;
            bjo.mo15202d();
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
            int c3 = bjo.mo15201c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(0);
            sb2.append(", ");
            sb2.append(c);
            sb2.append(", ");
            sb2.append(c3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo15207f(Charset charset) {
        return new String(this.f16480a, 0, mo15201c(), charset);
    }

    /* renamed from: g */
    public final boolean mo15208g() {
        return bna.m16778b(this.f16480a, 0, mo15201c());
    }

    /* renamed from: h */
    public final bjs mo15209h() {
        return bjs.m16089a(this.f16480a, 0, mo15201c(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo15210i(int i, int i2) {
        return bkr.m16343f(i, this.f16480a, 0, i2);
    }

    /* renamed from: j */
    public final bjq mo15211j(int i) {
        int t = bjq.m16054t(0, i, mo15201c());
        if (t == 0) {
            return bjq.f16482b;
        }
        return new bjk(this.f16480a, 0, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo15212k(bjr bjr) throws IOException {
        ((bjw) bjr).mo15313aq(this.f16480a, 0, mo15201c());
    }
}
