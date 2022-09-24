package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auf */
/* compiled from: IMASDK */
final class auf extends avu {

    /* renamed from: a */
    final Iterator<? extends att> f15755a;

    /* renamed from: b */
    Iterator f15756b = aun.f15768a;

    /* renamed from: c */
    final /* synthetic */ auj f15757c;

    auf(auj auj) {
        this.f15757c = auj;
        this.f15755a = ((atz) auj.f15762b.values()).listIterator();
    }

    public final boolean hasNext() {
        return this.f15756b.hasNext() || this.f15755a.hasNext();
    }

    public final Object next() {
        if (!this.f15756b.hasNext()) {
            this.f15756b = ((att) this.f15755a.next()).iterator();
        }
        return this.f15756b.next();
    }
}
