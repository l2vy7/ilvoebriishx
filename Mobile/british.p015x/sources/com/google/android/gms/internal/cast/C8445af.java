package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.af */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8445af implements Iterator<String> {

    /* renamed from: b */
    final Iterator<String> f43273b;

    /* renamed from: c */
    final /* synthetic */ C8462bf f43274c;

    C8445af(C8462bf bfVar) {
        this.f43274c = bfVar;
        this.f43273b = bfVar.f43306b.iterator();
    }

    public final boolean hasNext() {
        return this.f43273b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f43273b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
