package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bii */
/* compiled from: IMASDK */
final class bii extends bfi<Boolean> {
    bii() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return Boolean.valueOf(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            str = "null";
        } else {
            str = bool.toString();
        }
        biy.mo15118k(str);
    }
}
