package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfn */
/* compiled from: IMASDK */
final class bfn implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f16239a;

    /* renamed from: b */
    private final Type f16240b;

    /* renamed from: c */
    private final Type[] f16241c;

    public bfn(Type type, Type type2, Type... typeArr) {
        Type type3;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            art.m14631b(z);
        }
        if (type == null) {
            type3 = null;
        } else {
            type3 = bfp.m15815b(type);
        }
        this.f16239a = type3;
        this.f16240b = bfp.m15815b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f16241c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            art.m14632c(this.f16241c[i]);
            bfp.m15824k(this.f16241c[i]);
            Type[] typeArr3 = this.f16241c;
            typeArr3[i] = bfp.m15815b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && bfp.m15817d(this, (ParameterizedType) obj);
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f16241c.clone();
    }

    public final Type getOwnerType() {
        return this.f16239a;
    }

    public final Type getRawType() {
        return this.f16240b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f16241c) ^ this.f16240b.hashCode();
        Type type = this.f16239a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.f16241c.length;
        if (length == 0) {
            return bfp.m15818e(this.f16240b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(bfp.m15818e(this.f16240b));
        sb.append("<");
        sb.append(bfp.m15818e(this.f16241c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(bfp.m15818e(this.f16241c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
