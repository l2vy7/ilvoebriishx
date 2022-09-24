package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fv3<T> {

    /* renamed from: a */
    private final List<iv3<T>> f31894a;

    /* renamed from: b */
    private final List<iv3<Collection<T>>> f31895b;

    /* synthetic */ fv3(int i, int i2, ev3 ev3) {
        this.f31894a = ru3.m37252c(i);
        this.f31895b = ru3.m37252c(i2);
    }

    /* renamed from: a */
    public final fv3<T> mo31934a(iv3<? extends Collection<? extends T>> iv3) {
        this.f31895b.add(iv3);
        return this;
    }

    /* renamed from: b */
    public final fv3<T> mo31935b(iv3<? extends T> iv3) {
        this.f31894a.add(iv3);
        return this;
    }

    /* renamed from: c */
    public final gv3<T> mo31936c() {
        return new gv3<>(this.f31894a, this.f31895b, (ev3) null);
    }
}
