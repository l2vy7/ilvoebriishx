package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bho */
/* compiled from: IMASDK */
final class bho extends bfi<BigDecimal> {
    bho() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return new BigDecimal(biw.mo15092g());
        } catch (NumberFormatException e) {
            throw new bff((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15117j((BigDecimal) obj);
    }
}
