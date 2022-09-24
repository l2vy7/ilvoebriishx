package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.du */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7622du extends kp3<C7622du, C7587cu> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7622du zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C7622du duVar = new C7622du();
        zzb = duVar;
        kp3.m34067t(C7622du.class, duVar);
    }

    private C7622du() {
    }

    /* renamed from: E */
    public static C7587cu m31616E() {
        return (C7587cu) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m31618H(C7622du duVar, boolean z) {
        duVar.zze |= 1;
        duVar.zzf = z;
    }

    /* renamed from: I */
    static /* synthetic */ void m31619I(C7622du duVar, int i) {
        duVar.zze |= 2;
        duVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C7622du();
        } else {
            if (i2 == 4) {
                return new C7587cu((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final boolean mo31412J() {
        return this.zzf;
    }
}
