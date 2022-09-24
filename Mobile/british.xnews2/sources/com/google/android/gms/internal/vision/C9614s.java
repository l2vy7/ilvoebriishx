package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.s */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9614s extends C9643v2<C9614s, C9615a> implements C9538i4 {
    private static volatile C9587o4<C9614s> zzbk;
    private static final C9494d3<Integer, C9624t0> zzoh = new C9518g0();
    /* access modifiers changed from: private */
    public static final C9614s zzoi;
    private C9465a3 zzog = C9643v2.m44630q();

    /* renamed from: com.google.android.gms.internal.vision.s$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9615a extends C9643v2.C9644a<C9614s, C9615a> implements C9538i4 {
        private C9615a() {
            super(C9614s.zzoi);
        }

        /* synthetic */ C9615a(C9598q qVar) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.g0, com.google.android.gms.internal.vision.d3<java.lang.Integer, com.google.android.gms.internal.vision.t0>] */
    static {
        C9614s sVar = new C9614s();
        zzoi = sVar;
        C9643v2.m44627m(C9614s.class, sVar);
    }

    private C9614s() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.s>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9614s> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9614s();
            case 2:
                return new C9615a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzoi, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzog", C9624t0.m44581d()});
            case 4:
                return zzoi;
            case 5:
                C9587o4<C9614s> o4Var2 = zzbk;
                C9587o4<C9614s> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9614s.class) {
                        C9587o4<C9614s> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzoi);
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
