package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.beu */
/* compiled from: IMASDK */
public final class beu {

    /* renamed from: a */
    private bfx f16221a = bfx.f16262a;

    /* renamed from: b */
    private final bem f16222b = bel.IDENTITY;

    /* renamed from: c */
    private final Map<Type, bev<?>> f16223c = new HashMap();

    /* renamed from: d */
    private final List<bfj> f16224d = new ArrayList();

    /* renamed from: e */
    private final List<bfj> f16225e = new ArrayList();

    /* renamed from: f */
    private final int f16226f = 2;

    /* renamed from: g */
    private final int f16227g = 2;

    /* renamed from: h */
    private final boolean f16228h = true;

    /* renamed from: i */
    private final int f16229i = bfg.f16234a;

    /* renamed from: a */
    public final bet mo14974a() {
        ArrayList arrayList = new ArrayList(this.f16224d.size() + this.f16225e.size() + 3);
        arrayList.addAll(this.f16224d);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f16225e);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        return new bet(this.f16221a, this.f16222b, this.f16223c, true, this.f16229i, arrayList);
    }

    /* renamed from: b */
    public final void mo14975b(Type type, Object obj) {
        boolean z = obj instanceof bfe;
        boolean z2 = true;
        if (!z && !(obj instanceof bex) && !(obj instanceof bev) && !(obj instanceof bfi)) {
            z2 = false;
        }
        art.m14631b(z2);
        if (obj instanceof bev) {
            this.f16223c.put(type, (bev) obj);
        }
        if (z || (obj instanceof bex)) {
            this.f16224d.add(bhh.m15915a(biu.m15937c(type), obj));
        }
        if (obj instanceof bfi) {
            this.f16224d.add(bip.m15925a(biu.m15937c(type), (bfi) obj));
        }
    }

    /* renamed from: c */
    public final void mo14976c(bfj bfj) {
        this.f16224d.add(bfj);
    }

    /* renamed from: d */
    public final void mo14977d(arq arq) {
        this.f16221a = this.f16221a.mo15035e(arq);
    }
}
