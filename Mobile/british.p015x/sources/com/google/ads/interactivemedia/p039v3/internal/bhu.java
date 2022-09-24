package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhu */
/* compiled from: IMASDK */
final class bhu extends bfi<URI> {
    bhu() {
    }

    /* renamed from: a */
    public static final URI m15917a(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        try {
            String g = biw.mo15092g();
            if ("null".equals(g)) {
                return null;
            }
            return new URI(g);
        } catch (URISyntaxException e) {
            throw new bez((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        return m15917a(biw);
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        URI uri = (URI) obj;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toASCIIString();
        }
        biy.mo15118k(str);
    }
}
