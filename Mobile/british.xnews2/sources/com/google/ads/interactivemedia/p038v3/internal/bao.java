package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bao */
/* compiled from: IMASDK */
public final class bao extends bkl<bao, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bao f15959f;

    /* renamed from: a */
    private bar f15960a;

    /* renamed from: e */
    private bbw f15961e;

    static {
        bao bao = new bao();
        f15959f = bao;
        bkl.m16307an(bao.class, bao);
    }

    private bao() {
    }

    /* renamed from: d */
    public static bao m15386d(bjq bjq, bka bka) throws bkt {
        return (bao) bkl.m16313at(f15959f, bjq, bka);
    }

    /* renamed from: a */
    public final bar mo14800a() {
        bar bar = this.f15960a;
        return bar == null ? bar.m15406e() : bar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15959f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bao();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (char[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15959f;
        }
    }

    /* renamed from: c */
    public final bbw mo14801c() {
        bbw bbw = this.f15961e;
        return bbw == null ? bbw.m15560e() : bbw;
    }
}
