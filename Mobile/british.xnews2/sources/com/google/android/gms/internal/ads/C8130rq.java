package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8130rq extends kp3<C8130rq, C8095qq> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8130rq zzb;
    private int zze;
    private int zzf;
    private int zzg = 1000;
    private C7767hr zzh;
    private C7877kr zzi;
    private tp3<C7693fr> zzj = kp3.m34063p();
    private C7952mr zzk;
    private C8344xs zzl;
    private C7989ns zzm;
    private C7514as zzn;
    private C7585cs zzo;
    private tp3<C7842jt> zzp = kp3.m34063p();

    static {
        C8130rq rqVar = new C8130rq();
        zzb = rqVar;
        kp3.m34067t(C8130rq.class, rqVar);
    }

    private C8130rq() {
    }

    /* renamed from: F */
    public static C8130rq m37178F() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m37179I(C8130rq rqVar, C8059pq pqVar) {
        rqVar.zzf = pqVar.zza();
        rqVar.zze |= 1;
    }

    /* renamed from: J */
    static /* synthetic */ void m37180J(C8130rq rqVar, C7877kr krVar) {
        krVar.getClass();
        rqVar.zzi = krVar;
        rqVar.zze |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", C8059pq.m36163d(), "zzg", C8201tr.f39495a, "zzh", "zzi", "zzj", C7693fr.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C7842jt.class});
        } else if (i2 == 3) {
            return new C8130rq();
        } else {
            if (i2 == 4) {
                return new C8095qq((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final C7877kr mo34583H() {
        C7877kr krVar = this.zzi;
        return krVar == null ? C7877kr.m34113F() : krVar;
    }
}
