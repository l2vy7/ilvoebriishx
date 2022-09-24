package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7786i9 extends kp3<C7786i9, C7748h9> implements vq3 {
    /* access modifiers changed from: private */
    public static final C7786i9 zzb;
    private int zze;
    private tp3<eo3> zzf = kp3.m34063p();
    private eo3 zzg = eo3.f31444c;
    private int zzh = 1;
    private int zzi = 1;

    static {
        C7786i9 i9Var = new C7786i9();
        zzb = i9Var;
        kp3.m34067t(C7786i9.class, i9Var);
    }

    private C7786i9() {
    }

    /* renamed from: E */
    public static C7748h9 m33121E() {
        return (C7748h9) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m33123H(C7786i9 i9Var, eo3 eo3) {
        tp3<eo3> tp3 = i9Var.zzf;
        if (!tp3.zzc()) {
            i9Var.zzf = kp3.m34064q(tp3);
        }
        i9Var.zzf.add(eo3);
    }

    /* renamed from: I */
    static /* synthetic */ void m33124I(C7786i9 i9Var, eo3 eo3) {
        i9Var.zze |= 1;
        i9Var.zzg = eo3;
    }

    /* renamed from: J */
    static /* synthetic */ void m33125J(C7786i9 i9Var, int i) {
        i9Var.zzi = i - 1;
        i9Var.zze |= 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C7531b9.f29931a, "zzi", C8397z8.f42342a});
        } else if (i2 == 3) {
            return new C7786i9();
        } else {
            if (i2 == 4) {
                return new C7748h9((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
