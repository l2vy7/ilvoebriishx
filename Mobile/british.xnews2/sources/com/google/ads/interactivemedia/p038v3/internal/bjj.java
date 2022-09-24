package com.google.ads.interactivemedia.p038v3.internal;

import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjj */
/* compiled from: IMASDK */
final class bjj implements bjm {

    /* renamed from: a */
    final /* synthetic */ bjq f16475a;

    /* renamed from: b */
    private int f16476b;

    /* renamed from: c */
    private final int f16477c;

    bjj() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    bjj(bjq bjq) {
        this();
        this.f16475a = bjq;
        this.f16476b = 0;
        this.f16477c = bjq.mo15201c();
    }

    /* renamed from: a */
    public byte mo15195a() {
        int i = this.f16476b;
        if (i < this.f16477c) {
            this.f16476b = i + 1;
            return this.f16475a.mo15200b(i);
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return this.f16476b < this.f16477c;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(mo15195a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
