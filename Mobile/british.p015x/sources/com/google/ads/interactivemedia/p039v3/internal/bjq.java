package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjq */
/* compiled from: IMASDK */
public abstract class bjq implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    private static final bjl f16481a = new bjp((byte[]) null);

    /* renamed from: b */
    public static final bjq f16482b = new bjo(bkr.f16600b);

    /* renamed from: c */
    private int f16483c = 0;

    static {
        int i = bjf.f16467a;
    }

    bjq() {
    }

    /* renamed from: m */
    public static bjq m16050m(byte[] bArr, int i, int i2) {
        m16054t(i, i + i2, bArr.length);
        return new bjo(f16481a.mo15205a(bArr, i, i2));
    }

    /* renamed from: n */
    public static bjq m16051n(byte[] bArr) {
        return m16050m(bArr, 0, bArr.length);
    }

    /* renamed from: o */
    static bjq m16052o(byte[] bArr) {
        return new bjo(bArr);
    }

    /* renamed from: p */
    public static bjq m16053p(String str) {
        return new bjo(str.getBytes(bkr.f16599a));
    }

    /* renamed from: t */
    static int m16054t(int i, int i2, int i3) {
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

    /* renamed from: a */
    public abstract byte mo15199a(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte mo15200b(int i);

    /* renamed from: c */
    public abstract int mo15201c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo15203e(byte[] bArr, int i);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo15207f(Charset charset);

    /* renamed from: g */
    public abstract boolean mo15208g();

    /* renamed from: h */
    public abstract bjs mo15209h();

    public final int hashCode() {
        int i = this.f16483c;
        if (i == 0) {
            int c = mo15201c();
            i = mo15210i(c, c);
            if (i == 0) {
                i = 1;
            }
            this.f16483c = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo15210i(int i, int i2);

    /* renamed from: j */
    public abstract bjq mo15211j(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo15212k(bjr bjr) throws IOException;

    /* renamed from: l */
    public final bjm iterator() {
        return new bjj(this);
    }

    /* renamed from: q */
    public final byte[] mo15216q() {
        int c = mo15201c();
        if (c == 0) {
            return bkr.f16600b;
        }
        byte[] bArr = new byte[c];
        mo15203e(bArr, c);
        return bArr;
    }

    /* renamed from: r */
    public final String mo15217r() {
        Charset charset = bkr.f16599a;
        if (mo15201c() == 0) {
            return "";
        }
        return mo15207f(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo15218s() {
        return this.f16483c;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo15201c());
        objArr[2] = mo15201c() <= 50 ? bmm.m16664t(this) : String.valueOf(bmm.m16664t(mo15211j(47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
