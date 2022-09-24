package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.x1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9672x1 {

    /* renamed from: a */
    int f45981a;

    /* renamed from: b */
    private int f45982b;

    /* renamed from: c */
    private boolean f45983c;

    private C9672x1() {
        this.f45981a = 100;
        this.f45982b = Integer.MAX_VALUE;
        this.f45983c = false;
    }

    /* renamed from: a */
    static C9672x1 m44794a(byte[] bArr, int i, int i2, boolean z) {
        C9688z1 z1Var = new C9688z1(bArr, i2);
        try {
            z1Var.mo38636b(i2);
            return z1Var;
        } catch (C9513f3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    public static int m44795c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: e */
    public static long m44796e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    public abstract int mo38636b(int i) throws C9513f3;

    /* renamed from: d */
    public abstract int mo38637d();
}
