package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.fb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8525fb extends C8705qc<C8525fb, C8508eb> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8525fb zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private C8843zc<C8809x8> zzg = C8705qc.m41251l();
    private C8843zc<C8809x8> zzh = C8705qc.m41251l();
    private int zzi;

    static {
        C8525fb fbVar = new C8525fb();
        zzj = fbVar;
        C8705qc.m41246g(C8525fb.class, fbVar);
    }

    private C8525fb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        Class<C8809x8> cls = C8809x8.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zzb", "zze", C8454b7.m40715d(), "zzf", C8504e7.m40789d(), "zzg", cls, "zzh", cls, "zzi", C8468c4.m40723d()});
        } else if (i2 == 3) {
            return new C8525fb();
        } else {
            if (i2 == 4) {
                return new C8508eb((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
