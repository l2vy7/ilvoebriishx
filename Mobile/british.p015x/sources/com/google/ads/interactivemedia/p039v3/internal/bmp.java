package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmp */
/* compiled from: IMASDK */
final class bmp implements Iterator<String> {

    /* renamed from: a */
    final Iterator<String> f16706a;

    /* renamed from: b */
    final /* synthetic */ bmq f16707b;

    bmp(bmq bmq) {
        this.f16707b = bmq;
        this.f16706a = bmq.f16708a.iterator();
    }

    public final boolean hasNext() {
        return this.f16706a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f16706a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
