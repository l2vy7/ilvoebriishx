package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9129e5 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9129e5 zza;
    private int zze;
    private String zzf = "";
    private C9438y8 zzg = C9330r8.m43563v();

    static {
        C9129e5 e5Var = new C9129e5();
        zza = e5Var;
        C9330r8.m43558o(C9129e5.class, e5Var);
    }

    private C9129e5() {
    }

    /* renamed from: A */
    public final String mo37538A() {
        return this.zzf;
    }

    /* renamed from: B */
    public final List mo37539B() {
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
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C9235l5.class});
        } else if (i2 == 3) {
            return new C9129e5();
        } else {
            if (i2 == 4) {
                return new C9113d5((C9067a5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
