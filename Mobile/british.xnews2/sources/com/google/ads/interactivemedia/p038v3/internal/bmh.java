package com.google.ads.interactivemedia.p038v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmh */
/* compiled from: IMASDK */
final class bmh extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ bmi f16689a;

    /* synthetic */ bmh(bmi bmi) {
        this.f16689a = bmi;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f16689a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f16689a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f16689a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public Iterator<Map.Entry> iterator() {
        return new bmg(this.f16689a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f16689a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f16689a.size();
    }
}
