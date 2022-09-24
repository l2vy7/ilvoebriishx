package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfo */
/* compiled from: IMASDK */
final class bfo implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f16242a;

    /* renamed from: b */
    private final Type f16243b;

    public bfo(Type[] typeArr, Type[] typeArr2) {
        Class<Object> cls = Object.class;
        int length = typeArr2.length;
        boolean z = true;
        art.m14631b(length <= 1);
        art.m14631b(typeArr.length == 1);
        if (length == 1) {
            art.m14632c(typeArr2[0]);
            bfp.m15824k(typeArr2[0]);
            art.m14631b(typeArr[0] != cls ? false : z);
            this.f16243b = bfp.m15815b(typeArr2[0]);
            this.f16242a = cls;
            return;
        }
        art.m14632c(typeArr[0]);
        bfp.m15824k(typeArr[0]);
        this.f16243b = null;
        this.f16242a = bfp.m15815b(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && bfp.m15817d(this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        Type type = this.f16243b;
        if (type == null) {
            return bfp.f16244a;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f16242a};
    }

    public final int hashCode() {
        Type type = this.f16243b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16242a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f16243b;
        if (type != null) {
            String valueOf = String.valueOf(bfp.m15818e(type));
            return valueOf.length() != 0 ? "? super ".concat(valueOf) : new String("? super ");
        }
        Type type2 = this.f16242a;
        if (type2 == Object.class) {
            return "?";
        }
        String valueOf2 = String.valueOf(bfp.m15818e(type2));
        return valueOf2.length() != 0 ? "? extends ".concat(valueOf2) : new String("? extends ");
    }
}
