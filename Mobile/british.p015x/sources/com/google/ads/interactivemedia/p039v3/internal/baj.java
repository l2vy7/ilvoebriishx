package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.baj */
/* compiled from: IMASDK */
public final class baj extends bkl<baj, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final baj f15950f;

    /* renamed from: a */
    private int f15951a;

    /* renamed from: e */
    private bal f15952e;

    static {
        baj baj = new baj();
        f15950f = baj;
        bkl.m16307an(baj.class, baj);
    }

    private baj() {
    }

    /* renamed from: d */
    public static baj m15364d(bjq bjq, bka bka) throws bkt {
        return (baj) bkl.m16313at(f15950f, bjq, bka);
    }

    /* renamed from: a */
    public final int mo14791a() {
        return this.f15951a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15950f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new baj();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15950f;
        }
    }

    /* renamed from: c */
    public final bal mo14792c() {
        bal bal = this.f15952e;
        return bal == null ? bal.m15369c() : bal;
    }
}
