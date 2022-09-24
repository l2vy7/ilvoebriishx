package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9353t implements Iterator {

    /* renamed from: b */
    private int f45450b = 0;

    /* renamed from: c */
    final /* synthetic */ C9369u f45451c;

    C9353t(C9369u uVar) {
        this.f45451c = uVar;
    }

    public final boolean hasNext() {
        return this.f45450b < this.f45451c.f45477b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f45450b;
        C9369u uVar = this.f45451c;
        if (i < uVar.f45477b.length()) {
            String a = uVar.f45477b;
            this.f45450b = i + 1;
            return new C9369u(String.valueOf(a.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
