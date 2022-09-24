package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7877kr extends kp3<C7877kr, C7804ir> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7877kr zzb;
    private int zze;
    private String zzf = "";
    private tp3<C7693fr> zzg = kp3.m34063p();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        C7877kr krVar = new C7877kr();
        zzb = krVar;
        kp3.m34067t(C7877kr.class, krVar);
    }

    private C7877kr() {
    }

    /* renamed from: F */
    public static C7877kr m34113F() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m34114H(C7877kr krVar, String str) {
        str.getClass();
        krVar.zze |= 1;
        krVar.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            op3 op3 = C8201tr.f39495a;
            return kp3.m34066s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", C7693fr.class, "zzh", op3, "zzi", op3, "zzj", op3});
        } else if (i2 == 3) {
            return new C7877kr();
        } else {
            if (i2 == 4) {
                return new C7804ir((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
