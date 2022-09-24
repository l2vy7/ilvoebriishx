package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.bf */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8462bf extends AbstractList<String> implements RandomAccess, C8527fd {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8527fd f43306b;

    public C8462bf(C8527fd fdVar) {
        this.f43306b = fdVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C8510ed) this.f43306b).get(i);
    }

    public final Iterator<String> iterator() {
        return new C8445af(this);
    }

    /* renamed from: l */
    public final Object mo36387l(int i) {
        return this.f43306b.mo36387l(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C8845ze(this, i);
    }

    public final int size() {
        return this.f43306b.size();
    }

    public final List<?> zzf() {
        return this.f43306b.zzf();
    }

    public final C8527fd zzg() {
        return this;
    }
}
