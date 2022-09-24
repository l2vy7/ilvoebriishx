package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aai */
/* compiled from: IMASDK */
final class aai extends C4073il {

    /* renamed from: b */
    private final int f13930b;

    /* renamed from: c */
    private final int f13931c;

    /* renamed from: d */
    private final int[] f13932d;

    /* renamed from: e */
    private final int[] f13933e;

    /* renamed from: f */
    private final C4171mb[] f13934f;

    /* renamed from: g */
    private final Object[] f13935g;

    /* renamed from: h */
    private final HashMap<Object, Integer> f13936h = new HashMap<>();

    public aai(Collection collection, ack ack) {
        super(ack);
        int size = collection.size();
        this.f13932d = new int[size];
        this.f13933e = new int[size];
        this.f13934f = new C4171mb[size];
        this.f13935g = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            aak aak = (aak) it.next();
            this.f13934f[i3] = aak.f13937a.mo13307C();
            this.f13933e[i3] = i;
            this.f13932d[i3] = i2;
            i += this.f13934f[i3].mo13271t();
            i2 += this.f13934f[i3].mo13272u();
            Object[] objArr = this.f13935g;
            Object obj = aak.f13938b;
            objArr[i3] = obj;
            this.f13936h.put(obj, Integer.valueOf(i3));
            i3++;
        }
        this.f13930b = i;
        this.f13931c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo13264k(int i) {
        return amm.m14222al(this.f13932d, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo13265l(int i) {
        return amm.m14222al(this.f13933e, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo13266m(Object obj) {
        Integer num = this.f13936h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C4171mb mo13267n(int i) {
        return this.f13934f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo13268o(int i) {
        return this.f13932d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo13269p(int i) {
        return this.f13933e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo13270q(int i) {
        return this.f13935g[i];
    }

    /* renamed from: t */
    public final int mo13271t() {
        return this.f13930b;
    }

    /* renamed from: u */
    public final int mo13272u() {
        return this.f13931c;
    }
}
