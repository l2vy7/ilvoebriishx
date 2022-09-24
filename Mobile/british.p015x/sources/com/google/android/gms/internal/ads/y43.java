package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class y43 extends l73 {

    /* renamed from: c */
    final /* synthetic */ i53 f20997c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    y43(i53 i53, Map map) {
        super(map);
        this.f20997c = i53;
    }

    public final void clear() {
        e73.m20400b(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f20527b.keySet().containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f20527b.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f20527b.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new x43(this, this.f20527b.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f20527b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        i53 i53 = this.f20997c;
        i53.f20387f = i53.f20387f - size;
        return size > 0;
    }
}
