package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.clearcut.b0 */
final class C8855b0 implements Iterator {

    /* renamed from: b */
    private int f44395b = 0;

    /* renamed from: c */
    private final int f44396c;

    /* renamed from: d */
    private final /* synthetic */ C8847a0 f44397d;

    C8855b0(C8847a0 a0Var) {
        this.f44397d = a0Var;
        this.f44396c = a0Var.size();
    }

    /* renamed from: d */
    private final byte m41535d() {
        try {
            C8847a0 a0Var = this.f44397d;
            int i = this.f44395b;
            this.f44395b = i + 1;
            return a0Var.mo36808q(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f44395b < this.f44396c;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m41535d());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
