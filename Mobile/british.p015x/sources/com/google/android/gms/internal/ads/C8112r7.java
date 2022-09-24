package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8112r7 extends kp3<C8112r7, C8076q7> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8112r7 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C8112r7 r7Var = new C8112r7();
        zzb = r7Var;
        kp3.m34067t(C8112r7.class, r7Var);
    }

    private C8112r7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8112r7();
        } else {
            if (i2 == 4) {
                return new C8076q7((C8005o7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
