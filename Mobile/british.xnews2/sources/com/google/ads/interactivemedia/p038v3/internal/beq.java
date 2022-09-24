package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.ads.interactivemedia.v3.internal.beq */
/* compiled from: IMASDK */
final class beq extends bfi<AtomicLong> {

    /* renamed from: a */
    final /* synthetic */ bfi f16212a;

    beq(bfi bfi) {
        this.f16212a = bfi;
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        return new AtomicLong(((Number) this.f16212a.read(biw)).longValue());
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        this.f16212a.write(biy, Long.valueOf(((AtomicLong) obj).get()));
    }
}
