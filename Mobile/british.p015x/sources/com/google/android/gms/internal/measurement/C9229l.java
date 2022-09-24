package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9229l implements Iterator {

    /* renamed from: b */
    final /* synthetic */ Iterator f45182b;

    C9229l(Iterator it) {
        this.f45182b = it;
    }

    public final boolean hasNext() {
        return this.f45182b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C9369u((String) this.f45182b.next());
    }
}
