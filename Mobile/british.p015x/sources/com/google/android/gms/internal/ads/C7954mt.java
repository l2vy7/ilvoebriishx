package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7954mt extends kp3<C7954mt, C7879kt> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7954mt zzb;
    private int zze;
    private int zzf = 1000;
    private C8062pt zzg;
    private C7695ft zzh;

    static {
        C7954mt mtVar = new C7954mt();
        zzb = mtVar;
        kp3.m34067t(C7954mt.class, mtVar);
    }

    private C7954mt() {
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
            return new C7954mt();
        } else {
            if (i2 == 4) {
                return new C7879kt((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
