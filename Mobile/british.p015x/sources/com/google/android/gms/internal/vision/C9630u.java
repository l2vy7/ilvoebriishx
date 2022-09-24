package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.u */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9630u extends C9643v2<C9630u, C9631a> implements C9538i4 {
    private static volatile C9587o4<C9630u> zzbk;
    /* access modifiers changed from: private */
    public static final C9630u zzoo;
    private C9485c3<C9490d0> zzon = C9643v2.m44631r();

    /* renamed from: com.google.android.gms.internal.vision.u$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9631a extends C9643v2.C9644a<C9630u, C9631a> implements C9538i4 {
        private C9631a() {
            super(C9630u.zzoo);
        }

        /* synthetic */ C9631a(C9598q qVar) {
            this();
        }
    }

    static {
        C9630u uVar = new C9630u();
        zzoo = uVar;
        C9643v2.m44627m(C9630u.class, uVar);
    }

    private C9630u() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.v2$b, com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.u>] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9630u> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9630u();
            case 2:
                return new C9631a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzoo, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzon", C9490d0.class});
            case 4:
                return zzoo;
            case 5:
                C9587o4<C9630u> o4Var2 = zzbk;
                C9587o4<C9630u> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9630u.class) {
                        C9587o4<C9630u> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzoo);
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
