package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7712g9 extends kp3<C7712g9, C7638e9> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7712g9 zzb;
    private int zze;
    private String zzf = "";

    static {
        C7712g9 g9Var = new C7712g9();
        zzb = g9Var;
        kp3.m34067t(C7712g9.class, g9Var);
    }

    private C7712g9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new C7712g9();
        } else {
            if (i2 == 4) {
                return new C7638e9((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
