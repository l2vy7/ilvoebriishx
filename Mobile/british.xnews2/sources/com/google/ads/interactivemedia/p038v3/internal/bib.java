package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bib */
/* compiled from: IMASDK */
final class bib extends bfi<bey> {
    bib() {
    }

    /* renamed from: a */
    public final bey read(biw biw) throws IOException {
        int p = biw.mo15101p() - 1;
        if (p == 0) {
            bew bew = new bew();
            biw.mo15085a();
            while (biw.mo15090e()) {
                bew.mo14979a(read(biw));
            }
            biw.mo15086b();
            return bew;
        } else if (p == 2) {
            bfb bfb = new bfb();
            biw.mo15087c();
            while (biw.mo15090e()) {
                bfb.mo14989a(biw.mo15091f(), read(biw));
            }
            biw.mo15089d();
            return bfb;
        } else if (p == 5) {
            return new bfd(biw.mo15092g());
        } else {
            if (p == 6) {
                return new bfd((Number) new bga(biw.mo15092g()));
            }
            if (p == 7) {
                return new bfd(Boolean.valueOf(biw.mo15093h()));
            }
            if (p == 8) {
                biw.mo15094i();
                return bfa.f16231a;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public final void write(biy biy, bey bey) throws IOException {
        if (bey == null || (bey instanceof bfa)) {
            biy.mo15114g();
        } else if (bey instanceof bfd) {
            bfd bfd = (bfd) bey;
            if (bfd.mo14995c()) {
                biy.mo15117j(bfd.mo14996d());
            } else if (bfd.mo14993a()) {
                biy.mo15119l(bfd.mo14994b());
            } else {
                biy.mo15118k(bfd.mo14999f());
            }
        } else if (bey instanceof bew) {
            biy.mo15107b();
            Iterator<bey> it = ((bew) bey).iterator();
            while (it.hasNext()) {
                write(biy, it.next());
            }
            biy.mo15110d();
        } else if (bey instanceof bfb) {
            biy.mo15108c();
            for (Map.Entry next : ((bfb) bey).mo14990b()) {
                biy.mo15112f((String) next.getKey());
                write(biy, (bey) next.getValue());
            }
            biy.mo15111e();
        } else {
            String valueOf = String.valueOf(bey.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 15);
            sb.append("Couldn't write ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
