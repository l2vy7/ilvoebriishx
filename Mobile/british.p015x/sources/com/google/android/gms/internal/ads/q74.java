package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q74 implements Comparable<q74> {

    /* renamed from: b */
    public final boolean f37924b;

    /* renamed from: c */
    private final boolean f37925c;

    /* renamed from: d */
    private final boolean f37926d;

    /* renamed from: e */
    private final boolean f37927e;

    /* renamed from: f */
    private final int f37928f;

    /* renamed from: g */
    private final int f37929g;

    /* renamed from: h */
    private final int f37930h;

    /* renamed from: i */
    private final int f37931i;

    /* renamed from: j */
    private final boolean f37932j;

    public q74(C8281w wVar, l74 l74, int i, String str) {
        p63<String> p63;
        int i2;
        boolean z = false;
        this.f37925c = s74.m37356m(i, false);
        int i3 = wVar.f40611d;
        int i4 = l74.f34931B;
        this.f37926d = 1 == (i3 & 1);
        this.f37927e = (i3 & 2) != 0;
        if (l74.f32440r.isEmpty()) {
            p63 = p63.m20815D("");
        } else {
            p63 = l74.f32440r;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= p63.size()) {
                i5 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = s74.m37352g(wVar, p63.get(i5), false);
            if (i2 > 0) {
                break;
            }
            i5++;
        }
        this.f37928f = i5;
        this.f37929g = i2;
        int bitCount = Integer.bitCount(0);
        this.f37930h = bitCount;
        this.f37932j = false;
        int g = s74.m37352g(wVar, str, s74.m37355k(str) == null);
        this.f37931i = g;
        if (i2 > 0 || ((l74.f32440r.isEmpty() && bitCount > 0) || this.f37926d || (this.f37927e && g > 0))) {
            z = true;
        }
        this.f37924b = z;
    }

    /* renamed from: a */
    public final int compareTo(q74 q74) {
        d83 d83;
        e63 d = e63.m31723i().mo30627d(this.f37925c, q74.f37925c).mo30626c(Integer.valueOf(this.f37928f), Integer.valueOf(q74.f37928f), d83.m31324c().mo18552a()).mo30625b(this.f37929g, q74.f37929g).mo30625b(this.f37930h, q74.f37930h).mo30627d(this.f37926d, q74.f37926d);
        Boolean valueOf = Boolean.valueOf(this.f37927e);
        Boolean valueOf2 = Boolean.valueOf(q74.f37927e);
        if (this.f37929g == 0) {
            d83 = d83.m31324c();
        } else {
            d83 = d83.m31324c().mo18552a();
        }
        e63 b = d.mo30626c(valueOf, valueOf2, d83).mo30625b(this.f37931i, q74.f37931i);
        if (this.f37930h == 0) {
            b = b.mo30628e(false, false);
        }
        return b.mo30624a();
    }
}
