package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.r0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
abstract class C8709r0<E> extends C8581j1<E> {

    /* renamed from: b */
    private final int f43929b;

    /* renamed from: c */
    private int f43930c;

    protected C8709r0(int i, int i2) {
        C4640o0.m21339b(i2, i, "index");
        this.f43929b = i;
        this.f43930c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo36685a(int i);

    public final boolean hasNext() {
        return this.f43930c < this.f43929b;
    }

    public final boolean hasPrevious() {
        return this.f43930c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f43930c;
            this.f43930c = i + 1;
            return mo36685a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f43930c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f43930c - 1;
            this.f43930c = i;
            return mo36685a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f43930c - 1;
    }
}
