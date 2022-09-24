package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgq */
/* compiled from: IMASDK */
final class bgq<E> extends bfi<Collection<E>> {

    /* renamed from: a */
    private final bfi<E> f16303a;

    /* renamed from: b */
    private final bgj<? extends Collection<E>> f16304b;

    public bgq(bet bet, Type type, bfi<E> bfi, bgj<? extends Collection<E>> bgj) {
        this.f16303a = new bhi(bet, bfi, type);
        this.f16304b = bgj;
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        Collection collection = (Collection) this.f16304b.mo15028a();
        biw.mo15085a();
        while (biw.mo15090e()) {
            collection.add(this.f16303a.read(biw));
        }
        biw.mo15086b();
        return collection;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            biy.mo15114g();
            return;
        }
        biy.mo15107b();
        for (Object write : collection) {
            this.f16303a.write(biy, write);
        }
        biy.mo15110d();
    }
}
