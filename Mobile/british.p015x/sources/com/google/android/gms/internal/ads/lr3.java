package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lr3 implements Iterator<zn3> {

    /* renamed from: b */
    private final ArrayDeque<nr3> f35223b;

    /* renamed from: c */
    private zn3 f35224c;

    /* synthetic */ lr3(eo3 eo3, kr3 kr3) {
        if (eo3 instanceof nr3) {
            nr3 nr3 = (nr3) eo3;
            ArrayDeque<nr3> arrayDeque = new ArrayDeque<>(nr3.mo31619t());
            this.f35223b = arrayDeque;
            arrayDeque.push(nr3);
            this.f35224c = m34534b(nr3.f36101g);
            return;
        }
        this.f35223b = null;
        this.f35224c = (zn3) eo3;
    }

    /* renamed from: b */
    private final zn3 m34534b(eo3 eo3) {
        while (eo3 instanceof nr3) {
            nr3 nr3 = (nr3) eo3;
            this.f35223b.push(nr3);
            eo3 = nr3.f36101g;
        }
        return (zn3) eo3;
    }

    /* renamed from: a */
    public final zn3 next() {
        zn3 zn3;
        zn3 zn32 = this.f35224c;
        if (zn32 != null) {
            do {
                ArrayDeque<nr3> arrayDeque = this.f35223b;
                zn3 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f35224c = zn3;
                } else {
                    zn3 = m34534b(this.f35223b.pop().f36102h);
                }
            } while (zn3.mo31615e());
            this.f35224c = zn3;
            return zn32;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f35224c != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
