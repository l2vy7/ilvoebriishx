package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.bb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9087bb extends AbstractList implements RandomAccess, C9148f9 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9148f9 f44904b;

    public C9087bb(C9148f9 f9Var) {
        this.f44904b = f9Var;
    }

    /* renamed from: d */
    public final void mo37419d(C9329r7 r7Var) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C9133e9) this.f44904b).get(i);
    }

    public final Iterator iterator() {
        return new C9072ab(this);
    }

    public final ListIterator listIterator(int i) {
        return new C9455za(this, i);
    }

    public final int size() {
        return this.f44904b.size();
    }

    public final C9148f9 zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.f44904b.zzf(i);
    }

    public final List zzh() {
        return this.f44904b.zzh();
    }
}
