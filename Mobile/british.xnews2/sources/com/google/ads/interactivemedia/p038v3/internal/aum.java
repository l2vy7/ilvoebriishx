package com.google.ads.interactivemedia.p038v3.internal;

import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aum */
/* compiled from: IMASDK */
final class aum extends avu {

    /* renamed from: a */
    boolean f15766a;

    /* renamed from: b */
    final /* synthetic */ Object f15767b;

    aum(Object obj) {
        this.f15767b = obj;
    }

    public final boolean hasNext() {
        return !this.f15766a;
    }

    public final Object next() {
        if (!this.f15766a) {
            this.f15766a = true;
            return this.f15767b;
        }
        throw new NoSuchElementException();
    }
}
