package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfh */
/* compiled from: IMASDK */
final class bfh extends bfi {

    /* renamed from: a */
    final /* synthetic */ bfi f16237a;

    bfh(bfi bfi) {
        this.f16237a = bfi;
    }

    public final Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return this.f16237a.read(biw);
        }
        biw.mo15094i();
        return null;
    }

    public final void write(biy biy, Object obj) throws IOException {
        if (obj == null) {
            biy.mo15114g();
        } else {
            this.f16237a.write(biy, obj);
        }
    }
}
