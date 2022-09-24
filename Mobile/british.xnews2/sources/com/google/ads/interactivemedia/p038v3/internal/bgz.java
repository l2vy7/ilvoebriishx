package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgz */
/* compiled from: IMASDK */
public final class bgz extends bfi<Object> {

    /* renamed from: a */
    public static final bfj f16324a = new bgr((char[]) null);

    /* renamed from: b */
    private final bet f16325b;

    bgz(bet bet) {
        this.f16325b = bet;
    }

    public final Object read(biw biw) throws IOException {
        int p = biw.mo15101p() - 1;
        if (p == 0) {
            ArrayList arrayList = new ArrayList();
            biw.mo15085a();
            while (biw.mo15090e()) {
                arrayList.add(read(biw));
            }
            biw.mo15086b();
            return arrayList;
        } else if (p == 2) {
            bgi bgi = new bgi();
            biw.mo15087c();
            while (biw.mo15090e()) {
                bgi.put(biw.mo15091f(), read(biw));
            }
            biw.mo15089d();
            return bgi;
        } else if (p == 5) {
            return biw.mo15092g();
        } else {
            if (p == 6) {
                return Double.valueOf(biw.mo15095j());
            }
            if (p == 7) {
                return Boolean.valueOf(biw.mo15093h());
            }
            if (p == 8) {
                biw.mo15094i();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public final void write(biy biy, Object obj) throws IOException {
        if (obj == null) {
            biy.mo15114g();
            return;
        }
        bfi<?> d = this.f16325b.mo14967d(obj.getClass());
        if (d instanceof bgz) {
            biy.mo15108c();
            biy.mo15111e();
            return;
        }
        d.write(biy, obj);
    }
}
