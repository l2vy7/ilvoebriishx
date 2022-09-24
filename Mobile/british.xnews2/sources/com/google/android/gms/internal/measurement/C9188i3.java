package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9188i3 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9188i3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C9080b3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C9188i3 i3Var = new C9188i3();
        zza = i3Var;
        C9330r8.m43558o(C9188i3.class, i3Var);
    }

    private C9188i3() {
    }

    /* renamed from: B */
    public static C9173h3 m43008B() {
        return (C9173h3) zza.mo37996p();
    }

    /* renamed from: F */
    static /* synthetic */ void m43010F(C9188i3 i3Var, String str) {
        i3Var.zze |= 2;
        i3Var.zzg = str;
    }

    /* renamed from: A */
    public final C9080b3 mo37624A() {
        C9080b3 b3Var = this.zzh;
        return b3Var == null ? C9080b3.m42648A() : b3Var;
    }

    /* renamed from: D */
    public final String mo37625D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo37626G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean mo37627H() {
        return this.zzj;
    }

    /* renamed from: I */
    public final boolean mo37628I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final boolean mo37629J() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: K */
    public final boolean mo37630K() {
        return (this.zze & 32) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C9188i3();
        } else {
            if (i2 == 4) {
                return new C9173h3((C9387v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37631z() {
        return this.zzf;
    }
}
