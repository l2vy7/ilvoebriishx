package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9112d4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9112d4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C9112d4 d4Var = new C9112d4();
        zza = d4Var;
        C9330r8.m43558o(C9112d4.class, d4Var);
    }

    private C9112d4() {
    }

    /* renamed from: B */
    public static C9096c4 m42768B() {
        return (C9096c4) zza.mo37996p();
    }

    /* renamed from: D */
    static /* synthetic */ void m42770D(C9112d4 d4Var, int i) {
        d4Var.zze |= 1;
        d4Var.zzf = i;
    }

    /* renamed from: F */
    static /* synthetic */ void m42771F(C9112d4 d4Var, long j) {
        d4Var.zze |= 2;
        d4Var.zzg = j;
    }

    /* renamed from: A */
    public final long mo37497A() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo37498G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo37499H() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C9112d4();
        } else {
            if (i2 == 4) {
                return new C9096c4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37500z() {
        return this.zzf;
    }
}
