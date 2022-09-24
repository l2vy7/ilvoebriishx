package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b73 extends s83 {

    /* renamed from: b */
    boolean f29924b;

    /* renamed from: c */
    final /* synthetic */ Object f29925c;

    b73(Object obj) {
        this.f29925c = obj;
    }

    public final boolean hasNext() {
        return !this.f29924b;
    }

    public final Object next() {
        if (!this.f29924b) {
            this.f29924b = true;
            return this.f29925c;
        }
        throw new NoSuchElementException();
    }
}
