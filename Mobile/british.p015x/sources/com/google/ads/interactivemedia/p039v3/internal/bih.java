package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bih */
/* compiled from: IMASDK */
final class bih extends bfi<Boolean> {
    bih() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        int p = biw.mo15101p();
        if (p == 9) {
            biw.mo15094i();
            return null;
        } else if (p == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(biw.mo15092g()));
        } else {
            return Boolean.valueOf(biw.mo15093h());
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15116i((Boolean) obj);
    }
}
