package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.c8 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8472c8 extends C8705qc<C8472c8, C8455b8> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8472c8 zzl;
    private int zzb;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private C8843zc<C8574ia> zzi = C8705qc.m41251l();
    private C8843zc<C8574ia> zzj = C8705qc.m41251l();
    private String zzk = "";

    static {
        C8472c8 c8Var = new C8472c8();
        zzl = c8Var;
        C8705qc.m41246g(C8472c8.class, c8Var);
    }

    private C8472c8() {
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
            return C8705qc.m41247h(zzl, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzb", "zze", C8711r2.m41265d(), "zzf", "zzg", C8468c4.m40723d(), "zzh", "zzi", cls, "zzj", cls, "zzk"});
        } else if (i2 == 3) {
            return new C8472c8();
        } else {
            if (i2 == 4) {
                return new C8455b8((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzl;
        }
    }
}
