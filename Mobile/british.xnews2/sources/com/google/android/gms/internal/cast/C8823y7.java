package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.y7 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8823y7 extends C8705qc<C8823y7, C8808x7> implements C8798wd {
    private static final C8797wc<Integer, C8652n7> zzi = new C8792w7();
    /* access modifiers changed from: private */
    public static final C8823y7 zzj;
    private int zzb;
    private C8505e8 zze;
    private C8778v9 zzf;
    private C8843zc<C8717r9> zzg = C8705qc.m41251l();
    private C8781vc zzh = C8705qc.m41249j();

    static {
        C8823y7 y7Var = new C8823y7();
        zzj = y7Var;
        C8705qc.m41246g(C8823y7.class, y7Var);
    }

    private C8823y7() {
    }

    /* renamed from: m */
    public static C8808x7 m41429m() {
        return (C8808x7) zzj.mo36673e();
    }

    /* renamed from: o */
    static /* synthetic */ void m41431o(C8823y7 y7Var, C8505e8 e8Var) {
        e8Var.getClass();
        y7Var.zze = e8Var;
        y7Var.zzb |= 1;
    }

    /* renamed from: p */
    static /* synthetic */ void m41432p(C8823y7 y7Var, Iterable iterable) {
        C8781vc vcVar = y7Var.zzh;
        if (!vcVar.zza()) {
            int size = vcVar.size();
            y7Var.zzh = vcVar.mo36705l(size == 0 ? 10 : size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            y7Var.zzh.mo36704k(((C8652n7) it.next()).zza());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo36369d(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8705qc.m41247h(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzb", "zze", "zzf", "zzg", C8717r9.class, "zzh", C8652n7.m41148d()});
        } else if (i2 == 3) {
            return new C8823y7();
        } else {
            if (i2 == 4) {
                return new C8808x7((C8715r7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
