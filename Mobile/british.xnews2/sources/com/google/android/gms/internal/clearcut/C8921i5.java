package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.clearcut.i5 */
public final class C8921i5 extends C8891f1<C8921i5, C8922a> implements C8961n2 {
    private static volatile C9017v2<C8921i5> zzbg;
    /* access modifiers changed from: private */
    public static final C8921i5 zzbir;
    private C8934k1<C8923b> zzbiq = C8891f1.m41755o();

    /* renamed from: com.google.android.gms.internal.clearcut.i5$a */
    public static final class C8922a extends C8891f1.C8892a<C8921i5, C8922a> implements C8961n2 {
        private C8922a() {
            super(C8921i5.zzbir);
        }

        /* synthetic */ C8922a(C8931j5 j5Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.i5$b */
    public static final class C8923b extends C8891f1<C8923b, C8924a> implements C8961n2 {
        private static volatile C9017v2<C8923b> zzbg;
        /* access modifiers changed from: private */
        public static final C8923b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        /* renamed from: com.google.android.gms.internal.clearcut.i5$b$a */
        public static final class C8924a extends C8891f1.C8892a<C8923b, C8924a> implements C8961n2 {
            private C8924a() {
                super(C8923b.zzbiv);
            }

            /* synthetic */ C8924a(C8931j5 j5Var) {
                this();
            }

            /* renamed from: o */
            public final C8924a mo36974o(String str) {
                mo36906l();
                ((C8923b) this.f44513c).m41866D(str);
                return this;
            }

            /* renamed from: p */
            public final C8924a mo36975p(long j) {
                mo36906l();
                ((C8923b) this.f44513c).m41867E(j);
                return this;
            }

            /* renamed from: s */
            public final C8924a mo36976s(long j) {
                mo36906l();
                ((C8923b) this.f44513c).m41868F(j);
                return this;
            }
        }

        static {
            C8923b bVar = new C8923b();
            zzbiv = bVar;
            C8891f1.m41753m(C8923b.class, bVar);
        }

        private C8923b() {
        }

        /* renamed from: B */
        public static C8924a m41864B() {
            return (C8924a) ((C8891f1.C8892a) zzbiv.mo36855j(C8891f1.C8896e.f44522e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public final void m41866D(String str) {
            Objects.requireNonNull(str);
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public final void m41867E(long j) {
            this.zzbb |= 4;
            this.zzbit = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public final void m41868F(long j) {
            this.zzbb |= 8;
            this.zzbiu = j;
        }

        /* renamed from: A */
        public final long mo36969A() {
            return this.zzbiu;
        }

        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.i5$b>, com.google.android.gms.internal.clearcut.f1$b] */
        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final Object mo36855j(int i, Object obj, Object obj2) {
            C9017v2<C8923b> v2Var;
            switch (C8931j5.f44587a[i - 1]) {
                case 1:
                    return new C8923b();
                case 2:
                    return new C8924a((C8931j5) null);
                case 3:
                    return C8891f1.m41751k(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    C9017v2<C8923b> v2Var2 = zzbg;
                    C9017v2<C8923b> v2Var3 = v2Var2;
                    if (v2Var2 == null) {
                        synchronized (C8923b.class) {
                            C9017v2<C8923b> v2Var4 = zzbg;
                            v2Var = v2Var4;
                            if (v2Var4 == null) {
                                ? bVar = new C8891f1.C8893b(zzbiv);
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

        /* renamed from: s */
        public final int mo36970s() {
            return this.zzya;
        }

        /* renamed from: w */
        public final boolean mo36971w() {
            return (this.zzbb & 1) == 1;
        }

        /* renamed from: x */
        public final String mo36972x() {
            return this.zzbis;
        }

        /* renamed from: y */
        public final long mo36973y() {
            return this.zzbit;
        }
    }

    static {
        C8921i5 i5Var = new C8921i5();
        zzbir = i5Var;
        C8891f1.m41753m(C8921i5.class, i5Var);
    }

    private C8921i5() {
    }

    /* renamed from: t */
    public static C8921i5 m41859t() {
        return zzbir;
    }

    /* renamed from: v */
    public static C8921i5 m41861v(byte[] bArr) throws C8941l1 {
        return (C8921i5) C8891f1.m41754n(zzbir, bArr);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.i5>, com.google.android.gms.internal.clearcut.f1$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo36855j(int i, Object obj, Object obj2) {
        C9017v2<C8921i5> v2Var;
        switch (C8931j5.f44587a[i - 1]) {
            case 1:
                return new C8921i5();
            case 2:
                return new C8922a((C8931j5) null);
            case 3:
                return C8891f1.m41751k(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", C8923b.class});
            case 4:
                return zzbir;
            case 5:
                C9017v2<C8921i5> v2Var2 = zzbg;
                C9017v2<C8921i5> v2Var3 = v2Var2;
                if (v2Var2 == null) {
                    synchronized (C8921i5.class) {
                        C9017v2<C8921i5> v2Var4 = zzbg;
                        v2Var = v2Var4;
                        if (v2Var4 == null) {
                            ? bVar = new C8891f1.C8893b(zzbir);
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

    /* renamed from: s */
    public final List<C8923b> mo36968s() {
        return this.zzbiq;
    }
}
