package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s63<K, V> {

    /* renamed from: a */
    Object[] f38884a;

    /* renamed from: b */
    int f38885b;

    public s63() {
        this(4);
    }

    /* renamed from: d */
    private final void m37334d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f38884a;
        int length = objArr.length;
        if (i2 > length) {
            this.f38884a = Arrays.copyOf(objArr, j63.m33558b(length, i2));
        }
    }

    /* renamed from: a */
    public final s63<K, V> mo34664a(K k, V v) {
        m37334d(this.f38885b + 1);
        n53.m35070b(k, v);
        Object[] objArr = this.f38884a;
        int i = this.f38885b;
        int i2 = i + i;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
        this.f38885b = i + 1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.s63<K, V> mo34665b(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.f38885b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m37334d(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.mo34664a(r1, r0)
            goto L_0x0012
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s63.mo34665b(java.lang.Iterable):com.google.android.gms.internal.ads.s63");
    }

    /* renamed from: c */
    public final t63<K, V> mo34666c() {
        return j83.m20602i(this.f38885b, this.f38884a);
    }

    s63(int i) {
        this.f38884a = new Object[(i + i)];
        this.f38885b = 0;
    }
}
