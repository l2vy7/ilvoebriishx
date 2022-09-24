package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class n83<E> extends AbstractSet<E> {
    n83() {
    }

    public boolean removeAll(Collection<?> collection) {
        return o83.m35588b(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
