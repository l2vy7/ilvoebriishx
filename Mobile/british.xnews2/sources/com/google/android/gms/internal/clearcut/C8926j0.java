package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.j0 */
public abstract class C8926j0 {

    /* renamed from: a */
    private int f44561a;

    /* renamed from: b */
    private int f44562b;

    /* renamed from: c */
    private boolean f44563c;

    private C8926j0() {
        this.f44561a = 100;
        this.f44562b = Integer.MAX_VALUE;
        this.f44563c = false;
    }

    /* renamed from: a */
    public static long m41881a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    static C8926j0 m41882b(byte[] bArr, int i, int i2, boolean z) {
        C8940l0 l0Var = new C8940l0(bArr, 0, i2, false);
        try {
            l0Var.mo36978d(i2);
            return l0Var;
        } catch (C8941l1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m41883e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public abstract int mo36977c();

    /* renamed from: d */
    public abstract int mo36978d(int i) throws C8941l1;
}
