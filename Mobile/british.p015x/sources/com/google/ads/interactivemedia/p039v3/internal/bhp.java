package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhp */
/* compiled from: IMASDK */
final class bhp extends bfi<BigInteger> {
    bhp() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            return new BigInteger(biw.mo15092g());
        } catch (NumberFormatException e) {
            throw new bff((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15117j((BigInteger) obj);
    }
}
