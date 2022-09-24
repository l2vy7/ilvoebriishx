package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8203tt extends kp3<C8203tt, C8167st> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8203tt zzb;
    private int zze;
    private int zzf = 1000;
    private C8062pt zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C8203tt ttVar = new C8203tt();
        zzb = ttVar;
        kp3.m34067t(C8203tt.class, ttVar);
    }

    private C8203tt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", C8201tr.f39495a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C8203tt();
        } else {
            if (i2 == 4) {
                return new C8167st((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
