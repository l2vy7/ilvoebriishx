package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bep */
/* compiled from: IMASDK */
final class bep extends bfi<Number> {
    bep() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return Long.valueOf(biw.mo15096k());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            biy.mo15114g();
        } else {
            biy.mo15118k(number.toString());
        }
    }
}
