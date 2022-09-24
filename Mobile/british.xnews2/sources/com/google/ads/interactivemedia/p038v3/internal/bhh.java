package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhh */
/* compiled from: IMASDK */
public final class bhh<T> extends bfi<T> {

    /* renamed from: a */
    final bet f16351a;

    /* renamed from: b */
    private final bfe<T> f16352b;

    /* renamed from: c */
    private final bex<T> f16353c;

    /* renamed from: d */
    private final biu<T> f16354d;

    /* renamed from: e */
    private final bfj f16355e;

    /* renamed from: f */
    private final bhf f16356f = new bhf();

    /* renamed from: g */
    private bfi<T> f16357g;

    public bhh(bfe<T> bfe, bex<T> bex, bet bet, biu<T> biu, bfj bfj) {
        this.f16352b = bfe;
        this.f16353c = bex;
        this.f16351a = bet;
        this.f16354d = biu;
        this.f16355e = bfj;
    }

    /* renamed from: a */
    public static bfj m15915a(biu<?> biu, Object obj) {
        return new bhg(obj, biu, biu.mo15134b() == biu.mo15133a());
    }

    /* renamed from: b */
    private final bfi<T> m15916b() {
        bfi<T> bfi = this.f16357g;
        if (bfi != null) {
            return bfi;
        }
        bfi<T> c = this.f16351a.mo14966c(this.f16355e, this.f16354d);
        this.f16357g = c;
        return c;
    }

    public final T read(biw biw) throws IOException {
        if (this.f16353c == null) {
            return m15916b().read(biw);
        }
        if (aru.m14638d(biw) instanceof bfa) {
            return null;
        }
        return this.f16353c.mo14983a();
    }

    public final void write(biy biy, T t) throws IOException {
        bfe<T> bfe = this.f16352b;
        if (bfe == null) {
            m15916b().write(biy, t);
        } else if (t == null) {
            biy.mo15114g();
        } else {
            aru.m14639e(bfe.mo15001a(t), biy);
        }
    }
}
