package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ato */
/* compiled from: IMASDK */
final class ato extends atq {

    /* renamed from: a */
    final /* synthetic */ atr f15711a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ato(atr atr) {
        super(atr);
        this.f15711a = atr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo14448a(int i) {
        return this.f15711a.f15719b[i];
    }

    public final boolean contains(Object obj) {
        return this.f15711a.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int d = aup.m14873d(obj);
        int e = this.f15711a.mo14480e(obj, d);
        if (e == -1) {
            return false;
        }
        this.f15711a.mo14485h(e, d);
        return true;
    }
}
