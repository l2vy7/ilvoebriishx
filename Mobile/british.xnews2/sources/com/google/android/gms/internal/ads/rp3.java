package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rp3<F, T> extends AbstractList<T> {

    /* renamed from: b */
    private final List<F> f38753b;

    /* renamed from: c */
    private final qp3<F, T> f38754c;

    public rp3(List<F> list, qp3<F, T> qp3) {
        this.f38753b = list;
        this.f38754c = qp3;
    }

    public final T get(int i) {
        T a = C7619dr.m31545a(((Integer) this.f38753b.get(i)).intValue());
        return a == null ? C7619dr.AD_FORMAT_TYPE_UNSPECIFIED : a;
    }

    public final int size() {
        return this.f38753b.size();
    }
}
