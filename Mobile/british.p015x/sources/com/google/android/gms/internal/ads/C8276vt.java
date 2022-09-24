package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8276vt extends kp3<C8276vt, C8239ut> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8276vt zzb;
    private int zze;
    private int zzf = 1000;
    private C8062pt zzg;
    private C7695ft zzh;

    static {
        C8276vt vtVar = new C8276vt();
        zzb = vtVar;
        kp3.m34067t(C8276vt.class, vtVar);
    }

    private C8276vt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C8201tr.f39495a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C8276vt();
        } else {
            if (i2 == 4) {
                return new C8239ut((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
