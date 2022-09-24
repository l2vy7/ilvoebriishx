package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9235l5 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9235l5 zza;
    private int zze;
    private int zzf;
    private C9438y8 zzg = C9330r8.m43563v();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C9235l5 l5Var = new C9235l5();
        zza = l5Var;
        C9330r8.m43558o(C9235l5.class, l5Var);
    }

    private C9235l5() {
    }

    /* renamed from: B */
    public final String mo37698B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final String mo37699C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final List mo37700D() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean mo37701F() {
        return this.zzj;
    }

    /* renamed from: G */
    public final boolean mo37702G() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: H */
    public final boolean mo37703H() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: I */
    public final boolean mo37704I() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: J */
    public final int mo37705J() {
        int a = C9220k5.m43149a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C9205j5.f45100a, "zzg", C9235l5.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C9235l5();
        } else {
            if (i2 == 4) {
                return new C9175h5((C9067a5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final double mo37706z() {
        return this.zzk;
    }
}
