package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.u8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8762u8 extends C8705qc<C8762u8, C8747t8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8762u8 zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private C8438a8 zzg;

    static {
        C8762u8 u8Var = new C8762u8();
        zzh = u8Var;
        C8705qc.m41246g(C8762u8.class, u8Var);
    }

    private C8762u8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", C8788w3.m41372d(), "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8762u8();
        } else {
            if (i2 == 4) {
                return new C8747t8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }
}
