package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9265n4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9265n4 zza;
    private C9438y8 zze = C9330r8.m43563v();

    static {
        C9265n4 n4Var = new C9265n4();
        zza = n4Var;
        C9330r8.m43558o(C9265n4.class, n4Var);
    }

    private C9265n4() {
    }

    /* renamed from: D */
    static /* synthetic */ void m43235D(C9265n4 n4Var, C9296p4 p4Var) {
        p4Var.getClass();
        C9438y8 y8Var = n4Var.zze;
        if (!y8Var.zzc()) {
            n4Var.zze = C9330r8.m43564w(y8Var);
        }
        n4Var.zze.add(p4Var);
    }

    /* renamed from: z */
    public static C9249m4 m43236z() {
        return (C9249m4) zza.mo37996p();
    }

    /* renamed from: B */
    public final C9296p4 mo37754B(int i) {
        return (C9296p4) this.zze.get(0);
    }

    /* renamed from: C */
    public final List mo37755C() {
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
            return C9330r8.m43557n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C9296p4.class});
        } else if (i2 == 3) {
            return new C9265n4();
        } else {
            if (i2 == 4) {
                return new C9249m4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
