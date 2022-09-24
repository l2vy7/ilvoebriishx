package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhn */
/* compiled from: IMASDK */
final class bhn extends bfi<String> {
    bhn() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        int p = biw.mo15101p();
        if (p == 9) {
            biw.mo15094i();
            return null;
        } else if (p == 8) {
            return Boolean.toString(biw.mo15093h());
        } else {
            return biw.mo15092g();
        }
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15118k((String) obj);
    }
}
