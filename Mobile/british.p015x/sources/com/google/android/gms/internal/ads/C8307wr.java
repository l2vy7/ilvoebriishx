package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8307wr extends kp3<C8307wr, C8274vr> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8307wr zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi = 1000;
    private C7769ht zzj;
    /* access modifiers changed from: private */
    public sp3 zzk = kp3.m34062o();
    private C8025or zzl;
    private C8131rr zzm;
    private C7915ls zzn;
    private C8130rq zzo;
    private C8275vs zzp;
    private C7622du zzq;
    private C7513ar zzr;

    static {
        C8307wr wrVar = new C8307wr();
        zzb = wrVar;
        kp3.m34067t(C8307wr.class, wrVar);
    }

    private C8307wr() {
    }

    /* renamed from: H */
    public static C8274vr m39240H() {
        return (C8274vr) zzb.mo33147w();
    }

    /* renamed from: K */
    static /* synthetic */ void m39242K(C8307wr wrVar, String str) {
        str.getClass();
        wrVar.zze |= 2;
        wrVar.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m39243L(C8307wr wrVar, Iterable iterable) {
        sp3 sp3 = wrVar.zzk;
        if (!sp3.zzc()) {
            int size = sp3.size();
            wrVar.zzk = sp3.mo32935m(size == 0 ? 10 : size + size);
        }
        ln3.m34512f(iterable, wrVar.zzk);
    }

    /* renamed from: N */
    static /* synthetic */ void m39245N(C8307wr wrVar, C8025or orVar) {
        orVar.getClass();
        wrVar.zzl = orVar;
        wrVar.zze |= 32;
    }

    /* renamed from: O */
    static /* synthetic */ void m39246O(C8307wr wrVar, C8130rq rqVar) {
        rqVar.getClass();
        wrVar.zzo = rqVar;
        wrVar.zze |= 256;
    }

    /* renamed from: P */
    static /* synthetic */ void m39247P(C8307wr wrVar, C8275vs vsVar) {
        vsVar.getClass();
        wrVar.zzp = vsVar;
        wrVar.zze |= 512;
    }

    /* renamed from: Q */
    static /* synthetic */ void m39248Q(C8307wr wrVar, C7622du duVar) {
        duVar.getClass();
        wrVar.zzq = duVar;
        wrVar.zze |= 1024;
    }

    /* renamed from: R */
    static /* synthetic */ void m39249R(C8307wr wrVar, C7513ar arVar) {
        arVar.getClass();
        wrVar.zzr = arVar;
        wrVar.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C8201tr.f39495a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new C8307wr();
        } else {
            if (i2 == 4) {
                return new C8274vr((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final C8130rq mo35659E() {
        C8130rq rqVar = this.zzo;
        return rqVar == null ? C8130rq.m37178F() : rqVar;
    }

    /* renamed from: F */
    public final C8025or mo35660F() {
        C8025or orVar = this.zzl;
        return orVar == null ? C8025or.m35805F() : orVar;
    }

    /* renamed from: J */
    public final String mo35661J() {
        return this.zzg;
    }
}
