package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9174h4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9174h4 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C9174h4 h4Var = new C9174h4();
        zza = h4Var;
        C9330r8.m43558o(C9174h4.class, h4Var);
    }

    private C9174h4() {
    }

    /* renamed from: B */
    static /* synthetic */ void m42981B(C9174h4 h4Var, String str) {
        str.getClass();
        h4Var.zze |= 1;
        h4Var.zzf = str;
    }

    /* renamed from: C */
    static /* synthetic */ void m42982C(C9174h4 h4Var, long j) {
        h4Var.zze |= 2;
        h4Var.zzg = j;
    }

    /* renamed from: z */
    public static C9159g4 m42983z() {
        return (C9159g4) zza.mo37996p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C9174h4();
        } else {
            if (i2 == 4) {
                return new C9159g4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
