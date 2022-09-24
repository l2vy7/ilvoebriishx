package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.net.URL;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bht */
/* compiled from: IMASDK */
final class bht extends bfi<URL> {
    bht() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        String g = biw.mo15092g();
        if (!"null".equals(g)) {
            return new URL(g);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        URL url = (URL) obj;
        if (url == null) {
            str = null;
        } else {
            str = url.toExternalForm();
        }
        biy.mo15118k(str);
    }
}
