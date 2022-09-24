package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class g53 extends e53 implements ListIterator {

    /* renamed from: e */
    final /* synthetic */ h53 f32158e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g53(h53 h53) {
        super(h53);
        this.f32158e = h53;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f32158e.isEmpty();
        mo31478a();
        ((ListIterator) this.f31227b).add(obj);
        i53 i53 = this.f32158e.f20374g;
        i53.f20387f = i53.f20387f + 1;
        if (isEmpty) {
            this.f32158e.mo18295c();
        }
    }

    public final boolean hasPrevious() {
        mo31478a();
        return ((ListIterator) this.f31227b).hasPrevious();
    }

    public final int nextIndex() {
        mo31478a();
        return ((ListIterator) this.f31227b).nextIndex();
    }

    public final Object previous() {
        mo31478a();
        return ((ListIterator) this.f31227b).previous();
    }

    public final int previousIndex() {
        mo31478a();
        return ((ListIterator) this.f31227b).previousIndex();
    }

    public final void set(Object obj) {
        mo31478a();
        ((ListIterator) this.f31227b).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g53(h53 h53, int i) {
        super(h53, ((List) h53.f20325c).listIterator(i));
        this.f32158e = h53;
    }
}
