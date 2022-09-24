package com.google.ads.interactivemedia.p039v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asx */
/* compiled from: IMASDK */
abstract class asx<T> implements Iterator<T> {

    /* renamed from: b */
    int f15671b;

    /* renamed from: c */
    int f15672c;

    /* renamed from: d */
    int f15673d = -1;

    /* renamed from: e */
    final /* synthetic */ atb f15674e;

    /* synthetic */ asx(atb atb) {
        this.f15674e = atb;
        this.f15671b = atb.f15690f;
        this.f15672c = atb.mo14426g();
    }

    /* renamed from: b */
    private final void m14707b() {
        if (this.f15674e.f15690f != this.f15671b) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo14399a(int i);

    public final boolean hasNext() {
        return this.f15672c >= 0;
    }

    public final T next() {
        m14707b();
        if (hasNext()) {
            int i = this.f15672c;
            this.f15673d = i;
            T a = mo14399a(i);
            this.f15672c = this.f15674e.mo14428h(this.f15672c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m14707b();
        aup.m14883n(this.f15673d >= 0);
        this.f15671b += 32;
        atb atb = this.f15674e;
        atb.remove(atb.f15687b[this.f15673d]);
        this.f15672c--;
        this.f15673d = -1;
    }
}
