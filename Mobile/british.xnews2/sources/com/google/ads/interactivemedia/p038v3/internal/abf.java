package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abf */
final /* synthetic */ class abf implements Runnable {

    /* renamed from: a */
    private final abj f14008a;

    /* renamed from: b */
    private final abk f14009b;

    /* renamed from: c */
    private final aas f14010c;

    /* renamed from: d */
    private final aax f14011d;

    /* renamed from: e */
    private final IOException f14012e;

    /* renamed from: f */
    private final boolean f14013f;

    abf(abj abj, abk abk, aas aas, aax aax, IOException iOException, boolean z) {
        this.f14008a = abj;
        this.f14009b = abk;
        this.f14010c = aas;
        this.f14011d = aax;
        this.f14012e = iOException;
        this.f14013f = z;
    }

    public final void run() {
        abj abj = this.f14008a;
        this.f14009b.mo13247af(abj.f14023a, abj.f14024b, this.f14010c, this.f14011d, this.f14012e, this.f14013f);
    }
}
