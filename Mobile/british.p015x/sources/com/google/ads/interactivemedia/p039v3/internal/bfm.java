package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfm */
/* compiled from: IMASDK */
final class bfm implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f16238a;

    public bfm(Type type) {
        this.f16238a = bfp.m15815b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && bfp.m15817d(this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.f16238a;
    }

    public final int hashCode() {
        return this.f16238a.hashCode();
    }

    public final String toString() {
        return String.valueOf(bfp.m15818e(this.f16238a)).concat("[]");
    }
}
