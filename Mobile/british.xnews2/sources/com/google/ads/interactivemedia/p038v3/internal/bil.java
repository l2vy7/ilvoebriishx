package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bil */
/* compiled from: IMASDK */
final class bil extends bfi<Number> {
    bil() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return Integer.valueOf(biw.mo15097l());
        } catch (NumberFormatException e) {
            throw new bff((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15117j((Number) obj);
    }
}
