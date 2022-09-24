package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x53 extends AbstractCollection {

    /* renamed from: b */
    final /* synthetic */ y53 f41045b;

    x53(y53 y53) {
        this.f41045b = y53;
    }

    public final void clear() {
        this.f41045b.clear();
    }

    public final Iterator iterator() {
        y53 y53 = this.f41045b;
        Map q = y53.mo19004q();
        if (q != null) {
            return q.values().iterator();
        }
        return new q53(y53);
    }

    public final int size() {
        return this.f41045b.size();
    }
}
