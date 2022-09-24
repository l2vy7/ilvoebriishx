package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.za */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8841za extends C8705qc<C8841za, C8826ya> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8841za zzi;
    private int zzb;
    private long zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;

    static {
        C8841za zaVar = new C8841za();
        zzi = zaVar;
        C8705qc.m41246g(C8841za.class, zaVar);
    }

    private C8841za() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C8841za();
        } else {
            if (i2 == 4) {
                return new C8826ya((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
