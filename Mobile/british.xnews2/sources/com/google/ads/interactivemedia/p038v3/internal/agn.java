package com.google.ads.interactivemedia.p038v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agn */
/* compiled from: IMASDK */
public final class agn {

    /* renamed from: a */
    private final SparseArray<amk> f14708a = new SparseArray<>();

    /* renamed from: a */
    public final amk mo13687a(int i) {
        amk amk = this.f14708a.get(i);
        if (amk != null) {
            return amk;
        }
        amk amk2 = new amk(Long.MAX_VALUE);
        this.f14708a.put(i, amk2);
        return amk2;
    }

    /* renamed from: b */
    public final void mo13688b() {
        this.f14708a.clear();
    }
}
