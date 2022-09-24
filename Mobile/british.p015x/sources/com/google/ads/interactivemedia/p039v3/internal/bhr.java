package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhr */
/* compiled from: IMASDK */
final class bhr extends bfi<Class> {
    bhr() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String name = ((Class) obj).getName();
        StringBuilder sb = new StringBuilder(name.length() + 76);
        sb.append("Attempted to serialize java.lang.Class: ");
        sb.append(name);
        sb.append(". Forgot to register a type adapter?");
        throw new UnsupportedOperationException(sb.toString());
    }
}
