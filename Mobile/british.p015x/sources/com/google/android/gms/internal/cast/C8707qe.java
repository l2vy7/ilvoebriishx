package com.google.android.gms.internal.cast;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.qe */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8707qe extends AbstractSet<Map.Entry> {

    /* renamed from: b */
    final /* synthetic */ C8722re f43926b;

    /* synthetic */ C8707qe(C8722re reVar, C8611ke keVar) {
        this.f43926b = reVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f43926b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f43926b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f43926b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new C8691pe(this.f43926b, (C8611ke) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f43926b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f43926b.size();
    }
}
