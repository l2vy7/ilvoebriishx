package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bim */
/* compiled from: IMASDK */
final class bim extends bfi<AtomicInteger> {
    bim() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        try {
            return new AtomicInteger(biw.mo15097l());
        } catch (NumberFormatException e) {
            throw new bff((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15115h((long) ((AtomicInteger) obj).get());
    }
}
