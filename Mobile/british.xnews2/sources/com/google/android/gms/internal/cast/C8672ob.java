package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.ob */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8672ob extends C8704qb {

    /* renamed from: b */
    private int f43873b = 0;

    /* renamed from: c */
    private final int f43874c;

    /* renamed from: d */
    final /* synthetic */ C8796wb f43875d;

    C8672ob(C8796wb wbVar) {
        this.f43875d = wbVar;
        this.f43874c = wbVar.mo36697c();
    }

    public final boolean hasNext() {
        return this.f43873b < this.f43874c;
    }

    public final byte zza() {
        int i = this.f43873b;
        if (i < this.f43874c) {
            this.f43873b = i + 1;
            return this.f43875d.mo36696b(i);
        }
        throw new NoSuchElementException();
    }
}
