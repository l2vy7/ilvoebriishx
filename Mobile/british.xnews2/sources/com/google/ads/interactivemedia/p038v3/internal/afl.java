package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afl */
/* compiled from: IMASDK */
public final class afl {

    /* renamed from: b */
    private static final C4321rq f14526b = new C4321rq();

    /* renamed from: a */
    final C4306rb f14527a;

    /* renamed from: c */
    private final C4120ke f14528c;

    /* renamed from: d */
    private final amk f14529d;

    public afl(C4306rb rbVar, C4120ke keVar, amk amk) {
        this.f14527a = rbVar;
        this.f14528c = keVar;
        this.f14529d = amk;
    }

    /* renamed from: a */
    public final boolean mo13603a(C4307rc rcVar) throws IOException {
        return this.f14527a.mo13691f(rcVar, f14526b) == 0;
    }

    /* renamed from: b */
    public final boolean mo13604b() {
        C4306rb rbVar = this.f14527a;
        return (rbVar instanceof C4464wy) || (rbVar instanceof C4389ud);
    }

    /* renamed from: c */
    public final afl mo13605c() {
        C4306rb rbVar;
        aup.m14887r(!mo13604b());
        C4306rb rbVar2 = this.f14527a;
        if (rbVar2 instanceof ago) {
            rbVar = new ago(this.f14528c.f17672c, this.f14529d);
        } else if (rbVar2 instanceof C4427vo) {
            rbVar = new C4427vo();
        } else if (rbVar2 instanceof C4421vi) {
            rbVar = new C4421vi();
        } else if (rbVar2 instanceof C4424vl) {
            rbVar = new C4424vl();
        } else if (rbVar2 instanceof C4369tk) {
            rbVar = new C4369tk();
        } else {
            String simpleName = rbVar2.getClass().getSimpleName();
            throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
        }
        return new afl(rbVar, this.f14528c, this.f14529d);
    }
}
