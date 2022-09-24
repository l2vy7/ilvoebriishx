package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bu */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7551bu extends kp3<C7551bu, C7516au> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7551bu zzb;
    private int zze;
    private int zzf = 1000;
    private C8062pt zzg;

    static {
        C7551bu buVar = new C7551bu();
        zzb = buVar;
        kp3.m34067t(C7551bu.class, buVar);
    }

    private C7551bu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", C8201tr.f39495a, "zzg"});
        } else if (i2 == 3) {
            return new C7551bu();
        } else {
            if (i2 == 4) {
                return new C7516au((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
