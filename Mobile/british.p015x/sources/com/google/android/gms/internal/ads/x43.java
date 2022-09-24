package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x43 implements Iterator {
    @CheckForNull

    /* renamed from: b */
    Map.Entry f20979b;

    /* renamed from: c */
    final /* synthetic */ Iterator f20980c;

    /* renamed from: d */
    final /* synthetic */ y43 f20981d;

    x43(y43 y43, Iterator it) {
        this.f20981d = y43;
        this.f20980c = it;
    }

    public final boolean hasNext() {
        return this.f20980c.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f20980c.next();
        this.f20979b = entry;
        return entry.getKey();
    }

    public final void remove() {
        b43.m20210g(this.f20979b != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f20979b.getValue();
        this.f20980c.remove();
        i53 i53 = this.f20981d.f20997c;
        i53.f20387f = i53.f20387f - collection.size();
        collection.clear();
        this.f20979b = null;
    }
}
