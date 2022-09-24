package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.vision.t5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9629t5 implements ListIterator<String> {

    /* renamed from: b */
    private ListIterator<String> f45885b;

    /* renamed from: c */
    private final /* synthetic */ int f45886c;

    /* renamed from: d */
    private final /* synthetic */ C9596p5 f45887d;

    C9629t5(C9596p5 p5Var, int i) {
        this.f45887d = p5Var;
        this.f45886c = i;
        this.f45885b = p5Var.f45825b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f45885b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f45885b.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f45885b.next();
    }

    public final int nextIndex() {
        return this.f45885b.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f45885b.previous();
    }

    public final int previousIndex() {
        return this.f45885b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
