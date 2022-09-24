package com.google.ads.interactivemedia.p038v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atq */
/* compiled from: IMASDK */
abstract class atq<K, V, T> extends AbstractSet<T> {

    /* renamed from: b */
    final atr<K, V> f15717b;

    atq(atr<K, V> atr) {
        this.f15717b = atr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo14448a(int i);

    public final void clear() {
        this.f15717b.clear();
    }

    public final Iterator<T> iterator() {
        return new atp(this);
    }

    public final int size() {
        return this.f15717b.f15720c;
    }
}
