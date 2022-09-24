package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgg */
/* compiled from: IMASDK */
abstract class bgg<T> implements Iterator<T> {

    /* renamed from: a */
    bgh f16275a;

    /* renamed from: b */
    bgh f16276b = null;

    /* renamed from: c */
    int f16277c;

    /* renamed from: d */
    final /* synthetic */ bgi f16278d;

    bgg(bgi bgi) {
        this.f16278d = bgi;
        this.f16275a = bgi.f16292e.f16282d;
        this.f16277c = bgi.f16291d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bgh mo15059a() {
        bgh<K, V> bgh = this.f16275a;
        bgi bgi = this.f16278d;
        if (bgh == bgi.f16292e) {
            throw new NoSuchElementException();
        } else if (bgi.f16291d == this.f16277c) {
            this.f16275a = bgh.f16282d;
            this.f16276b = bgh;
            return bgh;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f16275a != this.f16278d.f16292e;
    }

    public final void remove() {
        bgh bgh = this.f16276b;
        if (bgh != null) {
            this.f16278d.mo15073d(bgh, true);
            this.f16276b = null;
            this.f16277c = this.f16278d.f16291d;
            return;
        }
        throw new IllegalStateException();
    }
}
