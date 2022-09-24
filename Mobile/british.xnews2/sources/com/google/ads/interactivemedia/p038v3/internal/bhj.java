package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhj */
/* compiled from: IMASDK */
final class bhj extends bfi<AtomicIntegerArray> {
    bhj() {
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        ArrayList arrayList = new ArrayList();
        biw.mo15085a();
        while (biw.mo15090e()) {
            try {
                arrayList.add(Integer.valueOf(biw.mo15097l()));
            } catch (NumberFormatException e) {
                throw new bff((Throwable) e);
            }
        }
        biw.mo15086b();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        biy.mo15107b();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            biy.mo15115h((long) atomicIntegerArray.get(i));
        }
        biy.mo15110d();
    }
}
