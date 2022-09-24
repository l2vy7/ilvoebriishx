package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8118rd extends kp3<C8118rd, C8082qd> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8118rd zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        C8118rd rdVar = new C8118rd();
        zzb = rdVar;
        kp3.m34067t(C8118rd.class, rdVar);
    }

    private C8118rd() {
    }

    /* renamed from: I */
    public static C8082qd m37034I() {
        return (C8082qd) zzb.mo33147w();
    }

    /* renamed from: K */
    public static C8118rd m37036K() {
        return zzb;
    }

    /* renamed from: L */
    public static C8118rd m37037L(eo3 eo3) throws wp3 {
        return (C8118rd) kp3.m34069z(zzb, eo3);
    }

    /* renamed from: M */
    public static C8118rd m37038M(eo3 eo3, wo3 wo3) throws wp3 {
        return (C8118rd) kp3.m34056B(zzb, eo3, wo3);
    }

    /* renamed from: P */
    static /* synthetic */ void m37039P(C8118rd rdVar, String str) {
        str.getClass();
        rdVar.zze |= 1;
        rdVar.zzf = str;
    }

    /* renamed from: Q */
    static /* synthetic */ void m37040Q(C8118rd rdVar, long j) {
        rdVar.zze |= 16;
        rdVar.zzj = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m37041R(C8118rd rdVar, String str) {
        str.getClass();
        rdVar.zze |= 2;
        rdVar.zzg = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m37042S(C8118rd rdVar, long j) {
        rdVar.zze |= 4;
        rdVar.zzh = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m37043T(C8118rd rdVar, long j) {
        rdVar.zze |= 8;
        rdVar.zzi = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C8118rd();
        } else {
            if (i2 == 4) {
                return new C8082qd((C8046pd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: E */
    public final long mo34525E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final long mo34526F() {
        return this.zzh;
    }

    /* renamed from: H */
    public final long mo34527H() {
        return this.zzj;
    }

    /* renamed from: N */
    public final String mo34528N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final String mo34529O() {
        return this.zzf;
    }
}
