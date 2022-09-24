package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.vision.k1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9552k1 implements Serializable, Iterable<Byte> {

    /* renamed from: c */
    public static final C9552k1 f45714c = new C9642v1(C9662w2.f45958c);

    /* renamed from: d */
    private static final C9600q1 f45715d = (C9519g1.m44268a() ? new C9680y1((C9576n1) null) : new C9584o1((C9576n1) null));

    /* renamed from: e */
    private static final Comparator<C9552k1> f45716e = new C9568m1();

    /* renamed from: b */
    private int f45717b = 0;

    C9552k1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m44402a(byte b) {
        return b & 255;
    }

    /* renamed from: b */
    public static C9552k1 m44403b(byte[] bArr, int i, int i2) {
        m44406r(i, i + i2, bArr.length);
        return new C9642v1(f45715d.mo38527a(bArr, i, i2));
    }

    /* renamed from: i */
    static C9625t1 m44404i(int i) {
        return new C9625t1(i, (C9576n1) null);
    }

    /* renamed from: r */
    static int m44406r(int i, int i2, int i3) {
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

    /* renamed from: y */
    public static C9552k1 m44407y(String str) {
        return new C9642v1(str.getBytes(C9662w2.f45956a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo38455c(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo38456e(C9560l1 l1Var) throws IOException;

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract byte mo38458f(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract byte mo38459h(int i);

    public final int hashCode() {
        int i = this.f45717b;
        if (i == 0) {
            int size = size();
            i = mo38462q(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f45717b = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C9576n1(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo38462q(int i, int i2, int i3);

    public abstract int size();

    /* renamed from: t */
    public final String mo38464t() {
        return size() == 0 ? "" : mo38455c(C9662w2.f45956a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? C9556k5.m44441a(this) : String.valueOf(C9556k5.m44441a(mo38468x(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract boolean mo38466u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo38467v() {
        return this.f45717b;
    }

    /* renamed from: x */
    public abstract C9552k1 mo38468x(int i, int i2);
}
