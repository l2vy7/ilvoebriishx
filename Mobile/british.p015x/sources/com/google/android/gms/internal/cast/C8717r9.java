package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.r9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8717r9 extends C8705qc<C8717r9, C8702q9> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8717r9 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C8717r9 r9Var = new C8717r9();
        zzg = r9Var;
        C8705qc.m41246g(C8717r9.class, r9Var);
    }

    private C8717r9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", C8834z3.m41448d(), "zzf"});
        } else if (i2 == 3) {
            return new C8717r9();
        } else {
            if (i2 == 4) {
                return new C8702q9((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
