package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8182t8 extends kp3<C8182t8, C8147s8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8182t8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        C8182t8 t8Var = new C8182t8();
        zzb = t8Var;
        kp3.m34067t(C8182t8.class, t8Var);
    }

    private C8182t8() {
    }

    /* renamed from: E */
    public static C8147s8 m37713E() {
        return (C8147s8) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m37715H(C8182t8 t8Var, long j) {
        t8Var.zze |= 4;
        t8Var.zzh = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m37716I(C8182t8 t8Var, long j) {
        t8Var.zze |= 8;
        t8Var.zzi = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m37717J(C8182t8 t8Var, long j) {
        t8Var.zze |= 16;
        t8Var.zzj = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m37718K(C8182t8 t8Var, long j) {
        t8Var.zze |= 32;
        t8Var.zzk = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C8182t8();
        } else {
            if (i2 == 4) {
                return new C8147s8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
