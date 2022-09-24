package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9264n3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9264n3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private C9438y8 zzi = C9330r8.m43563v();

    static {
        C9264n3 n3Var = new C9264n3();
        zza = n3Var;
        C9330r8.m43558o(C9264n3.class, n3Var);
    }

    private C9264n3() {
    }

    /* renamed from: B */
    public static C9264n3 m43224B() {
        return zza;
    }

    /* renamed from: C */
    public final String mo37746C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final List mo37747D() {
        return this.zzi;
    }

    /* renamed from: F */
    public final boolean mo37748F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo37749G() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: H */
    public final boolean mo37750H() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo37751I() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: J */
    public final int mo37752J() {
        int a = C9248m3.m43197a(this.zzf);
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
            return C9330r8.m43557n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C9233l3.f45186a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C9264n3();
        } else {
            if (i2 == 4) {
                return new C9203j3((C9387v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37753z() {
        return this.zzi.size();
    }
}
