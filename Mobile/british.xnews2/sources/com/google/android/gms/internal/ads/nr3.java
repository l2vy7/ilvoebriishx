package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nr3 extends eo3 {

    /* renamed from: k */
    static final int[] f36099k = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: f */
    private final int f36100f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final eo3 f36101g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final eo3 f36102h;

    /* renamed from: i */
    private final int f36103i;

    /* renamed from: j */
    private final int f36104j;

    private nr3(eo3 eo3, eo3 eo32) {
        this.f36101g = eo3;
        this.f36102h = eo32;
        int q = eo3.mo30457q();
        this.f36103i = q;
        this.f36100f = q + eo32.mo30457q();
        this.f36104j = Math.max(eo3.mo31619t(), eo32.mo31619t()) + 1;
    }

    /* renamed from: S */
    static eo3 m35267S(eo3 eo3, eo3 eo32) {
        if (eo32.mo30457q() == 0) {
            return eo3;
        }
        if (eo3.mo30457q() == 0) {
            return eo32;
        }
        int q = eo3.mo30457q() + eo32.mo30457q();
        if (q < 128) {
            return m35268U(eo3, eo32);
        }
        if (eo3 instanceof nr3) {
            nr3 nr3 = (nr3) eo3;
            if (nr3.f36102h.mo30457q() + eo32.mo30457q() < 128) {
                return new nr3(nr3.f36101g, m35268U(nr3.f36102h, eo32));
            } else if (nr3.f36101g.mo31619t() > nr3.f36102h.mo31619t() && nr3.f36104j > eo32.mo31619t()) {
                return new nr3(nr3.f36101g, new nr3(nr3.f36102h, eo32));
            }
        }
        if (q >= m35269V(Math.max(eo3.mo31619t(), eo32.mo31619t()) + 1)) {
            return new nr3(eo3, eo32);
        }
        return jr3.m33739a(new jr3((ir3) null), eo3, eo32);
    }

    /* renamed from: U */
    private static eo3 m35268U(eo3 eo3, eo3 eo32) {
        int q = eo3.mo30457q();
        int q2 = eo32.mo30457q();
        byte[] bArr = new byte[(q + q2)];
        eo3.mo31614c(bArr, 0, 0, q);
        eo32.mo31614c(bArr, 0, q, q2);
        return new ao3(bArr);
    }

    /* renamed from: V */
    static int m35269V(int i) {
        int[] iArr = f36099k;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo30448A(Charset charset) {
        return new String(mo31616f(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo30450E(rn3 rn3) throws IOException {
        this.f36101g.mo30450E(rn3);
        this.f36102h.mo30450E(rn3);
    }

    /* renamed from: F */
    public final boolean mo30451F() {
        int x = this.f36101g.mo30460x(0, 0, this.f36103i);
        eo3 eo3 = this.f36102h;
        if (eo3.mo30460x(x, 0, eo3.mo30457q()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final xn3 mo31612I() {
        return new hr3(this);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eo3)) {
            return false;
        }
        eo3 eo3 = (eo3) obj;
        if (this.f36100f != eo3.mo30457q()) {
            return false;
        }
        if (this.f36100f == 0) {
            return true;
        }
        int H = mo31611H();
        int H2 = eo3.mo31611H();
        if (H != 0 && H2 != 0 && H != H2) {
            return false;
        }
        lr3 lr3 = new lr3(this, (kr3) null);
        zn3 a = lr3.next();
        lr3 lr32 = new lr3(eo3, (kr3) null);
        zn3 a2 = lr32.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int q = a.mo30457q() - i;
            int q2 = a2.mo30457q() - i2;
            int min = Math.min(q, q2);
            if (i == 0) {
                z = a.mo30452Q(a2, i2, min);
            } else {
                z = a2.mo30452Q(a, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.f36100f;
            if (i3 < i4) {
                if (min == q) {
                    a = lr3.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == q2) {
                    a2 = lr32.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: h */
    public final byte mo30455h(int i) {
        eo3.m31878b(i, this.f36100f);
        return mo30456i(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final byte mo30456i(int i) {
        int i2 = this.f36103i;
        if (i < i2) {
            return this.f36101g.mo30456i(i);
        }
        return this.f36102h.mo30456i(i - i2);
    }

    public final /* synthetic */ Iterator iterator() {
        return new hr3(this);
    }

    /* renamed from: q */
    public final int mo30457q() {
        return this.f36100f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo30458r(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f36103i;
        if (i + i3 <= i4) {
            this.f36101g.mo30458r(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f36102h.mo30458r(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.f36101g.mo30458r(bArr, i, i2, i5);
            this.f36102h.mo30458r(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo31619t() {
        return this.f36104j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo31621u() {
        return this.f36100f >= m35269V(this.f36104j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo30459v(int i, int i2, int i3) {
        int i4 = this.f36103i;
        if (i2 + i3 <= i4) {
            return this.f36101g.mo30459v(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f36102h.mo30459v(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f36102h.mo30459v(this.f36101g.mo30459v(i, i2, i5), 0, i3 - i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo30460x(int i, int i2, int i3) {
        int i4 = this.f36103i;
        if (i2 + i3 <= i4) {
            return this.f36101g.mo30460x(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f36102h.mo30460x(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f36102h.mo30460x(this.f36101g.mo30460x(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: y */
    public final eo3 mo30461y(int i, int i2) {
        int G = eo3.m31870G(i, i2, this.f36100f);
        if (G == 0) {
            return eo3.f31444c;
        }
        if (G == this.f36100f) {
            return this;
        }
        int i3 = this.f36103i;
        if (i2 <= i3) {
            return this.f36101g.mo30461y(i, i2);
        }
        if (i >= i3) {
            return this.f36102h.mo30461y(i - i3, i2 - i3);
        }
        eo3 eo3 = this.f36101g;
        return new nr3(eo3.mo30461y(i, eo3.mo30457q()), this.f36102h.mo30461y(0, i2 - this.f36103i));
    }

    /* renamed from: z */
    public final mo3 mo30462z() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        lr3 lr3 = new lr3(this, (kr3) null);
        while (lr3.hasNext()) {
            arrayList.add(lr3.next().mo30449D());
        }
        int i = mo3.f35591e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new io3(arrayList, i2, true, (ho3) null);
        }
        return new ko3(new xp3(arrayList), 4096, (jo3) null);
    }
}
