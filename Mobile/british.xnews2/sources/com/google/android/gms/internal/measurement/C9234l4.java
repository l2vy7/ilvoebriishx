package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9234l4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9234l4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C9448z3 zzh;

    static {
        C9234l4 l4Var = new C9234l4();
        zza = l4Var;
        C9330r8.m43558o(C9234l4.class, l4Var);
    }

    private C9234l4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C9234l4();
        } else {
            if (i2 == 4) {
                return new C9219k4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
