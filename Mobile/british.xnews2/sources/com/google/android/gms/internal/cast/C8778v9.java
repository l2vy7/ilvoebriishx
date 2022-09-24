package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.v9 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8778v9 extends C8705qc<C8778v9, C8763u9> implements C8798wd {
    /* access modifiers changed from: private */
    public static final C8778v9 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        C8778v9 v9Var = new C8778v9();
        zzg = v9Var;
        C8705qc.m41246g(C8778v9.class, v9Var);
    }

    private C8778v9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C8778v9();
        } else {
            if (i2 == 4) {
                return new C8763u9((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
