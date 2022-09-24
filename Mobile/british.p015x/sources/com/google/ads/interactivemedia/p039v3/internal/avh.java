package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avh */
/* compiled from: IMASDK */
final class avh extends atz<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ avi f15790a;

    avh(avi avi) {
        this.f15790a = avi;
    }

    /* renamed from: f */
    public final boolean mo14504f() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        ars.m14626f(i, this.f15790a.f15793c);
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(this.f15790a.f15792b[i2], this.f15790a.f15792b[i2 + 1]);
    }

    public final int size() {
        return this.f15790a.f15793c;
    }
}
