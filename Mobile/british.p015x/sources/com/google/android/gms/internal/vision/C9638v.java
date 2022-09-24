package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.v */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9638v extends C9643v2<C9638v, C9640b> implements C9538i4 {
    private static volatile C9587o4<C9638v> zzbk;
    /* access modifiers changed from: private */
    public static final C9638v zzox;
    private int zzbm;
    private String zzop = "";
    private boolean zzoq;
    private int zzor;
    private long zzos;
    private long zzot;
    private long zzou;
    private String zzov = "";
    private boolean zzow;

    /* renamed from: com.google.android.gms.internal.vision.v$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public enum C9639a implements C9689z2 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);
        

        /* renamed from: g */
        private static final C9681y2<C9639a> f45901g = null;

        /* renamed from: b */
        private final int f45903b;

        static {
            f45901g = new C9534i0();
        }

        private C9639a(int i) {
            this.f45903b = i;
        }

        /* renamed from: d */
        public static C9474b3 m44612d() {
            return C9526h0.f45652a;
        }

        /* renamed from: i */
        public static C9639a m44613i(int i) {
            if (i == 0) {
                return REASON_UNKNOWN;
            }
            if (i == 1) {
                return REASON_MISSING;
            }
            if (i == 2) {
                return REASON_UPGRADE;
            }
            if (i != 3) {
                return null;
            }
            return REASON_INVALID;
        }

        /* renamed from: e */
        public final int mo38237e() {
            return this.f45903b;
        }

        public final String toString() {
            return "<" + C9639a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45903b + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9640b extends C9643v2.C9644a<C9638v, C9640b> implements C9538i4 {
        private C9640b() {
            super(C9638v.zzox);
        }

        /* synthetic */ C9640b(C9598q qVar) {
            this();
        }
    }

    static {
        C9638v vVar = new C9638v();
        zzox = vVar;
        C9643v2.m44627m(C9638v.class, vVar);
    }

    private C9638v() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.v>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9638v> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9638v();
            case 2:
                return new C9640b((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzox, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzbm", "zzop", "zzoq", "zzor", C9639a.m44612d(), "zzos", "zzot", "zzou", "zzov", "zzow"});
            case 4:
                return zzox;
            case 5:
                C9587o4<C9638v> o4Var2 = zzbk;
                C9587o4<C9638v> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9638v.class) {
                        C9587o4<C9638v> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzox);
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
