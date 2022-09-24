package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.j9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8589j9 extends C8705qc<C8589j9, C8573i9> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8589j9 zzf;
    private int zzb;
    private int zze;

    static {
        C8589j9 j9Var = new C8589j9();
        zzf = j9Var;
        C8705qc.m41246g(C8589j9.class, j9Var);
    }

    private C8589j9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zze", C8665o4.m41174d()});
        } else if (i2 == 3) {
            return new C8589j9();
        } else {
            if (i2 == 4) {
                return new C8573i9((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }
}
