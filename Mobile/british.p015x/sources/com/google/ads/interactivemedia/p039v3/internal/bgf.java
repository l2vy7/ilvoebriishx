package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgf */
/* compiled from: IMASDK */
final class bgf extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bgi f16274a;

    bgf(bgi bgi) {
        this.f16274a = bgi;
    }

    public final void clear() {
        this.f16274a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f16274a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new bge(this);
    }

    public final boolean remove(Object obj) {
        return this.f16274a.mo15074e(obj) != null;
    }

    public final int size() {
        return this.f16274a.f16290c;
    }
}
