package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ben */
/* compiled from: IMASDK */
final class ben extends bfi<Number> {
    ben() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return Double.valueOf(biw.mo15095j());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            biy.mo15114g();
            return;
        }
        bet.m15780a(number.doubleValue());
        biy.mo15117j(number);
    }
}
