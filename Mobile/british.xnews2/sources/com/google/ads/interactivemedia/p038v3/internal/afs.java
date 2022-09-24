package com.google.ads.interactivemedia.p038v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afs */
/* compiled from: IMASDK */
final class afs extends acv {

    /* renamed from: b */
    private final List<ahb> f14537b;

    /* renamed from: c */
    private final long f14538c;

    public afs(long j, List<ahb> list) {
        super(0, (long) (list.size() - 1));
        this.f14538c = j;
        this.f14537b = list;
    }

    /* renamed from: d */
    public final long mo13507d() {
        mo13468b();
        return this.f14538c + this.f14537b.get((int) mo13469c()).f14782g;
    }

    /* renamed from: e */
    public final long mo13508e() {
        mo13468b();
        ahb ahb = this.f14537b.get((int) mo13469c());
        return this.f14538c + ahb.f14782g + ahb.f14780e;
    }
}
