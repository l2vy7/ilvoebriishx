package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public abstract class C9452z7 extends C9176h7 {

    /* renamed from: b */
    private static final Logger f45539b = Logger.getLogger(C9452z7.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f45540c = C9165gb.m42942C();

    /* renamed from: a */
    C9069a8 f45541a;

    private C9452z7() {
    }

    /* synthetic */ C9452z7(C9407w7 w7Var) {
    }

    /* renamed from: A */
    public static int m43940A(C9117d9 d9Var) {
        int a = d9Var.mo37503a();
        return m43944a(a) + a;
    }

    /* renamed from: B */
    static int m43941B(C9409w9 w9Var, C9179ha haVar) {
        C9083b7 b7Var = (C9083b7) w9Var;
        int f = b7Var.mo37401f();
        if (f == -1) {
            f = haVar.zza(b7Var);
            b7Var.mo37403k(f);
        }
        return m43944a(f) + f;
    }

    /* renamed from: C */
    public static int m43942C(String str) {
        int i;
        try {
            i = C9240lb.m43186c(str);
        } catch (C9225kb unused) {
            i = str.getBytes(C9453z8.f45543b).length;
        }
        return m43944a(i) + i;
    }

    /* renamed from: D */
    public static int m43943D(int i) {
        return m43944a(i << 3);
    }

    /* renamed from: a */
    public static int m43944a(int i) {
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
    public static int m43945b(long j) {
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
    public static C9452z7 m43946c(byte[] bArr) {
        return new C9422x7(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m43948x(C9329r7 r7Var) {
        int c = r7Var.mo37731c();
        return m43944a(c) + c;
    }

    @Deprecated
    /* renamed from: y */
    static int m43949y(int i, C9409w9 w9Var, C9179ha haVar) {
        int a = m43944a(i << 3);
        int i2 = a + a;
        C9083b7 b7Var = (C9083b7) w9Var;
        int f = b7Var.mo37401f();
        if (f == -1) {
            f = haVar.zza(b7Var);
            b7Var.mo37403k(f);
        }
        return i2 + f;
    }

    /* renamed from: z */
    public static int m43950z(int i) {
        if (i >= 0) {
            return m43944a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo38220d() {
        if (mo38150g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo38221e(String str, C9225kb kbVar) throws IOException {
        f45539b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", kbVar);
        byte[] bytes = str.getBytes(C9453z8.f45543b);
        try {
            int length = bytes.length;
            mo38164u(length);
            mo38160q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C9437y7(e);
        } catch (C9437y7 e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract int mo38150g();

    /* renamed from: h */
    public abstract void mo38151h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo38152i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo38153j(int i, C9329r7 r7Var) throws IOException;

    /* renamed from: k */
    public abstract void mo38154k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo38155l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo38156m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo38157n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo38158o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo38159p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo38160q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo38161r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo38162s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo38163t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo38164u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo38165v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo38166w(long j) throws IOException;
}
