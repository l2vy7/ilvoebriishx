package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9160g5 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9160g5 zza;
    private int zze;
    private C9438y8 zzf = C9330r8.m43563v();
    private C9097c5 zzg;

    static {
        C9160g5 g5Var = new C9160g5();
        zza = g5Var;
        C9330r8.m43558o(C9160g5.class, g5Var);
    }

    private C9160g5() {
    }

    /* renamed from: B */
    public final List mo37594B() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C9235l5.class, "zzg"});
        } else if (i2 == 3) {
            return new C9160g5();
        } else {
            if (i2 == 4) {
                return new C9144f5((C9067a5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final C9097c5 mo37595z() {
        C9097c5 c5Var = this.zzg;
        return c5Var == null ? C9097c5.m42745B() : c5Var;
    }
}
