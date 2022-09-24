package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ca */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8474ca extends C8705qc<C8474ca, C8457ba> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8474ca zzh;
    private int zzb;
    private long zze;
    private C8813xc zzf = C8705qc.m41250k();
    private C8813xc zzg = C8705qc.m41250k();

    static {
        C8474ca caVar = new C8474ca();
        zzh = caVar;
        C8705qc.m41246g(C8474ca.class, caVar);
    }

    private C8474ca() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8474ca();
        } else {
            if (i2 == 4) {
                return new C8457ba((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }
}
