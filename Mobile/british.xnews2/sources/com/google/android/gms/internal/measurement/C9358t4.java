package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9358t4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9358t4 zza;
    private int zze;
    private int zzf = 1;
    private C9438y8 zzg = C9330r8.m43563v();

    static {
        C9358t4 t4Var = new C9358t4();
        zza = t4Var;
        C9330r8.m43558o(C9358t4.class, t4Var);
    }

    private C9358t4() {
    }

    /* renamed from: B */
    static /* synthetic */ void m43650B(C9358t4 t4Var, C9174h4 h4Var) {
        h4Var.getClass();
        C9438y8 y8Var = t4Var.zzg;
        if (!y8Var.zzc()) {
            t4Var.zzg = C9330r8.m43564w(y8Var);
        }
        t4Var.zzg.add(h4Var);
    }

    /* renamed from: z */
    public static C9311q4 m43651z() {
        return (C9311q4) zza.mo37996p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C9342s4.f45442a, "zzg", C9174h4.class});
        } else if (i2 == 3) {
            return new C9358t4();
        } else {
            if (i2 == 4) {
                return new C9311q4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
