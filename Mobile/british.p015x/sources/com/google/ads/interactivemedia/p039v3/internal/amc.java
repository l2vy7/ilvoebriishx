package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amc */
/* compiled from: IMASDK */
final class amc implements akb<ake> {

    /* renamed from: a */
    private final amb f15275a;

    public amc(amb amb) {
        this.f15275a = amb;
    }

    /* renamed from: v */
    public final akc mo13373v(ake ake, long j, long j2, IOException iOException, int i) {
        this.f15275a.mo13515b(iOException);
        return aki.f15146b;
    }

    /* renamed from: w */
    public final void mo13374w(ake ake, long j, long j2, boolean z) {
    }

    /* renamed from: x */
    public final void mo13375x(ake ake, long j, long j2) {
        if (!ame.m14133a()) {
            this.f15275a.mo13515b(new IOException(new ConcurrentModificationException()));
        } else {
            this.f15275a.mo13514a();
        }
    }
}
