package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfu */
/* compiled from: IMASDK */
final class bfu implements bgj {

    /* renamed from: a */
    final /* synthetic */ Type f16253a;

    bfu(Type type) {
        this.f16253a = type;
    }

    /* renamed from: a */
    public final Object mo15028a() {
        String str;
        String str2;
        Type type = this.f16253a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            String valueOf = String.valueOf(this.f16253a.toString());
            if (valueOf.length() != 0) {
                str2 = "Invalid EnumSet type: ".concat(valueOf);
            } else {
                str2 = new String("Invalid EnumSet type: ");
            }
            throw new bez(str2);
        }
        String valueOf2 = String.valueOf(type.toString());
        if (valueOf2.length() != 0) {
            str = "Invalid EnumSet type: ".concat(valueOf2);
        } else {
            str = new String("Invalid EnumSet type: ");
        }
        throw new bez(str);
    }
}
