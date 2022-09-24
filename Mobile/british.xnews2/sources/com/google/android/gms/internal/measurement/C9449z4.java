package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9449z4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9449z4 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C9449z4 z4Var = new C9449z4();
        zza = z4Var;
        C9330r8.m43558o(C9449z4.class, z4Var);
    }

    private C9449z4() {
    }

    /* renamed from: C */
    public static C9435y4 m43918C() {
        return (C9435y4) zza.mo37996p();
    }

    /* renamed from: H */
    static /* synthetic */ void m43920H(C9449z4 z4Var, long j) {
        z4Var.zze |= 1;
        z4Var.zzf = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m43921I(C9449z4 z4Var, String str) {
        str.getClass();
        z4Var.zze |= 2;
        z4Var.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m43922J(C9449z4 z4Var, String str) {
        str.getClass();
        z4Var.zze |= 4;
        z4Var.zzh = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m43923K(C9449z4 z4Var) {
        z4Var.zze &= -5;
        z4Var.zzh = zza.zzh;
    }

    /* renamed from: L */
    static /* synthetic */ void m43924L(C9449z4 z4Var, long j) {
        z4Var.zze |= 8;
        z4Var.zzi = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m43925M(C9449z4 z4Var) {
        z4Var.zze &= -9;
        z4Var.zzi = 0;
    }

    /* renamed from: N */
    static /* synthetic */ void m43926N(C9449z4 z4Var, double d) {
        z4Var.zze |= 32;
        z4Var.zzk = d;
    }

    /* renamed from: O */
    static /* synthetic */ void m43927O(C9449z4 z4Var) {
        z4Var.zze &= -33;
        z4Var.zzk = 0.0d;
    }

    /* renamed from: A */
    public final long mo38210A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final long mo38211B() {
        return this.zzf;
    }

    /* renamed from: F */
    public final String mo38212F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo38213G() {
        return this.zzh;
    }

    /* renamed from: P */
    public final boolean mo38214P() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: Q */
    public final boolean mo38215Q() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: R */
    public final boolean mo38216R() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: S */
    public final boolean mo38217S() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C9449z4();
        } else {
            if (i2 == 4) {
                return new C9435y4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final double mo38218z() {
        return this.zzk;
    }
}
