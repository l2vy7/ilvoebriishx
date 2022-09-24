package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class u63 extends s83 {

    /* renamed from: b */
    final Iterator<? extends k63> f39793b;

    /* renamed from: c */
    Iterator f39794c = c73.f30268e;

    /* renamed from: d */
    final /* synthetic */ y63 f39795d;

    u63(y63 y63) {
        this.f39795d = y63;
        this.f39793b = ((p63) y63.f21017e.values()).listIterator(0);
    }

    public final boolean hasNext() {
        return this.f39794c.hasNext() || this.f39793b.hasNext();
    }

    public final Object next() {
        if (!this.f39794c.hasNext()) {
            this.f39794c = ((k63) this.f39793b.next()).iterator();
        }
        return this.f39794c.next();
    }
}
