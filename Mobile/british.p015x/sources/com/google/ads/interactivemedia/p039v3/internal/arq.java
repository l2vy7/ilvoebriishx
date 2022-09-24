package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arq */
/* compiled from: IMASDK */
public final class arq {
    /* renamed from: a */
    public static arp m14617a(Object obj) {
        return new arp(obj.getClass().getSimpleName());
    }

    /* renamed from: b */
    public static boolean m14618b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static boolean m14619c(bek bek) {
        ark ark = (ark) bek.mo14962a().getAnnotation(ark.class);
        return ark != null && Arrays.asList(ark.mo14243b()).contains(bek.mo14963b());
    }
}
