package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9388v3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9388v3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C9388v3 v3Var = new C9388v3();
        zza = v3Var;
        C9330r8.m43558o(C9388v3.class, v3Var);
    }

    private C9388v3() {
    }

    /* renamed from: A */
    public final String mo38101A() {
        return this.zzf;
    }

    /* renamed from: B */
    public final String mo38102B() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C9388v3();
        } else {
            if (i2 == 4) {
                return new C9373u3((C9279o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
