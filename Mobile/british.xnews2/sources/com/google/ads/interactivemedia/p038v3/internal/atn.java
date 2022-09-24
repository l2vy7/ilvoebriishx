package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atn */
/* compiled from: IMASDK */
final class atn extends atq {

    /* renamed from: a */
    final /* synthetic */ atr f15710a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    atn(atr atr) {
        super(atr);
        this.f15710a = atr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo14448a(int i) {
        return this.f15710a.f15718a[i];
    }

    public final boolean contains(Object obj) {
        return this.f15710a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int d = aup.m14873d(obj);
        int c = this.f15710a.mo14475c(obj, d);
        if (c == -1) {
            return false;
        }
        this.f15710a.mo14483g(c, d);
        return true;
    }
}
