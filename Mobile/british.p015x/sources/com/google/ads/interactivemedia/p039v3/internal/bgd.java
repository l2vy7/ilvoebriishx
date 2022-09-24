package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgd */
/* compiled from: IMASDK */
final class bgd extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ bgi f16273a;

    bgd(bgi bgi) {
        this.f16273a = bgi;
    }

    public final void clear() {
        this.f16273a.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f16273a.mo15070c((Map.Entry) obj) != null;
    }

    public final Iterator<Map.Entry> iterator() {
        return new bgc(this);
    }

    public final boolean remove(Object obj) {
        bgh c;
        if (!(obj instanceof Map.Entry) || (c = this.f16273a.mo15070c((Map.Entry) obj)) == null) {
            return false;
        }
        this.f16273a.mo15073d(c, true);
        return true;
    }

    public final int size() {
        return this.f16273a.f16290c;
    }
}
