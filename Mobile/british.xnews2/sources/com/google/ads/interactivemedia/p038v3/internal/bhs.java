package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhs */
/* compiled from: IMASDK */
final class bhs extends bfi<StringBuffer> {
    bhs() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return new StringBuffer(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        StringBuffer stringBuffer = (StringBuffer) obj;
        if (stringBuffer == null) {
            str = null;
        } else {
            str = stringBuffer.toString();
        }
        biy.mo15118k(str);
    }
}
