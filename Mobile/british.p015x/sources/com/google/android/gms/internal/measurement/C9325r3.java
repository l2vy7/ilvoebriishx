package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9325r3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9325r3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C9325r3 r3Var = new C9325r3();
        zza = r3Var;
        C9330r8.m43558o(C9325r3.class, r3Var);
    }

    private C9325r3() {
    }

    /* renamed from: C */
    static /* synthetic */ void m43526C(C9325r3 r3Var, String str) {
        str.getClass();
        r3Var.zze |= 1;
        r3Var.zzf = str;
    }

    /* renamed from: B */
    public final String mo37969B() {
        return this.zzf;
    }

    /* renamed from: D */
    public final boolean mo37970D() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean mo37971F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo37972G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo37973H() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo37974I() {
        return (this.zze & 8) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C9325r3();
        } else {
            if (i2 == 4) {
                return new C9295p3((C9279o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37975z() {
        return this.zzi;
    }
}
