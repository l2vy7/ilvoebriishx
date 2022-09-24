package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auc */
/* compiled from: IMASDK */
public final class auc<K, V> {

    /* renamed from: a */
    Object[] f15748a;

    /* renamed from: b */
    int f15749b;

    public auc() {
        this(4);
    }

    /* renamed from: d */
    private final void m14831d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f15748a;
        int length = objArr.length;
        if (i2 > length) {
            this.f15748a = Arrays.copyOf(objArr, ats.m14789a(length, i2));
        }
    }

    /* renamed from: a */
    public final aue<K, V> mo14539a() {
        return avl.m14941l(this.f15749b, this.f15748a);
    }

    /* renamed from: b */
    public final void mo14540b(K k, V v) {
        m14831d(this.f15749b + 1);
        aup.m14882m(k, v);
        Object[] objArr = this.f15748a;
        int i = this.f15749b;
        int i2 = i + i;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
        this.f15749b = i + 1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14541c(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.f15749b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m14831d(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.mo14540b(r1, r0)
            goto L_0x0012
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.auc.mo14541c(java.lang.Iterable):void");
    }

    auc(int i) {
        this.f15748a = new Object[(i + i)];
        this.f15749b = 0;
    }
}
