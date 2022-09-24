package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.e8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8505e8 extends C8705qc<C8505e8, C8489d8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8505e8 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        C8505e8 e8Var = new C8505e8();
        zzg = e8Var;
        C8705qc.m41246g(C8505e8.class, e8Var);
    }

    private C8505e8() {
    }

    /* renamed from: m */
    public static C8489d8 m40790m() {
        return (C8489d8) zzg.mo36673e();
    }

    /* renamed from: o */
    static /* synthetic */ void m40792o(C8505e8 e8Var, String str) {
        str.getClass();
        e8Var.zzb |= 1;
        e8Var.zze = str;
    }

    /* renamed from: p */
    static /* synthetic */ void m40793p(C8505e8 e8Var, String str) {
        str.getClass();
        e8Var.zzb |= 2;
        e8Var.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C8505e8();
        } else {
            if (i2 == 4) {
                return new C8489d8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
