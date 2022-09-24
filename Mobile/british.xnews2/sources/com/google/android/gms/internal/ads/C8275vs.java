package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vs */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8275vs extends kp3<C8275vs, C8132rs> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8275vs zzb;
    private int zze;
    private tp3<C8097qs> zzf = kp3.m34063p();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private long zzl;

    static {
        C8275vs vsVar = new C8275vs();
        zzb = vsVar;
        kp3.m34067t(C8275vs.class, vsVar);
    }

    private C8275vs() {
    }

    /* renamed from: E */
    public static C8132rs m38908E() {
        return (C8132rs) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m38910H(C8275vs vsVar, Iterable iterable) {
        tp3<C8097qs> tp3 = vsVar.zzf;
        if (!tp3.zzc()) {
            vsVar.zzf = kp3.m34064q(tp3);
        }
        ln3.m34512f(iterable, vsVar.zzf);
    }

    /* renamed from: I */
    static /* synthetic */ void m38911I(C8275vs vsVar, int i) {
        vsVar.zze |= 1;
        vsVar.zzg = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m38912J(C8275vs vsVar, int i) {
        vsVar.zze |= 2;
        vsVar.zzh = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m38913K(C8275vs vsVar, long j) {
        vsVar.zze |= 4;
        vsVar.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m38914L(C8275vs vsVar, String str) {
        str.getClass();
        vsVar.zze |= 8;
        vsVar.zzj = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m38915M(C8275vs vsVar, String str) {
        str.getClass();
        vsVar.zze |= 16;
        vsVar.zzk = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m38916N(C8275vs vsVar, long j) {
        vsVar.zze |= 32;
        vsVar.zzl = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", C8097qs.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C8275vs();
        } else {
            if (i2 == 4) {
                return new C8132rs((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
