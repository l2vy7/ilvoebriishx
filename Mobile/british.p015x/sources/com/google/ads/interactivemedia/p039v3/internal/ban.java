package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ban */
/* compiled from: IMASDK */
public final class ban extends bkl<ban, bam> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final ban f15955g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15956a;

    /* renamed from: e */
    private baq f15957e;

    /* renamed from: f */
    private bbv f15958f;

    static {
        ban ban = new ban();
        f15955g = ban;
        bkl.m16307an(ban.class, ban);
    }

    private ban() {
    }

    /* renamed from: e */
    public static ban m15376e(bjq bjq, bka bka) throws bkt {
        return (ban) bkl.m16313at(f15955g, bjq, bka);
    }

    /* renamed from: f */
    public static bam m15377f() {
        return (bam) f15955g.mo15390aj();
    }

    /* renamed from: i */
    static /* synthetic */ void m15380i(ban ban, baq baq) {
        baq.getClass();
        ban.f15957e = baq;
    }

    /* renamed from: j */
    static /* synthetic */ void m15381j(ban ban, bbv bbv) {
        bbv.getClass();
        ban.f15958f = bbv;
    }

    /* renamed from: a */
    public final int mo14797a() {
        return this.f15956a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15955g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new ban();
        } else {
            if (i2 == 4) {
                return new bam((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15955g;
        }
    }

    /* renamed from: c */
    public final baq mo14798c() {
        baq baq = this.f15957e;
        return baq == null ? baq.m15396g() : baq;
    }

    /* renamed from: d */
    public final bbv mo14799d() {
        bbv bbv = this.f15958f;
        return bbv == null ? bbv.m15550g() : bbv;
    }
}
