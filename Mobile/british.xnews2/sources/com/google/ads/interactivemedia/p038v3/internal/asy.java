package com.google.ads.interactivemedia.p038v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asy */
/* compiled from: IMASDK */
final class asy extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ atb f15675a;

    asy(atb atb) {
        this.f15675a = atb;
    }

    public final void clear() {
        this.f15675a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f15675a.containsKey(obj);
    }

    public final Iterator iterator() {
        atb atb = this.f15675a;
        Map d = atb.mo14422d();
        if (d != null) {
            return d.keySet().iterator();
        }
        return new ast(atb);
    }

    public final boolean remove(Object obj) {
        Map d = this.f15675a.mo14422d();
        if (d != null) {
            return d.keySet().remove(obj);
        }
        return this.f15675a.m14722u(obj) != atb.f15685d;
    }

    public final int size() {
        return this.f15675a.size();
    }
}
