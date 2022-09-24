package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class ao3 extends zn3 {

    /* renamed from: f */
    protected final byte[] f29707f;

    ao3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f29707f = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo30448A(Charset charset) {
        return new String(this.f29707f, mo30453S(), mo30457q(), charset);
    }

    /* renamed from: D */
    public final ByteBuffer mo30449D() {
        return ByteBuffer.wrap(this.f29707f, mo30453S(), mo30457q()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo30450E(rn3 rn3) throws IOException {
        ((oo3) rn3).mo33959E(this.f29707f, mo30453S(), mo30457q());
    }

    /* renamed from: F */
    public final boolean mo30451F() {
        int S = mo30453S();
        return vs3.m38947j(this.f29707f, S, mo30457q() + S);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo30452Q(eo3 eo3, int i, int i2) {
        if (i2 <= eo3.mo30457q()) {
            int i3 = i + i2;
            if (i3 > eo3.mo30457q()) {
                int q = eo3.mo30457q();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(q);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(eo3 instanceof ao3)) {
                return eo3.mo30461y(i, i3).equals(mo30461y(0, i2));
            } else {
                ao3 ao3 = (ao3) eo3;
                byte[] bArr = this.f29707f;
                byte[] bArr2 = ao3.f29707f;
                int S = mo30453S() + i2;
                int S2 = mo30453S();
                int S3 = ao3.mo30453S() + i;
                while (S2 < S) {
                    if (bArr[S2] != bArr2[S3]) {
                        return false;
                    }
                    S2++;
                    S3++;
                }
                return true;
            }
        } else {
            int q2 = mo30457q();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(q2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public int mo30453S() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eo3) || mo30457q() != ((eo3) obj).mo30457q()) {
            return false;
        }
        if (mo30457q() == 0) {
            return true;
        }
        if (!(obj instanceof ao3)) {
            return obj.equals(this);
        }
        ao3 ao3 = (ao3) obj;
        int H = mo31611H();
        int H2 = ao3.mo31611H();
        if (H == 0 || H2 == 0 || H == H2) {
            return mo30452Q(ao3, 0, mo30457q());
        }
        return false;
    }

    /* renamed from: h */
    public byte mo30455h(int i) {
        return this.f29707f[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte mo30456i(int i) {
        return this.f29707f[i];
    }

    /* renamed from: q */
    public int mo30457q() {
        return this.f29707f.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo30458r(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f29707f, i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo30459v(int i, int i2, int i3) {
        return up3.m38378d(i, this.f29707f, mo30453S() + i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo30460x(int i, int i2, int i3) {
        int S = mo30453S() + i2;
        return vs3.m38943f(i, this.f29707f, S, i3 + S);
    }

    /* renamed from: y */
    public final eo3 mo30461y(int i, int i2) {
        int G = eo3.m31870G(i, i2, mo30457q());
        if (G == 0) {
            return eo3.f31444c;
        }
        return new wn3(this.f29707f, mo30453S() + i, G);
    }

    /* renamed from: z */
    public final mo3 mo30462z() {
        return mo3.m34839g(this.f29707f, mo30453S(), mo30457q(), true);
    }
}
