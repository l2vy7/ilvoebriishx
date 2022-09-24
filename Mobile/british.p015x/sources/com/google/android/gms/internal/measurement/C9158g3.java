package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9158g3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9158g3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C9158g3 g3Var = new C9158g3();
        zza = g3Var;
        C9330r8.m43558o(C9158g3.class, g3Var);
    }

    private C9158g3() {
    }

    /* renamed from: A */
    public static C9158g3 m42912A() {
        return zza;
    }

    /* renamed from: B */
    public final String mo37582B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final String mo37583C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final String mo37584D() {
        return this.zzi;
    }

    /* renamed from: F */
    public final boolean mo37585F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo37586G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final boolean mo37587H() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo37588I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo37589J() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: K */
    public final boolean mo37590K() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: L */
    public final int mo37591L() {
        int a = C9142f3.m42843a(this.zzf);
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
            return C9330r8.m43557n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C9127e3.f45003a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C9158g3();
        } else {
            if (i2 == 4) {
                return new C9095c3((C9387v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
