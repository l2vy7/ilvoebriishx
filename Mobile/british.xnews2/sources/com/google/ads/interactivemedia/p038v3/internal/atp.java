package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atp */
/* compiled from: IMASDK */
final class atp implements Iterator {

    /* renamed from: a */
    final /* synthetic */ atq f15712a;

    /* renamed from: b */
    private int f15713b;

    /* renamed from: c */
    private int f15714c = -1;

    /* renamed from: d */
    private int f15715d;

    /* renamed from: e */
    private int f15716e;

    atp(atq atq) {
        this.f15712a = atq;
        this.f15713b = atq.f15717b.f15726i;
        atr<K, V> atr = atq.f15717b;
        this.f15715d = atr.f15721d;
        this.f15716e = atr.f15720c;
    }

    /* renamed from: a */
    private final void m14758a() {
        if (this.f15712a.f15717b.f15721d != this.f15715d) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        m14758a();
        return this.f15713b != -2 && this.f15716e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f15712a.mo14448a(this.f15713b);
            this.f15714c = this.f15713b;
            this.f15713b = this.f15712a.f15717b.f15729l[this.f15713b];
            this.f15716e--;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m14758a();
        aup.m14883n(this.f15714c != -1);
        atr<K, V> atr = this.f15712a.f15717b;
        int i = this.f15714c;
        atr.mo14483g(i, aup.m14873d(atr.f15718a[i]));
        int i2 = this.f15713b;
        atr<K, V> atr2 = this.f15712a.f15717b;
        if (i2 == atr2.f15720c) {
            this.f15713b = this.f15714c;
        }
        this.f15714c = -1;
        this.f15715d = atr2.f15721d;
    }
}
