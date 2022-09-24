package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.a4 */
final class C8851a4 implements Iterator<String> {

    /* renamed from: b */
    private Iterator<String> f44383b;

    /* renamed from: c */
    private final /* synthetic */ C9039y3 f44384c;

    C8851a4(C9039y3 y3Var) {
        this.f44384c = y3Var;
        this.f44383b = y3Var.f44801b.iterator();
    }

    public final boolean hasNext() {
        return this.f44383b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f44383b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
