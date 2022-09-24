package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9107d implements Iterator {

    /* renamed from: b */
    final /* synthetic */ Iterator f44946b;

    /* renamed from: c */
    final /* synthetic */ Iterator f44947c;

    C9107d(C4652f fVar, Iterator it, Iterator it2) {
        this.f44946b = it;
        this.f44947c = it2;
    }

    public final boolean hasNext() {
        if (this.f44946b.hasNext()) {
            return true;
        }
        return this.f44947c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f44946b.hasNext()) {
            return new C9369u(((Integer) this.f44946b.next()).toString());
        }
        if (this.f44947c.hasNext()) {
            return new C9369u((String) this.f44947c.next());
        }
        throw new NoSuchElementException();
    }
}
