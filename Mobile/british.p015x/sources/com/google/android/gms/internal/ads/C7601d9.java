package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7601d9 extends kp3<C7601d9, C7566c9> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7601d9 zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private eo3 zzh = eo3.f31444c;

    static {
        C7601d9 d9Var = new C7601d9();
        zzb = d9Var;
        kp3.m34067t(C7601d9.class, d9Var);
    }

    private C7601d9() {
    }

    /* renamed from: H */
    public static C7601d9 m31328H() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C7601d9();
        } else {
            if (i2 == 4) {
                return new C7566c9((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final long mo31185E() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo31186I() {
        return (this.zze & 1) != 0;
    }
}
