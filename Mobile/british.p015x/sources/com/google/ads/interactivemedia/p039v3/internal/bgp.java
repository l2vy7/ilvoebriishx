package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgp */
/* compiled from: IMASDK */
public final class bgp<E> extends bfi<Object> {

    /* renamed from: a */
    public static final bfj f16300a = new bgr((byte[]) null);

    /* renamed from: b */
    private final Class<E> f16301b;

    /* renamed from: c */
    private final bfi<E> f16302c;

    public bgp(bet bet, bfi<E> bfi, Class<E> cls) {
        this.f16302c = new bhi(bet, bfi, cls);
        this.f16301b = cls;
    }

    public final Object read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        biw.mo15085a();
        while (biw.mo15090e()) {
            arrayList.add(this.f16302c.read(biw));
        }
        biw.mo15086b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f16301b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void write(biy biy, Object obj) throws IOException {
        if (obj == null) {
            biy.mo15114g();
            return;
        }
        biy.mo15107b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f16302c.write(biy, Array.get(obj, i));
        }
        biy.mo15110d();
    }
}
