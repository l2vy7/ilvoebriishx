package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9097c5 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9097c5 zza;
    private C9438y8 zze = C9330r8.m43563v();

    static {
        C9097c5 c5Var = new C9097c5();
        zza = c5Var;
        C9330r8.m43558o(C9097c5.class, c5Var);
    }

    private C9097c5() {
    }

    /* renamed from: B */
    public static C9097c5 m42745B() {
        return zza;
    }

    /* renamed from: C */
    public final List mo37447C() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C9129e5.class});
        } else if (i2 == 3) {
            return new C9097c5();
        } else {
            if (i2 == 4) {
                return new C9082b5((C9067a5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37448z() {
        return this.zze.size();
    }
}
