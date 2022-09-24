package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ab */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9072ab implements Iterator {

    /* renamed from: b */
    final Iterator f44888b;

    /* renamed from: c */
    final /* synthetic */ C9087bb f44889c;

    C9072ab(C9087bb bbVar) {
        this.f44889c = bbVar;
        this.f44888b = bbVar.f44904b.iterator();
    }

    public final boolean hasNext() {
        return this.f44888b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f44888b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
