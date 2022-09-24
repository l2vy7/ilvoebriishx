package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8133rt extends kp3<C8133rt, C8098qt> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8133rt zzb;
    private int zze;
    private C7769ht zzf;
    private int zzg = 1000;
    private C8062pt zzh;
    private C7695ft zzi;

    static {
        C8133rt rtVar = new C8133rt();
        zzb = rtVar;
        kp3.m34067t(C8133rt.class, rtVar);
    }

    private C8133rt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", C8201tr.f39495a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C8133rt();
        } else {
            if (i2 == 4) {
                return new C8098qt((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
