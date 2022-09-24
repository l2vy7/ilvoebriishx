package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.g8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8538g8 extends C8705qc<C8538g8, C8522f8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8538g8 zzp;
    private int zzb;
    private C8809x8 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private C8703qa zzm;
    private int zzn;
    private int zzo;

    static {
        C8538g8 g8Var = new C8538g8();
        zzp = g8Var;
        C8705qc.m41246g(C8538g8.class, g8Var);
    }

    private C8538g8() {
    }

    /* renamed from: m */
    public static C8522f8 m40926m() {
        return (C8522f8) zzp.mo36673e();
    }

    /* renamed from: n */
    public static C8522f8 m40927n(C8538g8 g8Var) {
        C8673oc e = zzp.mo36673e();
        e.mo36635k(g8Var);
        return (C8522f8) e;
    }

    /* renamed from: o */
    public static C8538g8 m40928o() {
        return zzp;
    }

    /* renamed from: q */
    static /* synthetic */ void m40930q(C8538g8 g8Var, C8809x8 x8Var) {
        x8Var.getClass();
        g8Var.zze = x8Var;
        g8Var.zzb |= 1;
    }

    /* renamed from: r */
    static /* synthetic */ void m40931r(C8538g8 g8Var, boolean z) {
        g8Var.zzb |= 2;
        g8Var.zzf = z;
    }

    /* renamed from: s */
    static /* synthetic */ void m40932s(C8538g8 g8Var, long j) {
        g8Var.zzb |= 4;
        g8Var.zzg = j;
    }

    /* renamed from: t */
    static /* synthetic */ void m40933t(C8538g8 g8Var, int i) {
        g8Var.zzb |= 64;
        g8Var.zzk = i;
    }

    /* renamed from: u */
    static /* synthetic */ void m40934u(C8538g8 g8Var, int i) {
        g8Var.zzb |= 128;
        g8Var.zzl = i;
    }

    /* renamed from: v */
    static /* synthetic */ void m40935v(C8538g8 g8Var, int i) {
        g8Var.zzb |= 1024;
        g8Var.zzo = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", C8803x2.m41404d(), "zzj", C8756u2.m41326d(), "zzk", "zzl", "zzm", "zzn", C8518f4.m40851d(), "zzo"});
        } else if (i2 == 3) {
            return new C8538g8();
        } else {
            if (i2 == 4) {
                return new C8522f8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzp;
        }
    }
}
