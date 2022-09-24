package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8181t7 extends kp3<C8181t7, C8040p7> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8181t7 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private long zzl;
    private String zzm = "";
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private tp3<C8112r7> zzq = kp3.m34063p();
    private int zzr;

    static {
        C8181t7 t7Var = new C8181t7();
        zzb = t7Var;
        kp3.m34067t(C8181t7.class, t7Var);
    }

    private C8181t7() {
    }

    /* renamed from: E */
    public static C8040p7 m37699E() {
        return (C8040p7) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m37701H(C8181t7 t7Var, long j) {
        t7Var.zze |= 2;
        t7Var.zzg = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m37702I(C8181t7 t7Var, String str) {
        str.getClass();
        t7Var.zze |= 4;
        t7Var.zzh = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m37703J(C8181t7 t7Var, String str) {
        str.getClass();
        t7Var.zze |= 8;
        t7Var.zzi = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m37704K(C8181t7 t7Var, String str) {
        t7Var.zze |= 16;
        t7Var.zzj = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m37705L(C8181t7 t7Var, String str) {
        t7Var.zze |= 1024;
        t7Var.zzp = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m37706M(C8181t7 t7Var, String str) {
        str.getClass();
        t7Var.zze |= 1;
        t7Var.zzf = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m37707N(C8181t7 t7Var, int i) {
        t7Var.zzr = i - 1;
        t7Var.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", C8112r7.class, "zzr", C8146s7.f38886a});
        } else if (i2 == 3) {
            return new C8181t7();
        } else {
            if (i2 == 4) {
                return new C8040p7((C8005o7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
