package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bio */
/* compiled from: IMASDK */
final class bio<T extends Enum<T>> extends bfi<T> {

    /* renamed from: a */
    private final Map<String, T> f16374a = new HashMap();

    /* renamed from: b */
    private final Map<T, String> f16375b = new HashMap();

    public bio(Class<T> cls) {
        try {
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                String name = enumR.name();
                bfl bfl = (bfl) cls.getField(name).getAnnotation(bfl.class);
                if (bfl != null) {
                    name = bfl.mo15011a();
                    for (String put : bfl.mo15012b()) {
                        this.f16374a.put(put, enumR);
                    }
                }
                this.f16374a.put(name, enumR);
                this.f16375b.put(enumR, name);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object read(biw biw) throws IOException {
        if (biw.mo15101p() != 9) {
            return (Enum) this.f16374a.get(biw.mo15092g());
        }
        biw.mo15094i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        String str;
        Enum enumR = (Enum) obj;
        if (enumR == null) {
            str = null;
        } else {
            str = this.f16375b.get(enumR);
        }
        biy.mo15118k(str);
    }
}
