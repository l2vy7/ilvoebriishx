package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7747h8 extends kp3<C7747h8, C7711g8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7747h8 zzb;
    private int zze;
    private int zzf;

    static {
        C7747h8 h8Var = new C7747h8();
        zzb = h8Var;
        kp3.m34067t(C7747h8.class, h8Var);
    }

    private C7747h8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", C7895l8.f34944a});
        } else if (i2 == 3) {
            return new C7747h8();
        } else {
            if (i2 == 4) {
                return new C7711g8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
