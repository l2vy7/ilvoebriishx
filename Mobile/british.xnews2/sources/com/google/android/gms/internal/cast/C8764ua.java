package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ua */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8764ua extends C8705qc<C8764ua, C8749ta> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8764ua zzi;
    private int zzb;
    private String zze = "";
    private C8843zc<C8622l9> zzf = C8705qc.m41251l();
    private C8843zc<C8809x8> zzg = C8705qc.m41251l();
    private boolean zzh;

    static {
        C8764ua uaVar = new C8764ua();
        zzi = uaVar;
        C8705qc.m41246g(C8764ua.class, uaVar);
    }

    private C8764ua() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzb", "zze", "zzf", C8622l9.class, "zzg", C8809x8.class, "zzh"});
        } else if (i2 == 3) {
            return new C8764ua();
        } else {
            if (i2 == 4) {
                return new C8749ta((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
