package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.l3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9562l3<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b */
    private Iterator<Map.Entry<K, Object>> f45734b;

    public C9562l3(Iterator<Map.Entry<K, Object>> it) {
        this.f45734b = it;
    }

    public final boolean hasNext() {
        return this.f45734b.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f45734b.next();
        return next.getValue() instanceof C9521g3 ? new C9537i3(next) : next;
    }

    public final void remove() {
        this.f45734b.remove();
    }
}
