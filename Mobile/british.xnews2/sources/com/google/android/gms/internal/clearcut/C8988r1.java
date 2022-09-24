package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.r1 */
final class C8988r1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b */
    private Iterator<Map.Entry<K, Object>> f44732b;

    public C8988r1(Iterator<Map.Entry<K, Object>> it) {
        this.f44732b = it;
    }

    public final boolean hasNext() {
        return this.f44732b.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f44732b.next();
        return next.getValue() instanceof C8967o1 ? new C8981q1(next) : next;
    }

    public final void remove() {
        this.f44732b.remove();
    }
}
