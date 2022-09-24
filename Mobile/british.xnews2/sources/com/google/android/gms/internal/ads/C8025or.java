package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.or */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8025or extends kp3<C8025or, C7988nr> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8025or zzb;
    private int zze;
    private String zzf = "";
    private C7695ft zzg;
    private int zzh;
    private C7769ht zzi;
    private int zzj;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C8025or orVar = new C8025or();
        zzb = orVar;
        kp3.m34067t(C8025or.class, orVar);
    }

    private C8025or() {
    }

    /* renamed from: F */
    public static C8025or m35805F() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m35806H(C8025or orVar, String str) {
        orVar.zze |= 1;
        orVar.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m35807I(C8025or orVar, C7769ht htVar) {
        htVar.getClass();
        orVar.zzi = htVar;
        orVar.zze |= 8;
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
            return kp3.m34066s(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", op3, "zzl", op3, "zzm", op3});
        } else if (i2 == 3) {
            return new C8025or();
        } else {
            if (i2 == 4) {
                return new C7988nr((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
