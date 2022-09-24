package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.c1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8465c1 extends C4647y0<Map.Entry> {

    /* renamed from: d */
    final /* synthetic */ C8482d1 f43310d;

    C8465c1(C8482d1 d1Var) {
        this.f43310d = d1Var;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C4640o0.m21338a(i, 0, "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(this.f43310d.f43391e[i2], this.f43310d.f43391e[i2 + 1]);
    }

    public final int size() {
        return 0;
    }
}
