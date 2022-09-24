package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.q8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8701q8 extends C8705qc<C8701q8, C8685p8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8701q8 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C8701q8 q8Var = new C8701q8();
        zzg = q8Var;
        C8705qc.m41246g(C8701q8.class, q8Var);
    }

    private C8701q8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", C8680p3.m41210d(), "zzf", C8632m3.m41128d()});
        } else if (i2 == 3) {
            return new C8701q8();
        } else {
            if (i2 == 4) {
                return new C8685p8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
