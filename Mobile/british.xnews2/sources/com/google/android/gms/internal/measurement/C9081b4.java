package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9081b4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9081b4 zza;
    private int zze;
    private int zzf;
    private C9389v4 zzg;
    private C9389v4 zzh;
    private boolean zzi;

    static {
        C9081b4 b4Var = new C9081b4();
        zza = b4Var;
        C9330r8.m43558o(C9081b4.class, b4Var);
    }

    private C9081b4() {
    }

    /* renamed from: A */
    public static C9066a4 m42660A() {
        return (C9066a4) zza.mo37996p();
    }

    /* renamed from: F */
    static /* synthetic */ void m42662F(C9081b4 b4Var, int i) {
        b4Var.zze |= 1;
        b4Var.zzf = i;
    }

    /* renamed from: G */
    static /* synthetic */ void m42663G(C9081b4 b4Var, C9389v4 v4Var) {
        v4Var.getClass();
        b4Var.zzg = v4Var;
        b4Var.zze |= 2;
    }

    /* renamed from: H */
    static /* synthetic */ void m42664H(C9081b4 b4Var, C9389v4 v4Var) {
        b4Var.zzh = v4Var;
        b4Var.zze |= 4;
    }

    /* renamed from: I */
    static /* synthetic */ void m42665I(C9081b4 b4Var, boolean z) {
        b4Var.zze |= 8;
        b4Var.zzi = z;
    }

    /* renamed from: C */
    public final C9389v4 mo37394C() {
        C9389v4 v4Var = this.zzg;
        return v4Var == null ? C9389v4.m43732H() : v4Var;
    }

    /* renamed from: D */
    public final C9389v4 mo37395D() {
        C9389v4 v4Var = this.zzh;
        return v4Var == null ? C9389v4.m43732H() : v4Var;
    }

    /* renamed from: J */
    public final boolean mo37396J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final boolean mo37397K() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: L */
    public final boolean mo37398L() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: M */
    public final boolean mo37399M() {
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
            return C9330r8.m43557n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C9081b4();
        } else {
            if (i2 == 4) {
                return new C9066a4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37400z() {
        return this.zzf;
    }
}
