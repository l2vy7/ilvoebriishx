package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.ads.interactivemedia.v3.internal.biu */
/* compiled from: IMASDK */
public final class biu<T> {

    /* renamed from: a */
    final Class<? super T> f16431a;

    /* renamed from: b */
    final Type f16432b;

    /* renamed from: c */
    final int f16433c;

    protected biu() {
        Type genericSuperclass = biu.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        this.f16432b = bfp.m15815b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        throw null;
    }

    /* renamed from: c */
    public static biu<?> m15937c(Type type) {
        return new biu<>(type);
    }

    /* renamed from: d */
    public static <T> biu<T> m15938d(Class<T> cls) {
        return new biu<>(cls);
    }

    /* renamed from: a */
    public final Class<? super T> mo15133a() {
        return this.f16431a;
    }

    /* renamed from: b */
    public final Type mo15134b() {
        return this.f16432b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof biu) && bfp.m15817d(this.f16432b, ((biu) obj).f16432b);
    }

    public final int hashCode() {
        return this.f16433c;
    }

    public final String toString() {
        return bfp.m15818e(this.f16432b);
    }

    biu(Type type) {
        art.m14632c(type);
        Type b = bfp.m15815b(type);
        this.f16432b = b;
        this.f16431a = bfp.m15816c(b);
        this.f16433c = b.hashCode();
    }
}
