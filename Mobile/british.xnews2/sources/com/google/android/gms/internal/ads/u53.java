package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class u53 extends AbstractSet {

    /* renamed from: b */
    final /* synthetic */ y53 f20916b;

    u53(y53 y53) {
        this.f20916b = y53;
    }

    public final void clear() {
        this.f20916b.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20916b.containsKey(obj);
    }

    public final Iterator iterator() {
        y53 y53 = this.f20916b;
        Map q = y53.mo19004q();
        if (q != null) {
            return q.keySet().iterator();
        }
        return new o53(y53);
    }

    public final boolean remove(@CheckForNull Object obj) {
        Map q = this.f20916b.mo19004q();
        if (q != null) {
            return q.keySet().remove(obj);
        }
        return this.f20916b.m21191D(obj) != y53.f21007k;
    }

    public final int size() {
        return this.f20916b.size();
    }
}
