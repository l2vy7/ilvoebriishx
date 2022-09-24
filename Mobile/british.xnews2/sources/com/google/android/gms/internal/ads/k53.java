package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k53 extends AbstractCollection {

    /* renamed from: b */
    final /* synthetic */ l53 f20472b;

    k53(l53 l53) {
        this.f20472b = l53;
    }

    public final void clear() {
        this.f20472b.zzp();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20472b.mo18508g(obj);
    }

    public final Iterator iterator() {
        return this.f20472b.mo18411c();
    }

    public final int size() {
        return this.f20472b.zze();
    }
}
