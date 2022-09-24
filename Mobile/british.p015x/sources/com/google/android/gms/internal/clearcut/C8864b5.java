package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;

/* renamed from: com.google.android.gms.internal.clearcut.b5 */
public final class C8864b5 extends C8891f1<C8864b5, C8865a> implements C8961n2 {
    private static volatile C9017v2<C8864b5> zzbg;
    /* access modifiers changed from: private */
    public static final C8864b5 zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    /* renamed from: com.google.android.gms.internal.clearcut.b5$a */
    public static final class C8865a extends C8891f1.C8892a<C8864b5, C8865a> implements C8961n2 {
        private C8865a() {
            super(C8864b5.zztx);
        }

        /* synthetic */ C8865a(C8889e5 e5Var) {
            this();
        }
    }

    static {
        C8864b5 b5Var = new C8864b5();
        zztx = b5Var;
        C8891f1.m41753m(C8864b5.class, b5Var);
    }

    private C8864b5() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.f1$b, com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.b5>] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo36855j(int i, Object obj, Object obj2) {
        C9017v2<C8864b5> v2Var;
        switch (C8889e5.f44509a[i - 1]) {
            case 1:
                return new C8864b5();
            case 2:
                return new C8865a((C8889e5) null);
            case 3:
                return C8891f1.m41751k(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                C9017v2<C8864b5> v2Var2 = zzbg;
                C9017v2<C8864b5> v2Var3 = v2Var2;
                if (v2Var2 == null) {
                    synchronized (C8864b5.class) {
                        C9017v2<C8864b5> v2Var4 = zzbg;
                        v2Var = v2Var4;
                        if (v2Var4 == null) {
                            ? bVar = new C8891f1.C8893b(zztx);
                            zzbg = bVar;
                            v2Var = bVar;
                        }
                    }
                    v2Var3 = v2Var;
                }
                return v2Var3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
