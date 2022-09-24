package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.i8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8572i8 extends C8705qc<C8572i8, C8555h8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8572i8 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C8572i8 i8Var = new C8572i8();
        zzi = i8Var;
        C8705qc.m41246g(C8572i8.class, i8Var);
    }

    private C8572i8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", C8820y4.m41427d(), "zzh"});
        } else if (i2 == 3) {
            return new C8572i8();
        } else {
            if (i2 == 4) {
                return new C8555h8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
