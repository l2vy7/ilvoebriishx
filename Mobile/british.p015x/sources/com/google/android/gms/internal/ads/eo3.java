package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class eo3 implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final eo3 f31444c = new ao3(up3.f39921d);

    /* renamed from: d */
    private static final Comparator<eo3> f31445d = new un3();

    /* renamed from: e */
    private static final do3 f31446e = new do3((co3) null);

    /* renamed from: b */
    private int f31447b = 0;

    static {
        int i = nn3.f36061a;
    }

    eo3() {
    }

    /* renamed from: G */
    static int m31870G(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: J */
    public static bo3 m31871J() {
        return new bo3(128);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Iterable<com.google.android.gms.internal.ads.eo3>, java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.eo3 m31872K(java.lang.Iterable<com.google.android.gms.internal.ads.eo3> r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.eo3 r3 = f31444c
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.eo3 r3 = m31879j(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eo3.m31872K(java.lang.Iterable):com.google.android.gms.internal.ads.eo3");
    }

    /* renamed from: L */
    public static eo3 m31873L(byte[] bArr) {
        return m31874M(bArr, 0, bArr.length);
    }

    /* renamed from: M */
    public static eo3 m31874M(byte[] bArr, int i, int i2) {
        m31870G(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ao3(bArr2);
    }

    /* renamed from: N */
    public static eo3 m31875N(String str) {
        return new ao3(str.getBytes(up3.f39919b));
    }

    /* renamed from: O */
    public static eo3 m31876O(InputStream inputStream) throws IOException {
        eo3 eo3;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                eo3 = null;
            } else {
                eo3 = m31874M(bArr, 0, i2);
            }
            if (eo3 == null) {
                return m31872K(arrayList);
            }
            arrayList.add(eo3);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: P */
    static eo3 m31877P(byte[] bArr) {
        return new ao3(bArr);
    }

    /* renamed from: b */
    static void m31878b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: j */
    private static eo3 m31879j(Iterator<eo3> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            eo3 j = m31879j(it, i2);
            eo3 j2 = m31879j(it, i - i2);
            if (Integer.MAX_VALUE - j.mo30457q() >= j2.mo30457q()) {
                return nr3.m35267S(j, j2);
            }
            int q = j.mo30457q();
            int q2 = j2.mo30457q();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(q);
            sb.append("+");
            sb.append(q2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract String mo30448A(Charset charset);

    /* renamed from: D */
    public abstract ByteBuffer mo30449D();

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract void mo30450E(rn3 rn3) throws IOException;

    /* renamed from: F */
    public abstract boolean mo30451F();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final int mo31611H() {
        return this.f31447b;
    }

    /* renamed from: I */
    public xn3 iterator() {
        return new sn3(this);
    }

    /* renamed from: a */
    public final String mo31613a(Charset charset) {
        return mo30457q() == 0 ? "" : mo30448A(charset);
    }

    @Deprecated
    /* renamed from: c */
    public final void mo31614c(byte[] bArr, int i, int i2, int i3) {
        m31870G(0, i3, mo30457q());
        m31870G(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo30458r(bArr, 0, i2, i3);
        }
    }

    /* renamed from: e */
    public final boolean mo31615e() {
        return mo30457q() == 0;
    }

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public final byte[] mo31616f() {
        int q = mo30457q();
        if (q == 0) {
            return up3.f39921d;
        }
        byte[] bArr = new byte[q];
        mo30458r(bArr, 0, 0, q);
        return bArr;
    }

    /* renamed from: h */
    public abstract byte mo30455h(int i);

    public final int hashCode() {
        int i = this.f31447b;
        if (i == 0) {
            int q = mo30457q();
            i = mo30459v(q, 0, q);
            if (i == 0) {
                i = 1;
            }
            this.f31447b = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract byte mo30456i(int i);

    /* renamed from: q */
    public abstract int mo30457q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo30458r(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo31619t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo30457q());
        objArr[2] = mo30457q() <= 50 ? es3.m31931a(this) : es3.m31931a(mo30461y(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo31621u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo30459v(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract int mo30460x(int i, int i2, int i3);

    /* renamed from: y */
    public abstract eo3 mo30461y(int i, int i2);

    /* renamed from: z */
    public abstract mo3 mo30462z();
}
