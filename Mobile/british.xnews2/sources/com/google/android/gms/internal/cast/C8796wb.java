package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.cast.wb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8796wb implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final C8796wb f44177c = new C8765ub(C8443ad.f43266c);

    /* renamed from: d */
    private static final Comparator<C8796wb> f44178d = new C8688pb();

    /* renamed from: e */
    private static final C8780vb f44179e = new C8780vb((C8672ob) null);

    /* renamed from: b */
    private int f44180b = 0;

    static {
        int i = C8640mb.f43715a;
    }

    C8796wb() {
    }

    /* renamed from: r */
    public static C8796wb m41383r(String str) {
        return new C8765ub(str.getBytes(C8443ad.f43264a));
    }

    /* renamed from: v */
    static int m41384v(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("End index: ");
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public abstract byte mo36695a(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte mo36696b(int i);

    /* renamed from: c */
    public abstract int mo36697c();

    /* renamed from: e */
    public abstract C8796wb mo36735e(int i, int i2);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo36737f(C8656nb nbVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo36738g(Charset charset);

    public final int hashCode() {
        int i = this.f44180b;
        if (i == 0) {
            int c = mo36697c();
            i = mo36740q(c, 0, c);
            if (i == 0) {
                i = 1;
            }
            this.f44180b = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C8672ob(this);
    }

    /* renamed from: j */
    public abstract boolean mo36739j();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo36740q(int i, int i2, int i3);

    /* renamed from: t */
    public final String mo36760t(Charset charset) {
        return mo36697c() == 0 ? "" : mo36738g(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo36697c());
        objArr[2] = mo36697c() <= 50 ? C8753te.m41320a(this) : String.valueOf(C8753te.m41320a(mo36735e(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo36762u() {
        return this.f44180b;
    }
}
