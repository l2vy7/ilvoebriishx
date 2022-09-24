package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bew */
/* compiled from: IMASDK */
public final class bew extends bey implements Iterable<bey> {

    /* renamed from: a */
    private final List<bey> f16230a = new ArrayList();

    /* renamed from: a */
    public final void mo14979a(bey bey) {
        this.f16230a.add(bey);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof bew) && ((bew) obj).f16230a.equals(this.f16230a));
    }

    public final int hashCode() {
        return this.f16230a.hashCode();
    }

    public final Iterator<bey> iterator() {
        return this.f16230a.iterator();
    }
}
