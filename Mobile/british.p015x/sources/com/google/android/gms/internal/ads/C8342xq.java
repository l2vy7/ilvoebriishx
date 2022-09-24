package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8342xq extends kp3<C8342xq, C8306wq> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8342xq zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C8342xq xqVar = new C8342xq();
        zzb = xqVar;
        kp3.m34067t(C8342xq.class, xqVar);
    }

    private C8342xq() {
    }

    /* renamed from: E */
    public static C8306wq m39528E() {
        return (C8306wq) zzb.mo33147w();
    }

    /* renamed from: H */
    public static C8342xq m39530H() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m39531I(C8342xq xqVar, boolean z) {
        xqVar.zze |= 1;
        xqVar.zzf = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m39532J(C8342xq xqVar, int i) {
        xqVar.zze |= 2;
        xqVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8342xq();
        } else {
            if (i2 == 4) {
                return new C8306wq((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
