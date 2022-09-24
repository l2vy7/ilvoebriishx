package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ber */
/* compiled from: IMASDK */
final class ber extends bfi<AtomicLongArray> {

    /* renamed from: a */
    final /* synthetic */ bfi f16213a;

    ber(bfi bfi) {
        this.f16213a = bfi;
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        ArrayList arrayList = new ArrayList();
        biw.mo15085a();
        while (biw.mo15090e()) {
            arrayList.add(Long.valueOf(((Number) this.f16213a.read(biw)).longValue()));
        }
        biw.mo15086b();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        biy.mo15107b();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f16213a.write(biy, Long.valueOf(atomicLongArray.get(i)));
        }
        biy.mo15110d();
    }
}
