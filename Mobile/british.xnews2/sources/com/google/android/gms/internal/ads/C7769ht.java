package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ht */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7769ht extends kp3<C7769ht, C7731gt> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7769ht zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C7769ht htVar = new C7769ht();
        zzb = htVar;
        kp3.m34067t(C7769ht.class, htVar);
    }

    private C7769ht() {
    }

    /* renamed from: E */
    public static C7731gt m32940E() {
        return (C7731gt) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m32942H(C7769ht htVar, int i) {
        htVar.zze |= 1;
        htVar.zzf = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m32943I(C7769ht htVar, int i) {
        htVar.zze |= 2;
        htVar.zzg = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m32944J(C7769ht htVar, int i) {
        htVar.zze |= 4;
        htVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C7769ht();
        } else {
            if (i2 == 4) {
                return new C7731gt((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
