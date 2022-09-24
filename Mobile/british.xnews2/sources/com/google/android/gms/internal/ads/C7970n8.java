package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7970n8 extends kp3<C7970n8, C7932m8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7970n8 zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        C7970n8 n8Var = new C7970n8();
        zzb = n8Var;
        kp3.m34067t(C7970n8.class, n8Var);
    }

    private C7970n8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", C7822j8.f33797a, "zzg"});
        } else if (i2 == 3) {
            return new C7970n8();
        } else {
            if (i2 == 4) {
                return new C7932m8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
