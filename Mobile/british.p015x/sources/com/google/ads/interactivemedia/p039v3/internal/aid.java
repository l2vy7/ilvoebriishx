package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aid */
/* compiled from: IMASDK */
public final class aid implements Comparable<aid> {

    /* renamed from: a */
    public final boolean f14963a;

    /* renamed from: b */
    private final boolean f14964b;

    /* renamed from: c */
    private final boolean f14965c;

    /* renamed from: d */
    private final boolean f14966d;

    /* renamed from: e */
    private final int f14967e;

    /* renamed from: f */
    private final int f14968f;

    /* renamed from: g */
    private final int f14969g;

    /* renamed from: h */
    private final int f14970h;

    /* renamed from: i */
    private final boolean f14971i;

    public aid(C4120ke keVar, ahz ahz, int i, String str) {
        atz<String> atz;
        int i2;
        boolean z = false;
        this.f14964b = aif.m13762a(i, false);
        int i3 = keVar.f17673d & (ahz.f15002I ^ -1);
        this.f14965c = 1 == (i3 & 1);
        this.f14966d = (i3 & 2) != 0;
        if (ahz.f14999F.isEmpty()) {
            atz = atz.m14808j("");
        } else {
            atz = ahz.f14999F;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= atz.size()) {
                i4 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = aif.m13764c(keVar, atz.get(i4), ahz.f15001H);
            if (i2 > 0) {
                break;
            }
            i4++;
        }
        this.f14967e = i4;
        this.f14968f = i2;
        int bitCount = Integer.bitCount(keVar.f17674e & ahz.f15000G);
        this.f14969g = bitCount;
        this.f14971i = (keVar.f17674e & 1088) != 0;
        int c = aif.m13764c(keVar, str, aif.m13763b(str) == null);
        this.f14970h = c;
        if (i2 > 0 || ((ahz.f14999F.isEmpty() && bitCount > 0) || this.f14965c || (this.f14966d && c > 0))) {
            z = true;
        }
        this.f14963a = z;
    }

    /* renamed from: a */
    public final int compareTo(aid aid) {
        avf avf;
        atf d = atf.m14742g().mo14443d(this.f14964b, aid.f14964b).mo14440a(Integer.valueOf(this.f14967e), Integer.valueOf(aid.f14967e), avf.m14921b().mo14605a()).mo14441b(this.f14968f, aid.f14968f).mo14441b(this.f14969g, aid.f14969g).mo14443d(this.f14965c, aid.f14965c);
        Boolean valueOf = Boolean.valueOf(this.f14966d);
        Boolean valueOf2 = Boolean.valueOf(aid.f14966d);
        if (this.f14968f == 0) {
            avf = avf.m14921b();
        } else {
            avf = avf.m14921b().mo14605a();
        }
        atf b = d.mo14440a(valueOf, valueOf2, avf).mo14441b(this.f14970h, aid.f14970h);
        if (this.f14969g == 0) {
            b = b.mo14442c(this.f14971i, aid.f14971i);
        }
        return b.mo14444e();
    }
}
