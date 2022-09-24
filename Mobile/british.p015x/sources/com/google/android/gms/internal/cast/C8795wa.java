package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.wa */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8795wa extends C8705qc<C8795wa, C8779va> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8795wa zzf;
    private int zzb;
    private C8438a8 zze;

    static {
        C8795wa waVar = new C8795wa();
        zzf = waVar;
        C8705qc.m41246g(C8795wa.class, waVar);
    }

    private C8795wa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new C8795wa();
        } else {
            if (i2 == 4) {
                return new C8779va((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }
}
