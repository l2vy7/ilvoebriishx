package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class w43<T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<Map.Entry> f20947b;
    @CheckForNull

    /* renamed from: c */
    Object f20948c = null;
    @CheckForNull

    /* renamed from: d */
    Collection f20949d = null;

    /* renamed from: e */
    Iterator f20950e = d73.INSTANCE;

    /* renamed from: f */
    final /* synthetic */ i53 f20951f;

    w43(i53 i53) {
        this.f20951f = i53;
        this.f20947b = i53.f20386e.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f20947b.hasNext() || this.f20950e.hasNext();
    }

    public final T next() {
        if (!this.f20950e.hasNext()) {
            Map.Entry next = this.f20947b.next();
            this.f20948c = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f20949d = collection;
            this.f20950e = collection.iterator();
        }
        return this.f20950e.next();
    }

    public final void remove() {
        this.f20950e.remove();
        Collection collection = this.f20949d;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f20947b.remove();
        }
        i53 i53 = this.f20951f;
        i53.f20387f = i53.f20387f - 1;
    }
}
