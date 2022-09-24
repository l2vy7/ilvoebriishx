package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asw */
/* compiled from: IMASDK */
final class asw extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ atb f15670a;

    asw(atb atb) {
        this.f15670a = atb;
    }

    public final void clear() {
        this.f15670a.clear();
    }

    public final boolean contains(Object obj) {
        Map d = this.f15670a.mo14422d();
        if (d != null) {
            return d.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int m = this.f15670a.m14721t(entry.getKey());
            if (m == -1 || !arq.m14618b(this.f15670a.f15688c[m], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return this.f15670a.mo14429i();
    }

    public final boolean remove(Object obj) {
        Map d = this.f15670a.mo14422d();
        if (d != null) {
            return d.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f15670a.mo14418c()) {
            return false;
        }
        int n = this.f15670a.m14719r();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object o = this.f15670a.f15689e;
        atb atb = this.f15670a;
        int l = aup.m14881l(key, value, n, o, atb.f15686a, atb.f15687b, atb.f15688c);
        if (l == -1) {
            return false;
        }
        this.f15670a.mo14425f(l, n);
        atb.m14717p(this.f15670a);
        this.f15670a.mo14423e();
        return true;
    }

    public final int size() {
        return this.f15670a.size();
    }
}
