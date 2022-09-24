package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8415zq extends kp3<C8415zq, C8379yq> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8415zq zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C8415zq zqVar = new C8415zq();
        zzb = zqVar;
        kp3.m34067t(C8415zq.class, zqVar);
    }

    private C8415zq() {
    }

    /* renamed from: E */
    public static C8379yq m40418E() {
        return (C8379yq) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m40420H(C8415zq zqVar, boolean z) {
        zqVar.zze |= 1;
        zqVar.zzf = z;
    }

    /* renamed from: I */
    static /* synthetic */ void m40421I(C8415zq zqVar, boolean z) {
        zqVar.zze |= 2;
        zqVar.zzg = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m40422J(C8415zq zqVar, int i) {
        zqVar.zze |= 4;
        zqVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C8415zq();
        } else {
            if (i2 == 4) {
                return new C8379yq((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
