package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhq */
/* compiled from: IMASDK */
final class bhq extends bfi<StringBuilder> {
    bhq() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return new StringBuilder(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        StringBuilder sb = (StringBuilder) obj;
        if (sb == null) {
            str = null;
        } else {
            str = sb.toString();
        }
        biy.mo15118k(str);
    }
}
