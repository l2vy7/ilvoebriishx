package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Modifier;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgo */
/* compiled from: IMASDK */
public abstract class bgo {
    /* renamed from: b */
    static void m15861b(Class<?> cls) {
        String str;
        String str2;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Interface can't be instantiated! Interface name: ".concat(name);
            } else {
                str2 = new String("Interface can't be instantiated! Interface name: ");
            }
            throw new UnsupportedOperationException(str2);
        } else if (Modifier.isAbstract(modifiers)) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Abstract class can't be instantiated! Class name: ".concat(name2);
            } else {
                str = new String("Abstract class can't be instantiated! Class name: ");
            }
            throw new UnsupportedOperationException(str);
        }
    }

    /* renamed from: a */
    public abstract <T> T mo15081a(Class<T> cls) throws Exception;
}
