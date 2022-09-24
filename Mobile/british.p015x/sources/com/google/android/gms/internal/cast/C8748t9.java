package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.t9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8748t9 extends C8705qc<C8748t9, C8733s9> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8748t9 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C8748t9 t9Var = new C8748t9();
        zzi = t9Var;
        C8705qc.m41246g(C8748t9.class, t9Var);
    }

    private C8748t9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zze", C8486d5.m40759d(), "zzf", "zzg", C8700q7.m41240d()});
        } else if (i2 == 3) {
            return new C8748t9();
        } else {
            if (i2 == 4) {
                return new C8733s9((C8715r7) null);
            }
            if (i2 == 5) {
                return zzi;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
