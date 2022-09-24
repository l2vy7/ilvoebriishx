package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9448z3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9448z3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        C9448z3 z3Var = new C9448z3();
        zza = z3Var;
        C9330r8.m43558o(C9448z3.class, z3Var);
    }

    private C9448z3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C9448z3();
        } else {
            if (i2 == 4) {
                return new C9434y3((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
