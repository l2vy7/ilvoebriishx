package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.w */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9657w extends C9643v2<C9657w, C9658a> implements C9538i4 {
    private static volatile C9587o4<C9657w> zzbk;
    /* access modifiers changed from: private */
    public static final C9657w zzpl;
    private int zzbm;
    private String zzpd = "";
    private String zzpe = "";
    private C9485c3<String> zzpf = C9643v2.m44631r();
    private int zzpg;
    private String zzph = "";
    private long zzpi;
    private long zzpj;
    private C9485c3<C9499e0> zzpk = C9643v2.m44631r();

    /* renamed from: com.google.android.gms.internal.vision.w$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9658a extends C9643v2.C9644a<C9657w, C9658a> implements C9538i4 {
        private C9658a() {
            super(C9657w.zzpl);
        }

        /* synthetic */ C9658a(C9598q qVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.w$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public enum C9659b implements C9689z2 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);
        

        /* renamed from: g */
        private static final C9681y2<C9659b> f45953g = null;

        /* renamed from: b */
        private final int f45955b;

        static {
            f45953g = new C9542j0();
        }

        private C9659b(int i) {
            this.f45955b = i;
        }

        /* renamed from: a */
        public static C9659b m44743a(int i) {
            if (i == 0) {
                return RESULT_UNKNOWN;
            }
            if (i == 1) {
                return RESULT_SUCCESS;
            }
            if (i == 2) {
                return RESULT_FAIL;
            }
            if (i != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }

        /* renamed from: d */
        public static C9474b3 m44744d() {
            return C9551k0.f45713a;
        }

        /* renamed from: e */
        public final int mo38237e() {
            return this.f45955b;
        }

        public final String toString() {
            return "<" + C9659b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45955b + " name=" + name() + '>';
        }
    }

    static {
        C9657w wVar = new C9657w();
        zzpl = wVar;
        C9643v2.m44627m(C9657w.class, wVar);
    }

    private C9657w() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.v2$b, com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.w>] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9657w> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9657w();
            case 2:
                return new C9658a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzpl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzbm", "zzpd", "zzpe", "zzpf", "zzpg", C9659b.m44744d(), "zzph", "zzpi", "zzpj", "zzpk", C9499e0.class});
            case 4:
                return zzpl;
            case 5:
                C9587o4<C9657w> o4Var2 = zzbk;
                C9587o4<C9657w> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9657w.class) {
                        C9587o4<C9657w> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzpl);
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
