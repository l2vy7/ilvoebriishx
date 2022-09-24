package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Currency;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhx */
/* compiled from: IMASDK */
final class bhx extends bfi<Currency> {
    bhx() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        return Currency.getInstance(biw.mo15092g());
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15118k(((Currency) obj).getCurrencyCode());
    }
}
