package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.internal.bfi;
import com.google.ads.interactivemedia.p039v3.internal.biw;
import com.google.ads.interactivemedia.p039v3.internal.biy;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bk */
/* compiled from: IMASDK */
final class C3798bk extends bfi<C3799bl> {
    C3798bk() {
    }

    public C3799bl read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return new C3799bl(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public void write(biy biy, C3799bl blVar) throws IOException {
        if (blVar == null) {
            biy.mo15114g();
        } else {
            biy.mo15118k(blVar.getName());
        }
    }
}
