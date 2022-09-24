package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.x */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9666x extends C9643v2<C9666x, C9668b> implements C9538i4 {
    private static volatile C9587o4<C9666x> zzbk;
    /* access modifiers changed from: private */
    public static final C9666x zzpv;
    private int zzbm;
    private float zzkp;
    private boolean zzkt;
    private int zzpr;
    private int zzps;
    private int zzpt;
    private boolean zzpu;

    /* renamed from: com.google.android.gms.internal.vision.x$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public enum C9667a implements C9689z2 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);
        

        /* renamed from: f */
        private static final C9681y2<C9667a> f45964f = null;

        /* renamed from: b */
        private final int f45966b;

        static {
            f45964f = new C9567m0();
        }

        private C9667a(int i) {
            this.f45966b = i;
        }

        /* renamed from: a */
        public static C9667a m44785a(int i) {
            if (i == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }

        /* renamed from: d */
        public static C9474b3 m44786d() {
            return C9559l0.f45731a;
        }

        /* renamed from: e */
        public final int mo38237e() {
            return this.f45966b;
        }

        public final String toString() {
            return "<" + C9667a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45966b + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.x$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9668b extends C9643v2.C9644a<C9666x, C9668b> implements C9538i4 {
        private C9668b() {
            super(C9666x.zzpv);
        }

        /* synthetic */ C9668b(C9598q qVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.x$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public enum C9669c implements C9689z2 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);
        

        /* renamed from: g */
        private static final C9681y2<C9669c> f45971g = null;

        /* renamed from: b */
        private final int f45973b;

        static {
            f45971g = new C9575n0();
        }

        private C9669c(int i) {
            this.f45973b = i;
        }

        /* renamed from: a */
        public static C9669c m44788a(int i) {
            if (i == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i == 1) {
                return LANDMARK_NONE;
            }
            if (i == 2) {
                return LANDMARK_ALL;
            }
            if (i != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }

        /* renamed from: d */
        public static C9474b3 m44789d() {
            return C9583o0.f45758a;
        }

        /* renamed from: e */
        public final int mo38237e() {
            return this.f45973b;
        }

        public final String toString() {
            return "<" + C9669c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45973b + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.x$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public enum C9670d implements C9689z2 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);
        

        /* renamed from: g */
        private static final C9681y2<C9670d> f45978g = null;

        /* renamed from: b */
        private final int f45980b;

        static {
            f45978g = new C9599q0();
        }

        private C9670d(int i) {
            this.f45980b = i;
        }

        /* renamed from: a */
        public static C9670d m44791a(int i) {
            if (i == 0) {
                return MODE_UNKNOWN;
            }
            if (i == 1) {
                return MODE_ACCURATE;
            }
            if (i == 2) {
                return MODE_FAST;
            }
            if (i != 3) {
                return null;
            }
            return MODE_SELFIE;
        }

        /* renamed from: d */
        public static C9474b3 m44792d() {
            return C9591p0.f45761a;
        }

        /* renamed from: e */
        public final int mo38237e() {
            return this.f45980b;
        }

        public final String toString() {
            return "<" + C9670d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45980b + " name=" + name() + '>';
        }
    }

    static {
        C9666x xVar = new C9666x();
        zzpv = xVar;
        C9643v2.m44627m(C9666x.class, xVar);
    }

    private C9666x() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.v2$b, com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.x>] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9666x> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9666x();
            case 2:
                return new C9668b((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzpv, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzbm", "zzpr", C9670d.m44792d(), "zzps", C9669c.m44789d(), "zzpt", C9667a.m44786d(), "zzkt", "zzpu", "zzkp"});
            case 4:
                return zzpv;
            case 5:
                C9587o4<C9666x> o4Var2 = zzbk;
                C9587o4<C9666x> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9666x.class) {
                        C9587o4<C9666x> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzpv);
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
