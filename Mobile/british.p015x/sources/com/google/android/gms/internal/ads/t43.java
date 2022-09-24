package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t43 implements Iterator<Map.Entry> {

    /* renamed from: b */
    final Iterator<Map.Entry> f20836b;
    @CheckForNull

    /* renamed from: c */
    Collection f20837c;

    /* renamed from: d */
    final /* synthetic */ u43 f20838d;

    t43(u43 u43) {
        this.f20838d = u43;
        this.f20836b = u43.f20914d.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f20836b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f20836b.next();
        this.f20837c = (Collection) next.getValue();
        return this.f20838d.mo18870c(next);
    }

    public final void remove() {
        b43.m20210g(this.f20837c != null, "no calls to next() since the last call to remove()");
        this.f20836b.remove();
        i53 i53 = this.f20838d.f20915e;
        i53.f20387f = i53.f20387f - this.f20837c.size();
        this.f20837c.clear();
        this.f20837c = null;
    }
}
