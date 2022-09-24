package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bif */
/* compiled from: IMASDK */
final class bif extends bfi {

    /* renamed from: a */
    final /* synthetic */ Class f16369a;

    /* renamed from: b */
    final /* synthetic */ big f16370b;

    bif(big big, Class cls) {
        this.f16370b = big;
        this.f16369a = cls;
    }

    public final Object read(biw biw) throws IOException {
        Object read = this.f16370b.f16372b.read(biw);
        if (read == null || this.f16369a.isInstance(read)) {
            return read;
        }
        String name = this.f16369a.getName();
        String name2 = read.getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 20 + name2.length());
        sb.append("Expected a ");
        sb.append(name);
        sb.append(" but was ");
        sb.append(name2);
        throw new bff(sb.toString());
    }

    public final void write(biy biy, Object obj) throws IOException {
        this.f16370b.f16372b.write(biy, obj);
    }
}
