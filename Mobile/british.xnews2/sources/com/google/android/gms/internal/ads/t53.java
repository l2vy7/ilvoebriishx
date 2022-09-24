package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class t53<T> implements Iterator<T> {

    /* renamed from: b */
    int f39283b;

    /* renamed from: c */
    int f39284c;

    /* renamed from: d */
    int f39285d = -1;

    /* renamed from: e */
    final /* synthetic */ y53 f39286e;

    /* synthetic */ t53(y53 y53, s53 s53) {
        this.f39286e = y53;
        this.f39283b = y53.f21012f;
        this.f39284c = y53.mo18999i();
    }

    /* renamed from: b */
    private final void m37683b() {
        if (this.f39286e.f21012f != this.f39283b) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo33837a(int i);

    public final boolean hasNext() {
        return this.f39284c >= 0;
    }

    public final T next() {
        m37683b();
        if (hasNext()) {
            int i = this.f39284c;
            this.f39285d = i;
            T a = mo33837a(i);
            this.f39284c = this.f39286e.mo19001j(this.f39284c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m37683b();
        b43.m20210g(this.f39285d >= 0, "no calls to next() since the last call to remove()");
        this.f39283b += 32;
        y53 y53 = this.f39286e;
        y53.remove(y53.m21200l(y53, this.f39285d));
        this.f39284c--;
        this.f39285d = -1;
    }
}
