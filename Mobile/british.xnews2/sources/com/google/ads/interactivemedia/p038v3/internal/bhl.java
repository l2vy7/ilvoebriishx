package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhl */
/* compiled from: IMASDK */
final class bhl extends bfi<Number> {
    bhl() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        int p = biw.mo15101p();
        int i = p - 1;
        if (i == 5 || i == 6) {
            return new bga(biw.mo15092g());
        }
        if (i == 8) {
            biw.mo15094i();
            return null;
        }
        String a = bix.m15972a(p);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 23);
        sb.append("Expecting number, got: ");
        sb.append(a);
        throw new bff(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        biy.mo15117j((Number) obj);
    }
}
