package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arz */
/* compiled from: IMASDK */
final class arz implements Iterator<Map.Entry> {

    /* renamed from: a */
    final Iterator<Map.Entry> f15623a;

    /* renamed from: b */
    Collection f15624b;

    /* renamed from: c */
    final /* synthetic */ asa f15625c;

    arz(asa asa) {
        this.f15625c = asa;
        this.f15623a = asa.f15636a.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f15623a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f15623a.next();
        this.f15624b = (Collection) next.getValue();
        return this.f15625c.mo14260b(next);
    }

    public final void remove() {
        aup.m14883n(this.f15624b != null);
        this.f15623a.remove();
        asn.m14679t(this.f15625c.f15637b, this.f15624b.size());
        this.f15624b.clear();
        this.f15624b = null;
    }
}
