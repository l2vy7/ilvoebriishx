package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
abstract class g33<T> implements Iterator<T> {
    @CheckForNull

    /* renamed from: b */
    private T f20335b;

    /* renamed from: c */
    private int f20336c = 2;

    protected g33() {
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: a */
    public abstract T mo18341a();

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: b */
    public final T mo18342b() {
        this.f20336c = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f20336c;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f20336c = 4;
                    this.f20335b = mo18341a();
                    if (this.f20336c != 3) {
                        this.f20336c = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f20336c = 2;
            T t = this.f20335b;
            this.f20335b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
