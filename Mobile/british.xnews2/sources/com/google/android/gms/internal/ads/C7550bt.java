package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7550bt extends kp3<C7550bt, C7515at> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7550bt zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C7550bt btVar = new C7550bt();
        zzb = btVar;
        kp3.m34067t(C7550bt.class, btVar);
    }

    private C7550bt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C7550bt();
        } else {
            if (i2 == 4) {
                return new C7515at((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
