package com.google.ads.interactivemedia.p039v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bla */
/* compiled from: IMASDK */
final class bla extends blb {
    private bla() {
    }

    /* synthetic */ bla(byte[] bArr) {
    }

    /* renamed from: d */
    static <E> bkq<E> m16376d(Object obj, long j) {
        return (bkq) bmv.m16740n(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo15419a(Object obj, long j) {
        bkq d = m16376d(obj, j);
        if (d.mo15173a()) {
            return d;
        }
        int size = d.size();
        bkq e = d.mo15190e(size == 0 ? 10 : size + size);
        bmv.m16741o(obj, j, e);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15420b(Object obj, long j) {
        m16376d(obj, j).mo15178b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo15421c(Object obj, Object obj2, long j) {
        bkq d = m16376d(obj, j);
        bkq d2 = m16376d(obj2, j);
        int size = d.size();
        int size2 = d2.size();
        if (size > 0 && size2 > 0) {
            if (!d.mo15173a()) {
                d = d.mo15190e(size2 + size);
            }
            d.addAll(d2);
        }
        if (size > 0) {
            d2 = d;
        }
        bmv.m16741o(obj, j, d2);
    }
}
