package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.qa */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8703qa extends C8705qc<C8703qa, C8687pa> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8703qa zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C8703qa qaVar = new C8703qa();
        zzg = qaVar;
        C8705qc.m41246g(C8703qa.class, qaVar);
    }

    private C8703qa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", C8836z5.m41449d(), "zzf", C8836z5.m41449d()});
        } else if (i2 == 3) {
            return new C8703qa();
        } else {
            if (i2 == 4) {
                return new C8687pa((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
