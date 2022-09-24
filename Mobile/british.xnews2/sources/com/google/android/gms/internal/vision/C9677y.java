package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.y */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9677y extends C9643v2<C9677y, C9678a> implements C9538i4 {
    private static volatile C9587o4<C9677y> zzbk;
    /* access modifiers changed from: private */
    public static final C9677y zzqq;
    private int zzbm;
    private float zzqk;
    private float zzql;
    private float zzqm;
    private float zzqn;
    private float zzqo;
    private float zzqp;

    /* renamed from: com.google.android.gms.internal.vision.y$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9678a extends C9643v2.C9644a<C9677y, C9678a> implements C9538i4 {
        private C9678a() {
            super(C9677y.zzqq);
        }

        /* synthetic */ C9678a(C9598q qVar) {
            this();
        }
    }

    static {
        C9677y yVar = new C9677y();
        zzqq = yVar;
        C9643v2.m44627m(C9677y.class, yVar);
    }

    private C9677y() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.y>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9677y> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9677y();
            case 2:
                return new C9678a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzqq, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzbm", "zzqk", "zzql", "zzqm", "zzqn", "zzqo", "zzqp"});
            case 4:
                return zzqq;
            case 5:
                C9587o4<C9677y> o4Var2 = zzbk;
                C9587o4<C9677y> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9677y.class) {
                        C9587o4<C9677y> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzqq);
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
