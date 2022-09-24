package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8200tq extends kp3<C8200tq, C8164sq> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8200tq zzb;
    private int zze;
    private int zzf;
    private C8342xq zzg;
    private C8415zq zzh;

    static {
        C8200tq tqVar = new C8200tq();
        zzb = tqVar;
        kp3.m34067t(C8200tq.class, tqVar);
    }

    private C8200tq() {
    }

    /* renamed from: E */
    public static C8164sq m37948E() {
        return (C8164sq) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m37950H(C8200tq tqVar, C8342xq xqVar) {
        xqVar.getClass();
        tqVar.zzg = xqVar;
        tqVar.zze |= 2;
    }

    /* renamed from: I */
    static /* synthetic */ void m37951I(C8200tq tqVar, C8415zq zqVar) {
        zqVar.getClass();
        tqVar.zzh = zqVar;
        tqVar.zze |= 4;
    }

    /* renamed from: J */
    static /* synthetic */ void m37952J(C8200tq tqVar, int i) {
        tqVar.zzf = 1;
        tqVar.zze = 1 | tqVar.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C8273vq.f40510a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C8200tq();
        } else {
            if (i2 == 4) {
                return new C8164sq((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
