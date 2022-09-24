package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahx */
/* compiled from: IMASDK */
public final class ahx implements Comparable<ahx> {

    /* renamed from: a */
    public final boolean f14893a;

    /* renamed from: b */
    private final String f14894b;

    /* renamed from: c */
    private final ahz f14895c;

    /* renamed from: d */
    private final boolean f14896d;

    /* renamed from: e */
    private final int f14897e;

    /* renamed from: f */
    private final int f14898f;

    /* renamed from: g */
    private final int f14899g;

    /* renamed from: h */
    private final int f14900h;

    /* renamed from: i */
    private final int f14901i;

    /* renamed from: j */
    private final boolean f14902j;

    /* renamed from: k */
    private final int f14903k;

    /* renamed from: l */
    private final int f14904l;

    /* renamed from: m */
    private final int f14905m;

    /* renamed from: n */
    private final int f14906n;

    public ahx(C4120ke keVar, ahz ahz, int i) {
        int i2;
        int i3;
        int i4;
        this.f14895c = ahz;
        this.f14894b = aif.m13763b(keVar.f17672c);
        int i5 = 0;
        this.f14896d = aif.m13762a(i, false);
        int i6 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i6 >= ahz.f14997D.size()) {
                i6 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = aif.m13764c(keVar, ahz.f14997D.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.f14898f = i6;
        this.f14897e = i3;
        this.f14899g = Integer.bitCount(keVar.f17674e & ahz.f14998E);
        boolean z = true;
        this.f14902j = 1 == (keVar.f17673d & 1);
        int i7 = keVar.f17694y;
        this.f14903k = i7;
        this.f14904l = keVar.f17695z;
        int i8 = keVar.f17677h;
        this.f14905m = i8;
        if ((i8 != -1 && i8 > ahz.f14930r) || (i7 != -1 && i7 > ahz.f14929q)) {
            z = false;
        }
        this.f14893a = z;
        String[] ae = amm.m14215ae();
        int i9 = 0;
        while (true) {
            if (i9 >= ae.length) {
                i9 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = aif.m13764c(keVar, ae[i9], false);
            if (i4 > 0) {
                break;
            }
            i9++;
        }
        this.f14900h = i9;
        this.f14901i = i4;
        while (true) {
            if (i5 < ahz.f14935w.size()) {
                String str = keVar.f17681l;
                if (str != null && str.equals(ahz.f14935w.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        this.f14906n = i2;
    }

    /* renamed from: a */
    public final int compareTo(ahx ahx) {
        avf avf;
        avf avf2;
        if (!this.f14893a || !this.f14896d) {
            avf = aif.f14981c.mo14605a();
        } else {
            avf = aif.f14981c;
        }
        atf a = atf.m14742g().mo14443d(this.f14896d, ahx.f14896d).mo14440a(Integer.valueOf(this.f14898f), Integer.valueOf(ahx.f14898f), avf.m14921b().mo14605a()).mo14441b(this.f14897e, ahx.f14897e).mo14441b(this.f14899g, ahx.f14899g).mo14443d(this.f14893a, ahx.f14893a).mo14440a(Integer.valueOf(this.f14906n), Integer.valueOf(ahx.f14906n), avf.m14921b().mo14605a());
        Integer valueOf = Integer.valueOf(this.f14905m);
        Integer valueOf2 = Integer.valueOf(ahx.f14905m);
        if (this.f14895c.f14936x) {
            avf2 = aif.f14981c.mo14605a();
        } else {
            avf2 = aif.f14982d;
        }
        atf a2 = a.mo14440a(valueOf, valueOf2, avf2).mo14443d(this.f14902j, ahx.f14902j).mo14440a(Integer.valueOf(this.f14900h), Integer.valueOf(ahx.f14900h), avf.m14921b().mo14605a()).mo14441b(this.f14901i, ahx.f14901i).mo14440a(Integer.valueOf(this.f14903k), Integer.valueOf(ahx.f14903k), avf).mo14440a(Integer.valueOf(this.f14904l), Integer.valueOf(ahx.f14904l), avf);
        Integer valueOf3 = Integer.valueOf(this.f14905m);
        Integer valueOf4 = Integer.valueOf(ahx.f14905m);
        if (!amm.m14233c(this.f14894b, ahx.f14894b)) {
            avf = aif.f14982d;
        }
        return a2.mo14440a(valueOf3, valueOf4, avf).mo14444e();
    }
}
