package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class e53 implements Iterator {

    /* renamed from: b */
    final Iterator f31227b;

    /* renamed from: c */
    final Collection f31228c;

    /* renamed from: d */
    final /* synthetic */ f53 f31229d;

    e53(f53 f53) {
        Iterator it;
        this.f31229d = f53;
        Collection collection = f53.f20325c;
        this.f31228c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f31227b = it;
    }

    e53(f53 f53, Iterator it) {
        this.f31229d = f53;
        this.f31228c = f53.f20325c;
        this.f31227b = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31478a() {
        this.f31229d.zzb();
        if (this.f31229d.f20325c != this.f31228c) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo31478a();
        return this.f31227b.hasNext();
    }

    public final Object next() {
        mo31478a();
        return this.f31227b.next();
    }

    public final void remove() {
        this.f31227b.remove();
        i53 i53 = this.f31229d.f20328f;
        i53.f20387f = i53.f20387f - 1;
        this.f31229d.mo18299e();
    }
}
