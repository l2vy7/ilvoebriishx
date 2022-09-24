package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.b9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8456b9 extends C8705qc<C8456b9, C8824y8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8456b9 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private C8843zc<C8439a9> zzh = C8705qc.m41251l();

    static {
        C8456b9 b9Var = new C8456b9();
        zzi = b9Var;
        C8705qc.m41246g(C8456b9.class, b9Var);
    }

    private C8456b9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C8439a9.class});
        } else if (i2 == 3) {
            return new C8456b9();
        } else {
            if (i2 == 4) {
                return new C8824y8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
