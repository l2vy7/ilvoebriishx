package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bin */
/* compiled from: IMASDK */
final class bin extends bfi<AtomicBoolean> {
    bin() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        return new AtomicBoolean(biw.mo15093h());
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15119l(((AtomicBoolean) obj).get());
    }
}
