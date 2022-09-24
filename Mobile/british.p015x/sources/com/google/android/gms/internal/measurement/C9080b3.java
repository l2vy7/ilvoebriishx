package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9080b3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9080b3 zza;
    private int zze;
    private C9264n3 zzf;
    private C9158g3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C9080b3 b3Var = new C9080b3();
        zza = b3Var;
        C9330r8.m43558o(C9080b3.class, b3Var);
    }

    private C9080b3() {
    }

    /* renamed from: A */
    public static C9080b3 m42648A() {
        return zza;
    }

    /* renamed from: F */
    static /* synthetic */ void m42649F(C9080b3 b3Var, String str) {
        b3Var.zze |= 8;
        b3Var.zzi = str;
    }

    /* renamed from: B */
    public final C9158g3 mo37385B() {
        C9158g3 g3Var = this.zzg;
        return g3Var == null ? C9158g3.m42912A() : g3Var;
    }

    /* renamed from: C */
    public final C9264n3 mo37386C() {
        C9264n3 n3Var = this.zzf;
        return n3Var == null ? C9264n3.m43224B() : n3Var;
    }

    /* renamed from: D */
    public final String mo37387D() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean mo37388G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo37389H() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo37390I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo37391J() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: K */
    public final boolean mo37392K() {
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
            return C9330r8.m43557n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C9080b3();
        } else {
            if (i2 == 4) {
                return new C9065a3((C9387v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
