package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.t */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9622t extends C9643v2<C9622t, C9623a> implements C9538i4 {
    private static volatile C9587o4<C9622t> zzbk;
    /* access modifiers changed from: private */
    public static final C9622t zzom;
    private int zzbm;
    private int zzoj;
    private int zzok;
    private String zzol = "";

    /* renamed from: com.google.android.gms.internal.vision.t$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9623a extends C9643v2.C9644a<C9622t, C9623a> implements C9538i4 {
        private C9623a() {
            super(C9622t.zzom);
        }

        /* synthetic */ C9623a(C9598q qVar) {
            this();
        }
    }

    static {
        C9622t tVar = new C9622t();
        zzom = tVar;
        C9643v2.m44627m(C9622t.class, tVar);
    }

    private C9622t() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.t>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9622t> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9622t();
            case 2:
                return new C9623a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzom, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzbm", "zzoj", C9624t0.m44581d(), "zzok", C9679y0.m44838d(), "zzol"});
            case 4:
                return zzom;
            case 5:
                C9587o4<C9622t> o4Var2 = zzbk;
                C9587o4<C9622t> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9622t.class) {
                        C9587o4<C9622t> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzom);
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
