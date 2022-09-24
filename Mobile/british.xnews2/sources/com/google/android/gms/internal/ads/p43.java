package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class p43<E> extends t83<E> {

    /* renamed from: b */
    private final int f37334b;

    /* renamed from: c */
    private int f37335c;

    protected p43(int i, int i2) {
        b43.m20205b(i2, i, "index");
        this.f37334b = i;
        this.f37335c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo30858a(int i);

    public final boolean hasNext() {
        return this.f37335c < this.f37334b;
    }

    public final boolean hasPrevious() {
        return this.f37335c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f37335c;
            this.f37335c = i + 1;
            return mo30858a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f37335c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f37335c - 1;
            this.f37335c = i;
            return mo30858a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f37335c - 1;
    }
}
