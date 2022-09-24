package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ati */
/* compiled from: IMASDK */
final class ati extends aso {

    /* renamed from: a */
    final Object f15701a;

    /* renamed from: b */
    int f15702b;

    /* renamed from: c */
    final /* synthetic */ atr f15703c;

    ati(atr atr, int i) {
        this.f15703c = atr;
        this.f15701a = atr.f15718a[i];
        this.f15702b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14447a() {
        int i = this.f15702b;
        if (i != -1) {
            atr atr = this.f15703c;
            if (i <= atr.f15720c && arq.m14618b(atr.f15718a[i], this.f15701a)) {
                return;
            }
        }
        this.f15702b = this.f15703c.mo14474b(this.f15701a);
    }

    public final Object getKey() {
        return this.f15701a;
    }

    public final Object getValue() {
        mo14447a();
        int i = this.f15702b;
        if (i == -1) {
            return null;
        }
        return this.f15703c.f15719b[i];
    }

    public final Object setValue(Object obj) {
        mo14447a();
        int i = this.f15702b;
        if (i == -1) {
            return this.f15703c.put(this.f15701a, obj);
        }
        V v = this.f15703c.f15719b[i];
        if (arq.m14618b(v, obj)) {
            return obj;
        }
        this.f15703c.m14762C(this.f15702b, obj);
        return v;
    }
}
