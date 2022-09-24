package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9337s implements Iterator {

    /* renamed from: b */
    private int f45436b = 0;

    /* renamed from: c */
    final /* synthetic */ C9369u f45437c;

    C9337s(C9369u uVar) {
        this.f45437c = uVar;
    }

    public final boolean hasNext() {
        return this.f45436b < this.f45437c.f45477b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f45436b;
        if (i < this.f45437c.f45477b.length()) {
            this.f45436b = i + 1;
            return new C9369u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
