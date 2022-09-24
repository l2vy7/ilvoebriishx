package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public abstract class C9329r7 implements Iterable, Serializable {

    /* renamed from: c */
    public static final C9329r7 f45419c = new C9298p7(C9453z8.f45545d);

    /* renamed from: d */
    private static final Comparator f45420d = new C9221k7();

    /* renamed from: e */
    private static final C9313q7 f45421e = new C9313q7((C9191i7) null);

    /* renamed from: b */
    private int f45422b = 0;

    static {
        int i = C9115d7.f44952a;
    }

    C9329r7() {
    }

    /* renamed from: q */
    static int m43543q(int i, int i2, int i3) {
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

    /* renamed from: t */
    public static C9329r7 m43544t(byte[] bArr, int i, int i2) {
        m43543q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C9298p7(bArr2);
    }

    /* renamed from: u */
    public static C9329r7 m43545u(String str) {
        return new C9298p7(str.getBytes(C9453z8.f45543b));
    }

    /* renamed from: a */
    public abstract byte mo37729a(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte mo37730b(int i);

    /* renamed from: c */
    public abstract int mo37731c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo37923e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract C9329r7 mo37925f(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo37926g(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo37927h(C9176h7 h7Var) throws IOException;

    public final int hashCode() {
        int i = this.f45422b;
        if (i == 0) {
            int c = mo37731c();
            i = mo37923e(c, 0, c);
            if (i == 0) {
                i = 1;
            }
            this.f45422b = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C9191i7(this);
    }

    /* renamed from: j */
    public abstract boolean mo37928j();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo37987r() {
        return this.f45422b;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo37731c());
        objArr[2] = mo37731c() <= 50 ? C9364ta.m43664a(this) : C9364ta.m43664a(mo37925f(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: v */
    public final String mo37989v(Charset charset) {
        return mo37731c() == 0 ? "" : mo37926g(charset);
    }
}
