package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.bb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8458bb extends C8705qc<C8458bb, C8441ab> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8458bb zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private C8438a8 zzg;

    static {
        C8458bb bbVar = new C8458bb();
        zzh = bbVar;
        C8705qc.m41246g(C8458bb.class, bbVar);
    }

    private C8458bb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", C8714r6.m41266d(), "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8458bb();
        } else {
            if (i2 == 4) {
                return new C8441ab((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }
}
