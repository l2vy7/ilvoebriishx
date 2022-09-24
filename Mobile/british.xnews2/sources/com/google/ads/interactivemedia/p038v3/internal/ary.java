package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ary */
/* compiled from: IMASDK */
final class ary extends aut {

    /* renamed from: a */
    final /* synthetic */ asa f15622a;

    ary(asa asa) {
        this.f15622a = asa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo14251a() {
        return this.f15622a;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f15622a.f15636a.entrySet();
        ars.m14627g(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator<Map.Entry> iterator() {
        return new arz(this.f15622a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        asn.m14675p(this.f15622a.f15637b, ((Map.Entry) obj).getKey());
        return true;
    }
}
