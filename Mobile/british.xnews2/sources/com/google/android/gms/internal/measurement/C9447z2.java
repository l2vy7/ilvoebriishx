package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9447z2 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9447z2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C9438y8 zzh = C9330r8.m43563v();
    private boolean zzi;
    private C9158g3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C9447z2 z2Var = new C9447z2();
        zza = z2Var;
        C9330r8.m43558o(C9447z2.class, z2Var);
    }

    private C9447z2() {
    }

    /* renamed from: B */
    public static C9433y2 m43899B() {
        return (C9433y2) zza.mo37996p();
    }

    /* renamed from: I */
    static /* synthetic */ void m43901I(C9447z2 z2Var, String str) {
        z2Var.zze |= 2;
        z2Var.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m43902J(C9447z2 z2Var, int i, C9080b3 b3Var) {
        b3Var.getClass();
        C9438y8 y8Var = z2Var.zzh;
        if (!y8Var.zzc()) {
            z2Var.zzh = C9330r8.m43564w(y8Var);
        }
        z2Var.zzh.set(i, b3Var);
    }

    /* renamed from: A */
    public final int mo38198A() {
        return this.zzf;
    }

    /* renamed from: D */
    public final C9080b3 mo38199D(int i) {
        return (C9080b3) this.zzh.get(i);
    }

    /* renamed from: F */
    public final C9158g3 mo38200F() {
        C9158g3 g3Var = this.zzj;
        return g3Var == null ? C9158g3.m42912A() : g3Var;
    }

    /* renamed from: G */
    public final String mo38201G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List mo38202H() {
        return this.zzh;
    }

    /* renamed from: K */
    public final boolean mo38203K() {
        return this.zzk;
    }

    /* renamed from: L */
    public final boolean mo38204L() {
        return this.zzl;
    }

    /* renamed from: M */
    public final boolean mo38205M() {
        return this.zzm;
    }

    /* renamed from: N */
    public final boolean mo38206N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: O */
    public final boolean mo38207O() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: P */
    public final boolean mo38208P() {
        return (this.zze & 64) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C9080b3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C9447z2();
        } else {
            if (i2 == 4) {
                return new C9433y2((C9387v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo38209z() {
        return this.zzh.size();
    }
}
