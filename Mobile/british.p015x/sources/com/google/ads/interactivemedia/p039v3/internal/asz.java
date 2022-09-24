package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asz */
/* compiled from: IMASDK */
final class asz extends aso {

    /* renamed from: a */
    final /* synthetic */ atb f15676a;

    /* renamed from: b */
    private final Object f15677b;

    /* renamed from: c */
    private int f15678c;

    asz(atb atb, int i) {
        this.f15676a = atb;
        this.f15677b = atb.f15687b[i];
        this.f15678c = i;
    }

    /* renamed from: a */
    private final void m14709a() {
        int i = this.f15678c;
        if (i == -1 || i >= this.f15676a.size() || !arq.m14618b(this.f15677b, this.f15676a.f15687b[this.f15678c])) {
            this.f15678c = this.f15676a.m14721t(this.f15677b);
        }
    }

    public final Object getKey() {
        return this.f15677b;
    }

    public final Object getValue() {
        Map d = this.f15676a.mo14422d();
        if (d != null) {
            return d.get(this.f15677b);
        }
        m14709a();
        int i = this.f15678c;
        if (i == -1) {
            return null;
        }
        return this.f15676a.f15688c[i];
    }

    public final Object setValue(Object obj) {
        Map d = this.f15676a.mo14422d();
        if (d != null) {
            return d.put(this.f15677b, obj);
        }
        m14709a();
        int i = this.f15678c;
        if (i == -1) {
            this.f15676a.put(this.f15677b, obj);
            return null;
        }
        Object[] objArr = this.f15676a.f15688c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
