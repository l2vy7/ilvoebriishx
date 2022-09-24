package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhk */
/* compiled from: IMASDK */
final class bhk extends bfi<Number> {
    bhk() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return Long.valueOf(biw.mo15096k());
        } catch (NumberFormatException e) {
            throw new bff((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15117j((Number) obj);
    }
}
