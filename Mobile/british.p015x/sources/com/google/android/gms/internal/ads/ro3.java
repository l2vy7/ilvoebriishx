package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ro3 extends rn3 {

    /* renamed from: b */
    private static final Logger f38746b = Logger.getLogger(ro3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f38747c = qs3.m36709a();

    /* renamed from: a */
    so3 f38748a;

    private ro3() {
    }

    /* synthetic */ ro3(qo3 qo3) {
    }

    /* renamed from: A */
    public static int m37147A(aq3 aq3) {
        int a = aq3.mo30470a();
        return m37151a(a) + a;
    }

    /* renamed from: B */
    static int m37148B(uq3 uq3, or3 or3) {
        ln3 ln3 = (ln3) uq3;
        int e = ln3.mo33139e();
        if (e == -1) {
            e = or3.zza(ln3);
            ln3.mo33144j(e);
        }
        return m37151a(e) + e;
    }

    /* renamed from: C */
    public static int m37149C(String str) {
        int i;
        try {
            i = vs3.m38942e(str);
        } catch (us3 unused) {
            i = str.getBytes(up3.f39919b).length;
        }
        return m37151a(i) + i;
    }

    /* renamed from: D */
    public static int m37150D(int i) {
        return m37151a(i << 3);
    }

    /* renamed from: a */
    public static int m37151a(int i) {
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

    /* renamed from: b */
    public static int m37152b(long j) {
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

    /* renamed from: c */
    public static ro3 m37153c(byte[] bArr) {
        return new oo3(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m37155x(eo3 eo3) {
        int q = eo3.mo30457q();
        return m37151a(q) + q;
    }

    @Deprecated
    /* renamed from: y */
    static int m37156y(int i, uq3 uq3, or3 or3) {
        int a = m37151a(i << 3);
        int i2 = a + a;
        ln3 ln3 = (ln3) uq3;
        int e = ln3.mo33139e();
        if (e == -1) {
            e = or3.zza(ln3);
            ln3.mo33144j(e);
        }
        return i2 + e;
    }

    /* renamed from: z */
    public static int m37157z(int i) {
        if (i >= 0) {
            return m37151a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo34577d() {
        if (mo33961g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo34578e(String str, us3 us3) throws IOException {
        f38746b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", us3);
        byte[] bytes = str.getBytes(up3.f39919b);
        try {
            int length = bytes.length;
            mo33975u(length);
            mo33971q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new po3(e);
        } catch (po3 e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract int mo33961g();

    /* renamed from: h */
    public abstract void mo33962h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo33963i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo33964j(int i, eo3 eo3) throws IOException;

    /* renamed from: k */
    public abstract void mo33965k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo33966l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo33967m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo33968n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo33969o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo33970p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo33971q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo33972r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo33973s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo33974t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo33975u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo33976v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo33977w(long j) throws IOException;
}
