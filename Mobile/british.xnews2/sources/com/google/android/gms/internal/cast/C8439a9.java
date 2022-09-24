package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.a9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8439a9 extends C8705qc<C8439a9, C8839z8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8439a9 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C8439a9 a9Var = new C8439a9();
        zzi = a9Var;
        C8705qc.m41246g(C8439a9.class, a9Var);
    }

    private C8439a9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C8439a9();
        } else {
            if (i2 == 4) {
                return new C8839z8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
