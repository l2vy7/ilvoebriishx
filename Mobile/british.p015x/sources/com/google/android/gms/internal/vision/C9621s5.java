package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.vision.s5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9621s5 implements Iterator<String> {

    /* renamed from: b */
    private Iterator<String> f45856b;

    /* renamed from: c */
    private final /* synthetic */ C9596p5 f45857c;

    C9621s5(C9596p5 p5Var) {
        this.f45857c = p5Var;
        this.f45856b = p5Var.f45825b.iterator();
    }

    public final boolean hasNext() {
        return this.f45856b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f45856b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
