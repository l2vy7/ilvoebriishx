package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9870p implements Iterator {

    /* renamed from: b */
    final Iterator f46563b;

    /* renamed from: c */
    final /* synthetic */ zzas f46564c;

    C9870p(zzas zzas) {
        this.f46564c = zzas;
        this.f46563b = zzas.f46936b.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.f46563b.next();
    }

    public final boolean hasNext() {
        return this.f46563b.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
