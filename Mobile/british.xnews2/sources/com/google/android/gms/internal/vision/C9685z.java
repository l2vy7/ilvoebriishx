package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.z */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9685z extends C9643v2<C9685z, C9686a> implements C9538i4 {
    private static volatile C9587o4<C9685z> zzbk;
    /* access modifiers changed from: private */
    public static final C9685z zzqu;
    private int zzbm;
    private C9460a0 zzqr;
    private C9479c0 zzqs;
    private C9485c3<C9657w> zzqt = C9643v2.m44631r();

    /* renamed from: com.google.android.gms.internal.vision.z$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9686a extends C9643v2.C9644a<C9685z, C9686a> implements C9538i4 {
        private C9686a() {
            super(C9685z.zzqu);
        }

        /* synthetic */ C9686a(C9598q qVar) {
            this();
        }
    }

    static {
        C9685z zVar = new C9685z();
        zzqu = zVar;
        C9643v2.m44627m(C9685z.class, zVar);
    }

    private C9685z() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.z>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9685z> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9685z();
            case 2:
                return new C9686a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzqu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzbm", "zzqr", "zzqs", "zzqt", C9657w.class});
            case 4:
                return zzqu;
            case 5:
                C9587o4<C9685z> o4Var2 = zzbk;
                C9587o4<C9685z> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9685z.class) {
                        C9587o4<C9685z> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzqu);
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
