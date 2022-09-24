package com.google.ads.interactivemedia.p039v3.internal;

import android.view.Surface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anj */
final /* synthetic */ class anj implements Runnable {

    /* renamed from: a */
    private final ann f15441a;

    /* renamed from: b */
    private final Surface f15442b;

    /* renamed from: c */
    private final long f15443c;

    anj(ann ann, Surface surface, long j) {
        this.f15441a = ann;
        this.f15442b = surface;
        this.f15443c = j;
    }

    public final void run() {
        this.f15441a.mo14110n(this.f15442b, this.f15443c);
    }
}
