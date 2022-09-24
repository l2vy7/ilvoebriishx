package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.f0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9508f0 extends C9643v2<C9508f0, C9509a> implements C9538i4 {
    private static volatile C9587o4<C9508f0> zzbk;
    /* access modifiers changed from: private */
    public static final C9508f0 zzrx;
    private int zzbm;
    private C9638v zzrt;
    private C9470b0 zzru;
    private C9685z zzrv;
    private int zzrw;

    /* renamed from: com.google.android.gms.internal.vision.f0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9509a extends C9643v2.C9644a<C9508f0, C9509a> implements C9538i4 {
        private C9509a() {
            super(C9508f0.zzrx);
        }

        /* synthetic */ C9509a(C9598q qVar) {
            this();
        }
    }

    static {
        C9508f0 f0Var = new C9508f0();
        zzrx = f0Var;
        C9643v2.m44627m(C9508f0.class, f0Var);
    }

    private C9508f0() {
    }

    /* renamed from: s */
    public static C9509a m44232s() {
        return (C9509a) zzrx.mo38611p();
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.v2$b, com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.f0>] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9508f0> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9508f0();
            case 2:
                return new C9509a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzrx, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"zzbm", "zzrt", "zzru", "zzrv", "zzrw"});
            case 4:
                return zzrx;
            case 5:
                C9587o4<C9508f0> o4Var2 = zzbk;
                C9587o4<C9508f0> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9508f0.class) {
                        C9587o4<C9508f0> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzrx);
                            zzbk = bVar;
                            o4Var = bVar;
                        }
                    }
                    o4Var3 = o4Var;
                }
                return o4Var3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
