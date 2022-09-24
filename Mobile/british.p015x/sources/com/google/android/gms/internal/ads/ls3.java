package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ls3 extends AbstractList<String> implements RandomAccess, cq3 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final cq3 f35236b;

    public ls3(cq3 cq3) {
        this.f35236b = cq3;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((bq3) this.f35236b).get(i);
    }

    public final Iterator<String> iterator() {
        return new ks3(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new js3(this, i);
    }

    /* renamed from: q0 */
    public final void mo30782q0(eo3 eo3) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f35236b.size();
    }

    public final cq3 zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.f35236b.zzf(i);
    }

    public final List<?> zzh() {
        return this.f35236b.zzh();
    }
}
