package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9357t3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9357t3 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private C9438y8 zzi = C9330r8.m43563v();
    private C9438y8 zzj = C9330r8.m43563v();
    /* access modifiers changed from: private */
    public C9438y8 zzk = C9330r8.m43563v();
    private String zzl = "";
    private boolean zzm;
    private C9438y8 zzn = C9330r8.m43563v();

    static {
        C9357t3 t3Var = new C9357t3();
        zza = t3Var;
        C9330r8.m43558o(C9357t3.class, t3Var);
    }

    private C9357t3() {
    }

    /* renamed from: D */
    public static C9341s3 m43632D() {
        return (C9341s3) zza.mo37996p();
    }

    /* renamed from: G */
    public static C9357t3 m43634G() {
        return zza;
    }

    /* renamed from: L */
    static /* synthetic */ void m43635L(C9357t3 t3Var, int i, C9325r3 r3Var) {
        r3Var.getClass();
        C9438y8 y8Var = t3Var.zzj;
        if (!y8Var.zzc()) {
            t3Var.zzj = C9330r8.m43564w(y8Var);
        }
        t3Var.zzj.set(i, r3Var);
    }

    /* renamed from: A */
    public final int mo38044A() {
        return this.zzj.size();
    }

    /* renamed from: B */
    public final long mo38045B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final C9325r3 mo38046C(int i) {
        return (C9325r3) this.zzj.get(i);
    }

    /* renamed from: H */
    public final String mo38047H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List mo38048I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final List mo38049J() {
        return this.zzn;
    }

    /* renamed from: K */
    public final List mo38050K() {
        return this.zzi;
    }

    /* renamed from: N */
    public final boolean mo38051N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final boolean mo38052O() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: P */
    public final boolean mo38053P() {
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
            return C9330r8.m43557n(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C9388v3.class, "zzj", C9325r3.class, "zzk", C9418x2.class, "zzl", "zzm", "zzn", C9160g5.class});
        } else if (i2 == 3) {
            return new C9357t3();
        } else {
            if (i2 == 4) {
                return new C9341s3((C9279o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo38054z() {
        return this.zzn.size();
    }
}
