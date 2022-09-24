package com.google.android.gms.internal.ads;

import p150t.C6090g;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rm1 {

    /* renamed from: a */
    s40 f38723a;

    /* renamed from: b */
    p40 f38724b;

    /* renamed from: c */
    f50 f38725c;

    /* renamed from: d */
    c50 f38726d;

    /* renamed from: e */
    r90 f38727e;

    /* renamed from: f */
    final C6090g<String, y40> f38728f = new C6090g<>();

    /* renamed from: g */
    final C6090g<String, v40> f38729g = new C6090g<>();

    /* renamed from: a */
    public final rm1 mo34558a(p40 p40) {
        this.f38724b = p40;
        return this;
    }

    /* renamed from: b */
    public final rm1 mo34559b(s40 s40) {
        this.f38723a = s40;
        return this;
    }

    /* renamed from: c */
    public final rm1 mo34560c(String str, y40 y40, v40 v40) {
        this.f38728f.put(str, y40);
        if (v40 != null) {
            this.f38729g.put(str, v40);
        }
        return this;
    }

    /* renamed from: d */
    public final rm1 mo34561d(r90 r90) {
        this.f38727e = r90;
        return this;
    }

    /* renamed from: e */
    public final rm1 mo34562e(c50 c50) {
        this.f38726d = c50;
        return this;
    }

    /* renamed from: f */
    public final rm1 mo34563f(f50 f50) {
        this.f38725c = f50;
        return this;
    }

    /* renamed from: g */
    public final tm1 mo34564g() {
        return new tm1(this);
    }
}
