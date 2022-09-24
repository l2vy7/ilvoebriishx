package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.db */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8492db extends C8705qc<C8492db, C8475cb> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8492db zzi;
    private int zzb;
    private int zze;
    private C8843zc<C8574ia> zzf = C8705qc.m41251l();
    private C8843zc<C8574ia> zzg = C8705qc.m41251l();
    private int zzh;

    static {
        C8492db dbVar = new C8492db();
        zzi = dbVar;
        C8705qc.m41246g(C8492db.class, dbVar);
    }

    private C8492db() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        Class<C8574ia> cls = C8574ia.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzb", "zze", C8822y6.m41428d(), "zzf", cls, "zzg", cls, "zzh"});
        } else if (i2 == 3) {
            return new C8492db();
        } else {
            if (i2 == 4) {
                return new C8475cb((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
