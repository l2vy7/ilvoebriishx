package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.a0 */
public abstract class C8847a0 implements Serializable, Iterable<Byte> {

    /* renamed from: c */
    public static final C8847a0 f44287c = new C8909h0(C8910h1.f44550c);

    /* renamed from: d */
    private static final C8884e0 f44288d = (C9007u.m42369b() ? new C8916i0((C8855b0) null) : new C8867c0((C8855b0) null));

    /* renamed from: b */
    private int f44289b = 0;

    C8847a0() {
    }

    /* renamed from: h */
    static int m41489h(int i, int i2, int i3) {
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

    /* renamed from: i */
    public static C8847a0 m41490i(byte[] bArr, int i, int i2) {
        return new C8909h0(f44288d.mo36858a(bArr, i, i2));
    }

    /* renamed from: j */
    public static C8847a0 m41491j(String str) {
        return new C8909h0(str.getBytes(C8910h1.f44548a));
    }

    /* renamed from: r */
    static C8890f0 m41492r(int i) {
        return new C8890f0(i, (C8855b0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo36799a(int i, int i2, int i3);

    /* renamed from: b */
    public abstract C8847a0 mo36800b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo36801c(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo36802e(C9042z zVar) throws IOException;

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract boolean mo36804f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo36805g() {
        return this.f44289b;
    }

    public final int hashCode() {
        int i = this.f44289b;
        if (i == 0) {
            int size = size();
            i = mo36799a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f44289b = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C8855b0(this);
    }

    /* renamed from: q */
    public abstract byte mo36808q(int i);

    public abstract int size();

    /* renamed from: t */
    public final String mo36810t() {
        return size() == 0 ? "" : mo36801c(C8910h1.f44548a);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
