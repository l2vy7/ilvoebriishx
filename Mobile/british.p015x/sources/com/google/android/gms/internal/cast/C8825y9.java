package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.y9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8825y9 extends C8705qc<C8825y9, C8810x9> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8825y9 zzh;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        C8825y9 y9Var = new C8825y9();
        zzh = y9Var;
        C8705qc.m41246g(C8825y9.class, y9Var);
    }

    private C8825y9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zze", C8535g5.m40925d(), "zzf", "zzg", C8484d3.m40758d()});
        } else if (i2 == 3) {
            return new C8825y9();
        } else {
            if (i2 == 4) {
                return new C8810x9((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }
}
