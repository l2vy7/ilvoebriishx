package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.cast.ec */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8509ec extends C8656nb {

    /* renamed from: b */
    private static final Logger f43442b = Logger.getLogger(C8509ec.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f43443c = C8545gf.m40952f();

    /* renamed from: a */
    C8526fc f43444a;

    private C8509ec() {
    }

    /* synthetic */ C8509ec(C8459bc bcVar) {
    }

    /* renamed from: A */
    public static int m40797A(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: B */
    public static int m40798B(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: C */
    public static int m40799C(String str) {
        int i;
        try {
            i = C8612kf.m41106c(str);
        } catch (C8595jf unused) {
            i = str.getBytes(C8443ad.f43264a).length;
        }
        return m40797A(i) + i;
    }

    /* renamed from: D */
    public static int m40800D(C8494dd ddVar) {
        int a = ddVar.mo36430a();
        return m40797A(a) + a;
    }

    /* renamed from: a */
    public static int m40801a(C8796wb wbVar) {
        int c = wbVar.mo36697c();
        return m40797A(c) + c;
    }

    /* renamed from: b */
    static int m40802b(C8782vd vdVar, C8561he heVar) {
        C8608kb kbVar = (C8608kb) vdVar;
        int b = kbVar.mo36567b();
        if (b == -1) {
            b = heVar.mo36372c(kbVar);
            kbVar.mo36568c(b);
        }
        return m40797A(b) + b;
    }

    @Deprecated
    /* renamed from: e */
    static int m40803e(int i, C8782vd vdVar, C8561he heVar) {
        int A = m40797A(i << 3);
        int i2 = A + A;
        C8608kb kbVar = (C8608kb) vdVar;
        int b = kbVar.mo36567b();
        if (b == -1) {
            b = heVar.mo36372c(kbVar);
            kbVar.mo36568c(b);
        }
        return i2 + b;
    }

    /* renamed from: x */
    public static C8509ec m40805x(byte[] bArr) {
        return new C8476cc(bArr, 0, bArr.length);
    }

    /* renamed from: y */
    public static int m40806y(int i) {
        return m40797A(i << 3);
    }

    /* renamed from: z */
    public static int m40807z(int i) {
        if (i >= 0) {
            return m40797A(i);
        }
        return 10;
    }

    /* renamed from: c */
    public final void mo36459c() {
        if (mo36415w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36460d(String str, C8595jf jfVar) throws IOException {
        f43442b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", jfVar);
        byte[] bytes = str.getBytes(C8443ad.f43264a);
        try {
            int length = bytes.length;
            mo36410r(length);
            mo36414v(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C8493dc(e);
        } catch (C8493dc e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract void mo36399g(int i, int i2) throws IOException;

    /* renamed from: h */
    public abstract void mo36400h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo36401i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo36402j(int i, int i2) throws IOException;

    /* renamed from: k */
    public abstract void mo36403k(int i, long j) throws IOException;

    /* renamed from: l */
    public abstract void mo36404l(int i, long j) throws IOException;

    /* renamed from: m */
    public abstract void mo36405m(int i, boolean z) throws IOException;

    /* renamed from: n */
    public abstract void mo36406n(int i, String str) throws IOException;

    /* renamed from: o */
    public abstract void mo36407o(int i, C8796wb wbVar) throws IOException;

    /* renamed from: p */
    public abstract void mo36408p(byte b) throws IOException;

    /* renamed from: q */
    public abstract void mo36409q(int i) throws IOException;

    /* renamed from: r */
    public abstract void mo36410r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo36411s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo36412t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo36413u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo36414v(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract int mo36415w();
}
