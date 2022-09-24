package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;

/* renamed from: com.google.android.gms.internal.clearcut.c5 */
public final class C8872c5 extends C8891f1<C8872c5, C8873a> implements C8961n2 {
    /* access modifiers changed from: private */
    public static final C8872c5 zzbfc;
    private static volatile C9017v2<C8872c5> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    /* renamed from: com.google.android.gms.internal.clearcut.c5$a */
    public static final class C8873a extends C8891f1.C8892a<C8872c5, C8873a> implements C8961n2 {
        private C8873a() {
            super(C8872c5.zzbfc);
        }

        /* synthetic */ C8873a(C8889e5 e5Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.c5$b */
    public enum C8874b implements C8917i1 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: x */
        private static final C8927j1<C8874b> f44464x = null;

        /* renamed from: b */
        private final int f44466b;

        static {
            f44464x = new C8900f5();
        }

        private C8874b(int i) {
            this.f44466b = i;
        }

        /* renamed from: a */
        public static C8874b m41654a(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        /* renamed from: d */
        public static C8927j1<C8874b> m41655d() {
            return f44464x;
        }

        public final int zzc() {
            return this.f44466b;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.c5$c */
    public enum C8875c implements C8917i1 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        

        /* renamed from: v */
        private static final C8927j1<C8875c> f44486v = null;

        /* renamed from: b */
        private final int f44488b;

        static {
            f44486v = new C8907g5();
        }

        private C8875c(int i) {
            this.f44488b = i;
        }

        /* renamed from: a */
        public static C8875c m41656a(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        /* renamed from: d */
        public static C8927j1<C8875c> m41657d() {
            return f44486v;
        }

        public final int zzc() {
            return this.f44488b;
        }
    }

    static {
        C8872c5 c5Var = new C8872c5();
        zzbfc = c5Var;
        C8891f1.m41753m(C8872c5.class, c5Var);
    }

    private C8872c5() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.c5>, com.google.android.gms.internal.clearcut.f1$b] */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo36855j(int i, Object obj, Object obj2) {
        C9017v2<C8872c5> v2Var;
        switch (C8889e5.f44509a[i - 1]) {
            case 1:
                return new C8872c5();
            case 2:
                return new C8873a((C8889e5) null);
            case 3:
                return C8891f1.m41751k(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", C8875c.m41657d(), "zzbfb", C8874b.m41655d()});
            case 4:
                return zzbfc;
            case 5:
                C9017v2<C8872c5> v2Var2 = zzbg;
                C9017v2<C8872c5> v2Var3 = v2Var2;
                if (v2Var2 == null) {
                    synchronized (C8872c5.class) {
                        C9017v2<C8872c5> v2Var4 = zzbg;
                        v2Var = v2Var4;
                        if (v2Var4 == null) {
                            ? bVar = new C8891f1.C8893b(zzbfc);
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
