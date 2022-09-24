package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhi */
/* compiled from: IMASDK */
final class bhi<T> extends bfi<T> {

    /* renamed from: a */
    private final bet f16358a;

    /* renamed from: b */
    private final bfi<T> f16359b;

    /* renamed from: c */
    private final Type f16360c;

    bhi(bet bet, bfi<T> bfi, Type type) {
        this.f16358a = bet;
        this.f16359b = bfi;
        this.f16360c = type;
    }

    public final T read(biw biw) throws IOException {
        return this.f16359b.read(biw);
    }

    public final void write(biy biy, T t) throws IOException {
        bfi<T> bfi = this.f16359b;
        Type type = this.f16360c;
        Type type2 = (t == null || (type != Object.class && !(type instanceof TypeVariable) && !(type instanceof Class))) ? type : t.getClass();
        if (type2 != type) {
            bfi = this.f16358a.mo14965b(biu.m15937c(type2));
            if (bfi instanceof bha) {
                bfi<T> bfi2 = this.f16359b;
                if (!(bfi2 instanceof bha)) {
                    bfi = bfi2;
                }
            }
        }
        bfi.write(biy, t);
    }
}
