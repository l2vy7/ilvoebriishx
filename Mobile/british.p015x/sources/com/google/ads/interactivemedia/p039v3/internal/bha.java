package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bha */
/* compiled from: IMASDK */
public final class bha<T> extends bfi<T> {

    /* renamed from: a */
    private final bgj<T> f16327a;

    /* renamed from: b */
    private final Map<String, bhb> f16328b;

    bha(bgj<T> bgj, Map<String, bhb> map) {
        this.f16327a = bgj;
        this.f16328b = map;
    }

    public final T read(biw biw) throws IOException {
        if (biw.mo15101p() == 9) {
            biw.mo15094i();
            return null;
        }
        T a = this.f16327a.mo15028a();
        try {
            biw.mo15087c();
            while (biw.mo15090e()) {
                bhb bhb = this.f16328b.get(biw.mo15091f());
                if (bhb != null) {
                    if (bhb.f16331c) {
                        bhb.mo15121b(biw, a);
                    }
                }
                biw.mo15098m();
            }
            biw.mo15089d();
            return a;
        } catch (IllegalStateException e) {
            throw new bff((Throwable) e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void write(biy biy, T t) throws IOException {
        if (t == null) {
            biy.mo15114g();
            return;
        }
        biy.mo15108c();
        try {
            for (bhb next : this.f16328b.values()) {
                if (next.mo15122c(t)) {
                    biy.mo15112f(next.f16329a);
                    next.mo15120a(biy, t);
                }
            }
            biy.mo15111e();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
