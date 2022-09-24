package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;

/* renamed from: com.google.android.gms.internal.vision.a0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9460a0 extends C9643v2<C9460a0, C9461a> implements C9538i4 {
    private static volatile C9587o4<C9460a0> zzbk;
    /* access modifiers changed from: private */
    public static final C9460a0 zzqz;
    private int zzbm;
    private int zzoj;
    private long zzqv;
    private long zzqw;
    private long zzqx;
    private long zzqy;

    /* renamed from: com.google.android.gms.internal.vision.a0$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static final class C9461a extends C9643v2.C9644a<C9460a0, C9461a> implements C9538i4 {
        private C9461a() {
            super(C9460a0.zzqz);
        }

        /* synthetic */ C9461a(C9598q qVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.a0$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public enum C9462b implements C9689z2 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);
        

        /* renamed from: g */
        private static final C9681y2<C9462b> f45586g = null;

        /* renamed from: b */
        private final int f45588b;

        static {
            f45586g = new C9608r0();
        }

        private C9462b(int i) {
            this.f45588b = i;
        }

        /* renamed from: a */
        public static C9462b m44027a(int i) {
            if (i == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i == 2) {
                return FORMAT_RGB8;
            }
            if (i != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }

        /* renamed from: d */
        public static C9474b3 m44028d() {
            return C9616s0.f45846a;
        }

        /* renamed from: e */
        public final int mo38237e() {
            return this.f45588b;
        }

        public final String toString() {
            return "<" + C9462b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45588b + " name=" + name() + '>';
        }
    }

    static {
        C9460a0 a0Var = new C9460a0();
        zzqz = a0Var;
        C9643v2.m44627m(C9460a0.class, a0Var);
    }

    private C9460a0() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.o4<com.google.android.gms.internal.vision.a0>, com.google.android.gms.internal.vision.v2$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo38236j(int i, Object obj, Object obj2) {
        C9587o4<C9460a0> o4Var;
        switch (C9598q.f45834a[i - 1]) {
            case 1:
                return new C9460a0();
            case 2:
                return new C9461a((C9598q) null);
            case 3:
                return C9643v2.m44625k(zzqz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzbm", "zzoj", C9462b.m44028d(), "zzqv", "zzqw", "zzqy", "zzqx"});
            case 4:
                return zzqz;
            case 5:
                C9587o4<C9460a0> o4Var2 = zzbk;
                C9587o4<C9460a0> o4Var3 = o4Var2;
                if (o4Var2 == null) {
                    synchronized (C9460a0.class) {
                        C9587o4<C9460a0> o4Var4 = zzbk;
                        o4Var = o4Var4;
                        if (o4Var4 == null) {
                            ? bVar = new C9643v2.C9645b(zzqz);
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
