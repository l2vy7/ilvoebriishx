package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.x8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8809x8 extends C8705qc<C8809x8, C8793w8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8809x8 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        C8809x8 x8Var = new C8809x8();
        zzg = x8Var;
        C8705qc.m41246g(C8809x8.class, x8Var);
    }

    private C8809x8() {
    }

    /* renamed from: m */
    public static C8793w8 m41407m() {
        return (C8793w8) zzg.mo36673e();
    }

    /* renamed from: o */
    static /* synthetic */ void m41409o(C8809x8 x8Var, String str) {
        str.getClass();
        x8Var.zzb |= 1;
        x8Var.zze = str;
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
            return new C8809x8();
        } else {
            if (i2 == 4) {
                return new C8793w8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
