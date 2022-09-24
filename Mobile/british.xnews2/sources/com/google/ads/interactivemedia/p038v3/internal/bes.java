package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bes */
/* compiled from: IMASDK */
final class bes<T> extends bfi<T> {

    /* renamed from: a */
    private bfi<T> f16214a;

    bes() {
    }

    /* renamed from: a */
    public final void mo14964a(bfi<T> bfi) {
        if (this.f16214a == null) {
            this.f16214a = bfi;
            return;
        }
        throw new AssertionError();
    }

    public final T read(biw biw) throws IOException {
        bfi<T> bfi = this.f16214a;
        if (bfi != null) {
            return bfi.read(biw);
        }
        throw new IllegalStateException();
    }

    public final void write(biy biy, T t) throws IOException {
        bfi<T> bfi = this.f16214a;
        if (bfi != null) {
            bfi.write(biy, t);
            return;
        }
        throw new IllegalStateException();
    }
}
