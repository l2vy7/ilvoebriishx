package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8041p8 extends kp3<C8041p8, C8006o8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8041p8 zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        C8041p8 p8Var = new C8041p8();
        zzb = p8Var;
        kp3.m34067t(C8041p8.class, p8Var);
    }

    private C8041p8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C7495a9.f29564a});
        } else if (i2 == 3) {
            return new C8041p8();
        } else {
            if (i2 == 4) {
                return new C8006o8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
