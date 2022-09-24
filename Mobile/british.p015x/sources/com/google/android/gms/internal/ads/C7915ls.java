package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ls */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7915ls extends kp3<C7915ls, C7620ds> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7915ls zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C7915ls lsVar = new C7915ls();
        zzb = lsVar;
        kp3.m34067t(C7915ls.class, lsVar);
    }

    private C7915ls() {
    }

    /* renamed from: E */
    public static C7620ds m34536E() {
        return (C7620ds) zzb.mo33147w();
    }

    /* renamed from: H */
    public static C7915ls m34538H() {
        return zzb;
    }

    /* renamed from: M */
    static /* synthetic */ void m34539M(C7915ls lsVar, int i) {
        lsVar.zzf = i - 1;
        lsVar.zze |= 1;
    }

    /* renamed from: N */
    static /* synthetic */ void m34540N(C7915ls lsVar, int i) {
        lsVar.zzg = i - 1;
        lsVar.zze |= 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", C7805is.f33501a, "zzg", C7694fs.f31866a});
        } else if (i2 == 3) {
            return new C7915ls();
        } else {
            if (i2 == 4) {
                return new C7620ds((C7951mq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final boolean mo33390I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo33391J() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: K */
    public final int mo33392K() {
        int a = C7730gs.m32676a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: L */
    public final int mo33393L() {
        int a = C7841js.m33742a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
