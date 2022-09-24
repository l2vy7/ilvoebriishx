package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.d0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9490d0 extends C9643v2<C9490d0, C9491a> implements C9538i4 {
    private static volatile C9587o4<C9490d0> zzbk;
    /* access modifiers changed from: private */
    public static final C9490d0 zzrn;
    private int zzbm;
    private int zzrl;
    private int zzrm;

    /* renamed from: com.google.android.gms.internal.vision.d0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9491a extends C9643v2.C9644a<C9490d0, C9491a> implements C9538i4 {
        private C9491a() {
            super(C9490d0.zzrn);
        }

        /* synthetic */ C9491a(C9598q qVar) {
            this();
        }
    }

    static {
        C9490d0 d0Var = new C9490d0();
        zzrn = d0Var;
        C9643v2.m44627m(C9490d0.class, d0Var);
    }

    private C9490d0() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.d0>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9490d0> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9490d0();
            case 2:
                return new C9491a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzrn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzbm", "zzrl", "zzrm"});
            case 4:
                return zzrn;
            case 5:
                C9587o4<C9490d0> o4Var2 = zzbk;
                C9587o4<C9490d0> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9490d0.class) {
                        C9587o4<C9490d0> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzrn);
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
