package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9420x4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9420x4 zza;
    private int zze;
    private int zzf;
    private C9423x8 zzg = C9330r8.m43561t();

    static {
        C9420x4 x4Var = new C9420x4();
        zza = x4Var;
        C9330r8.m43558o(C9420x4.class, x4Var);
    }

    private C9420x4() {
    }

    /* renamed from: C */
    public static C9405w4 m43808C() {
        return (C9405w4) zza.mo37996p();
    }

    /* renamed from: G */
    static /* synthetic */ void m43810G(C9420x4 x4Var, int i) {
        x4Var.zze |= 1;
        x4Var.zzf = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m43811H(C9420x4 x4Var, Iterable iterable) {
        C9423x8 x8Var = x4Var.zzg;
        if (!x8Var.zzc()) {
            x4Var.zzg = C9330r8.m43562u(x8Var);
        }
        C9083b7.m42674i(iterable, x4Var.zzg);
    }

    /* renamed from: A */
    public final int mo38143A() {
        return this.zzf;
    }

    /* renamed from: B */
    public final long mo38144B(int i) {
        return this.zzg.mo37689m(i);
    }

    /* renamed from: F */
    public final List mo38145F() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo38146I() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C9420x4();
        } else {
            if (i2 == 4) {
                return new C9405w4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo38147z() {
        return this.zzg.size();
    }
}
