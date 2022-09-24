package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ll */
/* compiled from: IMASDK */
final class C4154ll extends C4073il {

    /* renamed from: b */
    private final int f17844b;

    /* renamed from: c */
    private final int f17845c;

    /* renamed from: d */
    private final int[] f17846d;

    /* renamed from: e */
    private final int[] f17847e;

    /* renamed from: f */
    private final C4171mb[] f17848f;

    /* renamed from: g */
    private final Object[] f17849g;

    /* renamed from: h */
    private final HashMap<Object, Integer> f17850h = new HashMap<>();

    public C4154ll(Collection collection, ack ack) {
        super(ack);
        int size = collection.size();
        this.f17846d = new int[size];
        this.f17847e = new int[size];
        this.f17848f = new C4171mb[size];
        this.f17849g = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C4136ku kuVar = (C4136ku) it.next();
            this.f17848f[i3] = kuVar.mo15992b();
            this.f17847e[i3] = i;
            this.f17846d[i3] = i2;
            i += this.f17848f[i3].mo13271t();
            i2 += this.f17848f[i3].mo13272u();
            this.f17849g[i3] = kuVar.mo15991a();
            this.f17850h.put(this.f17849g[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f17844b = i;
        this.f17845c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo13264k(int i) {
        return amm.m14222al(this.f17846d, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo13265l(int i) {
        return amm.m14222al(this.f17847e, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo13266m(Object obj) {
        Integer num = this.f17850h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C4171mb mo13267n(int i) {
        return this.f17848f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo13268o(int i) {
        return this.f17846d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo13269p(int i) {
        return this.f17847e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo13270q(int i) {
        return this.f17849g[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final List<C4171mb> mo16264s() {
        return Arrays.asList(this.f17848f);
    }

    /* renamed from: t */
    public final int mo13271t() {
        return this.f17844b;
    }

    /* renamed from: u */
    public final int mo13272u() {
        return this.f17845c;
    }
}
