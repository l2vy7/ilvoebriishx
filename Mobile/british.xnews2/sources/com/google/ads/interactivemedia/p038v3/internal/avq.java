package com.google.ads.interactivemedia.p038v3.internal;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avq */
/* compiled from: IMASDK */
abstract class avq<E> extends AbstractSet<E> {
    avq() {
    }

    public boolean removeAll(Collection<?> collection) {
        return avr.m14963e(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        ars.m14627g(collection);
        return super.retainAll(collection);
    }
}
