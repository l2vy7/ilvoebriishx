package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v53 extends j53 {

    /* renamed from: b */
    private final Object f40310b;

    /* renamed from: c */
    private int f40311c;

    /* renamed from: d */
    final /* synthetic */ y53 f40312d;

    v53(y53 y53, int i) {
        this.f40312d = y53;
        this.f40310b = y53.m21200l(y53, i);
        this.f40311c = i;
    }

    /* renamed from: a */
    private final void m38728a() {
        int i = this.f40311c;
        if (i == -1 || i >= this.f40312d.size() || !x33.m21118a(this.f40310b, y53.m21200l(this.f40312d, this.f40311c))) {
            this.f40311c = this.f40312d.m21189B(this.f40310b);
        }
    }

    public final Object getKey() {
        return this.f40310b;
    }

    public final Object getValue() {
        Map q = this.f40312d.mo19004q();
        if (q != null) {
            return q.get(this.f40310b);
        }
        m38728a();
        int i = this.f40311c;
        if (i == -1) {
            return null;
        }
        return y53.m21203o(this.f40312d, i);
    }

    public final Object setValue(Object obj) {
        Map q = this.f40312d.mo19004q();
        if (q != null) {
            return q.put(this.f40310b, obj);
        }
        m38728a();
        int i = this.f40311c;
        if (i == -1) {
            this.f40312d.put(this.f40310b, obj);
            return null;
        }
        Object o = y53.m21203o(this.f40312d, i);
        y53.m21206s(this.f40312d, this.f40311c, obj);
        return o;
    }
}
