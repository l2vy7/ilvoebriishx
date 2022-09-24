package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.qa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9316qa extends AbstractSet {

    /* renamed from: b */
    final /* synthetic */ C9332ra f45392b;

    /* synthetic */ C9316qa(C9332ra raVar, C9224ka kaVar) {
        this.f45392b = raVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f45392b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f45392b.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f45392b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C9301pa(this.f45392b, (C9224ka) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f45392b.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f45392b.size();
    }
}
