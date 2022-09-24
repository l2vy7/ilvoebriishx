package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.d */
/* compiled from: IMASDK */
public final class C3926d extends bkl<C3926d, C3827a> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C3926d f16868r;

    /* renamed from: a */
    private int f16869a;

    /* renamed from: e */
    private String f16870e = "";

    /* renamed from: f */
    private long f16871f;

    /* renamed from: g */
    private String f16872g = "";

    /* renamed from: h */
    private String f16873h = "";

    /* renamed from: i */
    private String f16874i = "";

    /* renamed from: j */
    private long f16875j;

    /* renamed from: k */
    private long f16876k;

    /* renamed from: l */
    private String f16877l = "";

    /* renamed from: m */
    private long f16878m;

    /* renamed from: n */
    private String f16879n = "";

    /* renamed from: o */
    private String f16880o = "";

    /* renamed from: p */
    private bkq<C3872b> f16881p = bkl.m16311ar();

    /* renamed from: q */
    private int f16882q;

    static {
        C3926d dVar = new C3926d();
        f16868r = dVar;
        bkl.m16307an(C3926d.class, dVar);
    }

    private C3926d() {
    }

    /* renamed from: a */
    public static C3827a m16948a() {
        return (C3827a) f16868r.mo15390aj();
    }

    /* renamed from: d */
    static /* synthetic */ void m16950d(C3926d dVar, String str) {
        str.getClass();
        dVar.f16869a |= 1;
        dVar.f16870e = str;
    }

    /* renamed from: e */
    static /* synthetic */ void m16951e(C3926d dVar, long j) {
        dVar.f16869a |= 2;
        dVar.f16871f = j;
    }

    /* renamed from: f */
    static /* synthetic */ void m16952f(C3926d dVar, String str) {
        str.getClass();
        dVar.f16869a |= 4;
        dVar.f16872g = str;
    }

    /* renamed from: g */
    static /* synthetic */ void m16953g(C3926d dVar, String str) {
        str.getClass();
        dVar.f16869a |= 8;
        dVar.f16873h = str;
    }

    /* renamed from: h */
    static /* synthetic */ void m16954h(C3926d dVar, String str) {
        dVar.f16869a |= 16;
        dVar.f16874i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16868r, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"a", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", TtmlNode.TAG_P, C3872b.class, "q", C3899c.m16899b()});
        } else if (i2 == 3) {
            return new C3926d();
        } else {
            if (i2 == 4) {
                return new C3827a((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16868r;
        }
    }
}
