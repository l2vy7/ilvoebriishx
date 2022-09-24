package com.google.ads.interactivemedia.p038v3.internal;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ata */
/* compiled from: IMASDK */
final class ata extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ atb f15684a;

    ata(atb atb) {
        this.f15684a = atb;
    }

    public final void clear() {
        this.f15684a.clear();
    }

    public final Iterator iterator() {
        atb atb = this.f15684a;
        Map d = atb.mo14422d();
        if (d != null) {
            return d.values().iterator();
        }
        return new asv(atb);
    }

    public final int size() {
        return this.f15684a.size();
    }
}
