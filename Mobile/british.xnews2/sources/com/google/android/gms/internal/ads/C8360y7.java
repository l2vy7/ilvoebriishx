package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8360y7 extends kp3<C8360y7, C8324x7> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8360y7 zzb;
    private int zze;
    private int zzf = 2;

    static {
        C8360y7 y7Var = new C8360y7();
        zzb = y7Var;
        kp3.m34067t(C8360y7.class, y7Var);
    }

    private C8360y7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", C8396z7.f42333a});
        } else if (i2 == 3) {
            return new C8360y7();
        } else {
            if (i2 == 4) {
                return new C8324x7((C8217u7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
