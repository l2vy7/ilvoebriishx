package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bij */
/* compiled from: IMASDK */
final class bij extends bfi<Number> {
    bij() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return Byte.valueOf((byte) biw.mo15097l());
        } catch (NumberFormatException e) {
            throw new bff((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15117j((Number) obj);
    }
}
