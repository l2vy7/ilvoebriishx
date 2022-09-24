package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ks3 implements Iterator<String> {

    /* renamed from: b */
    final Iterator<String> f34470b;

    /* renamed from: c */
    final /* synthetic */ ls3 f34471c;

    ks3(ls3 ls3) {
        this.f34471c = ls3;
        this.f34470b = ls3.f35236b.iterator();
    }

    public final boolean hasNext() {
        return this.f34470b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f34470b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
