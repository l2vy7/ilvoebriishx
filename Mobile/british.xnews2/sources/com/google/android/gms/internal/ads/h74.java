package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h74 implements Comparable<h74> {

    /* renamed from: b */
    public final boolean f32648b;

    /* renamed from: c */
    private final String f32649c;

    /* renamed from: d */
    private final l74 f32650d;

    /* renamed from: e */
    private final boolean f32651e;

    /* renamed from: f */
    private final int f32652f;

    /* renamed from: g */
    private final int f32653g;

    /* renamed from: h */
    private final int f32654h;

    /* renamed from: i */
    private final int f32655i;

    /* renamed from: j */
    private final int f32656j;

    /* renamed from: k */
    private final boolean f32657k;

    /* renamed from: l */
    private final int f32658l;

    /* renamed from: m */
    private final int f32659m;

    /* renamed from: n */
    private final int f32660n;

    /* renamed from: o */
    private final int f32661o;

    public h74(C8281w wVar, l74 l74, int i) {
        int i2;
        int i3;
        int i4;
        this.f32650d = l74;
        this.f32649c = s74.m37355k(wVar.f40610c);
        int i5 = 0;
        this.f32651e = s74.m37356m(i, false);
        int i6 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i6 >= l74.f32435m.size()) {
                i6 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = s74.m37352g(wVar, l74.f32435m.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.f32653g = i6;
        this.f32652f = i3;
        this.f32654h = Integer.bitCount(0);
        this.f32657k = 1 == (wVar.f40611d & 1);
        this.f32658l = wVar.f40632y;
        this.f32659m = wVar.f40633z;
        this.f32660n = wVar.f40615h;
        this.f32648b = true;
        String[] C = d13.m20272C();
        int i7 = 0;
        while (true) {
            if (i7 >= C.length) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = s74.m37352g(wVar, C[i7], false);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.f32655i = i7;
        this.f32656j = i4;
        while (true) {
            if (i5 < l74.f32439q.size()) {
                String str = wVar.f40619l;
                if (str != null && str.equals(l74.f32439q.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        this.f32661o = i2;
    }

    /* renamed from: a */
    public final int compareTo(h74 h74) {
        d83 d83;
        if (this.f32651e) {
            d83 = s74.f38899f;
        } else {
            d83 = s74.f38899f.mo18552a();
        }
        e63 c = e63.m31723i().mo30627d(this.f32651e, h74.f32651e).mo30626c(Integer.valueOf(this.f32653g), Integer.valueOf(h74.f32653g), d83.m31324c().mo18552a()).mo30625b(this.f32652f, h74.f32652f).mo30625b(this.f32654h, h74.f32654h).mo30627d(true, true).mo30626c(Integer.valueOf(this.f32661o), Integer.valueOf(h74.f32661o), d83.m31324c().mo18552a());
        Integer valueOf = Integer.valueOf(this.f32660n);
        Integer valueOf2 = Integer.valueOf(h74.f32660n);
        boolean z = this.f32650d.f32443u;
        e63 c2 = c.mo30626c(valueOf, valueOf2, s74.f38900g).mo30627d(this.f32657k, h74.f32657k).mo30626c(Integer.valueOf(this.f32655i), Integer.valueOf(h74.f32655i), d83.m31324c().mo18552a()).mo30625b(this.f32656j, h74.f32656j).mo30626c(Integer.valueOf(this.f32658l), Integer.valueOf(h74.f32658l), d83).mo30626c(Integer.valueOf(this.f32659m), Integer.valueOf(h74.f32659m), d83);
        Integer valueOf3 = Integer.valueOf(this.f32660n);
        Integer valueOf4 = Integer.valueOf(h74.f32660n);
        if (!d13.m20317p(this.f32649c, h74.f32649c)) {
            d83 = s74.f38900g;
        }
        return c2.mo30626c(valueOf3, valueOf4, d83).mo30624a();
    }
}
